package com.icia.drawAcademy;

import java.util.List;

import javax.inject.Qualifier;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.icia.drawAcademy.Service.ClassService;
import com.icia.drawAcademy.Service.MemberService;
import com.icia.drawAcademy.Service.QboardService;
import com.icia.drawAcademy.dto.ClassDto;
import com.icia.drawAcademy.dto.MemberDto;
import com.icia.drawAcademy.dto.QboardDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@Autowired
	private MemberService mServ;

	@Autowired
	private ClassService cServ;
	
		@Autowired
	   private QboardService Qserv;
		
	// --------------------------------------------------------------------------------//
	@GetMapping("/")
	public String home(Model model) {
		log.info("home()");

		return "home";

	}

	// --------------------------------------------------------------------------------//
	@GetMapping("signUp")
	public String signUp() {
		log.info("signUp()");

		return "member/signUp";
	}

	@PostMapping("signUpProc")
	public String signUpProc(MemberDto memberDto, HttpSession session, RedirectAttributes rttr) {
		log.info("signUpProc()");
		String view = mServ.signUp(memberDto, session, rttr);
		System.out.println("rttr = " + rttr);

		return view;
	}

	@PostMapping(value = "emailCheckResult", produces = "application/text; charset=utf8")
	@ResponseBody
//@ResponseBody 를 쓰는 이유는 단순한 xml형식 또는 Json 형식으로 보낼 수 있기 때문에. / @ResponseBody를 사용하면 View Resolver를 우회하고 직접 반환 값을 HTTP 응답 본문에 넣습니다.
	public String checkEmail(@RequestParam String m_email) {
		log.info("checkEmail()");

		String result = mServ.checkEmail(m_email);
		return result;
	}

	// --------------------------------------------------------------------------------//
	@GetMapping("login")
	public String login() {
		log.info("login()");
		return "member/login";
	}

	@PostMapping("loginProc")
	public String loginProc(MemberDto memberDto, HttpSession session, RedirectAttributes rttr) {
		log.info("loginProc()");

		String view = mServ.login(memberDto, session, rttr);
		return view;
	}

	// --------------------------------------------------------------------------------//
	// 로그아웃
	@GetMapping("logout")
	public String logout(HttpSession session, RedirectAttributes rttr) {
		log.info("logout");
		String msg = "로그아웃 성공";
		// 세션에서 "login" 속성만을 제거
		
		session.removeAttribute("login");
	    session.invalidate();

		// 로그아웃 후 로그인 페이지로 리다이렉트
		rttr.addFlashAttribute("msg", msg);
		return "redirect:/";
	}

	// --------------------------------------------------------------------------------//
	@GetMapping("mypage")
	public String mypage(Model model, HttpSession session) {
		log.info("mypage()");

		// 세션에서 로그인한 회원 정보를 가져옴
		MemberDto loggedInMember = (MemberDto) session.getAttribute("login");

		if (loggedInMember != null) {
			// 로그인한 회원 정보를 모델에 추가하여 JSP로 전달
			mServ.myPage(loggedInMember.getM_id(), model);

			return "member/mypage";
		} else {
			// 로그인한 회원 정보가 없으면 로그인 페이지로 리다이렉트
			return "redirect:/login";
		}
	}

	// --------------------------------------------------------------------------------//
	@GetMapping("setting")
	public String setting(Model model, HttpSession session) {
		log.info("setting()");

		MemberDto loggedInMember = (MemberDto) session.getAttribute("login");

		if (loggedInMember != null) {
			// 로그인한 회원 정보를 모델에 추가하여 JSP로 전달
			model.addAttribute("loggedInMember", loggedInMember);

			return "member/setting";
		} else {
			// 로그인한 회원 정보가 없으면 로그인 페이지로 리다이렉트
			return "redirect:/login";
		}
	}

	@PostMapping("updateMember")
	public String updateMember(MemberDto memberDto, HttpSession session, RedirectAttributes rttr) {
		log.info("updateMember()");

		String view = mServ.updateMember(memberDto, session, rttr);
		return view;

	}

	@GetMapping("memout")
	public String memout(Integer m_id, HttpSession session, RedirectAttributes rttr) {
		log.info("memout()");

		String view = mServ.memout(m_id, session, rttr);
		return view;
	}

	// 수강신청 페이지
	// ---------------------------------------------------------------------------------------
	@GetMapping("classpage")
	public String classpage(HttpSession session) {
		log.info("classpage()");

		String view = cServ.classPage(session);
		return view;
	}

	@GetMapping("class1")
	public String class1(Model model,HttpSession session, Integer m_id) {
		log.info("class1()");
		model.addAttribute("classLimitA", cServ.getClassLimit("classA"));
		model.addAttribute("classLimitB", cServ.getClassLimit("classB"));
		model.addAttribute("classLimitC", cServ.getClassLimit("classC"));
		MemberDto loggedInMember = (MemberDto) session.getAttribute("login");
			
		cServ.class1(loggedInMember.getM_id(), model);
		return "Class/class1";
	}

	@PostMapping("class1proc")
	public String class1proc(ClassDto classDto, HttpSession session, RedirectAttributes rttr,Model model) {
		log.info("class1proc()");
		
		String view = cServ.class1proc(classDto, session, rttr, model);
		
		
		return view;
	}
	
	// 질문 게시판
	   // 게시물
	   // 목록------------------------------------------------------------------------//
	   @GetMapping("qboard")
	   public String qboardString(Integer pageNum, Model model, HttpSession session) {

	      // service에서 기능을 가져와야함./

	      log.info("qboard()");

	      String view = Qserv.getQboardList(pageNum, model, session);

	      return view;
	   }

	   // 게시물 작성---------------------------------------------------
	   @GetMapping("qwrite")
	   public String qBoardWrite() {
	      log.info("qwirte()");
	      return "qwrite";
	   }

	   // 게시물 작성----------------------------------------------------------------
	   @PostMapping("qwriteProc")
	   public String qwriteProc(QboardDto qboard, HttpSession session, RedirectAttributes rttr) {
	         log.info("qwritePoec()");
	      MemberDto login = (MemberDto) session.getAttribute("login");
	      System.out.println("qwriteProc Login" + login);
	      String view = null;
	      // 가져온 값이 null이 아니라면
	      if (login != null) {
	          // 가져온 값을 Integer로 변환하여 qboardDTO 객체에 저장
	          //qboard.setM_id(Integer.parseInt(login));
	         view = Qserv.insertQBoard(qboard, session, rttr);
	      }
	             
	      return view;
	   }

	   @GetMapping("detail")
	   public String detail(Integer b_code, Model model) {
	      log.info("detail()");
	      Qserv.getQBoard(b_code, model);
	      
	      //cServ.commentList(model, session, pageNum);   
	      return "detail";
	   }

	   // 게시물 수정-------------------------------------------------------
	   @GetMapping("QBUpdate")
	   public String qboardUpdateString(Integer b_code, Model model) {
	      log.info("QBUpdate()");
	      Qserv.getQBoard(b_code, model);
	      return "QBUpdate";
	   }

	   @PostMapping("QBUpdateProc")
	   public String QBUdateProc(QboardDto qboard, HttpSession session, RedirectAttributes rttr) {
	      log.info("QBUpdateProc()");
	      String view = Qserv.getQBUpdate(qboard, session, rttr);
	      // 세션에서 "login" 값을 가져옴
	      String login = (String) session.getAttribute("login");

	      // 가져온 값이 null이 아니라면
	      
	       if (login != null) {
	           // 가져온 값을 Integer로 변환하여 qboardDTO 객체에 저장
	           qboard.setM_id(Integer.parseInt(login));
	       } else {
	           // 세션에 "login" 값이 없는 경우 처리
	           view = "qboard";
	       }
	      return view;
	   }
	   
	   
	   // 게시물 삭제
	   @PostMapping("delete")
	   public String boardDelete (Integer b_code,
	                     HttpSession session,
	                     RedirectAttributes rttr) {
	      String view=Qserv.boardDelete(b_code, session, rttr);
	      
	      return view;
	   }
	   
	   // 게시물 댓글 달기
//	   @PostMapping("inscProc")
//	   public String insertCmt (CmtDto cDto,
//	                     //QboardDto qDto,
//	                     HttpSession session,
//	                     RedirectAttributes rttr) {
//	      
//	      String view = cServ.insertCmt(cDto, session, rttr);
//	      
//	      return view;
//	   }

}

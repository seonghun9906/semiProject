package com.icia.drawAcademy.Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.icia.drawAcademy.dao.MemberDao;
import com.icia.drawAcademy.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberService {

	@Autowired
	private MemberDao mDao;

	// 회원가입
	public String signUp(MemberDto member, HttpSession session, RedirectAttributes rttr) {
		log.info("signUp()");
		String msg = null; // DB 저장 성공/실패 관련 메시지 저장
		String view = null; // 대상 페이지 지정 변수

		try {
			mDao.signUp(member); // 저장 성공
			System.out.println("member" + member);
			view = "redirect:/?";
			msg = "회원가입 성공";

		} catch (Exception e) { // 저장 실패
			e.printStackTrace();
			view = "redirect:/?";
			msg = "회원가입 실패";
		}

		rttr.addFlashAttribute("msg", msg);
		System.out.println(msg);
		return view;
	}

	// 로그인
	public String login(MemberDto memberDto, HttpSession session, RedirectAttributes rttr) {
		log.info("login()");
		String msg = null;
		String view = null;
		MemberDto loggedInMember= mDao.login(memberDto);

		if (loggedInMember != null) {
//			mDao.login(m_email, m_password);
			msg = "로그인 성공";
			view = "redirect:/";
			
			System.out.println(loggedInMember);
		//	로그인시 세션에 저장
			session.setAttribute("login", loggedInMember);

		} else {
			msg = "로그인 실패/ 이메일 및 비밀번호를 다시 확인해주시길 바랍니다.";
			view = "redirect:login";
		}
		rttr.addFlashAttribute("msg", msg);
		return view;

	}
	
	public String logout(HttpSession session, RedirectAttributes rttr) {
		log.info("logout()");
		String msg = "로그아웃 성공";
		
		session.removeAttribute("login");
		
		rttr.addFlashAttribute("msg",msg);
		return "redirect:/";
	}
}

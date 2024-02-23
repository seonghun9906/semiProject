package com.icia.drawAcademy.Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.icia.drawAcademy.dao.classdao.ClassDao;
import com.icia.drawAcademy.dto.ClassDto;
import com.icia.drawAcademy.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClassService {

	@Autowired
	private ClassDao cDao;

	public String classPage(HttpSession session) {
		log.info("classPage()");
		
		String view = null;
		MemberDto loggedInMember = (MemberDto) session.getAttribute("login");
		
		try {
		if (loggedInMember != null) {
			view = "Class/classpage";
			return view;
			} else {
				view = "redirect:login";
			
			return view;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			view = "redirect:login";
			
			return view;
		}
	}

	public String class1proc(ClassDto classDto, HttpSession session, RedirectAttributes rttr, Model model) {
		log.info("class1proc()");
		String msg = null;
		String view = null;
		MemberDto loggedInMember = (MemberDto) session.getAttribute("login");
		Integer m_id = loggedInMember.getM_id();
		String className = classDto.getClassName();
		
		try {
			
			classDto.setM_id(m_id);
			loggedInMember.setClassName(className);
			
			// System.out.println("classDto = " + classDto);
			// System.out.println("loggedInMember = " + loggedInMember);

			// MemberDto의 ClassName 정보 업데이트
			cDao.class1proc(classDto); // 저장 성공
			
			cDao.PlusMemberClassName(className, m_id);
			cDao.PlusClassNameMember(className, m_id);
			view = "redirect:/?";
			msg = "수강신청 성공";
			rttr.addFlashAttribute("msg", msg);
			return view;
			
		} catch (Exception e) { // 저장 실패
			e.printStackTrace();
			view = "redirect:/?";
			msg = "수강신청 실패";
			rttr.addFlashAttribute("msg", msg);
			return view;
		}	
	}

	public Integer getClassLimit(String className) {
	    log.info("getClassLimitServ()");
	    
	    int classNameCount = cDao.classLimit(className);
	    
	   return classNameCount;
	}
		// 이메일 중복체크 

	public void class1(Integer m_id, Model model) {
		log.info("class1()");
		List<ClassDto> cList = cDao.checkClass(m_id);
		System.out.println(m_id);
		model.addAttribute("cList", cList);
		System.out.println("class1 serv = " + cList);
	}

}

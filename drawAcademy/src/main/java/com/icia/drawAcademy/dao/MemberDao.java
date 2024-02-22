package com.icia.drawAcademy.dao;




import java.util.List;
import java.util.Map;

import com.icia.drawAcademy.dto.ClassDto;
import com.icia.drawAcademy.dto.MemberDto;

public interface MemberDao {

	void signUp(MemberDto memberDto);
	
	MemberDto login(MemberDto memberDto);
	
	void updateMember(MemberDto memberDto);
	
	void memout(Integer m_id);
	
	Integer checkEmail(String m_email);
	
	MemberDto myPage(Integer m_id);
	
	List<ClassDto> getClasslist(String m_email);
} // interface end
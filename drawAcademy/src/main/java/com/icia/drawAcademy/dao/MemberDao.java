package com.icia.drawAcademy.dao;



import java.util.List;

import com.icia.drawAcademy.dto.MemberDto;

public interface MemberDao {

	void signUp(MemberDto memberDto);
	
	MemberDto login(MemberDto memberDto);
	
} // interface end

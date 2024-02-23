package com.icia.drawAcademy.dao.classdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icia.drawAcademy.dto.ClassDto;


public interface ClassDao {

	void class1proc(ClassDto classdto);
	
	void PlusMemberClassName(@Param("className")String className,@Param("m_id") Integer m_id);
	
	void PlusClassNameMember(@Param("className")String className,@Param("m_id") Integer m_id);
							
	Integer classLimit(String className);
	
	List<ClassDto> checkClass(Integer m_id);
}

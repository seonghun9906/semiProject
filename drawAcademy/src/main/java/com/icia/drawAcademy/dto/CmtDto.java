package com.icia.drawAcademy.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Alias("CmtDTO")
public class CmtDto {
   
   private int c_code;
   private String c_contents;
   private int b_code;
   private Integer m_id;
}
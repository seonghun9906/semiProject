package com.icia.drawAcademy.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Alias("QueDTO")
public class QboardDto {
   
   private int b_code; // �Խ��� ��ȣ
   private Integer m_id; // ȸ�� ��ȣ
   private String b_title; // �� ����
   private String b_contents; // �� ����
}
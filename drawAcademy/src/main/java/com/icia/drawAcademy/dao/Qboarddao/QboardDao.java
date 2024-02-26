package com.icia.drawAcademy.dao.Qboarddao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.icia.drawAcademy.dto.QboardDto;

public interface QboardDao {
   
   // �Խ��� ��� ��������
   List<QboardDto> getQboardList(Map<String, Integer> pMap);

   // ��ü �Խù� ���� ���ϱ�
   @Select("SELECT count(*) FROM Qboard")
   int cntQboard();
   
   // �Խù� ���� �Է�
   void insertQBoard(QboardDto qboard);

   QboardDto Qboardlist(QboardDto qboard);

   void updateQBoard(QboardDto qboard);

   QboardDto selectQBoard(Integer b_code);

   void deleteQBoard(Integer b_code);

   void deleteMemQboard(Integer id);
   
   
}
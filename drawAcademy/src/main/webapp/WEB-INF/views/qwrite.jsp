<%@page import="com.icia.drawAcademy.dto.QboardDto"%>
<%@page import="com.icia.drawAcademy.dao.Qboarddao.QboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시물 작성</title>
<script>
   $(function() {
      let m = "${msg}";
      if (m != "") {
         alert(m);
      }
   });
</script>
</head>
<body>
      <form action="qwriteProc" method="post">
         <h2>게시물 등록</h2>
         <input type="hidden" value="${sessionScope.login}" name="m_id">
         <input type="text" placeholder="제목" name="b_title"> <input
            type="text" placeholder="내용" name="b_contents"> <input
            type="text" placeholder="비밀번호" name="b_password">
         <button value="submit">등록</button>
      </form>
   
   <%
   System.out.println("qboard_m_id: " + request.getAttribute("qboard_m_id"));
   %>
   <%
   System.out.println("session.login: " + session.getAttribute("login"));
   %>
</body>
<script>
   $("#backbtn").click(function() {
      location.href = `./detail?b_code=${qboard.b_code}`;
   });
</script>
</html>
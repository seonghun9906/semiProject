<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강취소</title>
</head>

<body>
<h4>내 수강목록</h4>


		
		<c:forEach var="cl" items="${cList}">
		<form action="classCancleProc" method="post">
	  		<li>${cl.className} : ${cl.day} ${cl.date} ${cl.time} 
	  			<button type="submit">취소</button>
	  		</li>
	  		<input type="hidden" value="${sessionScope.login.m_id}" name="m_id">
	  		<input type="hidden" value="${cl.c_id}" name="c_id">
	  		<input type="hidden" value="${cl.className}" name="className">
	  		<input type="hidden" value="${cl.day} " name="day">
	  		<input type="hidden" value="${cl.date}" name="date">
	  		<input type="hidden" value="${cl.time}" name="time">
  		</form>
  		</c:forEach>
  		
</body>
<script type="text/javascript">
let msg = "${msg}";
if(msg != ""){
	alert(msg);
}	

</script>
</html>
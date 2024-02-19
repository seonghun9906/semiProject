<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script>
	$(function() {
		let msg = "${msg}";
		if(msg != ""){
			alert(msg);
		}
	});

</script>
</head>


<body>
	<h1>Sign Up</h1>
	<form action="signUpProc" method="post" enctype="multipart/form-data">
		<input type="text" placeholder="이메일" name="m_email" id="signUpEamil">
		<div id="emailCheckResult"></div>
		<input type="text" placeholder="비밀번호" name="m_password">
		<input type="text" placeholder="이름" name="m_name"> 
		<input type="text" placeholder="전화번호" name="m_phoneNumber">
		<input type="text" placeholder="주소" name="m_address">
		<input type="text" placeholder="나이" name="m_age">
		<input type="text" placeholder="프로필사진">
		
		<label for="classCode">클래스:</label>
        <select name="classCode">
            <option value="Classcode1">Classcode1</option>
            <option value="Classcode2">Classcode2</option>
            <option value="Classcode3">Classcode3</option>
        </select>
        
		<input type="submit" value="Test">
		<br>
	</form>
		
		
		
		<button onclick="location.href='./'">홈페이지 돌아가기</button>
</body>
</html>
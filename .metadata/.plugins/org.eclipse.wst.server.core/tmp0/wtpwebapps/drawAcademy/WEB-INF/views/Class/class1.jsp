<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>


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
  	 let m = "${msg}";
   	if (m != "") {
      alert(m);
   	}
	});
</script>
</head>
<body>
<h4>Class1</h4>
<img src="resources/images/강사 프로필 사진.PNG" alt="강사1">
<p>
    <span>date: 3/19</span>
    <span>day: Mon</span>
    <span>Time: 7:30-8:30</span>
    <span>Class A</span>
    <span>${classLimitA}/20</span>
</p>
<p>
    <span>date: 3/19</span>
    <span>day: Mon</span>
    <span>Time: 7:30-8:30</span>
    <span>Class B</span>
    <span>${classLimitB}/20</span>
</p>
<p>
    <span>date: 3/19</span>
    <span>day: Mon</span>
    <span>Time: 7:30-8:30</span>
    <span>Class C</span>
    <span>${classLimitC}/20</span>
</p>
<form action="class1proc" method="post" id="class1proc" onsubmit="checkClass()">
    <label for="selectOption">Choose an option:</label>
    <select id="selectOption" name="className">
    	<option value="none" id="none" selected>선택</option>
        <option value="classA" id="classA">Class A</option>
        <option value="classB" id="classB">Class B</option>
        <option value="classC" id="classC">Class C</option>
    </select>
    <p>
        <span>Date: <input type="text" id="dateField" name="date" readonly></span>
        <br><span>Day: <input type="text" id="dayField" name="day" readonly></span>
        <br><span>Time: <input type="text" id="timeField" name="time" readonly></span>
         <input type="hidden" name="m_id" value="${m_id}">
    </p>
    	<ul>
         <c:forEach var="cl" items="${cList}" varStatus="loop">
 			<input type="hidden" id="classCheck" value="${cl.className}"> 
 			<li>${cl.className}</li> 
         </c:forEach>
         </ul>
         
    <input type="submit" value="수강신청" >
</form>
</body>


<script>
$(document).ready(function () {
	
	//아무것도 선택안했을시 비활성화
	 $("#dateField, #dayField, #timeField").prop("disabled", true);
	 
	 
	$("#selectOption").on('change', function () {
        var selectedClass = $(this).val();
        console.log("selectedClass:", selectedClass);
        
        var classCheckElement = document.querySelectorAll("#classCheck");
        //console.log(classCheckElement);
        
        for(var classCheckItem of classCheckElement){
        	//console.log(classCheckItem);
        	var classCheck = classCheckItem ? classCheckItem.value : null;
        	console.log("consolelog = " + classCheck);
        	
        	if (classCheck == selectedClass) {
                alert("이미 수강신청한 CLASS입니다.");
                event.preventDefault();
                $("#dateField, #dayField, #timeField").prop("disabled", true);
                
                // 이미 중복되었다고 알리고 필드를 빈칸으로 비활성화
                $("#dateField").val("");
                $("#dayField").val("");
                $("#timeField").val("");
                return;
                break;
            }else if (selectedClass == "none"){
            	 $("#dateField, #dayField, #timeField").prop("disabled", true);
                 
                 // 이미 중복되었다고 알리고 필드를 빈칸으로 비활성화
                 $("#dateField").val("");
                 $("#dayField").val("");
                 $("#timeField").val("");
                 return;
            	 break;
            }
        }
        /* var classCheck = classCheckElement ? classCheckElement.value : null
       	console.log("consolelog = " + classCheck); 
        		
        if (classCheck == selectedClass) {
            alert("이미 수강신청한 CLASS입니다.");
            
        }*/
        
        // 선택된 클래스에 따라 필드 값 설정
        if (selectedClass === "classA") {
            $("#dateField").val("3/19");
            $("#dayField").val("MON");
            $("#timeField").val("7:30-8:30");
        } else if (selectedClass === "classB") {
            $("#dateField").val("3/20");
            $("#dayField").val("TUE");
            $("#timeField").val("8:30-9:30");
        } else if (selectedClass === "classC") {
            $("#dateField").val("3/21");
            $("#dayField").val("WED");
            $("#timeField").val("3:30-4:30");
        }
            // 이미 수강 중이라면 필드를 활성화하지 않음
        
   		  // 필드를 활성화
      	  $("#dateField, #dayField, #timeField").prop("disabled", false);
            
        // 이미 수강 중인 경우 폼 제출을 막음
        if (isFieldDisabled) {
            alert("이미 수강신청한 CLASS입니다.");
            event.preventDefault();
        }
    });
});
</script>
  <!-- -------------------------------------------------------- -->
	<script>
	
	</script>
  <!-- -------------------------------------------------------- -->
  <script>
  function checkClass() {
	    var selectedClass = $("#selectOption").val();
  		var classLimitAValue = ${classLimitA};
  		var classLimitBValue = ${classLimitB};
  		var classLimitCValue = ${classLimitC};
		
		
  	// 정원 초과 체크
 	 if (selectedClass === "classA" && classLimitAValue >= 20) {
      alert("classA 정원이 초과되었습니다. 수강신청이 불가합니다.");
      event.preventDefault();
 	 } else if (selectedClass === "classB" && classLimitBValue >= 20) {
      alert("classB 정원이 초과되었습니다. 수강신청이 불가합니다.");
      event.preventDefault();
  	} else if (selectedClass === "classC" && classLimitCValue >= 20) {
      alert("classC 정원이 초과되었습니다. 수강신청이 불가합니다.");
      event.preventDefault();
  	} 
     </script>


</html>
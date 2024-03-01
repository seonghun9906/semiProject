<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
<link rel="stylesheet" href="resources/css/qboard.css">
<!-- jQuery 라이브러리 추가 -->
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body>

<!-- 메뉴 버튼 -->
      <div class=title>FAQ</div>
   <header class="headerMenu">
      <button class="Home-btn" onclick="location.href='./'">
         <img src="resources/images/lg.png" class="logo">
      </button>
      <div id="menu-container">
         <img src="resources/images/menu.png" id="menuButton">
         <div id="rectangle">
            <br> <br>
            <button class="Home-btn" onclick="location.href='./'">
               <p>HOME</p>
            </button>
            <br> <br> <br>
            <button class="ABOUT-btn" onclick="location.href='./about'">
               <p>ABOUT</p>
            </button>
            <br> <br> <br>
            <button class="INSTRUCTORS-btn"
               onclick="location.href='./instructors'">
               <p>INSTRUCTORS</p>
            </button>
            <br> <br> <br>
            <button class="CLASS-btn" onclick="location.href='./classpage'">
               <p>CLASS</p>
            </button>
            <br> <br> <br>
            <button class="CONTACT-btn" onclick="location.href='./qboard'">
               <p>FAQ</p>
            </button>
            <br> <br> <br> <br> <br> <br> <br>
            <div class="smallWord">
               <button id="loginBtn" class="LOGIN-btn"
                  onclick="location.href='./login'">
                  <small>LOGIN</small>
               </button>
               <form id="logoutForm" action="logout" method="get">
                  <button class="LOGIN-btn" onclick="location.href='./'">
                     <small>LOGOUT</small>
                  </button>
               </form>
               <button id="signupBtn" class="SIGNUP-btn"
                  onclick="location.href='./signUp'">
                  <small>SIGN UP</small>
               </button>
               <button id="myPage" class="MYPAGE-btn"
                  onclick="location.href='./mypage'">
                  <small>MY PAGE</small>
               </button>
            </div>
            <br> <br>
            <div id="icon-container2">
               <a href="https://www.facebook.com"> <img
                  src="resources/images/facebookIcon.png" class="facebook">
               </a> <a href="https://www.youtube.com"> <img
                  src="resources/images/youtubeIcon.png" class="youtube">
               </a> <a href="https://www.instagram.com"> <img
                  src="resources/images/instagramIcon.png" class="instagram">
               </a>
            </div>
         </div>
      </div>
      <div id="icon-container">
         <a href="https://www.facebook.com"> <img
            src="resources/images/facebookIcon.png" class="facebook">
         </a> <a href="https://www.youtube.com"> <img
            src="resources/images/youtubeIcon.png" class="youtube">
         </a> <a href="https://www.instagram.com"> <img
            src="resources/images/instagramIcon.png" class="instagram">
         </a>
      </div>
      
   </header>

   <!-- 게시물 -->
   <main class="middle-part">
      <section class="content-box">
         <div class="commentList">
            <c:if test="${empty qList}">
               <section class="qboard-item">
                  <span class="none-content">등록된 게시물이 없습니다.</span>
               </section>
            </c:if>

            <c:if test="${qList ne null}">
               <c:forEach var="qqq" items="${qList}">
                  <section class="qboard-item">
                     <a id="qlist" href="./detail?b_code=${qqq.b_code}">제목 : "${qqq.b_title}"
                     </a>
                  </section>
               </c:forEach>
            </c:if>
            <!-- 페이지 기능 -->
         </div>
         <section class="paging-area">
            <section class="paging">${paging}</section>
         </section>
         <section class="wr-btn">
            <button id="cklogin" onclick="location.href='./qwrite'">질문등록</button>
         </section>
      </section>
   </main>


   -----------------------------


</body>
<!-- 메뉴 버튼 기능 -->
<script>
   var rectangle = document.getElementById('rectangle');
   var menuButton = document.getElementById('menuButton');
   var iconContainer = document.getElementById('icon-container');
   var isRectangleVisible = false; // rectangle의 초기 상태를 정의 - 첫 메뉴 클릭 때 실행되지 않는 현상 해결

   menuButton.addEventListener('click', function() {
      if (!isRectangleVisible) {
         rectangle.style.display = 'block';
         iconContainer.style.display = 'none'; //메뉴 창이 나오면서 iconcontainer 사라지기
         isRectangleVisible = true; // rectangle이 보이는 상태로 설정
      } else {
         rectangle.style.display = 'none';
         iconContainer.style.display = 'flex';
         isRectangleVisible = false; // rectangle이 숨겨진 상태로 설정
      }
   });
</script>





<script>
    $(document).ready(function() {
            // JSP에서 가져온 값을 JavaScript 변수에 할당
            var loggedInUserId = "<%=session.getAttribute("login.m_id")%>";
         
            // 질문 등록 버튼 클릭 이벤트 핸들러
            $("#cklogin").click(function() {
                // JavaScript 변수를 사용하여 로그인 여부 확인
                if (!loggedInUserId) {
                    alert("로그인 후 이용해주세요.");
                } else {
                    location.href = './qwrite';
                }
            });

   $("#upbtn").click(function() {
      location.href = `./QBUpdate?b_code=${qqq.b_code}`;
   });
</script>
</html>
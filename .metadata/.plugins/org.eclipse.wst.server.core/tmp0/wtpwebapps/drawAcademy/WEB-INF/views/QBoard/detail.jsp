<%@page import="com.icia.drawAcademy.dto.QboardDto"%>
<%@page import="com.icia.drawAcademy.dao.Qboarddao.QboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/detail.css">
</head>
<body>
   <div class="bodyMain">
      <div class="title">FAQ</div>
      <header class="headerMenu">
         <button class="Home-btn" onclick="location.href='./'">
            <img src="resources/images/lg.png" class="logo">
         </button>
      </header>
      <div class="headerMenu">
         <button class="Home-btn" onclick="location.href='./'">
            <img src="resources/images/lg.png" class="logo">
         </button>
      </div>
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
      <main class=detail-main>
         <!-- 게시글 상세 내용 출력(div) -->
         <section class="detail">
            <section class="detail-sub">
               <section class="detail-title">
                  <h2>FAQ</h2>
                  <section class="detail-title2">
                     <h2>${qboard.b_title}</h2>
                     <h4 class="author">${qboard.m_name}</h4>
                  </section>
               </section>
            </section>
            <section class="detail-sub">
               <section class="detail-content">
                  <h4>${qboard.b_contents}</h4>
               </section>
            </section>
            <div class="btn-area">

               <c:if test="${sessionScope.login.m_id eq qboard.m_id}">
                  <div class="btn-write1">
                     <a href="QBUpdate?b_code=${qboard.b_code}">
                        <button id="upbtn">
                           <span></span> <span></span> <span></span> <span></span> 수정
                        </button>
                     </a>
                  </div>
               </c:if>

               <div class="btn-write2">
                  <c:if test="${sessionScope.login.m_id eq qboard.m_id}">
                     <form action="delete?b_code=${qboard.b_code}" method="post">
                        <button  id="delbtn">
                           <span></span> <span></span> <span></span> <span></span>삭제
                        </button>
                     </form>
                  </c:if>
               </div>
            </div>

            <!-- 댓글 기능 -->
            <!-- 댓글 작성 -->
            <div id="comment">
               <form action="inscProc" method="post" onsubmit="scrollToComment()">
                  <input type="hidden" name="b_code" value="${qboard.b_code}">
                  <input type="hidden" name="m_id" value="${sessionScope.login.m_id}"> 
                  <input type="text" placeholder="내용" name="c_contents">
                  <button value="submit">등록</button>
               </form>
               <c:choose>
                  <c:when test="${empty cmtList}">
                     <div class="cmt-item">
                        <span class="none-content">등록된 댓글이 없습니다.</span>
                     </div>
                  </c:when>
                  <c:otherwise>
                     <h3>댓글</h3>
                     <c:forEach var="ccc" items="${cmtList}">
                        <div>
                           <p id="author">작성자: ${sessionScope.login.m_name}</p>
                           <p id="cContents">${ccc.c_contents}</p>
                        </div>
                     </c:forEach>
                  </c:otherwise>
               </c:choose>
            </div>
         </section>
      </main>
   </div>



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

      // 댓글을 작성한 후 페이지 스크롤 위치를 유지
      function scrollToComment() {
         // 댓글 영역의 상단 좌표를 가져옴
         var commentSection = document.getElementById("comment");
         var commentSectionTop = commentSection.offsetTop;

         // 페이지를 댓글 영역의 상단으로 스크롤
         window.scrollTo(0, commentSectionTop);
      }

      // 댓글이 추가될 때 화면의 크기 조정
      function adjustScreenSize() {
         // 현재 문서의 전체 높이
         var documentHeight = document.body.scrollHeight;

         // 브라우저 높이
         var windowHeight = window.innerHeight;

         // 브라우저 높이보다 문서의 높이가 작을 경우
         if (documentHeight < windowHeight) {
            // 문서의 높이를 브라우저 높이로 조정
            document.body.style.height = windowHeight + 'px';
         } else {
            // 문서의 높이를 기존 높이로 유지
            document.body.style.height = documentHeight + 'px';
         }
      }

      // 페이지 로드 시 화면 크기 조정
      window.onload = function() {
         adjustScreenSize();
      };

      // 댓글이 추가될 때 화면 크기 조정
      function addComment() {
         // 댓글 추가 작업 수행 후
         // 화면 크기 조정 함수 호출
         adjustScreenSize();
      }
   </script>

   <script>
      //게시글 삭제
   </script>
</body>
</html>
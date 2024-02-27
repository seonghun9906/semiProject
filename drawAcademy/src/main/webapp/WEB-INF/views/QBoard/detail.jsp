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
</head>
<body>
   <div class="content">
      <header class="headerMenu">
         <button class="Home-btn" onclick="location.href='./'">
            <img src="resources/images/lg.png" class="logo">
         </button>
      </header>
      <h2 class="form-header">상세 보기</h2>
      <!-- 게시글 상세 내용 출력(div) -->
      <div class="detail">
         <div class="detail-sub">
            <div class="detail-content"></div>
         </div>
      </div>
      <div class="detail">
         <div class="detail-sub">
            <div class="detail-title">제목</div>
            <div class="detail-content">${qboard.b_title}</div>
         </div>

         <div class="detail-sub">
            <div class="detail-title">내용</div>
            <div class="detail-content">${qboard.b_contents}</div>
         </div>

      </div>
   </div>
   <div class="btn-area">
      <c:if test="${sessionScope.login.m_id eq qboard.m_id}">
         <a href="QBUpdate?b_code=${qboard.b_code}">
            <button class="btn-write" id="upbtn">수정</button>
         </a>
      </c:if>

      <c:if test="${sessionScope.login.m_id eq qboard.m_id}">
         <form action="delete?b_code=${qboard.b_code}" method="post">
            <button class="btn-write" id="delbtn">삭제</button>
         </form>
      </c:if>



   </div>
   <!-- 댓글 기능 -->



   <!-- 댓글 작성 -->
   <div>
      <form action="inscProc" method="post">
         <input type="hidden" name="b_code" value="${qboard.b_code}">
         <input type="hidden" name="m_id" value="${sessionScope.login.m_id}">
         <input type="text" placeholder="내용" name="c_contents">
         <button value="submit">등록</button>
      </form>
      <div>
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
                     <p>작성자: ${sessionScope.login.m_name}</p>
                     <p>${ccc.c_contents}</p>
                  </div>
               </c:forEach>
            </c:otherwise>
         </c:choose>
      </div>

   </div>




   <script>
      //게시글 삭제
      $("#delbtn").click(function() {
         let conf = confirm("삭제할까요?");
         if (conf) {
            location.href = `./delete?b_code=${qboard.b_code}`;
         }
      });
   </script>
</body>
</html>
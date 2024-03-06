<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청 사이트</title>
<link rel="stylesheet" href="resources/css/classpage.css">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
   integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
   crossorigin="anonymous"></script>

</head>
<body>
   <div class="bodyMain">
      <div class="title">
         CLASS
      </div>
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
      
   
   <div class = cal>
	<h2>2024년 3월</h2>
	<table>
    	<thead>
        <tr>
            <th>SUN</th>
            <th>MON</th>
            <th>TUE</th>
            <th>WED</th>
            <th>THU</th>
            <th>FIR</th>
            <th>SAT</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>1
            	<ul>
            <li><a href="class1" class="Testclass">TeacherName1</a></li>
            <br>
            <li><a href="class2" class="Testclass">TeacherName2</a></li>
            <br>
            <li><a href="class3" class="Testclass">TeacherName3</a></li>
            </ul>
            </td>
            <td>2
             <p><a href="class1" class="Testclass">TeacherName1</a></p>
            <p><a href="class2" class="Testclass">TeacherName2</a></p>
            </td>
        </tr>
        <tr>
            <td>3
              <p><a href="class1" class="Testclass">TeacherName1</a></p>
           
            <p><a href="class3" class="Testclass">TeacherName3</a></p></td>
            <td>4
              <p><a href="class1" class="Testclass">TeacherName1</a></p>
            <p><a href="class2" class="Testclass">TeacherName2</a></p>
          
            <td>5
              <p><a href="class1" class="Testclass">TeacherName1</a></p>
            <p><a href="class2" class="Testclass">TeacherName2</a></p>
            <p><a href="class3" class="Testclass">TeacherName3</a></p></td>
            <td>6
              
            <p><a href="class2" class="Testclass">TeacherName2</a></p>
            <p><a href="class3" class="Testclass">TeacherName3</a></p></td>
            <td>7
              <p><a href="class1" class="Testclass">TeacherName1</a></p>
            <p><a href="class2" class="Testclass">TeacherName2</a></p>
            <p><a href="class3" class="Testclass">TeacherName3</a></p></td>
            <td>8
              <p><a href="class1" class="Testclass">TeacherName1</a></p>
            
            <p><a href="class3" class="Testclass">TeacherName3</a></p></td>
            <td>9
          
            <p><a href="class3" class="Testclass">TeacherName3</a></p></td>
        </tr>
        <tr>
            <td>10</td>
            <td>11</td>
            <td>12</td>
            <td>13</td>
            <td>14</td>
            <td>15</td>
            <td>16</td>
        </tr>
        <tr>
            <td>17</td>
            <td>18</td>
            <td>19</td>
            <td>20</td>
            <td>21</td>
            <td>22</td>
            <td>23</td>
        </tr>
        <tr>
            <td>24</td>
            <td>25</td>
            <td>26</td>
            <td>27</td>
            <td>28</td>
            <td>29</td>
            <td>30</td>
        </tr>
        <tr>
            <td>31</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </tbody>
</table>
</div>

</div><!-- bodymain -->


</body>
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
 
document.addEventListener("DOMContentLoaded", function() {
  var loginBtn = document.getElementById("loginBtn");
  var logoutForm = document.getElementById("logoutForm");
  var signupBtn = document.getElementById("signupBtn");
  var myPageBtn = document.getElementById("myPage");

  var loggedInMember = '<%=session.getAttribute("login")%>';
  
      console.log("세션에 저장된 값: " + loggedInMember);
      // 여기서 로그인 여부를 확인하고 그에 따라 버튼을 표시하거나 숨깁니다.
      var isLoggedIn = loggedInMember !== 'null' && loggedInMember !== '';

      if (isLoggedIn) {
         loginBtn.style.display = "none";
         logoutForm.style.display = "block";
         signupBtn.style.display = "none";
         myPageBtn.style.display = "block";
      } else {
         loginBtn.style.display = "block";
         logoutForm.style.display = "none";
         signupBtn.style.display = "block";
         myPageBtn.style.display = "none";
      }
   });
</script>
<script>
   console.log("classLimitB 값: ${classLimitB}");
</script>
</html>
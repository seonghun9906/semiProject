/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-03-03 23:47:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/icia.semiproject/semiProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/drawAcademy/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1709467646910L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Test Home</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/login.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.min.js\"\n");
      out.write("   integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\"\n");
      out.write("   crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("   src=\"https://unpkg.com/youtube-background@1.0.14/jquery.youtube-background.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("   $(function() {\n");
      out.write("      let m = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("      if (m != \"\") {\n");
      out.write("         alert(m);\n");
      out.write("      }\n");
      out.write("   });\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<!--<h1> Home Page</h1>   -->\n");
      out.write("<body>\n");
      out.write("   <div class=\"bodyMain\">\n");
      out.write("      <div class=\"headerMenu\">\n");
      out.write("         <button class=\"Home-btn\" onclick=\"location.href='./'\">\n");
      out.write("            <img src=\"resources/images/lg.png\" class=\"logo\">\n");
      out.write("         </button>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"menu-container\">\n");
      out.write("         <img src=\"resources/images/menu.png\" id=\"menuButton\">\n");
      out.write("         <div id=\"rectangle\">\n");
      out.write("            <br> <br>\n");
      out.write("            <button class=\"Home-btn\" onclick=\"location.href='./'\">\n");
      out.write("               <p>HOME</p>\n");
      out.write("            </button>\n");
      out.write("            <br> <br> <br>\n");
      out.write("            <button class=\"ABOUT-btn\" onclick=\"location.href='./about'\">\n");
      out.write("               <p>ABOUT</p>\n");
      out.write("            </button>\n");
      out.write("            <br> <br> <br>\n");
      out.write("            <button class=\"INSTRUCTORS-btn\"\n");
      out.write("               onclick=\"location.href='./instructors'\">\n");
      out.write("               <p>INSTRUCTORS</p>\n");
      out.write("            </button>\n");
      out.write("            <br> <br> <br>\n");
      out.write("            <button class=\"CLASS-btn\" onclick=\"location.href='./classpage'\">\n");
      out.write("               <p>CLASS</p>\n");
      out.write("            </button>\n");
      out.write("            <br> <br> <br>\n");
      out.write("              <button class=\"CONTACT-btn\" onclick=\"location.href='./qboard'\">\n");
      out.write("               <p>FAQ</p>\n");
      out.write("            </button>\n");
      out.write("            <br> <br> <br> <br> <br> <br> <br>\n");
      out.write("            <br> <br> <br> <br> <br> <br> <br>\n");
      out.write("            <div class=\"smallWord\">\n");
      out.write("               <button id=\"loginBtn\" class=\"LOGIN-btn\" onclick=\"location.href='./login'\">\n");
      out.write("                  <small>LOGIN</small>\n");
      out.write("               </button>\n");
      out.write("               <form id=\"logoutForm\" action=\"logout\" method=\"get\">\n");
      out.write("                <button class=\"LOGIN-btn\" onclick=\"location.href='./'\">\n");
      out.write("                  <small>LOGOUT</small>\n");
      out.write("               </button>\n");
      out.write("               </form>\n");
      out.write("               <button id=\"signupBtn\" class=\"SIGNUP-btn\" onclick=\"location.href='./signUp'\">\n");
      out.write("                  <small>SIGN UP</small>\n");
      out.write("               </button>\n");
      out.write("               <button id=\"myPage\" class=\"MYPAGE-btn\" onclick=\"location.href='./mypage'\">\n");
      out.write("            	<small>MY PAGE</small>\n");
      out.write("         		</button>\n");
      out.write("            </div>\n");
      out.write("            <br> <br> <br>\n");
      out.write("            <div id=\"icon-container2\">\n");
      out.write("               <a href=\"https://www.facebook.com\"> <img\n");
      out.write("                  src=\"resources/images/facebookIcon.png\" class=\"facebook\">\n");
      out.write("               </a> <a href=\"https://www.youtube.com\"> <img\n");
      out.write("                  src=\"resources/images/youtubeIcon.png\" class=\"youtube\">\n");
      out.write("               </a> <a href=\"https://www.instagram.com\"> <img\n");
      out.write("                  src=\"resources/images/instagramIcon.png\" class=\"instagram\">\n");
      out.write("               </a>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"icon-container\">\n");
      out.write("         <a href=\"https://www.facebook.com\"> <img\n");
      out.write("            src=\"resources/images/facebookIcon.png\" class=\"facebook\">\n");
      out.write("         </a> <a href=\"https://www.youtube.com\"> <img\n");
      out.write("            src=\"resources/images/youtubeIcon.png\" class=\"youtube\">\n");
      out.write("         </a> <a href=\"https://www.instagram.com\"> <img\n");
      out.write("            src=\"resources/images/instagramIcon.png\" class=\"instagram\">\n");
      out.write("         </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"video-container\">\n");
      out.write("       <div class=\"login-container\">\n");
      out.write("   <div class=\"login-box\">\n");
      out.write("      <h2>Login</h2>\n");
      out.write("      <form action=\"loginProc\" method=\"post\">\n");
      out.write("         <div class=\"user-box\">\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"m_email\" required=\"\"> <label\n");
      out.write("               for=\"email\">Username</label>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"user-box\">\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"m_password\" required=\"\">\n");
      out.write("            <label for=\"password\">Password</label>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("		<div class=\"button-container\">\n");
      out.write("         <button type=\"submit\">\n");
      out.write("            <span></span>\n");
      out.write("            <span></span> \n");
      out.write("            <span></span> \n");
      out.write("            <span></span> \n");
      out.write("            LOGIN\n");
      out.write("         </button>\n");
      out.write("         \n");
      out.write("           <button onclick=\"location.href='./signUp'\">\n");
      out.write("          <span></span>\n");
      out.write("         <span></span>\n");
      out.write("         <span></span>\n");
      out.write("         <span></span>\n");
      out.write("         SIGN UP\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      </form>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("      <!-- \n");
      out.write("      <div class=\"menuName\">\n");
      out.write("         <a href=\"signUp\">[회원가입 이동]</a> <a href=\"login\">[로그인 이동]</a> <a\n");
      out.write("            href=\"mypage\">[마이페이지]</a>\n");
      out.write("      </div> \n");
      out.write("      -->\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("   var rectangle = document.getElementById('rectangle');\n");
      out.write("   var menuButton = document.getElementById('menuButton');\n");
      out.write("   var iconContainer = document.getElementById('icon-container');\n");
      out.write("   var isRectangleVisible = false; // rectangle의 초기 상태를 정의 - 첫 메뉴 클릭 때 실행되지 않는 현상 해결\n");
      out.write("\n");
      out.write("   menuButton.addEventListener('click', function() {\n");
      out.write("      if (!isRectangleVisible) {\n");
      out.write("         rectangle.style.display = 'block';\n");
      out.write("         iconContainer.style.display = 'none'; //메뉴 창이 나오면서 iconcontainer 사라지기\n");
      out.write("         isRectangleVisible = true; // rectangle이 보이는 상태로 설정\n");
      out.write("      } else {\n");
      out.write("         rectangle.style.display = 'none';\n");
      out.write("         iconContainer.style.display = 'flex';\n");
      out.write("         isRectangleVisible = false; // rectangle이 숨겨진 상태로 설정\n");
      out.write("      }\n");
      out.write("   });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write(" \n");
      out.write("document.addEventListener(\"DOMContentLoaded\", function() {\n");
      out.write("  var loginBtn = document.getElementById(\"loginBtn\");\n");
      out.write("  var logoutForm = document.getElementById(\"logoutForm\");\n");
      out.write("  var signupBtn = document.getElementById(\"signupBtn\");\n");
      out.write("  var myPageBtn = document.getElementById(\"myPage\");\n");
      out.write("\n");
      out.write("  var loggedInMember = '");
      out.print( session.getAttribute("login") );
      out.write("';\n");
      out.write("  console.log(\"세션에 저장된 값: \" + loggedInMember);\n");
      out.write("  // 여기서 로그인 여부를 확인하고 그에 따라 버튼을 표시하거나 숨깁니다.\n");
      out.write("  var isLoggedIn = loggedInMember !== 'null' && loggedInMember !== '';\n");
      out.write("\n");
      out.write("  if (isLoggedIn) {\n");
      out.write("    loginBtn.style.display = \"none\";\n");
      out.write("    logoutForm.style.display = \"block\";\n");
      out.write("    signupBtn.style.display = \"none\";\n");
      out.write("    myPageBtn.style.display =\"block\";\n");
      out.write("  } else {\n");
      out.write("    loginBtn.style.display = \"block\";\n");
      out.write("    logoutForm.style.display = \"none\";\n");
      out.write("    signupBtn.style.display= \"block\";\n");
      out.write("    myPageBtn.style.display=\"none\";\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("  console.log(\"classLimitB 값: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classLimitB}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

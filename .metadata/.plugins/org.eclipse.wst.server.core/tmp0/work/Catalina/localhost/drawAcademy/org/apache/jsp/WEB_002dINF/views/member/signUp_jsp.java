/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-03-06 05:28:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/signup.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.min.js\"\n");
      out.write("	integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("<script>\n");
      out.write("	$(function() {\n");
      out.write("		let msg = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("		if(msg != \"\"){\n");
      out.write("			alert(msg);\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("  .white-text {\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("   <form action=\"signUpProc\" method=\"post\" id=\"signUpFrom\"\n");
      out.write("     onsubmit=\"return validateForm()\" class=\"joinForm\">\n");
      out.write("      <h2>SIGN UP</h2>\n");
      out.write("      <div class=\"textForm\">\n");
      out.write("         <input type=\"email\" class=\"id\" name=\"m_email\" placeholder=\"E-mail\" id=\"signUpEmail\" required>\n");
      out.write("      <span id=\"emailCheckResult\" class=\"checkResult\"></span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"textForm\">\n");
      out.write("         <input type=\"password\" class=\"pw\" name=\"m_password\" placeholder=\"Password\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"textForm\">\n");
      out.write("         <input type=\"text\" class=\"name\" name=\"m_name\" placeholder=\"이름\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"textForm\">\n");
      out.write("         <input type=\"text\" class=\"phoneNumber\" name=\"m_phoneNumber\" id=\"phoneNumber\" placeholder=\"전화번호 : 010-0000-0000 \" required>\n");
      out.write("         <span id=\"phoneNumberCheck\" class=\"checkResult\"></span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"textForm\">\n");
      out.write("         <input type=\"text\" class=\"address\" name=\"m_address\" placeholder=\"주소\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"textForm\">\n");
      out.write("         <input type=\"text\" id=\"birthdate\" class=\"age\" name=\"m_age\" placeholder=\"생년월일\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class =\"textForm\">\n");
      out.write("             <select id=\"selectOption\" name=\"sort\">\n");
      out.write("              <option value=\"student\">학생</option>\n");
      out.write("              <option value=\"teacher\">선생님</option>\n");
      out.write("          </select>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <button type=\"submit\">\n");
      out.write("         <span></span>\n");
      out.write("         <span></span>\n");
      out.write("         <span></span>\n");
      out.write("         <span></span>\n");
      out.write("         SIGN UP\n");
      out.write("      </button>\n");
      out.write("      \n");
      out.write("   </form>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("  $(document).ready(function() {\n");
      out.write("    // 이메일 중복 체크\n");
      out.write("    $(\"#signUpEmail\").on(\"blur\", function() {\n");
      out.write("      $.post(\"emailCheckResult\", { m_email: $(this).val() }, function(result) {\n");
      out.write("        $(\"#emailCheckResult\").text(result).addClass(\"white-text\");\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // 메뉴 토글\n");
      out.write("    var rectangle = $('#rectangle');\n");
      out.write("    var menuButton = $('#menuButton');\n");
      out.write("    var iconContainer = $('#icon-container');\n");
      out.write("\n");
      out.write("    menuButton.on('click', function() {\n");
      out.write("      var isRectangleVisible = rectangle.toggle().is(\":visible\");\n");
      out.write("      iconContainer.toggle(!isRectangleVisible);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // 로그인 여부에 따른 버튼 표시\n");
      out.write("    var loginBtn = $(\"#loginBtn\");\n");
      out.write("    var logoutForm = $(\"#logoutForm\");\n");
      out.write("    var signupBtn = $(\"#signupBtn\");\n");
      out.write("    var myPageBtn = $(\"#myPage\");\n");
      out.write("\n");
      out.write("    var loggedInMember = '");
      out.print( session.getAttribute("login") );
      out.write("';\n");
      out.write("    var isLoggedIn = loggedInMember !== 'null' && loggedInMember !== '';\n");
      out.write("\n");
      out.write("    loginBtn.toggle(!isLoggedIn);\n");
      out.write("    logoutForm.toggle(isLoggedIn);\n");
      out.write("    signupBtn.toggle(!isLoggedIn);\n");
      out.write("    myPageBtn.toggle(isLoggedIn);\n");
      out.write("\n");
      out.write("    // Datepicker 적용\n");
      out.write("    $(\"#birthdate\").datepicker({\n");
      out.write("      dateFormat: 'yy-mm-dd',\n");
      out.write("      changeYear: true,\n");
      out.write("      yearRange: '1900:2024',\n");
      out.write("      changeMonth: true,\n");
      out.write("      showMonthAfterYear: true,\n");
      out.write("      currentText: '오늘',\n");
      out.write("      closeText: '닫기',\n");
      out.write("      showDay: true\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // 전화번호 검증\n");
      out.write("    $(\"#signUpFrom\").submit(function(event) {\n");
      out.write("      var phoneNumberInput = $('#phoneNumber');\n");
      out.write("      var errorMessage = $('#phoneNumberCheck');\n");
      out.write("      var phoneNumberPattern = /^010-\\d{4}-\\d{4}$/;\n");
      out.write("\n");
      out.write("      if (!phoneNumberPattern.test(phoneNumberInput.val())) {\n");
      out.write("        errorMessage.text('(010-0000-0000 형식으로 입력해주세요)');\n");
      out.write("        alert(\"전화번호 형식을 다시 확인해주세요.\");\n");
      out.write("        errorMessage.css('color', 'white');\n");
      out.write("        event.preventDefault();\n");
      out.write("        return false;\n");
      out.write("      } else {\n");
      out.write("        errorMessage.text('');\n");
      out.write("        return true;\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  });\n");
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

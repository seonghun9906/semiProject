/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-22 04:06:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.Class;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class class1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/icia.semiproject/semiProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/drawAcademy/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1708260482529L));
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.min.js\"\r\n");
      out.write("	integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        // 클래스를 선택했을 때의 이벤트 처리\r\n");
      out.write("        $(\"#selectOption\").change(function () {\r\n");
      out.write("            // 선택된 옵션 값 가져오기\r\n");
      out.write("            var selectedClass = $(this).val();\r\n");
      out.write("\r\n");
      out.write("            // 선택된 클래스에 따라 필드 값 설정\r\n");
      out.write("            if (selectedClass === \"classA\") {\r\n");
      out.write("                $(\"#dateField\").val(\"3/19\");\r\n");
      out.write("                $(\"#dayField\").val(\"MON\");\r\n");
      out.write("                $(\"#timeField\").val(\"7:30-8:30\");\r\n");
      out.write("            } else if (selectedClass === \"classB\") {\r\n");
      out.write("                $(\"#dateField\").val(\"3/20\");\r\n");
      out.write("                $(\"#dayField\").val(\"TUE\");\r\n");
      out.write("                $(\"#timeField\").val(\"8:30-9:30\");\r\n");
      out.write("            } else if (selectedClass === \"classC\") {\r\n");
      out.write("                $(\"#dateField\").val(\"3/21\");\r\n");
      out.write("                $(\"#dayField\").val(\"WEN\");\r\n");
      out.write("                $(\"#timeField\").val(\"3:30-4:30\");\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // 필드를 활성화\r\n");
      out.write("            $(\"#dateField, #dayField, #timeField\").prop(\"disabled\", false);\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h4>Class1</h4>\r\n");
      out.write("<img src=\"resources/images/강사 프로필 사진.PNG\" alt=\"강사1\">\r\n");
      out.write("<p>\r\n");
      out.write("    <span>date: 3/19</span>\r\n");
      out.write("    <span>day: Mon</span>\r\n");
      out.write("    <span>Time: 7:30-8:30</span>\r\n");
      out.write("    <span>Class A</span>\r\n");
      out.write("    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classLimitA}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/20</span>\r\n");
      out.write("</p>\r\n");
      out.write("<p>\r\n");
      out.write("    <span>date: 3/19</span>\r\n");
      out.write("    <span>day: Mon</span>\r\n");
      out.write("    <span>Time: 7:30-8:30</span>\r\n");
      out.write("    <span>Class B</span>\r\n");
      out.write("    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classLimitB}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/20</span>\r\n");
      out.write("</p>\r\n");
      out.write("<p>\r\n");
      out.write("    <span>date: 3/19</span>\r\n");
      out.write("    <span>day: Mon</span>\r\n");
      out.write("    <span>Time: 7:30-8:30</span>\r\n");
      out.write("    <span>Class C</span>\r\n");
      out.write("    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classLimitC}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/20</span>\r\n");
      out.write("</p>\r\n");
      out.write("<form action=\"class1proc\" method=\"post\" id=\"class1proc\">\r\n");
      out.write("    <label for=\"selectOption\">Choose an option:</label>\r\n");
      out.write("    <select id=\"selectOption\" name=\"className\">\r\n");
      out.write("        <option value=\"classA\" id=\"classA\">Class A</option>\r\n");
      out.write("        <option value=\"classB\" id=\"classB\">Class B</option>\r\n");
      out.write("        <option value=\"classC\" id=\"classC\">Class C</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <p>\r\n");
      out.write("        <span>Date: <input type=\"text\" id=\"dateField\" name=\"date\" readonly></span>\r\n");
      out.write("        <br><span>Day: <input type=\"text\" id=\"dayField\" name=\"day\" readonly></span>\r\n");
      out.write("        <br><span>Time: <input type=\"text\" id=\"timeField\" name=\"time\" readonly></span>\r\n");
      out.write("        <input type=\"hidden\" name=\"m_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("        <input type=\"hidden\" name=\"m_email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m_email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    </p>\r\n");
      out.write("    <input type=\"submit\" value=\"수강신청\" >\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var classLimitAValue = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classLimitA}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("var classLimitBValue = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classLimitB}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("var classLimitCValue = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classLimitC}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("$(\"#class1proc\").submit(function (event) {\r\n");
      out.write("    var selectedClass = $(\"#selectOption\").val(); // 선택된 클래스 값 가져오기\r\n");
      out.write("\r\n");
      out.write("    if (selectedClass === \"classA\" && classLimitAValue >= 20) {\r\n");
      out.write("        alert(\"classA 정원이 초과되었습니다. 수강신청이 불가합니다.\");\r\n");
      out.write("        event.preventDefault();\r\n");
      out.write("    } else if (selectedClass === \"classB\" && classLimitBValue >= 20) {\r\n");
      out.write("        alert(\"classB 정원이 초과되었습니다. 수강신청이 불가합니다.\");\r\n");
      out.write("        event.preventDefault();\r\n");
      out.write("    } else if (selectedClass === \"classC\" && classLimitCValue >= 20) {\r\n");
      out.write("        alert(\"classC 정원이 초과되었습니다. 수강신청이 불가합니다.\");\r\n");
      out.write("        event.preventDefault();\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2018-06-09 21:40:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.eventmanager.utilities.Constants;

public final class resetPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.eventmanager.utilities.Constants");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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

String passwordResetStatus = (String)request.getSession().getAttribute(Constants.RESET_PASSWORD_STATUS);

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$(\"#errorMessage\").html(\"\");\r\n");
      out.write("\t\t\t");
if(passwordResetStatus!=null && !passwordResetStatus.equals("")){
      out.write("\r\n");
      out.write("\t\t\t$(\"#errorMessage\").html('");
      out.print(passwordResetStatus);
      out.write("');\r\n");
      out.write("\t\t\t");
}
			else{
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#errorMessage\").html(\"\");\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction validateCredentials(){\r\n");
      out.write("\t\t\tvar errorFlag = false;\r\n");
      out.write("\t\t\tvar currentPassword = $(\"#currentPassword\").val();\r\n");
      out.write("\t\t\tvar newPassword = $(\"#newPassword\").val();\r\n");
      out.write("\t\t\tvar confirmPassword = $(\"#confirmPassword\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#currentPasswordError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#newPasswordError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#confirmPasswordError\").html(\"\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(currentPassword == \"\"){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#currentPasswordError\").html(\"Please, enter your current password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(currentPassword.length != 8){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#currentPasswordError\").html(\"Invalid current password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(newPassword == \"\"){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#newPasswordError\").html(\"Please, enter your new password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(newPassword.length != 8){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#newPasswordError\").html(\"Invalid new password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(confirmPassword == \"\"){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#confirmPasswordError\").html(\"Please, confirm your password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(confirmPassword.length != 8){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#confirmPasswordError\").html(\"Invalid password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(newPassword != confirmPassword){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#confirmPasswordError\").html(\"Confirm password should be same as new password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(currentPassword == newPassword){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#newPasswordError\").html(\"New password should not be same as current password.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!errorFlag){\r\n");
      out.write("\t\t\t\t$(\"#resetPasswordForm\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("<title>Reset Password</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<form action=\"/event_manager/logout\" method=\"post\" id=\"logoutForm\">\r\n");
      out.write("\t\t<input type=\"button\" class=\"logoutButton\" id=\"logout\" value=\"Logout\" onclick=\"logoutFromEventManager()\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "backButton.jsp", out, false);
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<h1>Reset Password</h1>\r\n");
      out.write("\t\t<form id=\"resetPasswordForm\" action=\"/event_manager/resetPassword\" method=\"post\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" id=\"errorMessage\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"bold\">Current Password: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" id=\"currentPassword\" name=\"currentPassword\" maxlength=\"8\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"currentPasswordError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"bold\">New Password: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" id=\"newPassword\" name=\"newPassword\" maxlength=\"8\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"newPasswordError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"bold\">Confirm Password: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" id=\"confirmPassword\" name=\"confirmPassword\" maxlength=\"8\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"confirmPasswordError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input class=\"button\" type=\"button\" value=\"Reset Password\" onclick=\"validateCredentials()\"> </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"toDo\" name=\"toDo\" value=\"resetPassword\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</center>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\t\r\n");
      out.write("</body>\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2018-06-09 21:34:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.eventmanager.utilities.Constants;

public final class createNewEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String eventCreationStatus = (String)request.getSession().getAttribute(Constants.EVENT_CREATION_STATUS);
String errorMessage = null;
if(eventCreationStatus != null){
	if(!eventCreationStatus.contains("successful")){
		errorMessage = eventCreationStatus;
	}
}

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Event Listing</title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tclearErrors();\r\n");
      out.write("\t");
if(errorMessage!=null && !errorMessage.equals("")){
      out.write("\r\n");
      out.write("\t\t$(\"#errorMessage\").html('");
      out.print(errorMessage);
      out.write("');\r\n");
      out.write("\t");
}
	else{
      out.write("\r\n");
      out.write("\t\t$(\"#errorMessage\").html(\"\");\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function logoutFromEventManager() {\r\n");
      out.write("\t$(\"#logoutForm\").submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function createNewEvent() {\r\n");
      out.write("\tvar errorFlag = false;\r\n");
      out.write("\tvar eventName = $(\"#eventName\").val()\r\n");
      out.write("\tvar eventDescription = $(\"#eventDescription\").val()\r\n");
      out.write("\tvar eventLocation = $(\"#eventLocation\").val()\r\n");
      out.write("\tvar eventDate = $(\"#eventDate\").val()\r\n");
      out.write("\tvar ticketPrice = $(\"#ticketPrice\").val()\r\n");
      out.write("\tvar eventCapacity = $(\"#eventCapacity\").val()\r\n");
      out.write("\tvar numbers = /^[0-9]+$/;\r\n");
      out.write("\t\r\n");
      out.write("\tif(eventName == \"\"){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#nameError\").html(\"Please, enter a name for event.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#nameError\").html(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(eventName == \"\"){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#nameError\").html(\"Please, enter a name for event.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#nameError\").html(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(eventDescription == \"\"){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#descriptionError\").html(\"Please, enter a description for event.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#descriptionError\").html(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(eventLocation == \"\"){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#locationError\").html(\"Please, enter a location for event.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#locationError\").html(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(eventDate == \"\"){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#dateError\").html(\"Please, enter a date for event.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#dateError\").html(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(ticketPrice == \"\"){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#priceError\").html(\"Please, enter a ticket price.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(!ticketPrice.match(numbers)){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#priceError\").html(\"Please, enter numbers only.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#priceError\").html(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(eventCapacity == \"\"){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#capacityError\").html(\"Please, enter event capacity.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(!eventCapacity.match(numbers)){\r\n");
      out.write("\t\terrorFlag = true;\r\n");
      out.write("\t\t$(\"#capacityError\").html(\"Please, enter numbers only.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#capacityError\").html(\"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar time1 = $(\"#startTime\").val();\r\n");
      out.write("\tvar time2 = $(\"#endTime\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tvar [hours1,minutes1] = time1.split(':');\r\n");
      out.write("\tvar [hours2,minutes2] = time2.split(':');\r\n");
      out.write("\t\r\n");
      out.write("\tif(minutes1 == null || minutes2 == null){\r\n");
      out.write("\t\terrorFlag == true;\r\n");
      out.write("\t\t$(\"#timeError\").html(\"Please, select valid time.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$(\"#timeError\").html(\"\");\r\n");
      out.write("\t\tvar maridian1 = hours1 >= 12 ? \"PM\" : \"AM\";\r\n");
      out.write("\t\tvar maridian2 = hours2 >= 12 ? \"PM\" : \"AM\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\thours1 = hours1 % 12 + 12*(hours1%12 == 0);\r\n");
      out.write("\t\thours2 = hours2 % 12 + 12*(hours2%12 == 0);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar eventTime = hours1 + \":\" + minutes1 + \" \" + maridian1;\r\n");
      out.write("\t\teventTime = eventTime + \" to \" + hours2 + \":\" + minutes2 + \" \" + maridian2;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#eventTime\").val(eventTime);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!errorFlag){\r\n");
      out.write("\t\t$(\"#toDo\").val(\"createNewEvent\");\r\n");
      out.write("\t\t$(\"#eventCreationForm\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function clearErrors(){\r\n");
      out.write("\t$(\"#nameError\").html(\"\");\r\n");
      out.write("\t$(\"#descriptionError\").html(\"\");\r\n");
      out.write("\t$(\"#locationError\").html(\"\");\r\n");
      out.write("\t$(\"#dateError\").html(\"\");\r\n");
      out.write("\t$(\"#timeError\").html(\"\");\r\n");
      out.write("\t$(\"#priceError\").html(\"\");\r\n");
      out.write("\t$(\"#capacityError\").html(\"\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\t<h1>Create New Event</h1>\r\n");
      out.write("\t\t<form action=\"/event_manager/eventManager\" method=\"post\" id=\"eventCreationForm\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" id=\"errorMessage\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label class=\"bold\">Event Name:</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"eventName\" id=\"eventName\" maxlength=\"120\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"nameError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label class=\"bold\">Event Description:</label></td>\r\n");
      out.write("\t\t\t\t\t<td><textarea id=\"eventDescription\" name=\"eventDescription\" rows=\"4\" cols=\"21\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"descriptionError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label class=\"bold\">Event Location:</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"eventLocation\" id=\"eventLocation\" maxlength=\"200\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"locationError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label class=\"bold\">Event Date:</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"date\" name=\"eventDate\" id=\"eventDate\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"dateError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label class=\"bold\">Event Time:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"time\" name=\"startTime\" id=\"startTime\"> (From)\r\n");
      out.write("\t\t\t\t\t\t<input type=\"time\" name=\"endTime\" id=\"endTime\"> (To)\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"timeError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label class=\"bold\">Ticket Price:</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"ticketPrice\" id=\"ticketPrice\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"priceError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label class=\"bold\">Event Capacity:</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"eventCapacity\" id=\"eventCapacity\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"capacityError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"button\" class=\"button\" value=\"Create Event\" onclick=\"createNewEvent()\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"hidden\" id=\"toDo\" name=\"toDo\"></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"hidden\" id=\"eventTime\" name=\"eventTime\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
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

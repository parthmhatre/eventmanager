/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2018-06-09 21:38:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.eventmanager.events.EventTicket;
import com.eventmanager.utilities.Constants;
import com.eventmanager.events.Event;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.eventmanager.events.Event");
    _jspx_imports_classes.add("com.eventmanager.events.EventTicket");
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
      out.write("\r\n");
      out.write("\r\n");

EventTicket eventTicket = (EventTicket)request.getSession().getAttribute(Constants.SELECTED_TICKET);
Event event = eventTicket.getEvent();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$(\"#nameError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#cardNumberError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#monthError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#yearError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#cvvError\").html(\"\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction validateForm(){\r\n");
      out.write("\t\t\tvar errorFlag = false;\r\n");
      out.write("\t\t\tvar nameOnCard = $(\"#nameOnCard\").val();\r\n");
      out.write("\t\t\tvar cardNumber = $(\"#cardNumber\").val();\r\n");
      out.write("\t\t\tvar month = $(\"#month\").val();\r\n");
      out.write("\t\t\tvar year = $(\"#year\").val();\r\n");
      out.write("\t\t\tvar cvv = $(\"#cvv\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#nameError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#cardNumberError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#monthError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#yearError\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#cvvError\").html(\"\");\r\n");
      out.write("\t\t\tvar alphabets = /^[A-Za-z ]+$/;\r\n");
      out.write("\t\t\tvar numbers = /^[0-9]+$/;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(nameOnCard == \"\"){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#nameError\").html(\"Please, enter the name on your debit/credit card.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(!nameOnCard.match(alphabets)){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#nameError\").html(\"Please, enter alphabets only.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(cardNumber == \"\"){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#cardNumberError\").html(\"Please, enter card number.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(!cardNumber.match(numbers)){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#cardNumberError\").html(\"Please, enter numbers only.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(cardNumber.length != 16 || cardNumber < 1000000000000000){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#cardNumberError\").html(\"Please, enter a valid credit/debit card number.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(month == \"selectMonth\"){\r\n");
      out.write("\t\t\t\t$(\"#monthError\").html(\"Please, select a valid month.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(year == \"selectYear\"){\r\n");
      out.write("\t\t\t\t$(\"#yearError\").html(\"Please, select a valid year.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(cvv == \"\"){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#cvvError\").html(\"Please, enter CVV.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(!cvv.match(numbers)){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#cvvError\").html(\"Please, enter numbers only.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(cvv.length != 3 || cvv < 10){\r\n");
      out.write("\t\t\t\terrorFlag = true;\r\n");
      out.write("\t\t\t\t$(\"#cvvError\").html(\"Please, enter a valid CVV number.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!errorFlag){\r\n");
      out.write("\t\t\t\t$(\"#toDo\").val(\"purchaseTickets\");\r\n");
      out.write("\t\t\t\t$(\"#checkoutForm\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction backToEventListing(){\r\n");
      out.write("\t\t\t$(\"#eventListingForm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("<title>Checkout</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<form action=\"/event_manager/logout\" method=\"post\" id=\"logoutForm\">\r\n");
      out.write("\t\t<input type=\"button\" class=\"logoutButton\" id=\"logout\" value=\"Logout\" onclick=\"logoutFromEventManager()\">\r\n");
      out.write("</form>\r\n");
      out.write("<form action=\"/event_manager/homepage\" method=\"post\" id=\"eventListingForm\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"action\" name=\"toDo\" value=\"backToEventListing\">\r\n");
      out.write("\t\t\t<input type=\"button\" class=\"backButton\" id=\"backButton\" value=\"Back To Event Listing\" onclick=\"backToEventListing()\">\r\n");
      out.write("</form>\r\n");
      out.write("<center>\r\n");
      out.write("\t\t<h1>Checkout</h1>\r\n");
      out.write("\t\t<form id=\"checkoutForm\" action=\"/event_manager/purchaseTickets\" method=\"post\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" id=\"errorMessage\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label style=\"font-weight: bold;\">Event Name:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(event.getEventName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label style=\"font-weight: bold;\">Number of Tickets:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(eventTicket.getNumberOfTickets());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label style=\"font-weight: bold;\">Total Amount:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>$ ");
      out.print(eventTicket.getTotalCost());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label style=\"font-weight: bold;\">Event Date:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(event.getEventDate());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label style=\"font-weight: bold;\">Event Time:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(event.getEventTime());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label style=\"font-weight: bold;\">Event Location:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(event.getEventLocation());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>Name on Card:</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"nameOnCard\" id=\"nameOnCard\" maxlength=\"50\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"nameError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>Card Number</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"cardNumber\" id=\"cardNumber\" maxlength=\"16\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"cardNumberError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>Valid Till:</label></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"month\" name=\"month\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"selectMonth\">Month</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">January</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">February</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">March</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">April</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"5\">May</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"6\">June</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"7\">July</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"8\">August</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"9\">September</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"10\">October</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"11\">November</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"12\">December</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"monthError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select id=\"year\" name=\"year\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"selectYear\">Year</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">18</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">19</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">20</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">21</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"5\">22</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"6\">23</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"7\">24</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"8\">25</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"9\">26</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"10\">27</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"11\">28</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"12\">29</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"13\">30</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"yearError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>CVV</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"cvv\" id=\"cvv\" size=\"5\" maxlength=\"3\"></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"cvvError\" style=\"color: red\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input class=\"button\" type=\"button\" value=\"Confirm Payment\" onclick=\"validateForm()\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"hidden\" id=\"numberOfTickets\" name=\"numberOfTickets\" value=\"");
      out.print(eventTicket.getNumberOfTickets());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"hidden\" id=\"eventId\" name=\"eventId\" value=\"");
      out.print(event.getEventId());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"hidden\" id=\"toDo\" name=\"toDo\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<br><br>\r\n");
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

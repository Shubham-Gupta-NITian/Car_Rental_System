package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005ftask_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/main.css\"/>\n");
      out.write("          <script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("           <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\t\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<a class =\"navbar-brand\" href=\"index.jsp\">Car_Rental_System</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                 <li><a href=\"car_list.jsp\">AVILABLE_CAR</a></li>\n");
      out.write("                                 <li><a href=\"admin_login.jsp\">Admin</a></li>\n");
      out.write("                                             <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("                                                 <li><a href=\"signup.jsp\">SIGNUP</a></li>\n");
      out.write("                                                   <li><a href=\"logout.jsp\">LOGOUT</a></li> \n");
      out.write("                                                    <li><a href=\"contact.jsp\">About Us</a></li> \n");
      out.write("                                </ul>\n");
      out.write("\t\t\t<div>\n");
      out.write("                            \n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/main.css\"/>\n");
      out.write("<script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<title>admin page</title>\n");
      out.write("\n");
      out.write("   \n");
      out.write("   <link href=\"https://fonts.googleapis.com/css?family=Libre+Baskerville\" rel=\"stylesheet\">\n");
      out.write("   <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t#adminheading{\n");
      out.write("\t\t\tmargin: 10px;\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("\t\t\tfont-size: 40px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.image{\n");
      out.write("           margin-top: 10px;\n");
      out.write("           margin-bottom: 10px;\n");
      out.write("           height: 75px;\n");
      out.write("           width: 75px;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\t#header{\n");
      out.write("\t\t\tfont-size: 40px;\n");
      out.write("\t\t\tcolor:white;\n");
      out.write("\t\t}\n");
      out.write("\t\t.task:hover {\n");
      out.write("           background-color: #4CAF50; /* Green */\n");
      out.write("           color: white;\n");
      out.write("            }\n");
      out.write("\t\t.task{\n");
      out.write("\t\t\tborder-radius: 20px;\n");
      out.write("\t\t\tbackground-color: #ffff00;\n");
      out.write("\t\t\tmargin: 20px;\n");
      out.write("\t\t\tpadding: 3px;\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("\t\t}\n");
      out.write("\t\t#foot{\n");
      out.write("\t\t\tcolor:white;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t}\n");
      out.write("      \n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background: linear-gradient(-90deg, #c8e5bc,highlight);\">\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("     <div class=\"col-md-3\"> </div>\n");
      out.write("     <div class=\"col-md-6\">\n");
      out.write("     \t<center>\n");
      out.write("     \t\t<label id=\"adminheading\"><b>-:Admin Page:-</b></label>\n");
      out.write("     \t\t<div style=\"height: 30px;\"></div>\n");
      out.write("     \t\t<button class=\"btn btn-block task\"><a href=\"update_renter.jsp\">update renter</button>\n");
      out.write("     \t\t<button class=\"btn btn-block task\">update customer</button>\n");
      out.write("     \t\t<button class=\"btn btn-block task\">update car</button>\n");
      out.write("     \t\t<button class=\"btn btn-block task\">manage booking </button>\n");
      out.write("     \t\t<button class=\"btn btn-block task\">report customer</button>\n");
      out.write("     \t\t<button class=\"btn btn-block task\">logout</button>\n");
      out.write("     \t</center>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<footer class=\"page-footer font-small pt-4 mt-4\" id=\"foot\">\n");
      out.write("   <div class=\"footer-copyright py-3 text-center\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        © 2018 Copyright:\n");
      out.write("        <a href=\"https://mdbootstrap.com/material-design-for-bootstrap/\"> MDBootstrap.com </a>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

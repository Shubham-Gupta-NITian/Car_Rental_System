package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<title>admin login</title>\n");
      out.write("\n");
      out.write("   <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/main.css\"/>\n");
      out.write("          <script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("           <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("   \n");
      out.write("   <link href=\"https://fonts.googleapis.com/css?family=Libre+Baskerville\" rel=\"stylesheet\">\n");
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
      out.write("\t\t.task{\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("\t\t}\n");
      out.write("\t\t#foot{\n");
      out.write("\t\t\tcolor:white;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t}\n");
      out.write("       .input{\n");
      out.write("         border-radius: 20px;\n");
      out.write("       }\n");
      out.write("       .button{\n");
      out.write("       \t    border-radius: 20px;\n");
      out.write("\t\t\tbackground-color: #ffff00;\n");
      out.write("\t\t\tpadding: 3px;\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("       }\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background: linear-gradient(-90deg, #57d952, #F0FFFF);\">\n");
      out.write("<div class=\"container-fluid\" style=\"background-color:#00008B;\">\n");
      out.write("    \n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t    <div class=\"col-md-2\"></div>\n");
      out.write("\t\t<div class=\"col-md-1 \">\n");
      out.write("\t\t\t<img src=\"pic/icon.png\" class=\"image\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"col-md-1\"></div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<b id=\"header\"><u> Car Rental System</u></b>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-1\"></div>\n");
      out.write("\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t<img src=\"pic/icon.png\" class=\"image\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-2\"></div>\t\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("      <form action=\"admin_login\" method=\"post\">\n");
      out.write("     <div class=\"col-md-4\"> </div>\n");
      out.write("     <div class=\"col-md-4\">\n");
      out.write("         \n");
      out.write("     \t<center>\n");
      out.write("            \n");
      out.write("            \t<label id=\"adminheading\"><b>-:Admin Login:-</b></label></center>\n");
      out.write("     \t\t<div style=\"height: 30px;\"></div>\n");
      out.write("     \t\t<label class=\"task\">ID:-</label><br>\n");
      out.write("     \t\t<input type=\"text\" name=\"user_id\" class=\"form-control input\"><br>\n");
      out.write("     \t\t<label class=\"task\">password:-</label>\n");
      out.write("     \t\t<input type=\"password\" name=\"password\" class=\"form-control input\"><br><br>\n");
      out.write("     \t\t<button class=\"btn btn-block button\">login</button>\n");
      out.write("                \n");
      out.write("     </div>\n");
      out.write("     <div class=\"col-md-4\"></div>\n");
      out.write("     </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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

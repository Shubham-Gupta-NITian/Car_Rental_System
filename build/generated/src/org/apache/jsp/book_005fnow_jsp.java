package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_005fnow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/header3.jsp");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    ");
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
      out.write("                                 \n");
      out.write("                                          \n");
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
      out.write("<title>buttons</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/main.css\"/>\n");
      out.write("<script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\" >\n");
      out.write("\t<form class=\"form-group\" action=\"booknow\" method=\"post\" id=\"sty\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                            \n");
      out.write("\t\t\t<div class=\"row\" style=\"margin-top:40px;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"control-label\">Your Name</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\"><input type=\"text\" name=\"name\" placeholder=\"Your Name\" id=\"n\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("                            <div class=\"row\" style=\"margin-top:40px;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"control-label\">Mobile Number</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\"><input type=\"text\" name=\"mobile_number\" placeholder=\"Mobile Number\" id=\"mobile\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t\t<div class=\"row\" style=\"margin-top:40px;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"control-label\">Pick up Date</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\"><input type=\"date\" name=\"pick_up_date\" placeholder=\"Pick Up Date\" class=\"form-control inputfield\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"row\" style=\"margin-top:40px;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"control-label\">Dropoff Date</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\"><input type=\"date\" name=\"drop_off_date\" placeholder=\"Drop off Date\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\" style=\"margin-top:40px;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"control-label\">Pick Up Location</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\"><input type=\"text\" name=\"pick_up_location\" placeholder=\"Pick Up Location\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\" style=\"margin-top:40px;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t<label for=\"email\" class=\"control-label\">Drop Off Location</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\"><input type=\"text\" name=\"drop_off_location\" placeholder=\"Drop Off Location\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"row\" style=\"margin-top:40px;\">\n");
      out.write("\t\t\t\n");
      out.write("\t<center>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\t\n");
      out.write("          </div>\n");
      out.write("              </form>\n");
      out.write("<!--            <span><input type=\"submit\" name=\"booknow\" class=\"botton\" ></span><br>-->\n");
      out.write("\t\n");
      out.write("        <center>\n");
      out.write("<button onclick=\"BookNow()\">BookNow</button></div>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("              <script>\n");
      out.write("                  \n");
      out.write("                     function BookNow(){\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                      document.querySelector('#sty').submit();\n");
      out.write("                      \n");
      out.write("                      document.querySelector('#mobile').value=\"\";\n");
      out.write("                        document.querySelector('#n').value=\"\";\n");
      out.write("                      \n");
      out.write("                         \n");
      out.write("                     }\n");
      out.write("                     \n");
      out.write("                  </script>\n");
      out.write("\t</body>\n");
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

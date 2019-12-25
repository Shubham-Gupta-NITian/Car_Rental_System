package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head> \n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>About Us</title>\n");
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
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/main.css\"/>\n");
      out.write("<script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\"  type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("TD\n");
      out.write("{\n");
      out.write(" \n");
      out.write(" padding:20PX;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write("H3\n");
      out.write("{ text-align:center;\n");
      out.write("} \n");
      out.write(" \n");
      out.write("P\n");
      out.write("{\n");
      out.write("font-family:'Times New Roman', Times, serif;color:#000; font-size:smaller\n");
      out.write("}\n");
      out.write("\n");
      out.write("#profile p\n");
      out.write("{ text-align:center;\n");
      out.write("   font-family:\"Arial Black\", Gadget, sans-serif;\n");
      out.write(" }\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<section style=\"min-height:500px\">\n");
      out.write("<div style=\"width:100%;height:250px; background-color:#fff\">\n");
      out.write("\n");
      out.write("<div style=\"width:70%;height:250px; float:left\">\n");
      out.write("\n");
      out.write("<h1 style=\"font-style:normal; font-weight:lighter; color:#999; margin-left:50px;\">About Company </h1>\n");
      out.write("<blockquote>\n");
      out.write("<p style=\"font-family:'Times New Roman', Times, serif;color:#000; font-size:smaller\">A car rental, hire car, or car hire agency is a company that rents automobiles for short periods of time, generally ranging from a few hours to a few weeks. It is often organized with numerous local branches (which allow a user to return a vehicle to a different location), and primarily located near airports or busy city areas and often complemented by a website allowing online reservations.\n");
      out.write("\n");
      out.write("Car rental agencies primarily serve people who require a temporary vehicle, for example, those who do not own their own car, travelers who are out of town, or owners of damaged or destroyed vehicles who are awaiting repair or insurance compensation. Car rental agencies may also serve the self-moving industry needs, by renting vans or trucks, and in certain markets, other types of vehicles such as motorcycles or scooters may also be offered.\n");
      out.write("Alongside the basic rental of a vehicle, car rental agencies typically also offer extra products such as insurance, global positioning system (GPS) navigation systems, entertainment systems, mobile phones, portable WiFi and child safety seats.\n");
      out.write("</p>\n");
      out.write(" </blockquote>\n");
      out.write("</div>\n");
      out.write("<div style=\"width:30%;height:250px; background-color:green; float:left\">\n");
      out.write("<img src=\"pic/car.jpg\"  style=\"width:100%; height:100%;\"/>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("<div style=\"width:100%;height:230px; background-color:RGBA(245,246,246,0.7)\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<h3>WHO WE ARE ?</h3>\n");
      out.write("<p> Themes and styles also help keep your document coordinated. When you click Design and choose a new Theme, the pictures, charts, and SmartArt graphics change to match your new theme. When you apply styles, your headings change to match the new theme.</p>\n");
      out.write(" </td>\n");
      out.write("<td>\n");
      out.write("<h3>WHAT WE DO ? </h3>\n");
      out.write("<p>Themes and styles also help keep your document coordinated. When you click Design and choose a new Theme, the pictures, charts, and SmartArt graphics change to match your new theme. When you apply styles, your headings change to match the new theme. </p>\n");
      out.write(" </td>\n");
      out.write("<td>\n");
      out.write("<h3>OUR SERVICES</h3>\n");
      out.write("<p>Themes and styles also help keep your document coordinated. When you click Design and choose a new Theme, the pictures, charts, and SmartArt graphics change to match your new theme. When you apply styles, your headings change to match the new theme. </p>\n");
      out.write(" </td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div style=\"width:100%;height:auto; background-color:white\" id=\"profile\">\n");
      out.write("<h1 style=\"font-style:normal; font-weight:lighter; color:#999; margin-left:50px;\">Meet Our Team </h1>\n");
      out.write("<table style=\"margin-left:50px\">\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<img src=\"pic/abhishekgupta_1.jpg\" width=\"200px\" height=\"200px\" /> <br/>\n");
      out.write("<p>Abhishek Gupta</p>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<img src=\"pic/ak_1.jpg\" width=\"200px\" height=\"200px\" /> <br/>\n");
      out.write("<p>Aakriti Gupta </p>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<img src=\"pic/supriyo_1.jpg\" width=\"200px\" height=\"200px\" /> <br/>\n");
      out.write("<p>Aaditya Supriyo</p>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<img src=\"pic/abhishekS.jpg\" width=\"200px\" height=\"200px\" /> <br/>\n");
      out.write("<p>Abhishek Shakya</p>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<img src=\"pic/abhishekG.jpg\" width=\"200px\" height=\"200px\" /> <br/>\n");
      out.write("<p>Abhishek Gautam</p>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("<footer>\n");
      out.write("    <br>\n");
      out.write("<p style=\"text-align:center; \">Made by : Team </p>\n");
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

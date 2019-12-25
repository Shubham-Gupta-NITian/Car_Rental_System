package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class receipt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .sty{\n");
      out.write("                font-size:20px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system", "root", "root");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM booknow order by id desc limit 1";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    //int id = rs.getInt("id");
                    String n = rs.getString("name");
                    String mobile = rs.getString("mobile_number");
                    String pick_date = rs.getString("pick_up_date");
                    String drop_date= rs.getString("drop_off_date");
                    String pick_location = rs.getString("pick_up_location");
                    String drop_location= rs.getString("drop_off_location");
                   
                                         
					//String path = rs.getString("path");
        
      out.write("\n");
      out.write("        <form>\n");
      out.write("          \n");
      out.write("        <center>\n");
      out.write("        <h2>Receipt of booking your car.</h2><br>\n");
      out.write("        \n");
      out.write("      <pre width=\"800\">\n");
      out.write("     \n");
      out.write("               <b class=\"sty\">Your Name:</b>          <b class=\"sty\">");
      out.print(n);
      out.write("</b><br>       \n");
      out.write("           <b class=\"sty\">Mobile Number:</b>           <b class=\"sty\">");
      out.print(mobile);
      out.write("</b><br>\n");
      out.write("            <b class=\"sty\">Pick Up Date:</b>           <b class=\"sty\">");
      out.print(pick_date);
      out.write("</b><br>\n");
      out.write("            <b class=\"sty\">Drop Of Date:</b>           <b class=\"sty\">");
      out.print(drop_date);
      out.write("</b><br>\n");
      out.write("      <b class=\"sty\">Pick Up Location:</b>           <b class=\"sty\">");
      out.print(pick_location);
      out.write("</b><br>\n");
      out.write("<b class=\"sty\">Drop Of Location:</b>                   <b class=\"sty\">");
      out.print(drop_location);
      out.write("</b><br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("         <button onclick=\"myFunction()\">Print this page</button>&nbsp;&nbsp;&nbsp;&nbsp;<button ><a href=\"maps1.jsp\">Trace car</button>\n");
      out.write("        </pre>\n");
      out.write("        \n");
      out.write("       </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        ");

                }
            } catch (Exception e) {
                out.println(e);
            }
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("function myFunction() {\n");
      out.write("    window.print();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/header1.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
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
      out.write("                               \n");
      out.write("                                 \n");
      out.write("                                           \n");
      out.write("                                                 <li><a href=\"signup.jsp\">SIGNUP</a></li>\n");
      out.write("                                              \n");
      out.write("                                                    <li><a href=\"contact.jsp\">About Us</a></li> \n");
      out.write("                                </ul>\n");
      out.write("\t\t\t<div>\n");
      out.write("                            \n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<title>Login form</title>\n");
      out.write("        \n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\"/>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <style type=\"text/css\">\n");
      out.write("   \t  #body{\n");
      out.write("   \t  \tbackground-image: url(car8.jpg);\n");
      out.write("   \t  \theight: 800px;\n");
      out.write("   \t  }\n");
      out.write("   \t  #login{\n");
      out.write("   \t  \tbackground-color: #dfebad;\n");
      out.write("   \t  \tpadding: 10px;\n");
      out.write("   \t  }\n");
      out.write("        #forget{\n");
      out.write("         color:blue;\n");
      out.write("         font-size: 15px;\n");
      out.write("        }\n");
      out.write("   \t  #link{\n");
      out.write("   \t  \tcolor:blue;\n");
      out.write("   \t  }\n");
      out.write("   \t  .botton{\n");
      out.write("   \t  \tpadding: 2px;\n");
      out.write("   \t  \tmargin-left: 5px;\n");
      out.write("   \t  \tcolor:white;\n");
      out.write("   \t  \tbackground-color: black;\n");
      out.write("   \t  }\n");
      out.write("   \t  .inputlevel\n");
      out.write("   \t  {\n");
      out.write("   \t  \tcolor:#cc9876;\n");
      out.write("   \t  \tfont-size: 15px;\n");
      out.write("   \t  }\n");
      out.write("   \t  #title\n");
      out.write("   \t  {\n");
      out.write("   \t  \tfont-size: 40px;\n");
      out.write("   \t  \tmargin-top: 10px;\n");
      out.write("   \t  \tcolor:black;\n");
      out.write("   \t  \tmargin-bottom: 15px;\n");
      out.write("   \t  \tborder-bottom-color: #23ab68;\n");
      out.write("   \t  }\n");
      out.write("   </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("\t<div class=\"container\" id=\"body\" style=\"font-family:'Libre Baskerville', serif;\" style=\"background-color:green;\">\n");
      out.write("\t\t<div style=\"height: 50px;\"></div>\n");
      out.write("\t\t<div style=\"padding-bottom: 15px;\"><center ><h2 ><b id=\"title\"><u>Car Rental System</u></b></h2></center></div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t\t<div class=\"col-md-4\" id=\"login\">\n");
      out.write("                            <div><h3><u><center>customer login:-</center></u></h3></div>\n");
      out.write("\t\t\t\t<form action=\"login\" method=\"post\" id=\"form1\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<label class=\"inputlevel\">Email:</label><br>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"email\" class=\"inputfield\" placeholder=\"Email\" id=\"e_mail\"><br><label id=\"cemail\"></label><br>\n");
      out.write("\n");
      out.write("\t\t\t\t<label class=\"inputlevel\">Password:</label><br>\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"password\" class=\"inputfield\" placeholder=\"password\" id=\"pass\"><br><label id=\"cpass\"></label><br>\n");
      out.write("                                <br></center>\n");
      out.write("\t\t\t\t\n");
      out.write("                 </form>\n");
      out.write("                <center>\n");
      out.write("\t\t\t\t<span><input type=\"submit\" name=\"login\" class=\"botton\" onclick=\"validation()\" ><input type=\"reset\" name=\"reset\" class=\"botton\"></span><br></center>\n");
      out.write("\t\t\t\t<span>new user<a href=\"signup.jsp\" id=\"link\"> Register here</a></span>\n");
      out.write("\t\t\t\t\n");
      out.write("                \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("     function displaymessage(message,id,color)\n");
      out.write("     {\n");
      out.write("      document.getElementById(id).innerHTML=message;\n");
      out.write("      document.getElementById(id).style.color=color;\n");
      out.write("     }\n");
      out.write("\t \n");
      out.write("    function validemail() {\n");
      out.write("       var ad=document.getElementById('e_mail').value;\n");
      out.write("       if(ad.length==0)\n");
      out.write("       {\n");
      out.write("        displaymessage(\"email is required\",\"cemail\",\"red\");\n");
      out.write("        return false;\n");
      out.write("       }\n");
      out.write("       if(!ad.match(/^[a-zA-Z\\._0-9]*[@][a-zA-Z]*[\\.][a-z]{2,4}$/))\n");
      out.write("        {\n");
      out.write("        displaymessage(\"enter a valid email address\",\"cemail\",\"red\");\n");
      out.write("        return false;\n");
      out.write("       }\n");
      out.write("       //displaymessage(\"email address is enter successfully\",\"cemail\",\"green\");\n");
      out.write("       return true;\n");
      out.write("     }\n");
      out.write("\t \n");
      out.write("\t function mypassword()\n");
      out.write("     {\n");
      out.write("       var pass=document.getElementById('pass').value;\n");
      out.write("     if(pass==\"\")\n");
      out.write("     {\n");
      out.write("       displaymessage(\"enter a strong password!\",\"cpass\",\"red\");\n");
      out.write("          return false;\n");
      out.write("       }\n");
      out.write("       if(!pass.match(/^(?=.*\\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/))\n");
      out.write("       {\n");
      out.write("          displaymessage(\"enter a strong password!\",\"cpass\",\"red\");\n");
      out.write("          return false;\n");
      out.write("       }\n");
      out.write("      // displaymessage(\"you create a strong password\",\"cpass\",\"green\");\n");
      out.write("       return true;\n");
      out.write("     }\n");
      out.write("\t \n");
      out.write("\t function validation(){\n");
      out.write("\t   var flag=0;\n");
      out.write("\t   if(!validemail())\n");
      out.write("\t     flag=1;\n");
      out.write("\t   console.log(flag);\n");
      out.write("\t   if(!mypassword())\n");
      out.write("\t     flag=1;\n");
      out.write("\t   console.log(flag);\n");
      out.write("\t   if(flag==1){\n");
      out.write("\t       console.log('within false');\n");
      out.write("\t      return false;\n");
      out.write("\t\t  }\n");
      out.write("\t   else{\n");
      out.write("\t      console.log('true');\n");
      out.write("\t      document.querySelector('#form1').submit();\n");
      out.write("          return true;\n");
      out.write("\t   }\n");
      out.write("\t }\n");
      out.write("</script>\n");
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

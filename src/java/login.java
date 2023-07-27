/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Shubham Gupta.
 */
public class login extends HttpServlet {
    
    
    Connection con;
        PreparedStatement ps;
 
  public void init(){
        try{
           
        String qr="select email,password from registration where email=? and password=?";
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system","root","root");
        ps=con.prepareStatement(qr);        
        }catch(Exception e){}
        
  }
  
 public void destroy(){
        try{
            con.close();
        }catch(Exception e){}
    }
 
    

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String un=request.getParameter("email");
	String pw=request.getParameter("password");
        
        
        
        
        //response.sendRedirect("add_car_details.jsp");
        try {
            
            
            
            ps.setString(1, un);
            ps.setString(2, pw);
 
		ResultSet rs = ps.executeQuery();
 
		while (rs.next()) {
			///response.sendRedirect("index.jsp");
			    out.println("<h1>login sucessfull</h1>");
                            response.sendRedirect("add_car_details.jsp");
                  
                    return;
		}
		//response.sendRedirect("error.html");
                out.println("<h1>Invalid Id password</h1>");
		return;
	
        }catch(Exception e)
        {
            out.println(e);
        }
    }
}

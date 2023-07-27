/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shubham Gupta.
 */
public class feedback extends HttpServlet {
    Connection con;
        PreparedStatement ps;
 
    @Override
  public void init(){
        try{
           
        String qr="insert into feedback values(?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system","root","root");
        ps= (PreparedStatement) con.prepareStatement(qr);        
        }catch(Exception e){}
        
  }
  
    @Override
 public void destroy(){
        try{
            con.close();
        }catch(Exception e){}
    }
 
    
   

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.sendRedirect("thankyou.jsp");
        
         String s1=request.getParameter("name");
        String s2=request.getParameter("email");
        String s3=request.getParameter("comments");
        
        
        try {
             ps.setString(1, s1); 
             ps.setString(2, s2);
            ps.setString(3, s3);
             ps.executeUpdate();
        }catch(Exception e)
        {
              out.println(e);
        }
    }
}

    


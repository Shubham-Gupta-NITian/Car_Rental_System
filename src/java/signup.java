
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
//import ID_generator.java;
public class signup extends HttpServlet {
    Connection con;
        PreparedStatement ps;
 
  public void init(){
        try{
           
        String qr="insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?)";
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
            throws ServletException, IOException  {
        
        response.setContentType("text/html;charset=UTF-8");
       response.sendRedirect("login.jsp");
        PrintWriter out = response.getWriter();
         String s1=request.getParameter("first_name");
        String s2=request.getParameter("last_name");
        String s3=request.getParameter("password");
        String s4=request.getParameter("confirm_password");
        String s5=request.getParameter("sex");
        String s6=request.getParameter("adhar_number");
        String s7=request.getParameter("city");
        String s8=request.getParameter("district");
        String s9=request.getParameter("pincode");
        String s10=request.getParameter("state");
        String s11=request.getParameter("mobile_number");
        String s12=request.getParameter("email");
        
        try {
              ps.setString(1, s1); ps.setString(2, s2);
            ps.setString(3, s3); ps.setString(4, s4);
            ps.setString(5, s5); ps.setString(6, s6);
             ps.setString(7, s7); ps.setString(8, s8);
            ps.setString(9, s9); ps.setString(10, s10);
            ps.setString(11, s11); ps.setString(12, s12);
            ps.executeUpdate();
        } catch(Exception e)
        {
            out.println(e);
    }
    }
}
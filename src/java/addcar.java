/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Part;

@WebServlet("/FileUploadServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2,
        maxFileSize=1024*1024*10,
        maxRequestSize=1024*1024*50)
public class addcar extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.sendRedirect("car_list.jsp");
        
        //int id=Integer.parseInt(request.getParameter("id"));
        String carname=request.getParameter("car_name");
        String seater=request.getParameter("seater");
        String carnumber=request.getParameter("car_number");
        String model=request.getParameter("model");
        String mileage=request.getParameter("mileage");


        
        Part part=request.getPart("file");
        String fileName=extractFileName(part);
        String savePath="C:\\Users\\abhishek\\Documents\\NetBeansProjects\\car_rental_system\\web\\images\\"  + File.separator +fileName;
        File fileSaveDir = new File(savePath);
        part.write(savePath + File.separator);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system","root","root");
            PreparedStatement pst=con.prepareStatement("insert into image_table values(?,?,?,?,?,?)");
            //pst.setInt(1,id);
	    pst.setString(1,carname);
            pst.setString(2,seater);
            pst.setString(3,carnumber);
            pst.setString(4,model);
            pst.setString(5,mileage);
            pst.setString(6,fileName);
            pst.executeUpdate();
           //response.sendRedirect("car_list.jsp");
        
           // response.sendRedirect();
            //out.println("<h1>hello</h1>");
            //out.println("<a href='car_list.jsp?id=" +  carname +"'>Display</a>");
        } catch(Exception e)
        {
            out.println(e);
    }
}
    private String extractFileName(Part part)
    {
        String contentDisp=part.getHeader("content-disposition");
        String[] items=contentDisp.split(";");
        for(String s:items)
        {
            if(s.trim().startsWith("filename"))
            {
                return s.substring(s.indexOf("=") + 2,s.length()-1);
            }
        }
        return "";
    }

}
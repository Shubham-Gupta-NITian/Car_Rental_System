<%-- 
    Document   : viewfeedback
    Created on : Apr 23, 2018, 7:22:10 PM
    Author     : abhishek
--%>
<%-- 
    Document   : view
    Created on : Apr 8, 2018, 8:33:34 AM
    Author     : abhishek
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>feedback</title>
        <%@include  file="header4.jsp" %>
        <style>
            #bookbtn{
                padding:2px;
                text-align: center;
                margin-top: 30px;
                margin-left:30px;
              
            }
        </style>
    </head>
    <body >
         <center>  <h1>Total feedback</h1></center><br>
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system", "root", "root");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM feedback";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    //int id = rs.getInt("id");
                    String Id = rs.getString("name");
                    String item_name = rs.getString("email");
                    String vendor_id = rs.getString("comments");
                   			//String path = rs.getString("path");
        %>
    
<center>
 
        <table style="width:70%" border="25">
            
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Comment</th>
                
      
            </tr>
            <tr>
                <td><%=Id%></td>
                <td><%=item_name%></td>
                <td><%=vendor_id%></td>
                
            </tr>
        </table>
</center>
        <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
       
    </body>
</html>

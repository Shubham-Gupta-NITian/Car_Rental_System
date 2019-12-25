
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
          <%@include  file="header3.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>My CAR LOCATION</title>
    <style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
  </head>
 <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
   <%
   ResultSet rs;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system", "root", "root");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM booknow order by id desc limit 1";
                rs=st.executeQuery(sql);
                while (rs.next()) {
                    String pick_location = rs.getString("pick_up_location");
                    String drop_location= rs.getString("drop_off_location");
				
                                
                              	                   
					//String path = rs.getString("path");
        %>
        
                
        
       <%
            try {
               //  String sql1 = "SELECT * FROM maps where place='pick_location'";
               rs= st.executeQuery( "SELECT * FROM maps where place='"+pick_location+"'");
		while (rs.next()) {
		    String lg = rs.getString("longitude");
                    String lt= rs.getString("latitude");
		          	                   
					//String path = rs.getString("path");
        %>
        
          <%
            try {
               // String sql2 = "SELECT * FROM maps where place='drop_location'";
                 rs = st.executeQuery("SELECT * FROM maps where place='"+drop_location+"'");
		 while (rs.next()) {
		      String g = rs.getString("longitude");
                      String t= rs.getString("latitude");
                                       	
 
				
                                
                              	                   
					//String path = rs.getString("path");
        %>

        
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="index.jsp"> <img src="pic/rent.png" alt="logo" width="150" height="80"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="index.jsp">HOME</a></li>
        <li><a href="maps.html">REFESH</a></li>
        <li><a href="#tour">BACK</a></li>
      </ul>
    </div>
  </div>
 </nav>

             
  
                <h1 style="display:none" id="lt"><%=lt%></h1>
                  <h1 style="display:none" id="lg"><%=lg%></h1>
                   <h1 style="display:none" id="t"><%=t%></h1>
                  <h1 style="display:none" id="g"><%=g%></h1>
    
<!--                  <input type="text" value="">-->
                  
                   
              
  
    <div id="map"></div>
    
    <script>
        console.log("hello world");

//                   1console.log("longitude and latitude " + lt + " " + lg);
var lg=document.getElementById('lg').innerHTML;
var lt = document.getElementById('lt').innerHTML;
lg=parseFloat(lg);
lt=parseFloat(lt);
var g=document.getElementById('g').innerHTML;
var t = document.getElementById('t').innerHTML;
g=parseFloat(g);
t=parseFloat(t);
console.log("latitude longitude " + lg + " " +lt);
      function initMap() {

        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 3,
          center: {lat: 25.4358, lng: 81.8463}
        });
        // Create an array of alphabetical characters used to label the markers.
        var labels = 'PDC';

        // Add some markers to the map.
        // Note: The code uses the JavaScript Array.prototype.map() method to
        // create an array of markers based on a given "locations" array.
        // The map() method here has nothing to do with the Google Maps API.
        var markers = locations.map(function(location, i) {
          return new google.maps.Marker({
            position: location,
            label: labels[i % labels.length]
            
          });
        });
        

        // Add a marker clusterer to manage the markers.
        var markerCluster = new MarkerClusterer(map, markers,
            {imagePath: 'https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/m'});
      }
      var locations = [
        {lat: lg, lng: lt},
        {lat: g, lng: t},
        {lat:25.4920,  lng:81.8639},
      ]
    </script>
    <script src="https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js">
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCLWjR1odr3QDeUB2JUX0z7nV1PvDXx_Bw&callback=initMap">
    </script>
   
<!-- Footer -->
<footer class="text-center">
  <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="TO TOP">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a>
  <p style="font-size:20px;">Note:P-Pickup Location   D-Dropoff Location C- current Postion of car</br></p>
  <p><a href="#myPage"><img src="pic/fb.png" alt="fb" width="25" height="25"></a><a href="#myPage"><img src="pic/tt.png" alt="twitter" width="25" height="25"></a><br>Website made by [By Team]</p> 


</footer>
   
        <table>
    <tr>
                <td><%=pick_location%></td>
                  <td><%=drop_location%></td>
    </tr>
    </table>  
<%
}
                
                               }
catch(Exception e)
               {
    out.println(e);
           }
%>



<%
}
                               }
catch(Exception e)
               {
    out.println(e);
           }
%>
<%
}
}

catch(Exception e)
               {
    out.println(e);
           }
%>






  </body>
</html>
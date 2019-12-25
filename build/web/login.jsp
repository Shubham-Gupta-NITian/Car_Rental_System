<%-- 
    Document   : login
    Created on : Mar 13, 2018, 7:04:40 PM
    Author     : abhishek
--%>

<!DOCTYPE html>




<html lang="en">
<head>

    <%@include  file="header1.jsp" %>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE-edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Login form</title>
        
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css"/>
<script src="bootstrap/js/bootstrap.min.js"></script>


   <style type="text/css">
   	  #body{
   	  	background-image: url(car8.jpg);
   	  	height: 800px;
   	  }
   	  #login{
   	  	background-color: #dfebad;
   	  	padding: 10px;
   	  }
        #forget{
         color:blue;
         font-size: 15px;
        }
   	  #link{
   	  	color:blue;
   	  }
   	  .botton{
   	  	padding: 2px;
   	  	margin-left: 5px;
   	  	color:white;
   	  	background-color: black;
   	  }
   	  .inputlevel
   	  {
   	  	color:#cc9876;
   	  	font-size: 15px;
   	  }
   	  #title
   	  {
   	  	font-size: 40px;
   	  	margin-top: 10px;
   	  	color:black;
   	  	margin-bottom: 15px;
   	  	border-bottom-color: #23ab68;
   	  }
   </style>
</head>

    
<body>
 
	<div class="container" id="body" style="font-family:'Libre Baskerville', serif;" style="background-color:green;">
		<div style="height: 50px;"></div>
		<div style="padding-bottom: 15px;"><center ><h2 ><b id="title"><u>Car Rental System</u></b></h2></center></div>

		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4" id="login">
                            <div><h3><u><center>customer login:-</center></u></h3></div>
				<form action="login" method="post" id="form1">
				<center>
				<label class="inputlevel">Email:</label><br>
				<input type="text" name="email" class="inputfield" placeholder="Email" id="e_mail"><br><label id="cemail"></label><br>

				<label class="inputlevel">Password:</label><br>
				<input type="password" name="password" class="inputfield" placeholder="password" id="pass"><br><label id="cpass"></label><br>
                                <br></center>
				
                 </form>
                <center>
				<span><input type="submit" name="login" class="botton" onclick="validation()" ><input type="reset" name="reset" class="botton"></span><br></center>
				<span>new user<a href="signup.jsp" id="link"> Register here</a></span>
				
                
			</div>
		</div>
    </div>
    
      
</body>
<script type="text/javascript">

     function displaymessage(message,id,color)
     {
      document.getElementById(id).innerHTML=message;
      document.getElementById(id).style.color=color;
     }
	 
    function validemail() {
       var ad=document.getElementById('e_mail').value;
       if(ad.length==0)
       {
        displaymessage("email is required","cemail","red");
        return false;
       }
       if(!ad.match(/^[a-zA-Z\._0-9]*[@][a-zA-Z]*[\.][a-z]{2,4}$/))
        {
        displaymessage("enter a valid email address","cemail","red");
        return false;
       }
       //displaymessage("email address is enter successfully","cemail","green");
       return true;
     }
	 
	 function mypassword()
     {
       var pass=document.getElementById('pass').value;
     if(pass=="")
     {
       displaymessage("enter a strong password!","cpass","red");
          return false;
       }
       if(!pass.match(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/))
       {
          displaymessage("enter a strong password!","cpass","red");
          return false;
       }
      // displaymessage("you create a strong password","cpass","green");
       return true;
     }
	 
	 function validation(){
	   var flag=0;
	   if(!validemail())
	     flag=1;
	   console.log(flag);
	   if(!mypassword())
	     flag=1;
	   console.log(flag);
	   if(flag==1){
	       console.log('within false');
	      return false;
		  }
	   else{
	      console.log('true');
	      document.querySelector('#form1').submit();
          return true;
	   }
	 }
</script>
</html>
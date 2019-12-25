<!DOCTYPE html>

<html lang="en">
<head>
    <%@include  file="header2.jsp" %>
	<title>sinup form</title>
        
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
<script src="jquery-3.3.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
	
   
   <style type="text/css">
   	  #image{
   		background-image: url(car7.jpg);
   		height:100%;
   	      }
   	#form{
   		 background: linear-gradient(to right, #00FA9A , yellow);
   		
   		
   	}
   	.botton{
   		padding-top: 2px;
   		margin-left: 5px;
   		color:white;
   		background: black;
   	}
   	.inputfield{
   		
   		padding-left: 5px;
   		padding-top: 2px;
   		padding-bottom: 2px;
   		border-color: red;
   		
   	}
   	.tagname{
   		color: white;
   		font-size: 15px;
   	}
   	.reg{
   		border-bottom-style: ridge;
   		border-bottom-color: green;
   		font-size: 35px;
   		color:#0000CD;
   	}
   	.inputlevel{
   		font-size: 20px;
   		color:black;


   	}
   	  #refreshcaptch{
      border-width: 3px;
      
      margin-left: 20px;
      border-radius: 8px;
      font-size: 14px;
      border-color: #8768ac;
      padding: 3px;
      color:black;
      border-radius: 8px;
    }
      #inputcaptch{
      background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
      border-width: 3px;
      
      margin-left: 20px;
      display: inline-block;
      font-size: 20px;
      border-color: #8768ac;
      padding: 5px;
      color:black;
      
      border-radius: 8px;
    }
   </style>

   
</head>

<body id="image">
    
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6" id="form" style="font-family:'Libre Baskerville', serif;">
	                 <center>
		             <b class="reg" style="font-family: 'Libre Baskerville', serif;">Registration Form</b></center><br><br>
		             <form   id="form1" action="signup" method="post" >
                                 
		            

		             <label class="inputlevel">First name:<span class="text-danger">*</span></label>
		             <input type="text" name="first_name" id="first_name" placeholder="first name" class="inputfield form-control" ><label id="fname"></label><br>
		            

		             <label class="inputlevel">Last name:</label><br>
		             <input type="text" name="last_name" placeholder="last name" class="inputfield form-control" id="lastname"><label id="lname"></label><br>

		             <label class="inputlevel">Password:<span class="text-danger">*</span></label>(create strong password)
		              <input type="password" name="password" class="inputfield form-control" placeholder="password" id="mypass">
		             <label id="pass"></label><br>

		             <label class="inputlevel">Confirm Password:<span class="text-danger">*</span></label>
		             <input type="password" name="confirm_password" class="inputfield form-control" placeholder="password" id="cpass">
		             <label  id="ccpass"></label><br>

		             <label class="inputlevel">Gender:<span class="text-danger">*</span></label><br>
		             <label style="color:black;" class="radio-inline radio"><input type="radio" name="sex" value="male">Male</label>
                             <label style="color:black;"  class="radio-inline radio"><input type="radio" name="sex" value="female">Female</label> <br>

                     

                   <label class="inputlevel">Adhar Number:<span class="text-danger">*</span></label>
		              <input type="text" name="adhar_number" placeholder="Adhar number" class="inputfield form-control " id="adhar"><label  id="cadhar"></label><br>
                     <label class="inputlevel">Address:<span class="text-danger">*</span></label><br>

                     <span><label class="inputlevel">City/Post:</label>
                     <input type="text" name="city" placeholder="city/post" class="inputfield form-control" id="city"></span><label  id="ccity"></label><br>

                     <span><label class="inputlevel">District:</label>
                    <input type="text" class="inputfield form-control" name="district" placeholder="District" id="dis"></span><label  id="cdis"></label><br>

                     <span><label class="inputlevel">pincode:</label>
                     <input type="text" name="pincode" placeholder="pincode" class="inputfield form-control" id="pin"></span><label  id="cpin"></label><br>

                     <span><label class="inputlevel">State:</label>
                    <input type="text" name="state" placeholder="state" class="inputfield form-control" id="state"></span><label  id="cstate"></label><br>

                     <label class="inputlevel">Mobile Number:<span class="text-danger">*</span></label><br>
		              <input type="text" name="mobile_number" placeholder="Mobile number" class="inputfield form-control" id="mnum"><label  id="mobnum"></label><br>

		             <label class="inputlevel">Email:<span class="text-danger">*</span></label><br>
		              <input type="email" name="email" placeholder="Email" class="inputfield form-control" id="email"><label  id="cemail"></label><br>
                     <input type="checkbox" name="checkbox" id="check_box">I agree with terms and conditions<br><label id="mbox"></label><br>
																									
                   </form>  
						        
                     <input type="text" id="readcaptcha" placeholder="enter captcha"><label id="inputcaptch">u E 4 Y 0 9 a</label><button class="btn btn-danger" id="refreshcaptch" onclick="Captch()">refresh captcha</button><label id="displaycaptcha"></label><br>

                     <center><button class="botton" onclick="validation()">submit</button></center>
                             
                            
	              
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
    

     function Captch(){
                    console.log("hello");
                     var alpha = new Array('1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
                     var i;
                     for (i=0;i<6;i++){
                       var a = alpha[Math.floor(Math.random() * alpha.length)];
                       var b = alpha[Math.floor(Math.random() * alpha.length)];
                       var c = alpha[Math.floor(Math.random() * alpha.length)];
                       var d = alpha[Math.floor(Math.random() * alpha.length)];
                       var e = alpha[Math.floor(Math.random() * alpha.length)];
                       var f = alpha[Math.floor(Math.random() * alpha.length)];
                       var g = alpha[Math.floor(Math.random() * alpha.length)];
                      }
                    var code = a + ' ' + b + ' ' + ' ' + c + ' ' + d + ' ' + e + ' '+ f + ' ' + g;
                    document.getElementById('inputcaptch').innerHTML = code;

                  }

    function myfirstname()
     {
       var fname=document.getElementById('first_name').value;
       if(fname.length==0)
       {
         displaymessage("first name is required","fname","red");
         return false;
       }
       if(!fname.match(/^[a-zA-Z ]*[a-zA-Z]*$/))
       {
          displaymessage("enter a valid name!","fname","red");
          return false;
       }
       displaymessage("Welcome "+fname,"fname","green");
       return true;
     }
 
     function mylastname()
     {
       var fname=document.getElementById('lastname').value;
       if(fname.length==0)
       {
         displaymessage("last name is required","lname","red");
         return false;
       }
       if(!fname.match(/^[a-zA-Z ]*[a-zA-Z]*$/))
       {
          displaymessage("enter a valid name!","lname","red");
          return false;
       }
       displaymessage("Welcome "+fname,"lname","green");
       return true;
     }

      function mypassword()
     {
       var pass=document.getElementById('mypass').value;
     if(pass=="")
     {
       displaymessage("enter a strong password!","pass","red");
          return false;
       }
       if(!pass.match(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/))
       {
          displaymessage("enter a strong password!","pass","red");
          return false;
       }
       displaymessage("you create a strong password","pass","green");
       return true;
     }
     
     function validpassword() {
       var fpassword=document.getElementById('mypass').value;
       var confirm=document.getElementById('cpass').value;
       if(confirm.length==0)
        {
        displaymessage("password don't match","ccpass","red");
        return false;
       }
       else if(fpassword!=confirm)
       {
        displaymessage("password don't match","ccpass","red");
        return false;
       }
       displaymessage("password is matched","ccpass","green");
       return true;
     }

     function validadhar() {
       var ad=document.getElementById('adhar').value;
     if(ad.length==0)
     {
       displaymessage("adhar number is required","cadhar","red");
        return false;
       }
       if(isNaN(ad))
       {
        displaymessage("only numbers are allowed","cadhar","red");
        return false;
       }
       if(ad.length<12||ad.length>12)
        {
        displaymessage("please enter 12 digit adhar number","cadhar","red");
        return false;
       }
       displaymessage("adhar number is enter successfully","cadhar","green");
       return true;
     }

     function validcity()
     {
       var fname=document.getElementById('city').value;
       if(fname.length==0)
       {
         displaymessage("city is required","ccity","red");
         return false;
       }
       if(!fname.match(/^[a-zA-Z ]*[a-zA-Z]*$/))
       {
          displaymessage("enter a valid name!","ccity","red");
          return false;
       }
       //displaymessage("Welcome "+fname,"ccity","green");
       return true;
     }

     function validdistrict()
     {
       var fname=document.getElementById('dis').value;
       if(fname.length==0)
       {
         displaymessage("district is required","cdis","red");
         return false;
       }
       if(!fname.match(/^[a-zA-Z ]*[a-zA-Z]*$/))
       {
          displaymessage("enter a valid district!","cdis","red");
          return false;
       }
       //displaymessage("Welcome "+fname,"ccity","green");
       return true;
     }

      function validpincode() {
       var ad=document.getElementById('pin').value;
     if(ad.length==0)
     {
       displaymessage("pincode is required","cpin","red");
        return false;
       }
       if(isNaN(ad))
       {
        displaymessage("only numbers are allowed","cpin","red");
        return false;
       }
       if(ad.length<6||ad.length>6)
        {
        displaymessage("please enter 6 digit pin number","cpin","red");
        return false;
       }
       //displaymessage("adhar number is enter successfully","cpin","green");
       return true;
     }

     function validstate()
     {
       var fname=document.getElementById('state').value;
       if(fname.length==0)
       {
         displaymessage("state is required","cstate","red");
         return false;
       }
       if(!fname.match(/^[a-zA-Z ]*[a-zA-Z]*$/))
       {
          displaymessage("enter a valid state name!","cstate","red");
          return false;
       }
       //displaymessage("Welcome "+fname,"ccity","green");
       return true;
     }

      function validmobile()
     {
         var mob=document.getElementById('mnum').value;
       if(mob.length==0)
       {
        displaymessage("mobile number is required","mobnum","red");
        return false;
       }
       if(isNaN(mob))
       {
        displaymessage("only numbers are allowed","mobnum","red");
        return false;
       }
       if(!mob.match(/^[6-9]/))
       {
        displaymessage("first digit 6,7,8,9 are allowed","mobnum","red");
        return false;
       }
       if(mob.length<10||mob.length>10)
        {
        displaymessage("please enter 10 digit mobile number","mobnum","red");
        return false;
       }
       //displaymessage("mobile number is enter successfully","mobnum","green");
       return true;
     }

      function validemail() {
       var ad=document.getElementById('email').value;
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

     function box() {
        if (document.getElementById('check_box').checked) {
            return true;
        } 
        else {
            return false;
        }
    }
  

   function validation()
   {
     var cap1,cap2;
     var flag=0;

     cap1=document.getElementById('readcaptcha').value;
     cap2=document.getElementById('inputcaptch').innerHTML;
     cap2 = cap2.replace(/ /g,'');

     if(cap1!=cap2)
       {
        displaymessage("captcha is not matched","displaycaptcha","red");
        flag=1;
       }
        if(!box())
           flag=1;
        if(!myfirstname())
             flag=1;
        if(!mylastname())
           flag=1;
        if(!mypassword())
            flag=1;
        if(!validpassword())
            flag=1;
        if(!validadhar())
           flag=1;
        if(!validcity())
           flag=1;
        if(!validdistrict())
           flag=1; 
        if(!validpincode())
           flag=1;
        if(!validstate())
           flag=1;
        if(!validmobile())
           flag=1;
        if(!validemail())
           flag=1;
        if(flag==1)
        {
          console.log("false");
           return false;
        }
        else 
        {
          console.log("true");
          document.querySelector('#form1').submit();
          return true;
        }
     }
</script>
</html>
<%-- 
    Document   : index
    Created on : May 1, 2017, 5:24:59 PM
    Author     : Patrick Ian Co
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/css/style.css">
        <link rel="icon" href="assets/img/favicon.ico">
   	<script src="assets/js/jquery.min.js"></script>
    	<script src="assets/js/bootstrap.min.js"></script>
	<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body{
              margin-top: 30px;
              background-color: black;	}
              * {box-sizing:border-box}

              .nettxt {
              color: white;
              margin-top: 10px;
              font-size: 50px;
              text-align: center;
            }
            .nettxt2 {
              color: white;
              margin-top: -5px;
              font-size: 20px;
              text-align: center;
            }


            .mySlides {display:none}

            /* Slideshow container */
            .slideshow-container {
              max-width: 1000px;
              position: relative;
              margin: auto;
            }

            /* Caption text */
            .text {
              color: #f2f2f2;
              font-size: 15px;
              padding: 8px 12px;
              position: absolute;
              bottom: 8px;
              width: 100%;
              text-align: center;
            }

            .logo {
                margin: auto;

            }
            .numbertext {
              color: #f2f2f2;
              font-size: 12px;
              padding: 8px 12px;
              position: absolute;
              top: 0;
            }


            .dot {
              height: 13px;
              width: 13px;
              margin: 0 2px;
              background-color: #bbb;
              border-radius: 50%;
              display: inline-block;
              transition: background-color 0.3s ease;
            }

            .active {
              background-color: #717171;
            }

            /* Fading animation */
            .fade {
              -webkit-animation-name: fade;
              -webkit-animation-duration: 1.5s;
              animation-name: fade;
              animation-duration: 1.5s;
            }


            @-webkit-keyframes fade {
              from {opacity: .4} 
              to {opacity: 2}
            }

            @keyframes fade {
              from {opacity: .4} 
              to {opacity: 2}
            }

            /* On smaller screens, decrease text size */
            @media only screen and (max-width: 300px) {
              .text {font-size: 11px}
            }

            #popupbox{
            margin: 0; 
            margin-left: 25%; 
            margin-right: 20%;
            margin-top: 50px; 
            padding-top: 15px; 
            width: 50%; 
            height: 150px; 
            position: absolute; 
            background: #FBFBF0; 
            border: solid #000000 2px; 
            z-index: 9; 
            font-family: arial; 
            }
        </style>
    </head>    
    <body>
        <div class="slideshow-container">

        <div class="mySlides fade">
          <div class="numbertext">NetPHlix</div>
          <img src="assets/img/slide1.png" style="width:100%">
          <div class="text"><img class="img-responsive mx-auto d-block" src="assets/img/flogo.png" style="width:30%"></div>
        </div>

        <div class="mySlides fade">
          <div class="numbertext">NetPHlix</div>
          <img src="assets/img/slide2.png" style="width:100%">
          <div class="text"><img class="img-responsive mx-auto d-block" src="assets/img/flogo.png" style="width:30%"></div>
        </div>

        <div class="mySlides fade">
          <div class="numbertext">NetPHlix</div>
          <img src="assets/img/slide3.png" style="width:100%">
          <div class="text"><img class="img-responsive mx-auto d-block" src="assets/img/flogo.png" style="width:30%"></div>
        </div>

        </div>
        <br>

        <div style="text-align:center">
          <span class="dot"></span> 
          <span class="dot"></span> 
          <span class="dot"></span> 
        </div>
        <div class="nettxt">Introducing <b>NetPHlix</b></div>
        <div class="nettxt2"><b>WATCH ANYWHERE. PAUSE ANYTIME. PLAY WHENEVER YOU LIKE IT.</b></div><br>
        <script>
        var slideIndex = 0;
        showSlides();

        function showSlides() {
            var i;
            var slides = document.getElementsByClassName("mySlides");
            var dots = document.getElementsByClassName("dot");
            for (i = 0; i < slides.length; i++) {
               slides[i].style.display = "none";  
            }
            slideIndex++;
            if (slideIndex> slides.length) {slideIndex = 1}    
            for (i = 0; i < dots.length; i++) {
                dots[i].className = dots[i].className.replace(" active", "");
            }
            slides[slideIndex-1].style.display = "block";  
            dots[slideIndex-1].className += " active";
            setTimeout(showSlides, 1500); // Change image every 2 seconds
        }
        </script>
        <div id="popupbox">
            <h5 style="margin-bottom: 15; font-size: 15px; color:red;"><b>User not Found</b></h5>
            <form action="LoginServlet" method="POST">
              <div class="form-group">
                <input type="text" class="form-control" placeholder="Username" name="username">
              </div>
              <div class="form-group">
                <input type="password" class="form-control" placeholder="Password" name="password">
              </div>
              <br>
              <div class="form-group">
                <div class="col-md-12 text-center"><input type="submit" name="Submit" value="Login" class="btn btn-primary btn-block"></div>
              </div>

            </form>
        </div>
    </body>
</html>

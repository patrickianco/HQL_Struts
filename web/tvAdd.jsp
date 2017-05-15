<%-- 
    Document   : tvAdd
    Created on : May 1, 2017, 6:26:25 PM
    Author     : Patrick Ian Co
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NetPHlix</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
            .goBack{
                float:right;
            }
        </style>
    </head>
    <body>
        <img class="img-responsive mx-auto d-block" src="assets/img/flogo.png" style="width:25%">
        <div class="container">
            <div class="card">
                <div class="card-header text-center">
                  <div class="row">
                    <div class="col-md-11"><h3 class="">Add T.V. Show</h3></div>
                    <div class="col-md-1 text-center "><button class="btn btn-danger goBack" onclick="location.href='adminHome.jsp'">Go back</button></div>
                  </div>
                </div>
                <div class="card-block">
                    <form class="form-horizontal" action="TvAdd" method="POST">
                        <div class="form-group">
                          <div class="row">
                            <div class="col-md-4 text-center"><h5>Title:</h5></div>
                            <div class="col-md-8"><input type="text" class="form-control" placeholder="Title" name="title"></div>
                          </div>	
                        </div>
                        <div class="form-group">
                           <div class="row">
                            <div class="col-md-4 text-center"><h5>Year:</h5></div>
                            <div class="col-md-8"><input type="text" class="form-control" placeholder="Year" name="year"></div>
                          </div>	
                        </div>
                        <div class="form-group">
                            <div class="row">
                                <div class="col-md-4 text-center"><h5>Season:</h5></div>
                                <div class="col-md-8">
                                <input type="text"  class="form-control" placeholder="Season" name="season">
                                </div>
                            </div>
                        </div>		
                        <div class="form-group">
                            <div class="row">
                            <div class="col-md-12 text-center"><input type="submit" class="btn btn-primary " value="Add Record"></div>
                            </div>
                        </div>      
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

<%-- 
    Document   : adminHome
    Created on : May 1, 2017, 6:19:44 PM
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
        </style>
    </head>
    <body>
        <img class="img-responsive mx-auto d-block" src="assets/img/flogo.png" style="width:25%">
        <div class="container">
          <div class="card">
              <div class="card-header text-center">
              <div class="row">
                    <div class="col-md-12"><h3 class=" float-center">Welcome, <b>Admin</b></h3></div>
              </div>
              </div>
              
              <div class="card-block">
                <form action="AdminServlet" method="POST">
                  <div class="form-group">
                      <div class="row">
                          <div class="col-md-6">
                                  <input name="button" type="submit" value="Add User" class="btn btn-primary btn-block btn-lg">
                          </div>
                          <div class="col-md-6">
                                  <input name="button" type="submit" value="Add TV Show" class="btn btn-primary btn-block btn-lg">

                          </div>
                      </div>
                  </div>
                  <div class="form-group">
                    <div class="row">
                        <div class="col-md-6">
                                <input name="button" type="submit" value="View Users" class="btn btn-primary btn-block btn-lg">
                        </div>
                        <div class="col-md-6">
                            <input name="button" type="submit" value="View TV Shows" class="btn btn-primary btn-block btn-lg">
                        </div>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="row">
                        <div class="col-md-12"><input name="button" type="submit" value="Logout" class="float-right btn btn-danger btn-lg btn-block"></div>
                    </div>
                  </div>
                </form>
               </div>
          </div>
        </div>
    </body>
</html>

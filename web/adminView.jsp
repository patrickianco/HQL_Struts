<%-- 
    Document   : adminView
    Created on : May 1, 2017, 6:25:52 PM
    Author     : Patrick Ian Co
--%>

<%@page import="Hibernate.com.Users"%>
<%@page import="Hibernate.com.Users"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="org.hibernate.service.ServiceRegistry"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/css/style.css">
        <link rel="icon" href="assets/img/favicon.ico">
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>NetPHlix</title>
	<style>
	    body{
                margin-top: 30px;
                background-color: black;
	    }
            * {box-sizing:border-box}

	    .goBack{ float: right; }
	</style>
    </head>
    <body>
        <%

	    Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry
		    = new StandardServiceRegistryBuilder().applySettings(
			    configuration.getProperties()).build();
	    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

	    Session s = factory.openSession();
	    List results = s.createQuery("FROM Users").list();
        %>
	<img class="img-responsive mx-auto d-block" src="assets/img/flogo.png" style="width:25%">
        <div class="container">
	    <div class="card">
		<div class="card-header text-center">
		    <div class="row">
                        <div class="col-md-11"><h3 class="">View Users</h3></div>
                        <div class="col-md-1 text-center "><button class="btn btn-danger goBack" onclick="location.href = 'adminHome.jsp'">Go back</button></div>
		    </div>
		</div>
		<div class="card-block">
		    <div class="table-responsive">
			<table class="table table-condensed table-bordered text-center table-striped col-md-12">
			    <thead>
				<tr>
				    <th class="text-center active">USERNAME</th>
				    <th class="text-center">PASSWORD</th>
				    <th class="text-center">ROLE</th>
				    <th class="text-center" colspan="2">ACTIONS</th>
				</tr>
			    </thead>
			    <tbody>
				<%
				    for (Iterator it = results.iterator(); it.hasNext();) {
					Users user = (Users) it.next();
				%> 
				<tr>
			    <form action="EditServlet" method="POST">

				<td><input  type="text" readonly="" name="" value ="<%out.print(user.getUsername());%>" class="text-center"/></td>
				<td><input  type="text" readonly="" name="" value ="<%out.print(user.getPassword());%>" class="text-center"/></td>
				<td><input  type="text" readonly="" name="" value ="<%out.print(user.getRole());%>" class="text-center"/></td>
				<td><input type="checkbox" name="checkbox" value="<%out.println(user.getId());%>"></td>
				<td><input type="submit" name="button" value="Edit" /></td>

				<%}%>
				</tr>
				</tbody>
			</table>
		    </div>
		    <div class="form-group">
			<div class="row">
			    <div class="col-md-12 text-center"><input type="submit" value="Delete" name="button" class="btn btn-danger"/></div>
			</div>
		    </div>
		    </form>
		</div>
	    </div>
	</div>
    </body>
</html>

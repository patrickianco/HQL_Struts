<%-- 
    Document   : superView
    Created on : May 1, 2017, 6:11:23 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <table>
            <thead>
                <tr>
                    <th>USERNAME</th>
                    <th>PASSWORD</th>
                    <th>ROLE</th>
                </tr>
            </thead>
            <tbody>
                <%
                for(Iterator it = results.iterator(); it.hasNext();){
                       Users user = (Users) it.next();
                %> 
                 <tr>
                    <td><input  type="text" readonly="" name="" value ="<%out.print(user.getUsername());%>"/></td>
                    <td><input  type="text" readonly="" name="" value ="<%out.print(user.getPassword());%>"/></td>
                    <td><input  type="text" readonly="" name="" value ="<%out.print(user.getRole());%>"/></td> 
                <%}%>
                </tr>
            </tbody>
        </table>
    </body>
</html>

<%-- 
    Document   : tvView
    Created on : May 1, 2017, 6:32:49 PM
    Author     : Patrick Ian Co
--%>
<%@page import="Hibernate.com.Shows"%>
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
           List results = s.createQuery("FROM Shows").list();
        %>
        <table>
            <thead>
                <tr>
                    <th>TITLE</th>
                    <th>YEAR</th>
                    <th>SEASON</th>
                    <th>ACTIONS</th>
                </tr>
            </thead>
            <tbody>
                <%
                for(Iterator it = results.iterator(); it.hasNext();){
                       Shows show = (Shows) it.next();
                %> 
                 <tr>
        <form action="EditTvServlet" method="POST">
               
                    <td><input  type="text" readonly="" name="" value ="<%out.print(show.getTitle());%>"/></td>
                    <td><input  type="text" readonly="" name="" value ="<%out.print(show.getYear());%>"/></td>
                    <td><input  type="text" readonly="" name="" value ="<%out.print(show.getSeason());%>"/></td>
                    <td><input type="checkbox" name="checkbox" value="<%out.println(show.getId());%>"> | <input type="submit" name="button" value="Edit" /></td>
            
                <%}%>
                </tr>
            </tbody>
        </table>
                <input type="submit" value="Delete" name="button" />
        </form>
    </body>
</html>

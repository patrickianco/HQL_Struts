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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
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
            /*String hql = "from Users";
            List<Users> results = (List<Users>) s.createQuery(hql).list();
    
            for(Users result: results){
                String uname = result.getUsername();
                String pass = result.getPassword();
                String role = result.getRole();
                
                out.print(uname);
                out.print(pass);
                out.print(role);
            }*/
            String hqlU = "from Users";
            List<Users> resultsU = (List<Users>) s.createQuery(hqlU).list();
        %>
        <table>
            <thead>
                <tr>
                    <th>USERNAME</th>
                    <th>PASSWORD</th>
                    <th>ROLE</th>
                    <th>ACTIONS</th>
                </tr>
            </thead>
            <tbody>

                 <tr>
                <%
                     for(Users result: resultsU){
                String uname = result.getUsername();
                String pass = result.getPassword();
                String role = result.getRole();
                
                
                %> 
               
                    <td><% out.print(uname); %></td>
                
                        
                <%}%>
</tr>
            </tbody>
        </table>
    </body>
</html>

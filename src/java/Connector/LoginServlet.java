/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Session;
import Hibernate.com.Security;

/**
 *
 * @author Patrick Ian Co
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public SessionFactory factory;
    private int count = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            Configuration configuration = new Configuration();
            configuration.configure();
            ServiceRegistry serviceRegistry = 
                    new StandardServiceRegistryBuilder().applySettings(
                            configuration.getProperties()).build();
            factory = configuration.buildSessionFactory(serviceRegistry);
            
            String superAdmin = getServletContext().getInitParameter("adminUname");
            String superPass = getServletContext().getInitParameter("adminPass");
            String uname = request.getParameter("username");
            String pass = Security.encrypt(request.getParameter("password"));
            
            
            
            if(superAdmin.equals(uname) && superPass.equals(pass)){
                RequestDispatcher rd = request.getRequestDispatcher("superHome.jsp");
                rd.forward(request, response);
            }
            
            else{
                Session session = factory.openSession();
                //Check user table
                String hql = "from Users u where u.username=:uname and u.password=:pass";
                Query q = session.createQuery(hql).setString("uname", uname).setString("pass", pass);
                List results = q.list();
                Iterator it = results.iterator();
                
                //Check role hql
                String hqlRole = "select u.role from Users u where u.username=:uname and u.password=:pass";
                Query qRole = session.createQuery(hqlRole).setString("uname", uname).setString("pass", pass);
                List role = qRole.list();
                Iterator itRole = role.iterator();
                
                while(it.hasNext()){
                   while(itRole.hasNext()){
                       String r = (String) itRole.next();
                       if(r.equals("Admin")){
                           RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
                           rd.forward(request, response);
                       }
                       else if(r.equals("User")){
                           RequestDispatcher rd = request.getRequestDispatcher("userHome.jsp");
                           rd.forward(request, response);
                       }
                   }
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("loginError.jsp");
            rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

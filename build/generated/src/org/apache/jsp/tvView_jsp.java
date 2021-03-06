package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Hibernate.com.Shows;
import Hibernate.com.Users;
import Hibernate.com.Users;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;

public final class tvView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            Configuration configuration = new Configuration();
            configuration.configure();
            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder().applySettings(
                            configuration.getProperties()).build();
            SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

            Session s = factory.openSession();
           List results = s.createQuery("FROM Shows").list();
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>TITLE</th>\n");
      out.write("                    <th>YEAR</th>\n");
      out.write("                    <th>SEASON</th>\n");
      out.write("                    <th>ACTIONS</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                for(Iterator it = results.iterator(); it.hasNext();){
                       Shows show = (Shows) it.next();
                
      out.write(" \n");
      out.write("                 <tr>\n");
      out.write("        <form action=\"EditServlet\" method=\"POST\">\n");
      out.write("               \n");
      out.write("                    <td><input  type=\"text\" readonly=\"\" name=\"\" value =\"");
out.print(show.getTitle());
      out.write("\"/></td>\n");
      out.write("                    <td><input  type=\"text\" readonly=\"\" name=\"\" value =\"");
out.print(show.getYear());
      out.write("\"/></td>\n");
      out.write("                    <td><input  type=\"text\" readonly=\"\" name=\"\" value =\"");
out.print(show.getSeason());
      out.write("\"/></td>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"checkbox\" value=\"");
out.println(show.getId());
      out.write("\"> | <input type=\"submit\" name=\"button\" value=\"Edit\" /></td>\n");
      out.write("            \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("                <input type=\"submit\" value=\"Delete\" name=\"button\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

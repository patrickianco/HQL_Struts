package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NetPHlix</title>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <link rel=\"icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("   \t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    \t<script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin-top: 30px;\n");
      out.write("                background-color: black;\t}\n");
      out.write("            * {box-sizing:border-box}\n");
      out.write("\n");
      out.write("            .nettxt {\n");
      out.write("              color: white;\n");
      out.write("              margin-top: 10px;\n");
      out.write("              font-size: 50px;\n");
      out.write("              text-align: center;\n");
      out.write("            }\n");
      out.write("            .nettxt2 {\n");
      out.write("              color: white;\n");
      out.write("              margin-top: -5px;\n");
      out.write("              font-size: 20px;\n");
      out.write("              text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img class=\"img-responsive mx-auto d-block\" src=\"assets/img/flogo.png\" style=\"width:30%\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("              <div class=\"card-header text-center\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-10\"><h3 class=\" float-center\">Welcome, <b>Admin</b></h3></div>\n");
      out.write("                <div class=\"col-md-2\"><input type=\"button\" value=\"Logout\" class=\"float-right btn btn-danger btn-sm\"></div>\n");
      out.write("              </div>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <form action=\"AdminServlet\" method=\"POST\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                          <div class=\"col-md-6\">\n");
      out.write("                                  <input name=\"button\" type=\"submit\" value=\"Add User\" class=\"btn btn-primary btn-block btn-lg\">\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-md-6\">\n");
      out.write("                                  <input name=\"button\" type=\"submit\" value=\"Add TV Show\" class=\"btn btn-primary btn-block btn-lg\">\n");
      out.write("\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <input name=\"button\" type=\"submit\" value=\"View Users\" class=\"btn btn-primary btn-block btn-lg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <input name=\"button\" type=\"submit\" value=\"View TV Shows\" class=\"btn btn-primary btn-block btn-lg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("               </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
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

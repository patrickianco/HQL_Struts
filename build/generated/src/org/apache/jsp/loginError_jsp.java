package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginError_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
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
      out.write("              margin-top: 30px;\n");
      out.write("              background-color: black;\t}\n");
      out.write("              * {box-sizing:border-box}\n");
      out.write("\n");
      out.write("              .nettxt {\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            .mySlides {display:none}\n");
      out.write("\n");
      out.write("            /* Slideshow container */\n");
      out.write("            .slideshow-container {\n");
      out.write("              max-width: 1000px;\n");
      out.write("              position: relative;\n");
      out.write("              margin: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Caption text */\n");
      out.write("            .text {\n");
      out.write("              color: #f2f2f2;\n");
      out.write("              font-size: 15px;\n");
      out.write("              padding: 8px 12px;\n");
      out.write("              position: absolute;\n");
      out.write("              bottom: 8px;\n");
      out.write("              width: 100%;\n");
      out.write("              text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo {\n");
      out.write("                margin: auto;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .numbertext {\n");
      out.write("              color: #f2f2f2;\n");
      out.write("              font-size: 12px;\n");
      out.write("              padding: 8px 12px;\n");
      out.write("              position: absolute;\n");
      out.write("              top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .dot {\n");
      out.write("              height: 13px;\n");
      out.write("              width: 13px;\n");
      out.write("              margin: 0 2px;\n");
      out.write("              background-color: #bbb;\n");
      out.write("              border-radius: 50%;\n");
      out.write("              display: inline-block;\n");
      out.write("              transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active {\n");
      out.write("              background-color: #717171;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Fading animation */\n");
      out.write("            .fade {\n");
      out.write("              -webkit-animation-name: fade;\n");
      out.write("              -webkit-animation-duration: 1.5s;\n");
      out.write("              animation-name: fade;\n");
      out.write("              animation-duration: 1.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            @-webkit-keyframes fade {\n");
      out.write("              from {opacity: .4} \n");
      out.write("              to {opacity: 2}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes fade {\n");
      out.write("              from {opacity: .4} \n");
      out.write("              to {opacity: 2}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* On smaller screens, decrease text size */\n");
      out.write("            @media only screen and (max-width: 300px) {\n");
      out.write("              .text {font-size: 11px}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #popupbox{\n");
      out.write("            margin: 0; \n");
      out.write("            margin-left: 25%; \n");
      out.write("            margin-right: 20%;\n");
      out.write("            margin-top: 50px; \n");
      out.write("            padding-top: 20px; \n");
      out.write("            width: 50%; \n");
      out.write("            height: 150px; \n");
      out.write("            position: absolute; \n");
      out.write("            background: #FBFBF0; \n");
      out.write("            border: solid #000000 2px; \n");
      out.write("            z-index: 9; \n");
      out.write("            font-family: arial; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("        <div class=\"mySlides fade\">\n");
      out.write("          <div class=\"numbertext\">NetPHlix</div>\n");
      out.write("          <img src=\"assets/img/slide1.png\" style=\"width:100%\">\n");
      out.write("          <div class=\"text\"><img class=\"img-responsive mx-auto d-block\" src=\"assets/img/flogo.png\" style=\"width:30%\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mySlides fade\">\n");
      out.write("          <div class=\"numbertext\">NetPHlix</div>\n");
      out.write("          <img src=\"assets/img/slide2.png\" style=\"width:100%\">\n");
      out.write("          <div class=\"text\"><img class=\"img-responsive mx-auto d-block\" src=\"assets/img/flogo.png\" style=\"width:30%\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mySlides fade\">\n");
      out.write("          <div class=\"numbertext\">NetPHlix</div>\n");
      out.write("          <img src=\"assets/img/slide3.png\" style=\"width:100%\">\n");
      out.write("          <div class=\"text\"><img class=\"img-responsive mx-auto d-block\" src=\"assets/img/flogo.png\" style=\"width:30%\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div style=\"text-align:center\">\n");
      out.write("          <span class=\"dot\"></span> \n");
      out.write("          <span class=\"dot\"></span> \n");
      out.write("          <span class=\"dot\"></span> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"nettxt\">Introducing <b>NetPHlix</b></div>\n");
      out.write("        <div class=\"nettxt2\"><b>WATCH ANYWHERE. PAUSE ANYTIME. PLAY WHENEVER YOU LIKE IT.</b></div><br>\n");
      out.write("        <script>\n");
      out.write("        var slideIndex = 0;\n");
      out.write("        showSlides();\n");
      out.write("\n");
      out.write("        function showSlides() {\n");
      out.write("            var i;\n");
      out.write("            var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("            var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("            for (i = 0; i < slides.length; i++) {\n");
      out.write("               slides[i].style.display = \"none\";  \n");
      out.write("            }\n");
      out.write("            slideIndex++;\n");
      out.write("            if (slideIndex> slides.length) {slideIndex = 1}    \n");
      out.write("            for (i = 0; i < dots.length; i++) {\n");
      out.write("                dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("            }\n");
      out.write("            slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("            dots[slideIndex-1].className += \" active\";\n");
      out.write("            setTimeout(showSlides, 1500); // Change image every 2 seconds\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("        <h5>User not Found</h5>\n");
      out.write("        <div id=\"popupbox\"> \n");
      out.write("            <form action=\"LoginServlet\" method=\"POST\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"username\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\">\n");
      out.write("              </div>\n");
      out.write("              <br>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <div class=\"col-md-12 text-center\"><input type=\"submit\" name=\"Submit\" value=\"Login\" class=\"btn btn-primary btn-block\"></div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </form>\n");
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

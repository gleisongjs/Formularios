package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cadastro</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"Casa Conectada\" content=\"Sistema Água para Layla\">\n");
      out.write("\n");
      out.write("        <!-- inserindo o bootstrap-->\n");
      out.write("        <link href=\"public/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/bootstrap-select.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/costumizado.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"public/stylesheets/locastyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"icon\" sizes=\"192x192\" href=\"images/portal.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"public/img//portal.png\">\n");
      out.write("        <!-- Ele funciona da mesma com toda a versão do jQuery 1.x para 2.x -->\n");
      out.write("        <script src=\"public/js/jquery-1.9.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"public/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"public/js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container col-md-12\">\n");
      out.write("\n");
      out.write("            <div class=\"container\" align=\"center\">\n");
      out.write("                <img class=\"img-circle\" id=\"logo\" src=\"public/img/logologin.jpg\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Begin # DIV Form -->\n");
      out.write("            <div id=\"div-forms\">\n");
      out.write("\n");
      out.write("                <!-- Begin # Login Form -->\n");
      out.write("                <div class=\"container col-md-4\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container col-md-4\">\n");
      out.write("\n");
      out.write("                    <form id=\"login-form\"  align=\"center\">\n");
      out.write("                        <input id=\"login_username\" class=\"form-control\" type=\"text\" placeholder=\"Email\" required>\n");
      out.write("                        <br/>\n");
      out.write("                        <input id=\"login_password\" class=\"form-control\" type=\"password\" placeholder=\"senha\" required>\n");
      out.write("                        <br/>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">Entrar</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class =\"container col-md-4\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class =\"container\" align=\"center\">\n");
      out.write("            <button id=\"login_lost_btn\" type=\"button\" class=\"btn btn-link\">Esqueceu a senha?</button> || \n");
      out.write("            <a href = \"cadastro.jsp\" <button id=\"login_register_btn\" type=\"button\" class=\"btn btn-link\">Cadastre-se</button></a>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"public/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/bootstrap-select.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/costumizado.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/stylesheets/locastyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"public/js/bootstrap/bootstrap.min.js\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"public/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"public/js/bootstrap/bootstrap.min.js\"> </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<h1 class=\"text-center\">Tela de Login</h1>\n");
      out.write("                <button type =\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#loginModal\"> Login </button>\n");
      out.write("       <!-- <p class=\"text-center\"><a href=\"#\" class=\"btn btn-primary btn-lg\" role=\"button\" data-toggle=\"modal\" data-target=\"#loginModal\">Login</a></p>-->\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- BEGIN # MODAL LOGIN -->\n");
      out.write("<div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"loginModalLabel\" aria-hidden=\"true\" style=\"display: none;\">\n");
      out.write("    \t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\" align=\"center\">\n");
      out.write("                                    <img class=\"img-circle\" id=\"logo\" src=\"public/img/logologin.jpg\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                \n");
      out.write("                <!-- Begin # DIV Form -->\n");
      out.write("                <div id=\"div-forms\">\n");
      out.write("                \n");
      out.write("                    <!-- Begin # Login Form -->\n");
      out.write("                    <form id=\"login-form\">\n");
      out.write("\t\t                <div class=\"modal-body\">\n");
      out.write("\t\t\t\t    \t\t<input id=\"login_username\" class=\"form-control\" type=\"text\" placeholder=\"Email\" required>\n");
      out.write("\t\t\t\t    \t\t<input id=\"login_password\" class=\"form-control\" type=\"password\" placeholder=\"senha\" required>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\"> Lembre-me\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("        \t\t    \t</div>\n");
      out.write("\t\t\t\t        <div class=\"modal-footer\">\n");
      out.write("                            <div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">Entrar</button>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t    \t    <div>\n");
      out.write("                                <button id=\"login_lost_btn\" type=\"button\" class=\"btn btn-link\">Esqueceu a senha?</button>\n");
      out.write("                                <a href = \"cadastro.jsp\" <button id=\"login_register_btn\" type=\"button\" class=\"btn btn-link\">Cadastre-se</button></a>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- End # Login Form -->\n");
      out.write("                    \n");
      out.write("                    <!-- Begin | Lost Password Form -->\n");
      out.write("                    <form id=\"lost-form\" style=\"display:none;\">\n");
      out.write("    \t    \t\t    <div class=\"modal-body\">\n");
      out.write("\t\t    \t\t\t\t<div id=\"div-lost-msg\">\n");
      out.write("                                <div id=\"icon-lost-msg\" class=\"glyphicon glyphicon-chevron-right\"></div>\n");
      out.write("                                <span id=\"text-lost-msg\">Type your e-mail.</span>\n");
      out.write("                            </div>\n");
      out.write("\t\t    \t\t\t\t<input id=\"lost_email\" class=\"form-control\" type=\"text\" placeholder=\"E-Mail (type ERROR for error effect)\" required>\n");
      out.write("            \t\t\t</div>\n");
      out.write("\t\t    \t\t    <div class=\"modal-footer\">\n");
      out.write("                            <div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">Send</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <button id=\"lost_login_btn\" type=\"button\" class=\"btn btn-link\">Log In</button>\n");
      out.write("                                <button id=\"lost_register_btn\" type=\"button\" class=\"btn btn-link\">Register</button>\n");
      out.write("                            </div>\n");
      out.write("\t\t    \t\t    </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- End | Lost Password Form -->\n");
      out.write("                    \n");
      out.write("                    <!-- Begin | Register Form -->\n");
      out.write("                    <form id=\"register-form\" style=\"display:none;\">\n");
      out.write("            \t\t    <div class=\"modal-body\">\n");
      out.write("\t\t    \t\t\t\t<div id=\"div-register-msg\">\n");
      out.write("                                <div id=\"icon-register-msg\" class=\"glyphicon glyphicon-chevron-right\"></div>\n");
      out.write("                                <span id=\"text-register-msg\">Register an account.</span>\n");
      out.write("                            </div>\n");
      out.write("\t\t    \t\t\t\t<input id=\"register_username\" class=\"form-control\" type=\"text\" placeholder=\"Username (type ERROR for error effect)\" required>\n");
      out.write("                            <input id=\"register_email\" class=\"form-control\" type=\"text\" placeholder=\"E-Mail\" required>\n");
      out.write("                            <input id=\"register_password\" class=\"form-control\" type=\"password\" placeholder=\"Password\" required>\n");
      out.write("            \t\t\t</div>\n");
      out.write("\t\t    \t\t    <div class=\"modal-footer\">\n");
      out.write("                            <div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">Register</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <button id=\"register_login_btn\" type=\"button\" class=\"btn btn-link\">Log In</button>\n");
      out.write("                                <button id=\"register_lost_btn\" type=\"button\" class=\"btn btn-link\">Lost Password?</button>\n");
      out.write("                            </div>\n");
      out.write("\t\t    \t\t    </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- End | Register Form -->\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!-- End # DIV Form -->\n");
      out.write("                \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <!-- END # MODAL LOGIN -->\n");
      out.write("    </body>\n");
      out.write("</html>");
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

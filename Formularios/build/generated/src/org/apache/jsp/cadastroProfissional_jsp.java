package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroProfissional_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>CadastroProfissional</title>\n");
      out.write("        <link href=\"public/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/bootstrap-select.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/css/costumizado.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"public/stylesheets/locastyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"public/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Formulário de Cadastro -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"view-form\">                            \n");
      out.write("                <form action=\"#SV\" name=\"cadastrasv\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" id=\"id\" name=\"id\"/>\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\"> Dados Pessoais</div>\n");
      out.write("                        <div class=\"panel-body\">                       \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nome\" class=\"control-label col-md-2\"><span class=\"obrigatorio\">*</span> Nome</label>\n");
      out.write("                                <div class=\"col-md-4\">           \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nome\" maxlength=\"100\" placeholder=\"Nome\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <label for=\"sexo\" class=\"control-label col-md-2\"><span class=\"obrigatorio\">*</span> Sexo</label>\n");
      out.write("                                <div class=\"col-md-4\">           \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"sexo\" maxlength=\"14\" placeholder=\"Sexo\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"crm\" class=\"control-label col-md-2\"><span class=\"obrigatorio\">*</span> Registro</label>\n");
      out.write("                                <div class=\"col-md-4\">           \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"crm\" maxlength=\"14\" placeholder=\"CRM\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <label for=\"descricao\" class=\"control-label col-md-2\"> Descrição</label>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <input  type=\"text\" class=\"form-control\" maxlength=\"14\" name=\"descricao\" placeholder=\"Descrição\" required />\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"especialidade\" class=\"control-label col-md-2\"> Especialidade</label>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <input  type=\"text\" class=\"form-control\" maxlength=\"100\" name=\"especialidade\" placeholder=\"Especialidade\" required />\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <label for=\"foto\" class=\"control-label col-md-2\"> Foto</label>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <input  type=\"file\" class=\"form-control\"  name=\"foto\"  required />\n");
      out.write("                                </div>\n");
      out.write("                            </div>   \n");
      out.write("                            <br/><br/><br/><br/><br/><br/>\n");
      out.write("\n");
      out.write("                            <!-- BOTÕES DE AÇÕES -->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div style=\"alignment-adjust: central\" ><center>\n");
      out.write("                                        <span id=\"load\"></span>\n");
      out.write("                                        <input type=\"submit\" name=\"btnsubmit\" class=\"btn btn-success\" aria-label=\"Left Align\">\n");
      out.write("                                        <input type=\"reset\" name=\"btnreset\" class=\"btn btn-danger\" aria-label=\"Right Align\">\n");
      out.write("                                    </center>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\" style=\"text-align: right\">\n");
      out.write("                                    <span class=\"obrigatorio\">*</span> Campos Obrigatórios\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div> \n");
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

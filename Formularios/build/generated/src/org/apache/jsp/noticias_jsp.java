package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html class=\"ls-theme-blue\" lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <title>Sistema Consultar</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"CarSell APP\" content=\"Essa aplicação será utilizada na avaliação da 3º VA, na disciplina de Programação e Tecnologia para Web\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("            <div class=\"container col-md-12\">\n");
      out.write("              \n");
      out.write("                <div class=\"view-form\">  \n");
      out.write("\n");
      out.write("                    <form action=\"NoticiaSV?action=noticiatopo\" name=\"topoSV\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\"><span class=\"glyphicon glyphicon-tasks\"></span> Notícia de topo</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <label for=\"titulo\" class=\"control-label col-md-2\"> Título: </label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"tituloNoticiaTopo\"  maxlength=\"50\"  required />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <label for=\"imagem\" class=\"control-label col-md-2\"> Imagem:  </label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input type=\"file\" class=\"form-control\" name=\"imagemNoticiaTopo\"    required />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div> \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"descricao\" class=\"control-label col-md-2\"> Descrição:  </label>\n");
      out.write("                                    <div class=\"col-md-10\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"descricaoNoticiaTopo\"    required />\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <br/>\n");
      out.write("                                <br/>\n");
      out.write("                               \n");
      out.write("                                <!-- BOTÕES DE AÇÕES -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div style=\"alignment-adjust: central\" ><center>\n");
      out.write("                                            <span id=\"load\"></span>\n");
      out.write("                                            <input type=\"submit\" name=\"btnsubmit\" class=\"btn btn-success\" aria-label=\"Left Align\">\n");
      out.write("                                            <input type=\"reset\" name=\"btnreset\" class=\"btn btn-danger\" aria-label=\"Right Align\">\n");
      out.write("                                        </center>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-9\" style=\"text-align: right\"></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <form action=\"NoticiaSV?action=noticiacotidiana\" name=\"cotidianaSV\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\"><span class=\"glyphicon glyphicon-tasks\"></span> Notícias cotidianas</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <label for=\"modelo\" class=\"control-label col-md-2\"> Título: </label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"tituloNoticiaCotidiana\"  maxlength=\"50\"  required />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <label for=\"imagem\" class=\"control-label col-md-2\"> Imagem:  </label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input type=\"file\" class=\"form-control\" name=\"imagemNoticiaCotidiana\"    required />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div> \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"NoticiaSV?action=descricao\" class=\"control-label col-md-2\"> Descrição:  </label>\n");
      out.write("                                    <div class=\"col-md-10\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"descricaoNoticiaCotidiana\"    required />\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <br/>\n");
      out.write("                                <br/>\n");
      out.write("                                <!-- BOTÕES DE AÇÕES -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div style=\"alignment-adjust: central\" ><center>\n");
      out.write("                                            <span id=\"load\"></span>\n");
      out.write("                                            <input type=\"submit\" name=\"btnsubmit\" class=\"btn btn-success\" aria-label=\"Left Align\">\n");
      out.write("                                            <input type=\"reset\" name=\"btnreset\" class=\"btn btn-danger\" aria-label=\"Right Align\">\n");
      out.write("                                        </center>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-9\" style=\"text-align: right\"></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <form action=\"NoticiaSV?action=dicadesaude\" name=\"dicasaude\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\"><span class=\"glyphicon glyphicon-alert\"></span> Dicas de Saúde</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <label for=\"modelo\" class=\"control-label col-md-2\"> Título: </label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"tituloDicaSaude\"  maxlength=\"50\"  required />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <label for=\"imagem\" class=\"control-label col-md-2\"> Imagem:  </label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input type=\"file\" class=\"form-control\" name=\"imagemDicaSaude\"    required />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div> \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"descricao\" class=\"control-label col-md-2\"> Descrição:  </label>\n");
      out.write("                                    <div class=\"col-md-10\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"descricaoDicaSaude\"    required />\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <br/>\n");
      out.write("                                <br/>\n");
      out.write("                                <!-- BOTÕES DE AÇÕES -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div style=\"alignment-adjust: central\" ><center>\n");
      out.write("                                            <span id=\"load\"></span>\n");
      out.write("                                            <input type=\"submit\" name=\"btnsubmit\" class=\"btn btn-success\" aria-label=\"Left Align\">\n");
      out.write("                                            <input type=\"reset\" name=\"btnreset\" class=\"btn btn-danger\" aria-label=\"Right Align\">\n");
      out.write("                                        </center>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-9\" style=\"text-align: right\"></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <form action=\"NoticiaSV?action=alterar\" name=\"topoSV\" class=\"form-horizontal\" method=\"post\"> \n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\"><span class=\"glyphicon glyphicon-remove-circle\"></span> Alterar/Remover</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"noticiatopo\" class=\"control-label col-md-2\"> Notícia de Topo: </label>\n");
      out.write("                                    <div class=\"col-md-4\">           \n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"alterartopo\" maxlength=\"60\" placeholder=\"Digite o título da notícia de topo\"  required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <span id=\"load\"></span>\n");
      out.write("                                        <input type=\"submit\" name=\"btnsubmit\" value=\"Alterar\"  class=\"btn btn-success\" aria-label=\"Left Align\">\n");
      out.write("                                        <input type=\"reset\" name=\"btnreset\" value=\"Excluir\" class=\"btn btn-danger\" aria-label=\"Right Align\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Nome do produto/marca sem sidebar quando for o pre-painel  -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"ls-topbar \">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <span class=\"ls-show-sidebar ls-ico-menu\"></span>\n");
      out.write("\n");
      out.write("            <a href=\"/locawebstyle/documentacao/exemplos//pre-painel\"  class=\"ls-go-next\"><span class=\"ls-text\">Voltar à lista de serviços</span></a>\n");
      out.write("\n");
      out.write("            <!-- Nome do produto/marca com sidebar -->\n");
      out.write("            <h1 class=\"ls-brand-name\">\n");
      out.write("                <a href=\"index.jsp\" class=\"ls-ico-accessibility\">\n");
      out.write("                    Sistema Consultar\n");
      out.write("                </a>\n");
      out.write("            </h1>\n");
      out.write("\n");
      out.write("            <!-- Nome do produto/marca sem sidebar quando for o pre-painel  -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <aside class=\"ls-sidebar\">\n");
      out.write("\n");
      out.write("            <div class=\"ls-sidebar-inner\">\n");
      out.write("                <a href=\"#\"  class=\"ls-go-prev\"><span class=\"ls-text\">Voltar à lista de serviços</span></a>\n");
      out.write("\n");
      out.write("                <nav class=\"ls-menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"NoticiaSV?action=noticia\"class=\"ls-ico-book\" title=\"noticias\">NOTÍCIAS</a></li>\n");
      out.write("                        <li><a href=\"unidades.jsp\" class=\"ls-ico-plus\" title=\"unidades\">UNIDADES DE SAÚDE</a></li>\n");
      out.write("                        <li><a href=\"recursos.jsp\" class=\"ls-ico-list\" title=\"recursos\">RECURSOS</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"public/lib/jquery.min.js\"></script>\n");
      out.write("        <script src=\"public/js/locastyle.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"public/js/jquery-1.9.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <main class=\"ls-main \">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"ls-title-intro ls-ico-home\">Página inicial</h1>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\"><span class=\"glyphicon glyphicon-info-sign\"></span> Descrição</div>\n");
      out.write("                        <div class=\"panel-body\">  \n");
      out.write("                            <P>\n");
      out.write("                                CARREGUE OS CONTEÚDOS AQUÍ.\n");
      out.write("                            </P>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

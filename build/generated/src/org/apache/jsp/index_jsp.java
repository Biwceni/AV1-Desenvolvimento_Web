package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dados.ExemplosBase2;
import Dados.ExemplosBase;
import Dados.DadosBase;
import java.util.ArrayList;
import java.util.List;

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Porcentagem</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.print(new DadosBase().getPorcentagem());
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            
            List<ExemplosBase> e = new ArrayList<ExemplosBase>();
            
            e.add(new ExemplosBase("<p>10 (Parte do Valor) de 20 (Valor Total) é 50%</p>","<p>72 (Parte do Valor) de 90 (Valor Total) é 80%</p>","<p>40 (Parte do Valor) de 100 (Valor Total) é 40%</p>","<p>10 (Parte do Valor) de 50 (Valor Total) é 20%</p>","<p>Podemos separar os exemplos em duas partes:</p>"));
            
            for(ExemplosBase exemplo :e){
                out.print(exemplo.getExemplo1());
                out.print(exemplo.getExemplo2());
                out.print(exemplo.getExemplo3());
                out.print(exemplo.getExemplo4() + "<br>");
                out.print(exemplo.getSepararexemplos());
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

        out.print(new DadosBase().exemplo_Porcentagem());
        out.print(new DadosBase().exemplo_Valores());
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <h4>Calcule a Porcentagem</h4><br>\n");
      out.write("            <form action=\"calculoporcentagem.jsp\" method=\"get\" target=\"valorfinal\">\n");
      out.write("                Parte do Valor: <input type=\"text\" name=\"parte\"><br>\n");
      out.write("                de (Valor Total): <input type=\"text\" name=\"total\"><br><br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"enviar\" value=\"Calcular a Porcentagem\">       \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <iframe name=\"valorfinal\" width=\"300\" height=\"200\"></iframe>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        ");
      out.print(new DadosBase().getPorcentagem2());
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            
            List<ExemplosBase2> b = new ArrayList<ExemplosBase2>();
            
            b.add(new ExemplosBase2("<p>Se 10 (Parte do Valor) é  50% (Porcentagem) , o total é de 20</p>","<p>Se 72 (Parte do Valor) é  80% (Porcentagem) , o total é de 90</p>","<p>Se 40 (Parte do Valor) é  40% (Porcentagem) , o total é de 100</p>","<p>Se 10 (Parte do Valor) é  20% (Porcentagem) , o total é de 50</p>","<p>Podemos separar os exemplos em duas partes:</p>"));
            
            for(ExemplosBase2 base :b){
                out.print(base.getExemplo5());
                out.print(base.getExemplo6());
                out.print(base.getExemplo7());
                out.print(base.getExemplo8()+ "<br>");
                out.print(base.getSepararexemplos()+ "<br>");
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

        out.print(new DadosBase().exemplo_Parte_Porcentagem());
        out.print(new DadosBase().exemplo_ValorTotal());
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <h4>Calcule o Valor Total</h4><br>\n");
      out.write("            <form action=\"calculoporcentagem2.jsp\" method=\"get\" target=\"valorfinal2\">\n");
      out.write("                Parte do Valor: <input type=\"text\" name=\"parte2\"><br>\n");
      out.write("                é de (Porcentagem): <input type=\"text\" name=\"porcentagemtotal\"><br><br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"enviar\" value=\"Calcular o Total\">       \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <iframe name=\"valorfinal2\" width=\"300\" height=\"200\"></iframe>\n");
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

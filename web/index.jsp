<%@page import="Dados.ExemplosBase2"%>
<%@page import="Dados.ExemplosBase"%>
<%@page import="Dados.DadosBase"%>
<%@page import='java.util.ArrayList'%>
<%@page import='java.util.List'%>


<!DOCTYPE html>

<html>
    <head>
        <title>Cálculo Porcentagem</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%=new DadosBase().getPorcentagem()%>
        
        <%
            
            List<ExemplosBase> e = new ArrayList<ExemplosBase>();
            
            e.add(new ExemplosBase("<p>10 (Parte do Valor) de 20 (Valor Total) é 50%</p>","<p>72 (Parte do Valor) de 90 (Valor Total) é 80%</p>","<p>40 (Parte do Valor) de 100 (Valor Total) é 40%</p>","<p>10 (Parte do Valor) de 50 (Valor Total) é 20%</p>","<p>Podemos separar os exemplos em duas partes:</p>"));
            
            for(ExemplosBase exemplo :e){
                out.print(exemplo.getExemplo1());
                out.print(exemplo.getExemplo2());
                out.print(exemplo.getExemplo3());
                out.print(exemplo.getExemplo4() + "<br>");
                out.print(exemplo.getSepararexemplos());
            }
            
        %>
        
        <%
        out.print(new DadosBase().exemplo_Porcentagem());
        out.print(new DadosBase().exemplo_Valores());
        %>
        
        <div>
            <h4>Calcule a Porcentagem</h4><br>
            <form action="calculoporcentagem.jsp" method="get" target="valorfinal">
                Parte do Valor: <input type="text" name="parte"><br>
                de (Valor Total): <input type="text" name="total"><br><br>

                <input type="submit" name="enviar" value="Calcular a Porcentagem">       
            </form>
        </div>
        <div>
            <iframe name="valorfinal" width="300" height="200"></iframe>
        </div>
        <br>
        
        <%=new DadosBase().getPorcentagem2()%>
        
        <%
            
            List<ExemplosBase2> b = new ArrayList<ExemplosBase2>();
            
            b.add(new ExemplosBase2("<p>Se 10 (Parte do Valor) é  50% (Porcentagem) , o total é de 20</p>","<p>Se 72 (Parte do Valor) é  80% (Porcentagem) , o total é de 90</p>","<p>Se 40 (Parte do Valor) é  40% (Porcentagem) , o total é de 100</p>","<p>Se 10 (Parte do Valor) é  20% (Porcentagem) , o total é de 50</p>","<p>Podemos separar os exemplos em duas partes:</p>"));
            
            for(ExemplosBase2 base :b){
                out.print(base.getExemplo5());
                out.print(base.getExemplo6());
                out.print(base.getExemplo7());
                out.print(base.getExemplo8() + "<br>");
                out.print(base.getSepararexemplos2() + "<br>");
            }
            
        %>
        
        <%
        out.print(new DadosBase().exemplo_Parte_Porcentagem());
        out.print(new DadosBase().exemplo_ValorTotal());
        %>
        
        <div>
            <h4>Calcule o Valor Total</h4><br>
            <form action="calculoporcentagem2.jsp" method="get" target="valorfinal2">
                Parte do Valor: <input type="text" name="parte2"><br>
                é de (Porcentagem): <input type="text" name="porcentagemtotal"><br><br>

                <input type="submit" name="enviar" value="Calcular o Total">       
            </form>
        </div>
        <div>
            <iframe name="valorfinal2" width="300" height="200"></iframe>
        </div>
    </body>
</html>

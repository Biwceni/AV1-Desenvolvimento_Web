<%@page import="Dados.DadosBase"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
try{ 
String parte_txt, total_txt;

float parte, total;
parte = 0f;
total = 0f;

parte_txt = request.getParameter("parte");
total_txt = request.getParameter("total");

parte = Float.parseFloat(parte_txt);
total = Float.parseFloat(total_txt);

out.println(new DadosBase().CalculoPorcentagem(parte, total));

} catch(NumberFormatException e){
    out.print("Erro.<br>Digite apenas números!<br>Não é necessário utilizar o %");
}
        %>
    </body>
</html>

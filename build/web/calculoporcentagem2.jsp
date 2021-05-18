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
String parte2_txt, porcentagemtotal_txt;

float parte2, porcentagemtotal;
parte2 = 0f;
porcentagemtotal = 0f;

parte2_txt = request.getParameter("parte2");
porcentagemtotal_txt = request.getParameter("porcentagemtotal");

parte2 = Float.parseFloat(parte2_txt);
porcentagemtotal = Float.parseFloat(porcentagemtotal_txt);

out.println(new DadosBase().CalculoPorcentagem2(parte2, porcentagemtotal));

} catch(NumberFormatException e){
    out.print("Erro.<br>Digite apenas números!<br>Não é necessário utilizar o %");
}
        %>
    </body>
</html>

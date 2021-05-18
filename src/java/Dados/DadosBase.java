package Dados;

public class DadosBase {
    String html = "";
    
    public void Porcentagem(){
        html += "<h2>Cálculo Porcentagem</h2>";
        html += "<p>Escolha um dos métodos de cálculo</p><br>";
        html += "<h4>Calcular qual a porcentagem de determinada quantidade</h4>";
        html += "<p>Exemplos:</p>";
    }
    
    public void Porcentagem2(){
        html += "<h4>Calcular um valor total com base em uma parte desse valor e a porcentagem que representa essa parte</h4>";
        html += "<p>Exemplos:</p>";
    }
    
    public String getPorcentagem(){
        Porcentagem();
        return html;
    }
    
    public String getPorcentagem2(){
        Porcentagem2();
        return html;
    }
    
    public String CalculoPorcentagem(float parte, float total){
        float calcularporcentagem=0;
        calcularporcentagem = (parte * 100)/total;
        return String.format("%.2f", calcularporcentagem) + "%";
    }
    
    public String CalculoPorcentagem2(float parte2, float porcentagemtotal){
        float calculartotal=0;
        calculartotal = (parte2 * 100)/porcentagemtotal;
        return String.format("%.2f", calculartotal) + " - Valor Total";
    }
    
    public String exemplo_Porcentagem(){  
        
        String result = "";
        int nivelIMC[] = {50,80,40,20};
        
        result += "<br>";

        result += "<h4>Porcentagens</h4><br>";
        
        for(int i = 0;i<4;i++){
                result += "<br>Valor Porcentagem = " + nivelIMC[i];
            }
            
            result += "<br><br><br>";
            
            return result;
    }
    
    public String exemplo_Valores(){
        String result = "";
        int exemploValores[][] = {
            {10,20},
            {72,90},
            {40,100},
            {10,50}
            };

        result += "<h4>Valores - Parte e Total</h4>";
        
        for(int i = 0;i<4;i++){
            result += "<br>";
        for(int j = 0;j<2;j++){
                result += "<br>Valores = " + exemploValores[i][j];
            }
        }
            
            result += "<br><br><br>";
            return result;
  }
    
    public String exemplo_Parte_Porcentagem(){
        String result = "";
        int exemploValores[][] = {
            {10,50},
            {72,80},
            {40,40},
            {10,20}
            };

        result += "<h4>Valores - Parte e Porcentagem</h4>";
        
        for(int i = 0;i<4;i++){
            result += "<br>";
        for(int j = 0;j<2;j++){
                result += "<br>Valores = " + exemploValores[i][j];
            }
        }
            
            result += "<br><br>";
            return result;
  }
    
    public String exemplo_ValorTotal(){  
        
        String result = "";
        int nivelIMC[] = {20,90,100,50};
        
        result += "<br>";

        result += "<h4>Valores Totais</h4><br>";
        
        for(int i = 0;i<4;i++){
                result += "<br>Valor Total = " + nivelIMC[i];
            }
            
            result += "<br><br><br>";
            
            return result;
    }
}
    

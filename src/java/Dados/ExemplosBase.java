package Dados;

public class ExemplosBase {
    
    private String exemplo1;
    private String exemplo2;
    private String exemplo3;
    private String exemplo4;
    private String separarexemplos;
    
    public ExemplosBase(String exemplo1, String exemplo2, String exemplo3, String exemplo4, String separarexemplos){
        this.exemplo1 = exemplo1;
        this.exemplo2 = exemplo2;
        this.exemplo3 = exemplo3;
        this.exemplo4 = exemplo4;
        this.separarexemplos = separarexemplos;
    }

    public String getExemplo1() {
        return exemplo1;
    }

    public void setExemplo1(String exemplo1) {
        this.exemplo1 = exemplo1;
    }

    public String getExemplo2() {
        return exemplo2;
    }

    public void setExemplo2(String exemplo2) {
        this.exemplo2 = exemplo2;
    }

    public String getExemplo3() {
        return exemplo3;
    }

    public void setExemplo3(String exemplo3) {
        this.exemplo3 = exemplo3;
    }

    public String getExemplo4() {
        return exemplo4;
    }

    public void setExemplo4(String exemplo4) {
        this.exemplo4 = exemplo4;
    }

    public String getSepararexemplos() {
        return separarexemplos;
    }

    public void setSepararexemplos(String separarexemplos) {
        this.separarexemplos = separarexemplos;
    }
   
}

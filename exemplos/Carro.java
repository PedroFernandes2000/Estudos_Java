
package exemplos;


public class Carro {
    private String modelo;
    private int ano;
    private String marca;
    private boolean automatico;
    
    public void setModelo(String g){
        this.modelo = g;
    }
    public void setAno(int f){
        this.ano = f;
    }
    public void setMarca(String f){
        this.marca = f;
    }
    public void setAutomatico(boolean f){
        this.automatico = f;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public String getMarca(){
        return marca;
    }
    public boolean getAutomatico(){
        return automatico;
    }
    
}

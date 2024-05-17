
package escolaPregect;

/**
 *
 * @author 17824810607
 */
public class Professor {
    public boolean carteiraAssinada;
    private int id;
    private String areaDeAtuacao;
    public void setCarteiraAssinada(boolean n){
        this.carteiraAssinada = n;
    }
    public void setId(int n){
        this.id = n;
    }
    public void setAreaDeAtuacao(String n){
        this.areaDeAtuacao = n;
    }
    public boolean getCarteiraAssinada(){
        return this.carteiraAssinada;
    }
    public int getId(){
        return this.id;
    }
    public String getAreaDeAtuacao(){
        return this.areaDeAtuacao;
    }
}

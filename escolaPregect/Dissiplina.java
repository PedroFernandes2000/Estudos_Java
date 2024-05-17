
package escolaPregect;

/**
 *
 * @author 17824810607
 */
public class Dissiplina {
    public boolean ehLagal;
    private int numeroAulas;
    private String nome;
    public void setEhlegal(boolean n){
        this.ehLagal = n;
    }
    public void setNumeroAulas(int n){
        this.numeroAulas = n;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public boolean getEhlagal(){
        return this.ehLagal;
    }
    public int getNumeroAulas(){
        return this.numeroAulas;
    }
    public String getNome(){
        return this.nome;
    }
}

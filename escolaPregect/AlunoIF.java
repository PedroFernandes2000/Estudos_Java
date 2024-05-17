
package escolaPregect;

/**
 *
 * @author 17824810607
 */
public class AlunoIF {
    public boolean aprovado;
    private int matricula;
    private String nome;
    public void setAprovado(boolean n){
        this.aprovado = n;
    }
    public void setMatricula(int n){
        this.matricula = n;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public boolean getAprovado(){
        return this.aprovado;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }

    
    public String toString(){
        return "aprvado: "+this.aprovado;
    }
}

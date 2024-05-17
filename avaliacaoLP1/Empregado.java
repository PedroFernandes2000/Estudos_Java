
package avaliacaoLP1;

/*
 * 2º ano T.I.
 * Pedro Fernandes dos Santos
 */
public class Empregado {
    private String nome;
    private int idade;
    private String proficao;
    private double salarioMensal;
    private String sobrenome;
    
     public void setNome(String c){
        this.nome = c;
    }
    public void setIdade(int c){
        this.idade = c;
    }
    public void setProficao(String c){
        this.proficao = c;
    }
    public void setSalarioMensal(double c){
        if(c < 0){
            this.salarioMensal = 0;
        }
            this.salarioMensal = c;
    }
    public void setSobreome(String c){
        this.sobrenome = c;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getProficao(){
        return this.proficao;
    }
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
    public double salarioAnual(){
        return this.salarioMensal*12;
    }
    public String sobrenome(){
        return this.sobrenome;
    }
    public void aumento(double porCento){
        porCento = porCento/100;
        this.salarioMensal = this.salarioMensal + this.salarioMensal*porCento;
        System.out.println("valor atualizado com sucesso!");
    }
    public void exibirInformacoes(){
        System.out.println(this.nome+this.sobrenome()+"\n"+this.salarioAnual());
    }
    public Empregado(){
        
    }
    public Empregado(String nome, int idade, String proficao, double salarioM){
        this.nome = nome;
        this.idade = idade;
        this.proficao = proficao;
        this.salarioMensal = salarioM;
        if(salarioM < 0){
            this.salarioMensal = 0;
        }
    }
}

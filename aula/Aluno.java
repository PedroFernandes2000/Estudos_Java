
package aula;


public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    
    public void mostrarDados(){
        System.out.println("matricula :"+matricula);
        System.out.println("nome :"+nome);
        System.out.println("curso :"+curso);
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public void setCurso(String m){
        this.curso = m;
    }
    public void setMatricula(int n){
        this.matricula = n;
    }
        public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
    public int getMatricula(){
        return matricula;
    }
    
    public String toString(){
        return "Matricula :"+this.matricula+"\nNome :"+this.nome+"\nCurso :"+this.curso;
    }
}



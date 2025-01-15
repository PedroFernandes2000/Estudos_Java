
package pedrof.prova_trimestral_3.questao1;

/**
 *
 * @author 17824810607
 */
public class Item {
    int cod;
    String nome;
    float peso;

    public Item(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Item(int cod, String nome, float peso) {
        this.cod = cod;
        this.nome = nome;
        this.peso = peso;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}

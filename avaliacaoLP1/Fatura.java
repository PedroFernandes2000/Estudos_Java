
package avaliacaoLP1;

/**
 * 2º ano T.I.
 * Pedro Fernandes dos Santos
 */
public class Fatura {
    
    private int codFatura;
    private String descricao;
    private int qtdd;
    private double preco;
    
    public void setCodFatura(int c){
        this.codFatura = c;
    }
    public void setDescricao(String c){
        this.descricao = c;
    }
    public void setQtdd(int c){
        this.qtdd = c;
        if(c < 0){
            this.qtdd = 0;
        }
    }
    public void setPreco(double c){
        this.preco = c;
        if(c < 0){
            this.preco = 0;
        }    
    }
    public int getCodFatura(){
        return this.codFatura;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public int getQtdd(){
        return this.qtdd;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getValorFatura(){
        int q = this.qtdd;
        double p = this.preco;
        return p*q;
    }
    public Fatura(int codigoFatura, String descricao, int quantidade, double preco){
        this.codFatura = codigoFatura;
        this.descricao = descricao;
        this.qtdd = quantidade;
        this.preco = preco;
        
        if(quantidade < 0){
            this.qtdd = 0;
        }
        if(preco < 0){
            this.preco = 0;
        }
    }
    public String toString(){
        return "valor fatura: "+getValorFatura()+
               "  codigo fatura: "+getCodFatura()+
               "  descricao: "+ getDescricao() +
               "   quantidade: "+getQtdd()+
               "  Preco: "+getPreco();
    }  
    
}

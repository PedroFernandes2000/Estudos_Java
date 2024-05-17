
package avaliacaoLP1;

/**
 * 2º ano T.I.
 * Pedro Fernandes dos Santos
 */
public class FaturaTest {
    public static void main(String[] args){
        Fatura f1 = new Fatura(123,"amarelo",12,43.0);
        Fatura f2 = new Fatura(321,"alerama",21,34.0);
    
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}

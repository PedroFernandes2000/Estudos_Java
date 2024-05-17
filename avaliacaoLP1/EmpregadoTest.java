
package avaliacaoLP1;

/**
 * 2º ano T.I.
 * Pedro Fernandes dos Santos
 */
public class EmpregadoTest {
    public static void main(String[] args){
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado("Pedro" , 16 , "estudiante" , 1420.0);
        e2.setSobreome("Fernandes");
        
        e1.setNome("ordeP");
        e1.setSobreome("sednanreF");
        e1.setIdade(61);
        e1.setProficao("etnaidutse");
        e1.setSalarioMensal(4102.0);
        
        e1.exibirInformacoes();
        e2.exibirInformacoes();
    }
}

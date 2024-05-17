
package escolaPregect;

/**
 *
 * @author 17824810607
 */
public class MainIF {
    public static void main(String args[]){
        AlunoIF a1 = new AlunoIF();
        a1.setAprovado(false);
        a1.setMatricula(222);
        System.out.println(a1.getAprovado());
        
        AlunoIF a2 = new AlunoIF();
        a2.setNome("Pedrero");
        a2.setAprovado(true);
        System.out.println(a1.getNome());
        System.out.println(a2.toString());
        
        Professor p1 = new Professor();
        p1.setCarteiraAssinada(false);
        p1.setAreaDeAtuacao("Exatas");
        System.out.println(p1.getCarteiraAssinada());
        
        Professor p2 = new Professor();
        p2.setAreaDeAtuacao("Informatica");
        p2.setId(123456);
        System.out.println(p1.getId());
        
        Dissiplina d1 = new Dissiplina();
        d1.setEhlegal(true);
        d1.setNome("matemática");
        System.out.println(d1.getEhlagal());
        
        Dissiplina d2 = new Dissiplina();
        d2.setNome("Portugues");
        d2.setNumeroAulas(32);
        System.out.println(d2.getNome());
        
        
        
        
    }
}

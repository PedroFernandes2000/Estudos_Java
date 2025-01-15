
package pedrof.prova_trimestral_3.questao1;

/**
 *
 * @author 17824810607
 */

import java.util.List;

public interface ItemDAO {

   
    public abstract void adicionarItem(Item item);
    public abstract void alterarItem(Item item);
    public abstract void deletarItem(int cod);
    public abstract Item consultarItens(int cod);
    public abstract List<Item> consultarItems();
    
}

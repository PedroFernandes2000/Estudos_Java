
# Atividade LP1 - 13/11

1.  Explique o que são as constantes BD_URL, BD_ADMIN e BD_SENHA definidas na classe ConexaoBD.java e para que elas são utilizadas na classe.
 
	- **BD_URL** :  Essa constante possui o link para o banco de dados.

	 - **BD_ADMIN** : Essa constante armazena o nome do usuário que tem acesso de administrador no nosso BD .
	 - **BD_SENHA** : Essa constante armazena a senha que acesso ao nosso BD.
	 -  **Essas constantes são utilizadas para criar uma conexão entre o nosso código e o BD, assim temos a garantia de que elas não serão alteradas durante a execução do código.**

2. Dado o código do método inserir definido na classe *`ProdutoDAOImplementacao`* explique:
	```
	1 public void inserir(Produto produto) {
	2
	3 Connection conexao = Conexao.getConexao();
	4
	5 String sql = "INSERT INTO Produto (nome, preco, quantidade) VALUES (?, ?, ?)";
	6 try {
	7 PreparedStatement instrucaoPreparada = conexao.prepareStatement(sql);
	8 instrucaoPreparada.setString(1, produto.getNome());
	9 instrucaoPreparada.setDouble(2, produto.getPreco());
	10 instrucaoPreparada.setInt(3, produto.getQuantidade());
	11 instrucaoPreparada.execute();
	12 System.out.println("Produto Inserido com Sucesso!");
	13 } catch (Exception e) {
	14 System.out.println("Não foi possível inserir o produto");
	15 }
	16 }
	```
	- **a)** Que tipo de operação será feita na tabela Produto?
		- **R:** Será feira uma inserção no BD.
	
	- **b)** O que está sendo feito nas linhas 8, 9 e 10? 
		-  **R:** Nestas linhas estão sendo definidos os `VALUES` 1, 2 e 3 da instrução que será enviada ao nosso BD.
	- **c)**  Porque está sendo utilizado o bloco try/catch?
		- **R:** Pois estamos tentando estabelecer uma conexão com o BD, e nesses casos há a possibilidade da conexão não ser possível, por isso é necessário que haja um tratamento de possíveis exceções que ocorram durante a execução do programa.
		
3. Considere a implementação da classe entidade Usuario que você implementou na atividade de aula ’Atividade - Classe Entidade Usuario’. A partir dessa classe defina:

	- A interface (classe totalmente abstrata) UsuarioDAO com o seguinte método abstrato:
		- public void cadastrar(Usuario u);

	- A classe ImplementacaoUsuarioDAO que implementa a interface UsuarioDAO. A classe deverá implementar corretamente o método cadastrar. Permitindo que um usuário seja cadastrado no banco de dados.

	- Utilize o mesmo método de conexão implementado na aula (definido na classe ConexaoBD) para estabelecer e retornar uma conexão com o banco de dados.

	- Utilize o mesmo banco de dados da tabela Produto para criar a tabela usuario.
	
	- Consulte o código referente a aula do dia 30-10 para te auxiliar na implementação do método cadastrar.
	
	- Faça testes diretamente pelo código java para adicionar um usuário na tabela usuário. Certifique-se de:
		- Ter criado a tabela no banco de dados;
		- Que o seu programa está conseguindo conectar com o banco de dados.
		Em seguida responda as perguntas a seguir, com base no código que você definiu:

- Considerando as quatro operações básicas CRUD: CREATE, READ, UPDATE, DELETE, a qual operação o método adicionar implementado se refere?
	- **R:** Se refere a operação <mark> *CREATE* </mark> .

		- Código interface `UsuarioDAO` :
		
			```
			package gerenciadordeestoque;
		
			 /**
			  *  @author 17824810607 
			  */
		  
			  public interface UsuarioDAO {
				  public abstract void cadastrar(Usuario u); 
			  }
			```
		- Código classe `ImplementacaoUsuarioDAO` :
			```
			package gerenciadordeestoque;

			import java.sql.Connection;
			import java.sql.PreparedStatement;
			import java.sql.SQLException;

			/**
			 *
			 * @author 17824810607
			 */
	
			public class UsuarioDAOImplementacao implements UsuarioDAO{
			    @Override
			   public void cadastrar(Usuario u) {
		        // try connection
		        Connection conection = ConexaoBD.getConexao();     
		        String sql = "insert into Usuario(nome, perfil) values (?, ?)";       
		        try{
		            PreparedStatement instrucaoPreparada = conection.prepareStatement(sql);
		            instrucaoPreparada.setString(1, u.getNome());
		            instrucaoPreparada.setString(2, u.getPerfil());
                   
		            instrucaoPreparada.execute();
		            System.out.println("Persona cadastrado com sucesso!");
		        } catch(SQLException e ){
		            System.out.println("Nao foi possivel cadastrar a persona");
			        }
			    }
			}
			```
		- Código `Main` :
	
			```
			package gerenciadordeestoque;

			/**
			 *
			 * @author 17824810607
			 */
			public class GerenciadorDeEstoque {
			    public static void main(String[] args) {
			        ConexaoBD conexao = new ConexaoBD();
			        ConexaoBD.getConexao();
			        Usuario user = new Usuario("Pedro","Programador");
			        UsuarioDAOImplementacao udi = new UsuarioDAOImplementacao();
			        udi.cadastrar(user);
			    }
			}	
			```

.
.
.
# **Bem vindo ao meu GitHub Professor :)**
Essa atividade foi bem legal de fazer usando MarkDown

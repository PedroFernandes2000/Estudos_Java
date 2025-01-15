package pedrof.prova_trimestral_3.questao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 17824810607
 */
public class LivroDAOImplementacao implements LivroDAO {

    @Override
    public void inserir(Livro livro) {
        Connection conexao = Conexao.getConexao();
        String sql = "INSERT INTO Livro (titulo, autor, anoPublicacao) VALUES (?, ?, ?)";
        try {
            PreparedStatement instrucaoPreparada = conexao.prepareStatement(sql);
            instrucaoPreparada.setString(1, livro.getTitulo());
            instrucaoPreparada.setString(2, livro.getAutor());
            instrucaoPreparada.setInt(3, livro.getAnoPublicacao());
            instrucaoPreparada.execute();
            System.out.println("Livro Inserido com Sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível inserir o livro");
        }
    }

    @Override
    public Livro buscarPorId(int id) {
        Connection conexao = Conexao.getConexao();
        String sql = "SELECT * FROM Livro WHERE id = ?";
        try {
            PreparedStatement instrucaoPreparada = conexao.prepareStatement(sql);
            instrucaoPreparada.setInt(1, id);
            instrucaoPreparada.execute();
            ResultSet resposta = instrucaoPreparada.getResultSet();
            resposta.next();
            Livro encontrado = new Livro(
                    resposta.getInt("id"),
                    resposta.getString("titulo"),
                    resposta.getString("autor"),
                    resposta.getInt("anoPublicacao")
            );
            conexao.close();
            return encontrado;
        } catch (SQLException e) {
            System.out.println("Não foi possível consultar o livro");
        }
        return null;
    }
}

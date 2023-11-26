/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;
import conexão_dados.Conexao;
import java.util.Properties;
/**
 *
 * @author erick
 */
public class Cad_userDAO {
    private Properties properties;
    
    public Cad_userDAO(Properties properties) {
    this.properties = properties;
}
        public void cadastrarUsuario(Cad_user u) {
        //1. Construir uma fábrica de conexões
        var fabrica = new Conexao(properties);

        //2. Estabelecer uma conexão com o banco
        try (var conexao = fabrica.conectar()) {
            //3. Especificar o comando SQL
            String INSERT_QUERY = "INSERT INTO usuario (coluna1, coluna2, coluna3) VALUES (?, ?, ?)";

            //4. Substituir os eventuais placeholders
            try (var ps = conexao.prepareStatement(INSERT_QUERY)) {
                ps.setInt(1, u.getId());  // Substitua pelo método adequado para obter o valor de coluna1
                ps.setString(2, u.getNome());  // Substitua pelo método adequado para obter o valor de coluna2
                ps.setString(3, u.getEmail());  // Substitua pelo método adequado para obter o valor de coluna3

                //5. Executar o comando
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
                // Tratar exceções, se necessário
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Tratar exceções, se necessário
        }
    }
}
   
    
   
        
    



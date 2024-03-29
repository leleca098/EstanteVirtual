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
public class UsuarioDAO {
    private Properties properties;
    
    public UsuarioDAO(Properties properties){
        this.properties = properties;
        System.out.println("torneras");
                System.out.println(this.properties);

    }
    
    public Usuario existe(Usuario u) throws Exception{
        //1. Construir uma fábrica de conexões
        System.out.println("torneras");
                System.out.println(this.properties);
        var fabrica = new Conexao(properties);
        //2. Estabelecer uma conexão com o banco
        try(var conexao = fabrica.conectar()){
            //3. Especificar o comando SQL
            String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
            try(var ps = conexao.prepareStatement(sql)){
                //4. Substituir os eventuais placeholders
                ps.setString(1, u.getLogin());
                ps.setString(2, u.getSenha());
                //5. Executar o comando
                try(var rs = ps.executeQuery()){
                    //6. Mover o cursor, verificando se o usuário existe
                    //7. Devolver um objeto usuário, null
                    return rs.next() ? u : null;
                }
            }
            
        }
    }    
}

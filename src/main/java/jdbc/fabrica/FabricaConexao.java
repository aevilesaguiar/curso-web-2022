package jdbc.fabrica;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao(){
        try {
            Properties properties= getProperties();
            String url = properties.getProperty("banco.url");
            String usuario = properties.getProperty("banco.usuario");
            String senha =properties.getProperty("banco.senha");

            return DriverManager.getConnection(url, usuario,senha);

        } catch (SQLException | IOException e) {
            //se ele não conseguir conectar com o BD
            throw new RuntimeException(e);
        }
    }
    private static Properties getProperties() throws IOException {
        Properties properties=new Properties();
        String caminho="/conexao.properties";
        properties.load(FabricaConexao.class.getResourceAsStream(caminho));
        return properties;
    }


}

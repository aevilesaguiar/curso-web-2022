package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao(){
        try {
            String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
            String usuario = "root";
            String senha ="123456";

            return DriverManager.getConnection(url, usuario,senha);

        } catch (SQLException e) {
            //se ele não conseguir conectar com o BD
            throw new RuntimeException(e);
        }
    }


}

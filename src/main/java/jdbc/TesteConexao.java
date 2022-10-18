package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        //? colocando paramentros
        //& para separar os parametros dentro da url
        //ele verifica que a conexão, mas a mesma não possui um certificado
        String url = "jdbc:mysql://localhost:3306/agenda?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha ="123456";

        Connection connection= DriverManager.getConnection(url, usuario,senha);

        System.out.println("Conexão efetuada com sucesso!");
        connection.close();

    }
}

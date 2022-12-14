package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection connection= FabricaConexao.getConexao();

        /*https://openjdk.org/jeps/355*/

        String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
                +"codigo INT AUTO_INCREMENT PRIMARY KEY,"
                +"nome VARCHAR(80) NOT NULL"
                +")";
        Statement statement= connection.createStatement();
        statement.execute(sql);

        System.out.println("Tabela criada com sucesso");
        connection.close();
    }
}

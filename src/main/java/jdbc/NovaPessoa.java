package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();

        Connection connection = FabricaConexao.getConexao();

        String sql="INSERT INTO  pessoas (nome) VALUES (?)";
        //É APARTIR DELE QUE VOCÊ PASSA PARAMETROS PARA A SUA CONSULTA
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,nome);


        stmt.execute();

        System.out.println("Pessoa incluida com sucesso!");
        entrada.close();
    }
}

package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoas {
    public static void main(String[] args) throws SQLException {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe o código:");
        int codigo = scanner.nextInt();

        Connection connection = FabricaConexao.getConexao();

        String sql = "DELETE FROM pessoas WHERE codigo = ?";
        //      String sql = "DELETE FROM pessoas WHERE codigo > ?";  afeta mais pessoas

        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setInt(1, codigo);
        int contador = statement.executeUpdate();

        if(contador>0){
            System.out.println("Pessoa exluida com sucesso!");
        }else {
            System.out.println("Nada feito");
        }

            System.out.println("Linhas afetadas: "+ contador);

        statement.close();
        connection.close();

    }
}

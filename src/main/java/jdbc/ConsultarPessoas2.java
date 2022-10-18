package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);

        Connection connection = FabricaConexao.getConexao();


        String sql = "SELECT *FROM pessoas WHERE nome LIKE ?";

        System.out.println("Informe o valor para pesquisa:");
        String pesquisaNome = scanner.nextLine();

        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setString(1,"%" + pesquisaNome+ "%");


        //ele retorna um resultSet
        ResultSet resultSet=statement.executeQuery();

        List <Pessoa> pessoas = new ArrayList<>();

        while (resultSet.next()){
            int codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));

        }
        for (Pessoa p:pessoas
             ) {
            System.out.println(p.getCodigo() + "==>"+p.getNome());

        }

        statement.close();
        connection.close();
        scanner.close();

    }
}

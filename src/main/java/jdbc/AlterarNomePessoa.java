package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);

        System.out.println("Informe o código da Pessoa:");
        int codigo = scanner.nextInt();

        String select = "SELECT codigo, nome  FROM pessoas WHERE codigo=?";
        String update="UPDATE pessoas SET nome=? WHERE codigo=?";

        Connection connection = FabricaConexao.getConexao();

        PreparedStatement statement = connection.prepareStatement(select);
        statement.setInt(1,codigo);

        ResultSet resultado = statement.executeQuery();

        if(resultado.next()){
            Pessoa pessoa= new Pessoa(resultado.getInt(1), resultado.getString(2));
            System.out.println("O nome atual é: "+ pessoa.getNome());
            scanner.nextLine();

            System.out.println("Informe o novo nome da pessoa: ");
            String novoNome = scanner.nextLine();


            statement.close();

            statement=connection.prepareStatement(update);
            statement.setString(1,novoNome);
            //altera a partir de um código
            statement.setInt(2,codigo);

            //para ele salvar no banco
            statement.execute();

            System.out.println("Pessoa alterada com Sucesso!");
        }else {
            System.out.println("Pessoa não encontrada");
        }


        connection.close();
        scanner.close();

    }
}

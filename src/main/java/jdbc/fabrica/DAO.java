package jdbc.fabrica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection connection;

    public  int incluir (String sql, Object...atributos) {
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(
                    sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(preparedStatement, atributos);
            if(preparedStatement.executeUpdate()>0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if(resultSet.next()){
                    return  resultSet.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private  void adicionarAtributos(PreparedStatement stmt, Object[] atributos ) throws SQLException{
        int indice = 1;
        for (Object atributo: atributos){
            if(atributo instanceof  String){
                stmt.setString(indice, (String) atributo);
            }else if(atributo instanceof Integer){
                stmt.setInt(indice, (Integer) atributo);
            }
            indice++;

        }

    }

    private Connection getConnection(){

        try {
            if(connection != null && !connection.isClosed()){
                return connection;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        connection=FabricaConexao.getConexao();
        return connection;
    }
}

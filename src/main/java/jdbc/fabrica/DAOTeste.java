package jdbc.fabrica;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao= new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        dao.incluir(sql, "João da Silva");
        dao.incluir(sql, "Ana Júlia");
        dao.incluir(sql, "Djalma Santos");
        dao.incluir(sql, "Maria da Silva");

    }
}

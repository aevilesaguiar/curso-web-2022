package streams;

public class Produto {

    final String nome;
    final Double preco;
    final Double desconto;
    final Boolean freteGratis;

    public Produto(String nome, Double preco, Double desconto, Boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                ", freteGratis=" + freteGratis +
                '}';
    }
}

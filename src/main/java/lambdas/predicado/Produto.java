package lambdas.predicado;


//toda classe em java extend Object exemplo abaixo
public class Produto extends Object{
    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
}

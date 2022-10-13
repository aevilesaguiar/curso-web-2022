package lambdas.consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!");

        Produto p1 = new Produto("Caneta",19.99,0.15);

        imprimir.accept(p1);

        Produto p2 = new Produto("Lápis",9.99,0.05);
        Produto p3 = new Produto("Caderno",59.99,0.08);
        Produto p4 = new Produto("Monitor",1919.99,0.15);
        Produto p5 = new Produto("A4",29.99,0.05);

        List<Produto> produtos= Arrays.asList(p1,p2,p3,p4,p5);
        System.out.println("*********************************************************");
        produtos.forEach(imprimir);
        System.out.println("*********************************************************");
        produtos.forEach(p-> System.out.println(p.preco));
        System.out.println("*********************************************************");
        produtos.forEach(p-> System.out.println(p.desconto));

        System.out.println("*********************************************************");
        produtos.forEach(p-> System.out.println(p.nome+ " - " +p.preco + " - "+p.desconto));


        System.out.println("*********************************************************");
        produtos.forEach(System.out::println);


    }
}

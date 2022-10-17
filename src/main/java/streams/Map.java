package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("bmv ","fiat ","vm ","renault ", "ford \n");
        //operação de built (construção da stream começa aqui
        marcas.stream().map(m->m.toUpperCase()).forEach(print);


        UnaryOperator<String> maiuscula = n-> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n->n.charAt(0)+"";//primeiro caractere da palavra que foi passada como parametro
        UnaryOperator<String> grito =n-> n+"!!!  ";


        System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("renault"));

        System.out.println("\nUsando composição...");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);


    }
}

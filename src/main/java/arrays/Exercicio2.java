package arrays;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {

        //foreach laço muito utilizada no contexto de arrays de coleções
        double[] notas = {9.9,9.5,4.0,6.9};

        for (double nota:notas
             ) {
            System.out.println(nota);
        }

        String[] nomes={"Ana","Ben", "Fran", "paty"};
        for (String nome:nomes
             ) {
            System.out.println(nome);
        }


    }
}

package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana","Ben", "Fla", "Gui");

        System.out.println("Forma Tradicional....");
        for (String aprovado:aprovados
             ) {
            System.out.println(aprovado.toUpperCase());
        }
        System.out.println("\nLambda #01....");
        aprovados.forEach((nome)->{System.out.println(nome+"!!!");});

        System.out.println("\nLambda #02....");
        aprovados.forEach(nome->System.out.println(nome+"<3"));

        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #03....");
        aprovados.forEach(nome->meuImprimir(nome));


        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Foreach::meuImprimir);
    }

    public static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome é:"+nome);
    }
}

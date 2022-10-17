package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        //primeira parte do Built construção dos Streams

        Consumer<String> print= System.out::print;
        Consumer<Integer> println= System.out::println;
        Consumer<Object> obj= System.out::print;


        Stream<String> langs = Stream.of("Java ", "Lua ", "JS \n");
        langs.forEach(print);

        //Outra forma de gerar um stream é através do array

        String[] maisLangs = {"Python ", "Lisp ", "Perl ","Go \n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 0, 2).forEach(print);

        //Outra forma de gerar um stream é através de list
        List< String> outrasLangs = Arrays.asList("C ", " C# ", "javaScript", "Lua\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //gerar stream de forma infinita
         //  Stream.generate(()->"a").forEach(print);

        //gerar stream de forma infinita com ordenação
       // Stream.iterate(0, n->n+1).forEach(println);



    }
}

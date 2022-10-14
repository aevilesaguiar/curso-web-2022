package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        //tres formas diferentes
        List<String> aprovados = Arrays.asList("Luca", "Luana", "Gui","Pedro");

        System.out.println("Usando for ... \n");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println((i+1)+" - "+aprovados.get(i));
        }
        System.out.println("\nUsando foreach ...\n");
        for (String nome: aprovados
             ) {
            System.out.println("# "+nome);
        }

        System.out.println("\nUsando Iterator... \n");

        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream... \n");
        //stream seuqencia de dados
        //paradigma funcional
        Stream<String> stream=aprovados.stream();
        stream.forEach(System.out::println);//laço interno!!!


    }
}

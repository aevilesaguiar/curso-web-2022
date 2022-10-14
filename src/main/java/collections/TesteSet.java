package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {
        String t1,t2,t3,t4,t5,t6;
        t1="Emanuel";
        t2="Pedro";
        t3="Pedro";
        t4="Flavio";
        t5="Zé";
        t6="Ana";
        Set<String> grupo1= new HashSet<>();
        grupo1.add(t1);
        grupo1.add(t2);
        grupo1.add(t3);
        grupo1.add(t4);
        grupo1.add(t5);
        grupo1.add(t6);

        Set<String> grupo2= new TreeSet<>();
        grupo2.add(t1);
        grupo2.add(t2);
        grupo2.add(t3);
        grupo2.add(t4);
        grupo2.add(t5);
        grupo2.add(t6);

        System.out.println("Imprimindo Hashset...");
        for (String nome: grupo1
             ) {
            System.out.println(nome + " ,");
        }

        //Treeset faz um set ordenado

        System.out.println("\nImprimindo Treeset...");
        for (String nome: grupo2
        ) {
            System.out.println(nome + " ,");
        }






    }
}

package collections;

import java.util.*;

public class ConjuntoOrdenado {
    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<>();

        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Bia");
        lista.add("José");

        for (String nome:lista
             ) {
            System.out.println(nome);
        }


        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for (int num: nums
             ) {
            System.out.println(num);

        }




    }
}

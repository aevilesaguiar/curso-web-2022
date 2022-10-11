package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDesordenado {
    public static void main(String[] args) {

        HashSet<java.io.Serializable> conjunto = new HashSet<>();
        conjunto.add(1.2);//CONVERSÃO AUTOMATICA double-> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("A");
        conjunto.add(3);

        System.out.println("Tamanho: "+conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho: "+conjunto.size());
        conjunto.add("A");
        System.out.println("Tamanho: "+conjunto.size());

        System.out.println(conjunto.remove("A"));
        System.out.println(conjunto.remove(1));

        System.out.println("Tamanho: "+conjunto.size());

//verifica se um valor está contido ou não
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1.2));

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

       // conjunto.addAll(nums);//união entre dois conjuntos

        conjunto.retainAll(nums); //intersecção
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);





    }
}

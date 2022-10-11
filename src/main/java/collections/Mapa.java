package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        //put() inclui e altera
        usuarios.put(1,"Flavio");
        usuarios.put(2,"Pedro");
        usuarios.put(3,"Ana");
        usuarios.put(4,"Maria");


        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsKey(4));

        System.out.println(usuarios.containsValue("Maria"));

        System.out.println(usuarios.get(3));

        //formas de percorrer os elementos com Map
        for (int chave: usuarios.keySet()
             ) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()
             ) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()
             ) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

        System.out.println(usuarios.remove(4));

        System.out.println(usuarios);
        System.out.println(usuarios.containsValue("Pedro"));
    }
}

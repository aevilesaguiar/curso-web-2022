package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1=new Usuario("Ana");
        Usuario u2=new Usuario("Maria");
        Usuario u3=new Usuario("Pedro");

        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Adriana"));
        System.out.println("------------------------------");
        System.out.println(lista.get(2));
        System.out.println(lista.get(5));

        System.out.println("------------------------------");

        for (Usuario u:lista
             ) {
            System.out.println(u);
        }

        lista.remove(5);

        System.out.println(lista.toString());

        System.out.println(lista.remove(new Usuario("Manu")));
        System.out.println(lista.contains(new Usuario("Pedro")));
        System.out.println(lista.contains(new Usuario("Adriana")));

    }
}

package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        //LinkedList representa uma fila em java
        Queue<String> fila = new LinkedList<>();
        //ambos adicionam elementos na fila, a difereça é o comportamento
        //A diferença é que offer() retornará false se falhar ao inserir o elemento em um tamanho restrito Queue
        //enquanto add() lançará um IllegalStateException .
        fila.add("Ana");
        fila.offer("Bia");
       fila.offer("Daniel");
        fila.offer("Fran");
        fila.offer("Pedro");
        fila.offer("Paulo");
       fila.offer("Fran");
        System.out.println("**********");

        //pega um elemento da fila a diferença ocorre
        //se a fila estiver vazia ele dá null -peeck()
        //element() dá uma exceção Exception in thread "main" java.util.NoSuchElementException
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        //limpar fila
        //file.size();
        //fila.clear();
        //fila.isEmpty();

        //removendo o primeiro elemento da fila já removendo
        //qundo a lista está vazia poll retorna false
        //remove() lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.remove());
        System.out.println(fila);

        System.out.println(fila.size());
        fila.clear();
        System.out.println(fila.isEmpty());
        System.out.println(fila.contains("Pedro"));


    }
}

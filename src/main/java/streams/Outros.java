package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno3 d1= new Aluno3("Ana",10.00 );
        Aluno3 d2= new Aluno3("Pedro",6.0 );
        Aluno3 d3= new Aluno3("Dom",7.50 );
        Aluno3 d4= new Aluno3("Ben",6.00 );
        Aluno3 d5= new Aluno3("Dan",4.00 );
        Aluno3 d6= new Aluno3("Bin",7.10 );
        Aluno3 d7= new Aluno3("Ana",10.00 );
        Aluno3 d8= new Aluno3("Pedro",6.0 );
        Aluno3 d9= new Aluno3("Dom",7.50 );


        List<Aluno3> alunos = Arrays.asList(d1,d2,d3,d4,d5,d6,d7,d8,d9);

        //distinct para que não pegue valor duplicado
        //lembrando que será necessário usar o equals e hash code senão ele pega o endereçod e memória
        System.out.println("distinct...\n");
        alunos.stream().distinct().forEach(System.out::println);

        //paginação no Stream
        System.out.println("\nSkip/Limit...\n");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);


        //pegue os elementos até acontecer determinada condição
        //me dê todos os produtos enquanto os produtos estiverem ativos
        System.out.println("\nTakeWhile...\n");
        alunos.stream()
                .distinct()
                .takeWhile(a->a.nota >=7)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile... com skip\n");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a->a.nota >=7)
                .forEach(System.out::println);
    }
}

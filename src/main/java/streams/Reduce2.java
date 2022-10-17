package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {


        Aluno3 d1= new Aluno3("Ana",10.00 );
        Aluno3 d2= new Aluno3("Pedro",6.0 );
        Aluno3 d3= new Aluno3("Dom",7.50 );
        Aluno3 d4= new Aluno3("Ben",6.00 );
        Aluno3 d5= new Aluno3("Dan",4.00 );
        Aluno3 d6= new Aluno3("Bin",7.10 );

        List<Aluno3> alunos = Arrays.asList(d1,d2,d3,d4,d5,d6);

        //predicado eu uso quando quero filtrar
        Predicate<Aluno3> aprovado = a->a.nota>=7;

        Function<Aluno3, Double> apenasNota = a->a.nota;

        BinaryOperator<Double> somatoria = (a,b)-> a+b;




        alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatoria)
                .ifPresent(System.out::println);



    }
}

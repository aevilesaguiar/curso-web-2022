package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {
        Aluno3 d1= new Aluno3("Ana",10.00 );
        Aluno3 d2= new Aluno3("Pedro",6.0 );
        Aluno3 d3= new Aluno3("Dom",7.50 );
        Aluno3 d4= new Aluno3("Ben",6.00 );
        Aluno3 d5= new Aluno3("Dan",4.00 );
        Aluno3 d6= new Aluno3("Bin",7.10 );

        List<Aluno3> alunos = Arrays.asList(d1,d2,d3,d4,d5,d6);

    //com max e min preciso usar o Comparator que é uma interface funcional que tem apenas um unico método
        //com o objetivo de comparar um único método
        //quando eu retorno 1 quer dizer que o primeiro é maior que o segundo
        //quando eu retorno -1 quer dizer que o segundo parametro é maior que o primeiro
        //quando retorna 0 os dois objetos são iguais

        Comparator<Aluno3> melhorNota = (a1,a2)->{
            if(a1.nota> a2.nota) return 1;
            if (a2.nota>a1.nota) return -1;
            return 0;
        };


        Comparator<Aluno3> piorNota = (a1,a2)->{
            if(a1.nota> a2.nota) return -1;
            if (a2.nota>a1.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
       // System.out.println(alunos.stream().min(piorNota).get());

       // System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());

    }
}

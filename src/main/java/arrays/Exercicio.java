package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA=new double[3];
        notasAlunoA[0]=8.9;
        notasAlunoA[1]=6.9;
        notasAlunoA[2]=5.9;



        System.out.println(Arrays.toString(notasAlunoA));

        for (double notaA: notasAlunoA
             ) {
            System.out.println(notaA);
        }

        double total=0;

        for (int i = 0; i < notasAlunoA.length ; i++) {
            total+=notasAlunoA[i]/ notasAlunoA.length;


        }
        System.out.println(total);

        double[] notasAlunoB={6.9,8.9,5.5,10};

        System.out.println(Arrays.asList(Arrays.toString(notasAlunoB)));

        System.out.println(notasAlunoB[notasAlunoB.length-1]);


        for (Double nota:notasAlunoB
             ) {
            System.out.println(nota);
        }



    }
}

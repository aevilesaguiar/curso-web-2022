package arrays.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Quantas notas: ");
        int qtdeNotas= 0;

        double[] notas= new double[qtdeNotas];

        for (int i = 0; i <notas.length ; i++) {
            System.out.println("Informe a nota "+(i +1)+" : ");
            notas[i]=scanner.nextInt();
        }

        double total=0;
        for (double nota:notas
             ) {
                total+=nota;

        }


        System.out.println(Arrays.toString(notas));
        System.out.println(total/qtdeNotas);


        scanner.close();



    }
}

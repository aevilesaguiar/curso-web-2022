package lambdas;



public class CalculoTeste2 {
    public static void main(String[] args) {

        //java Método
        //função javaScript

        Calculo calculo=(x,y)->{ return x+y; };

        System.out.println(calculo.executar(2,3));

        calculo=(x,y)->x*y;
        System.out.println(calculo.executar(1,3));

        Calculo1 calculo1=(a)->{ return a*a;};
        System.out.println(calculo1.executar(2));

        calculo1=a -> a*a;
        System.out.println(calculo1.executar(6));



    }
}

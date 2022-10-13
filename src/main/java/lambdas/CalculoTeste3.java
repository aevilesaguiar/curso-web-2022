package lambdas;


import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        //interfaces funcionais padrão java
       //https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

        BinaryOperator<Double> calcular=(x,y)->{return x+y;};
        System.out.println(calcular.apply(2.0,3.3));

        calcular=(x,y)->{return x*y;};
        System.out.println(calcular.apply(6.0,3.00));




    }
}

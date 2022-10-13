package lambdas;


import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class PadroesInterfaceFuncionalBinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Double> calcular=(x, y)->{return x+y;};
        System.out.println(calcular.apply(2.0,3.3));
    }
}

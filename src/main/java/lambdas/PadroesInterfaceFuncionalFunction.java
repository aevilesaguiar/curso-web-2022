package lambdas;


import java.util.function.Function;

public class PadroesInterfaceFuncionalFunction {

    public static void main(String[] args) {

        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(5));
    }
}

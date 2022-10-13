package lambdas;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PadroesInterfaceFuncionalUnaryOperator {

    public static void main(String[] args) {

        UnaryOperator<Double> pot=(x)->{return x*x;};
        System.out.println(pot.apply(2.0));
    }
}

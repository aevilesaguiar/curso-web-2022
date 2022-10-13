package lambdas;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PadroesInterfaceFuncionalConsumer {

    public static void main(String[] args) {

        Consumer<String> print = x-> System.out.println(x);
        print.accept("Aeviles");

        List <String> aprovados = Arrays.asList("Ana","Fla","Gui");

        Consumer<String> stringConsumer=(String x)-> System.out.println(x+" ok!");
        aprovados.forEach(stringConsumer);
    }


}

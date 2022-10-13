package lambdas.prediadoComposicao;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        //Predicado em sentido geral é uma declaração sobre algo que é verdadeiro ou falso
        //

        Predicate<Integer> isPar= num-> num %2 ==0;
        Predicate<Integer> isTresDigitos = num-> num>=100 &&num<=999;

        System.out.println(isPar.and(isTresDigitos).test(998));

        //inserindo a negação
        System.out.println(isPar.and(isTresDigitos).negate().test(998));
        //usando or
        System.out.println(isPar.or(isTresDigitos).test(107));



    }
}

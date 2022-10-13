package lambdas.unaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        //tipo de parametro que vc passa como entrada é o tipo de retorno que é gerado
        //e pode ter função usando then...
        //composição de função
        UnaryOperator<Integer> maisDois= n->n+2;
        UnaryOperator<Integer> vezesDois=n->n*2;
        UnaryOperator<Integer> aoQuadrado=n->n*n;

        Integer result = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(result);


        //compose ela roda ao contrario
        Integer result2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                        .apply(0);
        System.out.println(result2);



    }
}

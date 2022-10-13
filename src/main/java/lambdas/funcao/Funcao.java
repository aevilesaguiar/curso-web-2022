package lambdas.funcao;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                numero-> numero%2 ==0 ? "Par": "Impar";

        //RECEBE UMA STRING E RETORNA UMA STRING
        Function<String, String> oResultadoE=
                valor-> "O resultado é: "+ valor;

        Function<String, String> empolgado =
                valor-> valor+"!!!!";

        Function<String, String> duvida=
                valor-> valor+"?????";

        System.out.println("-----------------------------------------------------------");

        //composição de função , você faz funções pequenas e depois compõe as mesmas
        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .andThen(empolgado)
                .apply(32);

        System.out.println(resultadoFinal);





    }
}

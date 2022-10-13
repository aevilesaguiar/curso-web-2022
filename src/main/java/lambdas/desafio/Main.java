package lambdas.desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

       /*
        * 1. A partir do produto calcular preco real(com desconto
        * 2. Imposto Municipal: >=2500(8,5%) / <2500(isento)
        * 3. Frete: >=3000(100)/ <3000(50)
        * 4. Arredondar: Deixar duas casas decimais
        * 5. Formatar: R$1234,56
        *
        */
        Produto p =new Produto("iPad",2600.06,.15);

        Function<Produto,Double> precoDesc=
                prod-> prod.preco*(1-prod.desconto);

        UnaryOperator<Double> impostoMunicipal=
                preco->preco>=2500.00 ? (preco*1.085) :preco;

        UnaryOperator<Double> frete=
                preco-> (preco >= 3000.00) ? (preco + 100.00) : (preco + 50.00);

        UnaryOperator<Double> arredondar =
                preco ->Double.parseDouble(String.format("%.2f",preco));

        Function<Double, String> formatar=
                preco-> ("R$ "+preco).replace(".",",");


        String precoFinal=precoDesc
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar).apply(p);

        System.out.println("O preço final é: "+ precoFinal);








    }
}

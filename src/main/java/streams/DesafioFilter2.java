package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    public static void main(String[] args) {

        /**
         *mostrar produtos com frete gratis
         * mostrar produtos com 30% de desconto */

        Produto p1 =new Produto("Notebook",5000.99,.31,true);
        Produto p2 =new Produto("Canetas",9.99,.31,true);
        Produto p3 =new Produto("Cadeira",1000.99,.05,false);
        Produto p4 =new Produto("Caderno",5.99,.03,false);
        Produto p5 =new Produto("Monitor",1000.99,.30,true);

        List<Produto> produtoList = Arrays.asList(p1,p2,p3,p4,p5);

        //pipeline de Execução
        Predicate<Produto> freteGratis=f->f.freteGratis==true;
        Predicate<Produto>desconto = d->d.desconto>.3;

        Function< Produto, String> saudacao = p->"Parabéns o produto "+ p.nome+ " Está numa grande Promoção Frete Grátis e desconto de "+(p.desconto*100) +"%" ;

        produtoList.stream()
                .filter(freteGratis)
                .filter(desconto)
                .map(saudacao)
                .forEach(System.out::println);

    }
}

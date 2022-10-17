package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter {
    public static void main(String[] args) {

        /*
         *.1  2 expressões lambdas para fazer dois filtros diferentes
         *
         * */

        AlunoDesafio d1= new AlunoDesafio("Ana",10.00, 25,true);
        AlunoDesafio d2= new AlunoDesafio("Pedro",6.0, 0,true);
        AlunoDesafio d3= new AlunoDesafio("Dom",7.50, 18,true);
        AlunoDesafio d4= new AlunoDesafio("Ben",8.00, 5,true);
        AlunoDesafio d5= new AlunoDesafio("Dan",4.00, 30,false);
        AlunoDesafio d6= new AlunoDesafio("Bin",7.10, 8,false);

        List<AlunoDesafio> alunoDesafioList = Arrays.asList(d1,d2,d3,d4,d5,d6);

        Consumer<String> print = System.out::println;

        Predicate<AlunoDesafio> pFalta = f->f.falta<20;
        Predicate<AlunoDesafio> pComportamento =c-> c.bomComportamento;
        Predicate<AlunoDesafio> pNota = n->n.nota>7;
        Function< AlunoDesafio, String> saudacaoAprovado = a->"Parabens "+a.nome + ", Você foi Aprovado(a)! ";


        alunoDesafioList.stream()
                .filter(pFalta)
                .filter(pComportamento)
                .filter(pNota)
                .map(saudacaoAprovado)
                .forEach(print);


    }
}

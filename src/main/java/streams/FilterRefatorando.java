package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterRefatorando {
    public static void main(String[] args) {

        Aluno a1= new Aluno("Ana", 7.9);
        Aluno a2= new Aluno("Fla", 9.5);
        Aluno a3= new Aluno("Gui", 6.0);
        Aluno a4= new Aluno("Dan", 5.0);
        Aluno a5= new Aluno("Zé", 9.0);
        Aluno a6= new Aluno("Jan", 7.0);

        List<Aluno> alunoList = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate< Aluno> aprovado= a-> a.nota>=7;
        Function< Aluno, String> saudacaoAprovado = a->"Parabens "+a.nome + ", Você foi Aprovado(a)! ";

        alunoList.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);

    }
}

package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        Aluno a1= new Aluno("Ana", 7.9);
        Aluno a2= new Aluno("Fla", 9.5);
        Aluno a3= new Aluno("Gui", 6.0);
        Aluno a4= new Aluno("Dan", 5.0);
        Aluno a5= new Aluno("Zé", 9.0);
        Aluno a6= new Aluno("Jan", 7.0);

        List<Aluno> alunoList = Arrays.asList(a1,a2,a3,a4,a5,a6);

        alunoList.stream()
                .filter(a->a.nota>=7)
                .map(a->"Parabens "+a.nome + ", Você foi Aprovado(a)! ")
                .forEach(System.out::println);

    }
}

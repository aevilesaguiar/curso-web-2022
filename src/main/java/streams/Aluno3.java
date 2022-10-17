package streams;

import java.util.Objects;

public class Aluno3 {
    public final String nome;
    final double nota;
    final boolean bomComportamento;


    public Aluno3(String nome, double nota ) {
        this(nome,nota,true);
    }


    public Aluno3(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento=bomComportamento;
    }

    @Override
    public String toString() {
        return "Aluno3{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", bomComportamento=" + bomComportamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno3 aluno3 = (Aluno3) o;
        return Double.compare(aluno3.nota, nota) == 0 && bomComportamento == aluno3.bomComportamento && Objects.equals(nome, aluno3.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}

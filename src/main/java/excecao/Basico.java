package excecao;

import streams.Aluno3;

public class Basico {
    public static void main(String[] args) {
        //a exceção é interrompida de forma abrupta

        //.NullPointerException
        Aluno3 a1= null;

        try {

                imprimirNomeDoAluno(a1);
            }catch (Exception e){
            System.out.println("ocorreu um erro no momento da impressão no nome do usuario" + e);
        }

        //Thread com erro : .ArithmeticException
        try {
            System.out.println(7/0);
        } catch (Exception e) {
            //printStackTrace imprimi a pilha de execução
            //e.printStackTrace();
            System.out.println("Ocorreu o erro: "+e.getMessage());
        }finally {
            System.out.println("fim");
        }
    }

    public static void imprimirNomeDoAluno(Aluno3 aluno){
        System.out.println(aluno.nome);

    }
}

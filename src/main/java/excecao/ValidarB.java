package excecao;

import excecao.personalizadab.NumeroForaDoIntervaloException;
import excecao.personalizadab.StringVaziaException;

public class ValidarB {

    private ValidarB(){}

    public static void usuario(Aluno aluno)
            throws StringVaziaException, NumeroForaDoIntervaloException{
        if(aluno==null){
            throw  new IllegalArgumentException("O aluno está nulo");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw  new StringVaziaException("nome");
        }

        if(aluno.nota<0 || aluno.nota>10){
            throw new NumeroForaDoIntervaloException("nota");
        }

    }
}

package excecao;


import excecao.personalizadab.NumeroForaDoIntervaloException;
import excecao.personalizadab.StringVaziaException;

public class TesteValidacoesB {
    public static void main(String[] args) {


        try {
            Aluno aluno= new Aluno("Ana",-7);
            Validar.usuario(aluno);

            ValidarB.usuario(null);


        } catch (StringVaziaException e) {
          //  throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }catch (NumeroForaDoIntervaloException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }
}

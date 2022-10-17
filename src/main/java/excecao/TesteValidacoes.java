package excecao;

import excecao.personalizada.NumeroNegativoException;

public class TesteValidacoes {
    public static void main(String[] args) {


        try {
            Aluno aluno= new Aluno("Ana",-7);
            Validar.usuario(aluno);

        } catch (NumeroNegativoException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
          //  throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }
}

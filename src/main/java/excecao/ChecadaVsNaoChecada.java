package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        geraErro1();

        try {
            geraErro2();
            //posso ser mais genérico e incluir o Throwable ao invéns do EXCEPTION
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim!");

    }

    //exceção não checada ou não verificada (ela não possui o throws na assinatura do método)
    static void geraErro1(){
        //throw é usado para lançar o erro
        //throw : lançar , algo que pode ser lançado
        //tudo que herda da classe Throwable é algo que você pode chamar throw new...
        //toda classe que termina com exception é filha de exception
       throw new RuntimeException("Ocorreu um erro #01");// (lance um novo erro RuntimeException)

    }

//eu tenho que deixar claro na assinatura que eu tenho uma exceção checada ou verificada
    static void geraErro2() throws Exception{
        try {
            throw new Exception("Ocorreu um erro #02 - TRATEI O ERRO");
        }catch (Exception e){
            System.out.println("UFA passou"+e.getMessage());
        }
    }
}

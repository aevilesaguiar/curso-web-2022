package generics.comgenerics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto<String> caixaObjeto= new CaixaObjeto<>();
        caixaObjeto.aguardar("Segredo");


        String coisaA= caixaObjeto.abrir();
        System.out.println(coisaA);

        CaixaObjeto<Double> caixaB = new CaixaObjeto<>();
        caixaB.aguardar(3.1514);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }

}

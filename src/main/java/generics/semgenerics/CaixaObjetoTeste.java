package generics.semgenerics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3); //double -: Double


        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);
    }

}

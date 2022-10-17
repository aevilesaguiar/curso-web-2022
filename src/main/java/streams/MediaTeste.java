package streams;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 =new Media();
        m1.adicionar(8.3);
        m1.adicionar(6.7);

        System.out.println(m1.getValor());

        //ou
        //posso encadear varias instancias
        Media m2 =new Media().adicionar(8.3).adicionar(6.7);
        System.out.println(m2.getValor());


        //media resultante

        Media m3 =new Media().adicionar(7.2).adicionar(6).adicionar(10);
        System.out.println(m3.getValor());

        Media.combinar(m2,m1).getValor();


    }
}

package streams;

public class UtilitariosDesafios {
    /**
     * 1 . Numero para string binaria ... 6=>"110"
     * 2. Inverter a string... "110" =>"011"
     * 3. Converter de volta para inteiro =>"011"=>3
     */


    public final static String binString(Integer i) {
        String result = Integer.toBinaryString(i);
        return result + " ";
    }

    public static String reverse(String dado) {
        String result = new StringBuilder(dado).reverse().toString();
        return result + " ";
    }


}

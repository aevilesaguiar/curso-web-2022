package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    //Static:  serve para referenciar todos aqueles atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
   //final :Uma classe com este modificador não pode ser estendida, isto é, não pode ter classes que herdam dela. Isso é importante para garantir que uma determinada implementação não tenha seu comportamento modificado. Isso tem muito a ver com a imutabilidade.


    //transformar o construtor em private pois tudo é estatico
    //ou seja não posso instanciar pois é private
    private Utilitarios(){

    }

    public final static UnaryOperator<String> maiuscula = n-> n.toUpperCase();
    public final static  UnaryOperator<String> primeiraLetra = n->n.charAt(0)+"";//primeiro caractere da palavra que foi passada como parametro

    public final static String  grito(String n) {
        return  n+"!!!  ";
    };

}

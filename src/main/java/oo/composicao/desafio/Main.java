package oo.composicao.desafio;

public class Main {

    public static void main(String[] args) {


        Compra compra1=new Compra();
        compra1.adicionarItem("Canetas azuis",9.67,20);
        compra1.adicionarItem(new Produto("Notebook", 1987.25),2);

        Compra compra2=new Compra();
        compra2.adicionarItem("Caderno",19.67,2);
        compra2.adicionarItem(new Produto("Resma de A4", 29.9),2);


        Cliente cliente=new Cliente("Maria Silva");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println("Valor total: R$"+cliente.obterValorTotal());



    }
}

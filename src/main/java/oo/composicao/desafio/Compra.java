package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> items= new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade){
        this.items.add(new Item(quantidade, produto));

    }

    void adicionarItem(String nome, Double preco,  int quantidade){

        var produto = new Produto(nome,preco);
        this.items.add(new Item(quantidade, produto));


    }



    public Double obterValorTotal( ){
        double total=0;

        for (Item item:items
             ) {
            total+= item.quantidade*item.produto.preco;
            
        }
        return total;
    }

}

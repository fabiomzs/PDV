package br.com.trainning.pdv.domain.model;

/**
 * Created by android on 19/03/2016.
 */
import java.util.List;

public class Compra {
    private Carrinho carrinho;
    private List<Item> itens;


    public Carrinho getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }



}

package br.com.trainning.pdv.domain.model;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.AutoIncrement;
import se.emilsjolander.sprinkles.annotations.Column;
import se.emilsjolander.sprinkles.annotations.Key;
import se.emilsjolander.sprinkles.annotations.Table;
import se.emilsjolander.sprinkles.typeserializers.StringSerializer;

/**
 * Created by android on 12/03/2016.
 */
@Table("item")
public class Item extends Model {
    @Key
    @AutoIncrement
    @Column("id")
    private long id;
    @Column("id_compra")
    private String idCompra;
    @Column("id_produto")
    private String idProduto;
    @Column("quantidade")
    private int quantidade;
    @Column("unidade")
    private String unidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}

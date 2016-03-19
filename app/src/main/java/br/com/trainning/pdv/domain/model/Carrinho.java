package br.com.trainning.pdv.domain.model;

/**
 * Created by android on 19/03/2016.
 */
import java.io.Serializable;

public class Carrinho implements Cloneable, Serializable {

    private static final long serialVersionUID = -1382880549600149967L;

    private String idCompra;
    private int encerrada;
    private int enviada;

    public int getEncerrada() {
        return encerrada;
    }

    public void setEncerrada(int encerrada) {
        this.encerrada = encerrada;
    }

    public int getEnviada() {
        return enviada;
    }

    public void setEnviada(int enviada) {
        this.enviada = enviada;
    }

    public Carrinho () {

    }

    public String getIdCompra() {
        return this.idCompra;
    }
    public void setIdCompra(String idCompraIn) {
        this.idCompra = idCompraIn;
    }
}

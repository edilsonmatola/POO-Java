package company;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {
    private StringBuffer nome;
    private char sexo;
    private StringBuffer id;
    private double saldo;
    private ArrayList<Produto> carrinhoCompras;
    private ArrayList<Produto> produtosProcessados;

    public Cliente(StringBuffer nome, char sexo, StringBuffer id) {
        this.nome = nome;
        this.sexo = sexo;
        this.id = id;
        this.carrinhoCompras = new ArrayList<>();
        this.produtosProcessados = new ArrayList<>();
    }


    public StringBuffer getNome() {
        return nome;
    }

    public void setNome(StringBuffer nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public StringBuffer getId() {
        return id;
    }

    public void setId(StringBuffer id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Produto> getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public ArrayList<Produto> getProdutosProcessados() {
        return produtosProcessados;
    }

}

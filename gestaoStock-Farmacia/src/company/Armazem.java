package company;

import java.util.ArrayList;


import java.util.ArrayList;

public class Armazem {
    private int numero;
    private StringBuffer nome;
    private ArrayList<Produto> produtosArmazenados = new ArrayList<>();

    public Armazem(int numero, StringBuffer nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutosArmazenados() {
        return produtosArmazenados;
    }

    public void setProdutosArmazenados(ArrayList<Produto> produtosArmazenados) {
        this.produtosArmazenados = produtosArmazenados;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public StringBuffer getNome() {
        return nome;
    }

    public void setNome(StringBuffer nome) {
        this.nome = nome;
    }
}

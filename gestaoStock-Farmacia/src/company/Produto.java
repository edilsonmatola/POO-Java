package company;

import java.io.Serializable;
import java.util.Date;

public class Produto {
    private StringBuffer nome;
    private StringBuffer marca;//el
    private StringBuffer id;
    private StringBuffer fornecedor;
    private StringBuffer categoria;
    private StringBuffer descricao;//el
    private StringBuffer armazem;
    private StringBuffer codigoFornecedorPertencente;
    private int codigoArmazemPertencente;
    private boolean stockMinimo;
    private final Date dataCadastro;
    private Date dataVenda;
    private double preco;
    private double precoUnitario;
    private int stock;
    private double valorCompra;
    private int qtCompra;
    private boolean foiProcessado = false;



    public StringBuffer getCodigoFornecedorPertencente() {
        return codigoFornecedorPertencente;
    }

    public void setCodigoFornecedorPertencente(StringBuffer codigoFornecedorPertencente) {
        this.codigoFornecedorPertencente = codigoFornecedorPertencente;
    }

    public Produto(StringBuffer id, StringBuffer nome, StringBuffer armazem, int codigoArmazemPertencente, boolean stockMinimo
            , int stock, StringBuffer fornecedor, StringBuffer codigoFornecedorPertencente, double precoUnitario,
                   Date dataCadastro, StringBuffer categoria) {
        this.nome = nome;
        this.id = id;
        this.armazem = armazem;
        this.dataCadastro = dataCadastro;
        this.dataVenda = new Date();
        this.categoria = categoria;
        this.precoUnitario = precoUnitario;
        this.stockMinimo = stockMinimo;
        this.stock = stock;
        this.fornecedor = fornecedor;
        this.codigoArmazemPertencente = codigoArmazemPertencente;
        this.codigoFornecedorPertencente = codigoFornecedorPertencente;
    }


    public int getCodigoArmazemPertencente() {
        return codigoArmazemPertencente;
    }

    public void setCodigoArmazemPertencente(int codigoArmazemPertencente) {
        this.codigoArmazemPertencente = codigoArmazemPertencente;
    }

    public StringBuffer getNome() {
        return nome;
    }

    public StringBuffer getArmazem() {
        return armazem;
    }

    public void setArmazem(StringBuffer armazem) {
        this.armazem = armazem;
    }

    public boolean isStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(boolean stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public boolean isFoiProcessado() {
        return foiProcessado;
    }

    public void setFoiProcessado(boolean foiProcessado) {
        this.foiProcessado = foiProcessado;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setNome(StringBuffer nome) {
        this.nome = nome;
    }
    public StringBuffer getMarca() {
        return marca;
    }

    public void setMarca(StringBuffer marca) {
        this.marca = marca;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public StringBuffer getId() {
        return id;
    }

    public void setId(StringBuffer id) {
        this.id = id;
    }

    public StringBuffer getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(StringBuffer fornecedor) {
        this.fornecedor = fornecedor;
    }

    public StringBuffer getCategoria() {
        return categoria;
    }

    public void setCategoria(StringBuffer categoria) {
        this.categoria = categoria;
    }

    public StringBuffer getDescricao() {
        return descricao;
    }

    public void setDescricao(StringBuffer descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Date getDataVenda() { return dataVenda; }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getQtCompra() {
        return qtCompra;
    }

    public void setQtCompra(int qtCompra) {
        this.qtCompra = qtCompra;
    }

}

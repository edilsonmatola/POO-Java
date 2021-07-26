package company;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Produtos implements Serializable {

    private static Date hoje = new Date();
    static double saldoDoGerente = 0;
    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<Produto> produtosVendidos = new ArrayList<>();

    static SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

    public Produtos() {
        produtos = new ArrayList<>();
        this.produtosVendidos = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public static double getSaldoDoGerente() {
        return saldoDoGerente;
    }

    //Este metodo cria novos produtos na loja e so pode ser usado para criar novos produtos
    //Nao adiciona duas vezes ou mais vezes o mesmo produto, esse contexto  aumentarStock() ou Actualizar produto
    public static boolean adicionarProduto(StringBuffer id, StringBuffer nome, StringBuffer armazem, int idArmazemPertencent,
                                           boolean stockMinimo
            , int stock, StringBuffer fornecedor, StringBuffer fornecedorPertencente, double precoUnitario,
                                           Date dataCadastro, StringBuffer categoria) {
        if (encontrarProduto(id) == null) {
            if (stock > 0) {
                Armazem armazemDesejado = Armazens.encontrarArmazem(armazem);
                if (armazemDesejado != null) {
                    armazemDesejado.getProdutosArmazenados().add(new Produto(id, nome, armazem, idArmazemPertencent, stockMinimo, stock, fornecedor, fornecedorPertencente, precoUnitario, dataCadastro, categoria));
                    return true;
                }
            }
        }
        return false;
    }

    //Nao aceita mudar o id - Um produto so deve ter o mesmo id para sempre, ao criar um produto garantimos que nao se repitam ids
    public static boolean actualizarProduto(StringBuffer id, StringBuffer nome, StringBuffer armazem, boolean stockMinimo
            , int stock, StringBuffer fornecedor, double precoUnitario,
                                            Date dataCadastro, StringBuffer categoria) {
        Produto produtoEncontrado = encontrarProduto(id);
        if (produtoEncontrado != null) {
            produtoEncontrado.setNome(nome);
            produtoEncontrado.setArmazem(armazem);
            produtoEncontrado.setStock(stock);
            produtoEncontrado.setFornecedor(fornecedor);
            produtoEncontrado.setPrecoUnitario(precoUnitario);
            produtoEncontrado.setCategoria(categoria);
            return true;
        }
        return false;
    }

    //Remove produtos
    public boolean removerProduto(StringBuffer idProduto, boolean todosProdutos) {
        if (encontrarProduto(idProduto) != null && todosProdutos) {
            Produto produtoEncontrado = encontrarProduto(idProduto);
            produtos.remove(produtoEncontrado);
            return true;
        }
        return false;
    }

    public boolean removerProduto(StringBuffer id, int quantidadeProdutos) {
        if (encontrarProduto(id) != null) {
            Produto produtoEncontrado = encontrarProduto(id);
            if (quantidadeProdutos > 0 && quantidadeProdutos <= produtoEncontrado.getStock()) {
                produtoEncontrado.setStock(produtoEncontrado.getStock() - quantidadeProdutos);
                return true;
            }
        }
        return false;
    }

    public static void venderProduto(StringBuffer idCliente) {
        Cliente clienteEncontrado = Clientes.encontrarCliente(idCliente);
        //Fazer um check up da existencia de stock para cada produto que o cliente deseja comprar

        if (clienteEncontrado != null) {
            for (int i = 0; i < clienteEncontrado.getCarrinhoCompras().size(); i++) {
                Produto produtoAVender = clienteEncontrado.getCarrinhoCompras().get(i);
                if (produtoAVender != null) {
                    int quantidadeDesejada = produtoAVender.getQtCompra();
                    //Encontrar ao nivel geral
                    int quantidadeDisponivel = encontrarProduto(produtoAVender.getId()).getStock() - quantidadeDesejada;

                    double precoUnitario = produtoAVender.getPrecoUnitario();
                    double precoSemIva = produtoAVender.getPrecoUnitario() * produtoAVender.getQtCompra();

                    double precoFinal = produtoAVender.getPrecoUnitario() * produtoAVender.getQtCompra() * 1.17;
                    //--------------------------------------//
                    double saldoCliente = clienteEncontrado.getSaldo();

                    if (saldoCliente >= precoFinal) {
                        if (quantidadeDisponivel >= 0) {
                            clienteEncontrado.getProdutosProcessados().add(produtoAVender);
                            produtoAVender.setFoiProcessado(true);
                            saldoCliente -= precoFinal;

                            produtoAVender.setDataVenda(hoje);

                            Produto produtoAdicionado = new
                                    Produto(produtoAVender.getId(), produtoAVender.getNome(), produtoAVender.getArmazem(),
                                    produtoAVender.getCodigoArmazemPertencente(),
                                    produtoAVender.isStockMinimo(), produtoAVender.getStock(), produtoAVender.getFornecedor(),
                                    produtoAVender.getCodigoFornecedorPertencente(),
                                    produtoAVender.getPrecoUnitario(), produtoAVender.getDataCadastro(), produtoAVender.getCategoria());

                            //Inicializemos os valores n�o poss�veis de passar pelo construtor
                            produtoAdicionado.setValorCompra(produtoAVender.getValorCompra());
                            produtoAdicionado.setQtCompra(produtoAVender.getQtCompra());

                            produtosVendidos.add(produtoAdicionado);
                            encontrarProduto(produtoAVender.getId()).setStock(quantidadeDisponivel);
                        }

                    } else {
                        produtoAVender.setFoiProcessado(false);
                    }
                }
            }
            finalizarVenda(clienteEncontrado);
        }
    }

    private static void finalizarVenda(Cliente cliente) {
        linha("Venda(s) Realizada(s) com sucesso!");
        linha("Cliente: " + cliente.getNome() + " | " + " id: " + cliente.getId());
        linha();
        if (!cliente.getProdutosProcessados().isEmpty()) {
            for (int i = 0; i < cliente.getProdutosProcessados().size(); i++) {
                Produto produtoProcessado = cliente.getProdutosProcessados().get(i);

                double precoUnitario = produtoProcessado.getPreco();
                double precoSemIva = produtoProcessado.getPrecoUnitario() * produtoProcessado.getQtCompra();
                double precoFinal = produtoProcessado.getPrecoUnitario() * produtoProcessado.getQtCompra() * 1.17;
                saldoDoGerente += precoFinal;

                produtoProcessado.setValorCompra(precoFinal);
                cliente.setSaldo(cliente.getSaldo() - precoFinal);
                System.out.println("[" + (i + 1) + "]" + "Produto\n id: " + "'" + produtoProcessado.getId() +
                        "'" + " nome: " + produtoProcessado.getNome() + " qt: " + produtoProcessado.getQtCompra() +
                        "\n" +
                        "preco unitario: " + precoUnitario + " Mzn" + "\n" +
                        "preco. sem Iva: " + precoSemIva + " Mzn" + "\n" +
                        "preco Final: " + precoFinal + " Mzn" + "\n" +
                        "Data venda: " + formatarData.format(produtoProcessado.getDataVenda()));
                System.out.println();
            }
        }
    }

    public void emitirRelatorio(boolean stockNegativo, boolean stockAbaixoDeCinco, boolean produtosMaisVendidos) {
        if (stockNegativo) {
            relatarStockNegativo();
        }
        if (stockAbaixoDeCinco) {
            relatarProdutoAbaixoDeCincoUnidades();
        }
        if (produtosMaisVendidos) {
            relatarCincoProdutosMaisVendidos();
        }
    }

    private void relatarStockNegativo() {
        linha();
        linha("PRODUTOS COM STOCK NEGATIVO (0)");
        int cont = 0;
        Produto produtoAnalisado;
        for (int i = 0; i < produtos.size(); i++) {
            produtoAnalisado = produtos.get(i);
            if (produtoAnalisado.getStock() == 0) {
                descreverProduto(i);
                cont++;
            }
        }
        if (cont == 0) {
            linha("Sem produto com stock negativo!");
        } else {
            linha("Numero total de produtos com stock abaixo de 5 unidades: " + cont);
        }
        linha();
    }

    private void relatarProdutoAbaixoDeCincoUnidades() {
        Produto produtoAnalisado;
        linha("PRODUTOS COM STOCK ABAIXO DE 5 UNIDADES");
        int cont = 0;
        for (int i = 0; i < produtos.size(); i++) {
            produtoAnalisado = produtos.get(i);
            if (produtoAnalisado.getStock() < 5) {
                descreverProduto(i);
                cont++;
            }
        }
        if (cont == 0) {
            linha("Sem produto com stock abaixo de 5 unidades");
        } else {
            linha("Total numero de produtos com stock abaixo de 5 unidades: " + cont);
        }
        linha();
    }

    public void deveEncomendar() {
        linha("ABAIXO ESTAO OS PRODUTOS QUE NECESSITAM DE ENCOMENDA DE STOCK");
        relatarProdutoAbaixoDeCincoUnidades();
    }

    public boolean encomendar(StringBuffer idProduto, int quantidade, int tempoPermanecidoNaLoja) {
        linha("ENCOMENDAS");
        Produto produtoEncontrado = encontrarProduto(idProduto);
        double custoDeEncomenda;
        //Mais de 60 dias aumenta 15%, 30-60 preco de venda, 0-30 diminui de 15%
        if (produtoEncontrado != null) {
            if (quantidade > 5) {
                if (tempoPermanecidoNaLoja > 60) {
                    custoDeEncomenda = Math.ceil(produtoEncontrado.getPreco() * quantidade * 1.15);
                } else {
                    if (tempoPermanecidoNaLoja > 30 && tempoPermanecidoNaLoja < 60) {
                        custoDeEncomenda = produtoEncontrado.getPreco() * quantidade;
                    } else {
                        custoDeEncomenda = produtoEncontrado.getPreco() * quantidade * 0.85;
                        //Por ser um cliente que vende logo os produtos que lhe sao fornecidos
                    }
                }
                if (saldoDoGerente >= custoDeEncomenda) {
                    produtoEncontrado.setStock(produtoEncontrado.getStock() + quantidade);
                    linha("Preco unitario: " + produtoEncontrado.getPreco() + " Mzn" + "\n" +
                            "Quantidade encomendada: " + quantidade + " unidade" + "\n" +
                            "Preco de encomenda: " + custoDeEncomenda + " Mzn" + "\n" +
                            "Tempo de permanencia anterior: " + tempoPermanecidoNaLoja + " dias");
                    return true;
                }
            } else {
                System.out.println("Por favor! No minimo 5 unidades");
            }
        } else {
            linha("OPS! Impossivel encomendar o produto com id " + idProduto.toString() + " nao existe.");
        }
        return false;
    }

    public static Produto[] relatarCincoProdutosMaisVendidos() {
        //Para relatar os cinco produtos mais vendidos precisamos saber se a quantidade de produtos registados
        // sao de pelo menos 5 unidades
        if (produtos.size() >= 5) {
            Produto[] arrayMaisVendido = new Produto[produtos.size()];
            for (int i = 0; i < produtos.size(); i++) {
                String id = produtos.get(i).getId().toString();
                int qtVendidos = 0;
                for (int j = 0; j < produtosVendidos.size(); j++) {
                    if (produtosVendidos.get(j).getId().toString().equals(id)) {
                        qtVendidos += produtosVendidos.get(j).getQtCompra();
                    }
                }
                produtos.get(i).setQtCompra(qtVendidos);
                //Fazer uma copia de produtos com dados actualizados para poder fazer a organizacao logica
                arrayMaisVendido[i] = produtos.get(i);
            }

            //Fazer o sort
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int k = 0; k < arrayMaisVendido.length - 2; k++) {
                    if (arrayMaisVendido[k + 1].getQtCompra() > arrayMaisVendido[k].getQtCompra()) {
                        Produto temporario = arrayMaisVendido[k];
                        arrayMaisVendido[k] = arrayMaisVendido[k + 1];
                        arrayMaisVendido[k + 1] = temporario;
                        flag = true;
                    }
                }
            }
            linha("TOP 5 PRODUTOS MAIS VENDIDOS");
            for (int i = 0; i < 5; i++) {
                linha();
                System.out.println("Produto " + "[" + (i + 1) + "]");
                System.out.println("id: " + arrayMaisVendido[i].getId() + "\n" +
                        "nome: " + arrayMaisVendido[i].getNome() + "\n" +
                        "descricao: " + arrayMaisVendido[i].getDescricao() + "\n" +
                        "preco: " + arrayMaisVendido[i].getPreco() + " Mzn" + "\n" +
                        "quantidade vendida: " + arrayMaisVendido[i].getQtCompra());
                linha();
            }
        } else {
            linha("Nao possui 5 produtos registados! Registe no minimo 5 unidades");
        }

        return new Produto[0];
    }

    public void listarProdutos() {
        linha();
        linha("PRODUTOS EXISTENTES NA LOJA");
        if (!produtos.isEmpty()) {
            for (int i = 0; i < produtos.size(); i++) {
                descreverProduto(i);
            }
        } else {
            linha("Sem produtos registados na loja");
        }

    }

    public void listarProdutosVendidos() {
        linha("PRODUTOS VENDIDOS NA LOJA");
        for (int i = 0; i < produtosVendidos.size(); i++) {
            descreverProdutoVendido(i);
        }
    }

    public static void linha() {
        System.out.println();
    }

    public static void linha(String conteudo) {
        System.out.println(conteudo);
    }

    private void descreverProduto(int i) {
        linha();
        System.out.println("Produto " + "[" + (i + 1) + "]");
        System.out.println("id: " + produtos.get(i).getId() + "\n" +
                "nome: " + produtos.get(i).getNome() + "\n" +
                "stock: " + produtos.get(i).getStock() + "\n" +
                "data Cadastro: " + formatarData.format(produtos.get(i).getDataCadastro()) + "\n" +
                "descricao: " + produtos.get(i).getDescricao() + "\n" +
                "preco: " + produtos.get(i).getPreco() + " Mzn");
        linha();
    }

    private void descreverProdutoVendido(int i) {
        linha();
        System.out.println("Produto " + "[" + (i + 1) + "]");
        System.out.println("id: " + produtosVendidos.get(i).getId() + "\n" +
                "nome: " + produtosVendidos.get(i).getNome() + "\n" +
                "descricao: " + produtosVendidos.get(i).getDescricao() + "\n" +
                "preco: " + produtosVendidos.get(i).getPreco() + " Mzn" + "\n" +
                "quantidade vendida: " + produtosVendidos.get(i).getQtCompra());
        linha();
    }

    public static Produto encontrarProduto(StringBuffer id) {
        Produto produtoEncontrado;

        for (int j = 0; j < Armazens.getArmazens().size(); j++) {
            Armazem armazemEncontrado = Armazens.getArmazens().get(j);
            ArrayList<Produto> produtosPorComparar = armazemEncontrado.getProdutosArmazenados();
            if (produtosPorComparar != null) {
                for (int k = 0; k < produtosPorComparar.size(); k++) {
                    produtoEncontrado = produtosPorComparar.get(k);
                    String idProdutoEncontrado = produtoEncontrado.getId().toString();
                    String idProdutoProcurado = id.toString();

                    if (idProdutoEncontrado.equals(idProdutoProcurado)) {
                        return produtoEncontrado;
                    }
                }
            }

        }

        return null;
    }
}

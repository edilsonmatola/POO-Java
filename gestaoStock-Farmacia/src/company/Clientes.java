package company;

import java.io.Serializable;
import java.util.ArrayList;

public class Clientes implements Serializable {
    //private Produtos produto;
    static ArrayList<Cliente> clientes = new ArrayList<>();


    public Clientes() {
        clientes = new ArrayList<>();
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static boolean adicionarCliente(StringBuffer nome, char sexo, StringBuffer id){
        if (encontrarCliente(id) == null){
            clientes.add(new Cliente(nome, sexo, id));
            return true;
        }
        return false;
    }

    public boolean actualizarCliente(StringBuffer id, StringBuffer nomeNovo, char sexoNovo){
        Cliente clienteEncontrado = encontrarCliente(id);
        if (clienteEncontrado != null){
            clienteEncontrado.setNome(nomeNovo);
            clienteEncontrado.setSexo(sexoNovo);
            return true;
        }
        return false;
    }

    public boolean removerCliente(StringBuffer idCliente){
        if (encontrarCliente(idCliente) != null){
            Cliente clienteEncontrado = encontrarCliente(idCliente);
            clientes.remove(clienteEncontrado);
            return true;
        }
        return false;
    }

    public static boolean adicionarAoCarrinho(StringBuffer idCliente, StringBuffer idProduto,int quantidade){
        if (quantidade > 0){
        Cliente clienteEncontrado = encontrarCliente(idCliente);

            Produto produtoEncontrado = Produtos.encontrarProduto(idProduto);
            System.out.println("ID DO PRODUTO PASSADO AD CARRINHO() " + idProduto.toString());

            if (clienteEncontrado != null) {
                if (produtoEncontrado != null) {
                    if (produtoEncontrado.getStock() > 0) {
                        if ((produtoEncontrado.getStock() - quantidade) >= 0) {
                            linha();
                            Produto produtoAAdicionar = new Produto(produtoEncontrado.getId(), produtoEncontrado.getNome(), produtoEncontrado.getArmazem(),
                                    produtoEncontrado.getCodigoArmazemPertencente(),
                                    produtoEncontrado.isStockMinimo(), produtoEncontrado.getStock(), produtoEncontrado.getFornecedor(),
                                    produtoEncontrado.getCodigoFornecedorPertencente(),
                                    produtoEncontrado.getPrecoUnitario(), produtoEncontrado.getDataCadastro(), produtoEncontrado.getCategoria());

                            produtoAAdicionar.setQtCompra(quantidade);

                            clienteEncontrado.getCarrinhoCompras().add(produtoAAdicionar);
                            linha("Carrinho: " + clienteEncontrado.getNome());
                            System.out.println("Produto Adicionado com sucesso \n" + " => Nome: " + produtoEncontrado.getNome() + " | " + "Quantidade: " + quantidade + " | " + " Stock (Ainda não vendido): " + produtoEncontrado.getStock() + " | " + " Preço unitario: " + produtoEncontrado.getPrecoUnitario() + " Mzn");
                            linha();
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }


    public static Cliente encontrarCliente(StringBuffer idProcurado){
        if (clientes != null){
            for (Cliente clienteEncontrado : clientes) {
                String idCliente = idProcurado.toString();
                String idEncontrado = clienteEncontrado.getId().toString();
                if (idCliente.equals(idEncontrado)) {
                    return clienteEncontrado;
                }
            }
        }
        return null;
    }

    public void contaCorrente(StringBuffer idCliente){
        Cliente clienteEncontrado = encontrarCliente(idCliente);
        if (clienteEncontrado != null){
            ArrayList<Produto> produtosDoCliente = clienteEncontrado.getProdutosProcessados();
            if (produtosDoCliente != null){
                linha("PRODUTOS NAO COMPRADOS");
                for (Produto produtoAImprimir : produtosDoCliente) {
                    System.out.println("idProduto: " + "'" + produtoAImprimir.getId() + "'" + " Nome: " + produtoAImprimir.getNome() + " Descrição: " + produtoAImprimir.getDescricao() + " Marca: " + produtoAImprimir.getMarca() + " Fornecedor: " + produtoAImprimir.getFornecedor() + " Categoria: " + produtoAImprimir.getCategoria() + " Quantidade: " + produtoAImprimir.getQtCompra() + "\n" +
                            " Preco: " + produtoAImprimir.getValorCompra());
                }
            }else {
                linha("Cliente sem compra(s) efectuada(s)");
            }
        }else  {
            linha("Cliente com o ID nao existe!");
        }
    }

   /* public void listarProdutosNaoProcessados(StringBuffer idCliente){
        Cliente clienteAListar = encontrarCliente(idCliente);

        if (clienteAListar != null){
            if (clienteAListar.getProdutosNaoProcessados() != null){
                ArrayList<Produto> produtoAListar = clienteAListar.getProdutosNaoProcessados();
                linha("Produtos nao processados");
                linha("Cliente: " + " id: " + clienteAListar.getId() + " nome: " + clienteAListar.getNome());
                System.out.println(produtoAListar);
                for (int i=0; i<clienteAListar.getProdutosNaoProcessados().size();i++){
                    System.out.println("Produto " + "["+(i+1)+"]");
                    System.out.println(produtoAListar.get(i).toString());
                    System.out.println();
                }
            }else {
                linha("Todos os produtos foram processados com sucesso");
            }
        }else {
            linha("Cliente com o id não existe");
        }

    }*/

    public void listarClientes(){
        if (clientes != null){
            for (int i=0; i<clientes.size();i++){
                System.out.println("Cliente " + "["+(i+1)+"]");
                System.out.println("nome: " + clientes.get(i).getNome() + "\n" +
                        "sexo: " + clientes.get(i).getSexo() +"\n" +
                        "id: " + clientes.get(i).getId());
                System.out.println();
            }
        }else {
            linha("Sem clientes registados");
        }
    }

    public void verificarSaldo(StringBuffer id) {
        Cliente clienteEncontrado=encontrarCliente(id);
        if(clienteEncontrado!=null) {
            System.out.println("O saldo do cliente "+clienteEncontrado.getNome()+" com id "+ clienteEncontrado.getId()+" sao de "+clienteEncontrado.getSaldo() + " Mzn");
        }else {
            System.out.println("Erro! O cliente nao existe!");
        }
    }

    public boolean depositar(StringBuffer id, double valorDepositar) {
        Cliente clienteEncontrado=encontrarCliente(id);
        if(clienteEncontrado!=null) {
            if (valorDepositar > 0){
                clienteEncontrado.setSaldo(clienteEncontrado.getSaldo()+valorDepositar);
                return true;
            }else {
                linha("Deposito aceite sao com montantes positivos.");
            }
        }else {
            linha("Erro, ID nao existe!");
        }
        return false;
    }

    public static void linha(){
        System.out.println();
    }

    public static void linha(String conteudo){
        System.out.println(conteudo);
    }

}

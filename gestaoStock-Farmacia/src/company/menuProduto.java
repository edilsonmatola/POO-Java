/*
package company;

import java.awt.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class menuProduto {

    static Produtos produtos = new Produtos();

    public static Produtos getProdutos() {
        return produtos;
    }

    public static void  menuProduto() throws IOException {

        Date hoje = new Date();

        boolean saidaMenuProduto = false;
        while (!saidaMenuProduto) {
            Scanner input = new Scanner(System.in);
            System.out.println("======Produtos=====");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Actualizar Produto");
            System.out.println("3- Remover Produto");
            System.out.println("4- Listar Produtos");
            System.out.println("5- Listar Produtos Vendidos");
            System.out.println("6- Voltar");
            //StringBuffer nome, StringBuffer marca, StringBuffer id, StringBuffer fornecedor, StringBuffer categoria, StringBuffer descricao, Date dataCadastro, double preco, int stock
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Insira o nome do produto: ");
                    String nome = input.next();
                    StringBuffer nome1 = new StringBuffer();
                    nome1.append(nome);

                    System.out.println("Insira a marca do produto: ");
                    String marca = input.next();
                    StringBuffer marca1 = new StringBuffer();
                    marca1.append(marca);

                    System.out.println("Insira a identificação do produto: ");
                    String id = input.next();
                    StringBuffer id1 = new StringBuffer();
                    id1.append(id);

                    System.out.println("Insira o fornecedor do produto: ");
                    String fornecedor = input.next();
                    StringBuffer fornecedor1 = new StringBuffer();
                    fornecedor1.append(fornecedor);

                    System.out.println("Insira a categoria do produto: ");
                    String categoria = input.next();
                    StringBuffer categoria1 = new StringBuffer();
                    categoria1.append(categoria);

                    System.out.println("Insira a Descricao do produto: ");
                    String descricao = input.next();
                    StringBuffer descricao1 = new StringBuffer();
                    descricao1.append(descricao);

                    input.nextLine();

                    System.out.println("Insira o custo por Unidade: ");
                    double custoPorUnidade = input.nextDouble();

                    System.out.println("Insira o stock do produto: ");
                    int stock = input.nextInt();

                    if (produtos.adicionarProduto(nome1, marca1, id1, fornecedor1, categoria1, descricao1, hoje, custoPorUnidade, stock)) {
                        System.out.println("Produto adicionado com sucesso!...");
                    } else {
                        System.out.println("ERRO! Nao foi possível adicionar o produto...");
                    }
                    break;

                case 2:

                    System.out.println("Insira a identificação do produto: ");
                    String encontrarIdProduto = input.next();
                    StringBuffer encontrarIdProduto1 = new StringBuffer();
                    encontrarIdProduto1.append(encontrarIdProduto);

                    System.out.println("Insira o nome do produto: ");
                    String nomeNovo = input.next();
                    StringBuffer nomeNovo1 = new StringBuffer();
                    nomeNovo1.append(nomeNovo);

                    System.out.println("Insira a marca do produto: ");
                    String marcaNova = input.next();
                    StringBuffer marcaNova1 = new StringBuffer();
                    marcaNova1.append(marcaNova);

                    System.out.println("Insira o fornecedor do produto: ");
                    String fornecedorNovo = input.next();
                    StringBuffer fornecedorNovo1 = new StringBuffer();
                    fornecedorNovo1.append(fornecedorNovo);

                    System.out.println("Insira a categoria do produto: ");
                    String categoriaNova = input.next();
                    StringBuffer categoriaNova1 = new StringBuffer();
                    categoriaNova1.append(categoriaNova);

                    System.out.println("Insira a Descricao do produto: ");
                    String descricaoNova = input.next();
                    StringBuffer descricaoNova1 = new StringBuffer();
                    descricaoNova1.append(descricaoNova);

                    input.nextLine();

                    System.out.println("Insira o custo por Unidade: ");
                    double custoPorUnidadeNovo = input.nextDouble();

                    System.out.println("Insira o stock do produto: ");
                    int stockNovo = input.nextInt();

                    if (produtos.actualizarProduto(encontrarIdProduto1, nomeNovo1, marcaNova1, fornecedorNovo1, categoriaNova1, descricaoNova1, custoPorUnidadeNovo, stockNovo)) {
                        System.out.println("Produto actualizado com sucesso!...");
                    } else {
                        System.out.println("ERRO! nao foi possivel actualizar o produto!");
                    }
                    break;

                case 3:
                    System.out.println("Insira a identificacao do Produto que deseja remover: ");
                    String idRemover = input.next();

                    StringBuffer idRemover1 = new StringBuffer();
                    idRemover1.append(idRemover);

                    System.out.println("Todos ? [S/N]");
                    String resp = input.next().toLowerCase();
                    if (resp.equals("s")) {
                        if (produtos.removerProduto(idRemover1, true)) {
                            System.out.println("Produto removido com sucesso!...");
                        } else {
                            System.out.println("Erro! Nao foi possivel remover o produto!..");
                        }
                    } else {
                        System.out.println("Insira a quantidade do Produto que deseja remover: ");
                        int qtRemover = input.nextInt();

                        if (produtos.removerProduto(idRemover1, qtRemover)) {
                            System.out.println("Produto removido com sucesso!...");
                        } else {
                            System.out.println("Erro! Nao foi possivel remover o produto, o produto não existe!..");
                        }
                    }
                    break;
                case 4:
                    produtos.listarProdutos();
                    break;
                case 5:
                    produtos.listarProdutosVendidos();
                case 6:
                    saidaMenuProduto = true;
                    Main.menuPrincipal();
                default:
                    System.out.println("Saída_ERRO...");
                    break;
            }
        }
    }


    public static void menuInventario() throws IOException {

        boolean saidaMenuInventarios = false;

        while (!saidaMenuInventarios) {
            Scanner input = new Scanner(System.in);
            System.out.println("======Inventários=====");
            System.out.println("1- Relatar stock");
            System.out.println("2- Produtos que deve encomendar");
            System.out.println("3- Encomendar");
            System.out.println("4- Voltar");
            //StringBuffer nome, StringBuffer marca, StringBuffer id, StringBuffer fornecedor, StringBuffer categoria, StringBuffer descricao, Date dataCadastro, double preco, int stock
            int escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    relatarStock();
                    break;

                case 2:
                    produtos.deveEncomendar();
                    break;

                case 3:
                    System.out.println("Insira a identificação do Produto que deseja encomendar: ");
                    String idEncomendar = input.next();
                    StringBuffer idEncomendar1 = new StringBuffer();
                    idEncomendar1.append(idEncomendar);

                    System.out.println("Insira a quantidade do Produto que deseja encomendar: ");
                    int quantidadeEncomenda = input.nextInt();

                    System.out.println("Insira o tempo em dias que Produto que deseja encomendar permaneceu na loja: ");
                    int tempo = input.nextInt();

                    produtos.encomendar(idEncomendar1, quantidadeEncomenda, tempo);
                    break;
                case 4:
                    saidaMenuInventarios = true;
                    Main.menuPrincipal();
                    break;
                default:
                    System.out.println("ERRO...");
                    break;
            }
        }
    }


    public static void vender() throws IOException {
        Scanner input=new Scanner(System.in);

        System.out.println("Insira a o id do cliente: ");
        String id=input.next();
        StringBuffer id1= new StringBuffer();
        id1.append(id);

        produtos.venderProduto(id1);
        Main.menuPrincipal();
    }


    public static void relatarStock() throws IOException {
        Scanner input = new Scanner(System.in);

        boolean menosDeCinco = false;
        boolean negativo = false;
        boolean maisVendidos = false;

        System.out.println("Abaixo de 5 unidades? [S/N]");
        String abaixoDeCinco=input.next().toLowerCase();
        if (abaixoDeCinco.equals("s")) {
            menosDeCinco = true;
        }

        System.out.println("Stock negativo? [S/N]");
        String stockNegativo=input.next();
        if (stockNegativo.equals("s")) {
            negativo = true;
        }

        System.out.println("Top 5 mais vendidos? [S/N]");
        String topCinco=input.next();
        if (topCinco.equals("s")) {
            maisVendidos = true;
        }

        produtos.emitirRelatorio(negativo, menosDeCinco, maisVendidos);
        Main.menuPrincipal();
    }


}
*/

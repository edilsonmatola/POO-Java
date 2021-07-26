/*
package com.company;

import java.util.Date;
import java.util.Scanner;

public class menuInventarios {

    public void menuInventario(){
        Date hoje = new Date();

        Scanner input=new Scanner(System.in);
            System.out.println("======Inventários=====");
            System.out.println("1- Relatar stock");
            System.out.println("2- Produtos que deve encomendar");
            System.out.println("3- Encomendar");
        //StringBuffer nome, StringBuffer marca, StringBuffer id, StringBuffer fornecedor, StringBuffer categoria, StringBuffer descricao, Date dataCadastro, double preco, int stock
        int escolha=input.nextInt();
            switch(escolha) {
            case 1:
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

                break;

            case 2:

                System.out.println("Insira a identificação do produto: ");
                String encontrarIdProduto=input.next();
                StringBuffer encontrarIdProduto1=new StringBuffer();
                encontrarIdProduto1.append(encontrarIdProduto);

                System.out.println("Insira o nome do produto: ");
                String nomeNovo=input.next();
                StringBuffer nomeNovo1 = new StringBuffer();
                nomeNovo1.append(nomeNovo);

                System.out.println("Insira a marca do produto: ");
                String marcaNova=input.next();
                StringBuffer marcaNova1=new StringBuffer();
                marcaNova1.append(marcaNova);

                System.out.println("Insira o fornecedor do produto: ");
                String fornecedorNovo=input.next();
                StringBuffer fornecedorNovo1=new StringBuffer();
                fornecedorNovo1.append(fornecedorNovo);

                System.out.println("Insira a categoria do produto: ");
                String categoriaNova=input.next();
                StringBuffer categoriaNova1=new StringBuffer();
                categoriaNova1.append(categoriaNova);

                System.out.println("Insira a Descricao do produto: ");
                String descricaoNova=input.next();
                StringBuffer descricaoNova1=new StringBuffer();
                descricaoNova1.append(descricaoNova);


                System.out.println("Insira o custo por Unidade: ");
                double custoPorUnidadeNovo=input.nextDouble();

                System.out.println("Insira o stock do produto: ");
                int stockNovo=input.nextInt();

                if(produtos.actualizarProduto(encontrarIdProduto1, nomeNovo1, marcaNova1, fornecedorNovo1, categoriaNova1, descricaoNova1, custoPorUnidadeNovo, stockNovo)) {
                    System.out.println("Produto actualizado com sucesso!...");
                }else {
                    System.out.println("ERRO! nao foi possivel actualizar o cliente!");
                }
                break;

            case 3:
                System.out.println("Insira a identificacao do Produto que deseja remover: ");
                String idRemover=input.next();

                StringBuffer idRemover1=new StringBuffer();
                idRemover1.append(idRemover);

                System.out.println("Todos ? [S/N]");
                String resp = input.next().toLowerCase();
                if (resp.equals("s")){
                    if(produtos.removerProduto(idRemover1, true)) {
                        System.out.println("Produto removido com sucesso!...");
                    }else {
                        System.out.println("Erro! Nao foi possivel remover o produto!..");
                    }
                }else {
                    System.out.println("Insira a quantidade do Produto que deseja remover: ");
                    int qtRemover=input.nextInt();

                    if(produtos.removerProduto(idRemover1, qtRemover)) {
                        System.out.println("Produto removido com sucesso!...");
                    }else {
                        System.out.println("Erro! Nao foi possivel remover o produto!..");
                    }
                }
            default:
                System.out.println("ERRO...");
                break;
        }
    }
}

*/

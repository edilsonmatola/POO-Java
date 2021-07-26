/*
package company;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main implements Serializable {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Date hoje = new Date();
*/

        //20 produtos registados
       /* menuProduto.produtos.adicionarProduto(new StringBuffer("Batata"), new StringBuffer("Nacional"), new StringBuffer("365ts"), new StringBuffer("Nacional"), new StringBuffer("Alimentos"), new StringBuffer("Rica em proteinas"), hoje, 529, 10);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Agua"), new StringBuffer("Vumba"), new StringBuffer("15"), new StringBuffer("Vumba Mz"), new StringBuffer("Bebidas"), new StringBuffer("Líqiuido ph = 7, 5l"), hoje, 219, 40 );
        menuProduto.produtos.adicionarProduto(new StringBuffer("Manteiga"), new StringBuffer("Stork"), new StringBuffer("we2"), new StringBuffer("Stork lda"), new StringBuffer("Matabicho"), new StringBuffer("250 cal/g"), hoje, 250, 30);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Pao"), new StringBuffer("Mosako"), new StringBuffer("12s"), new StringBuffer("Mosako"), new StringBuffer("Matabicho"), new StringBuffer("Integral, Optimo para tosta"), hoje,60 , 12);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Oleo"), new StringBuffer("Sunflower"), new StringBuffer("oi9"), new StringBuffer("Tropigalia mz"), new StringBuffer("Alimentos"), new StringBuffer("Oleoso excessivamente, alternancia a cor escura durante exposicao ao sol (2l)"), hoje, 200, 35);

        menuProduto.produtos.adicionarProduto(new StringBuffer("Cafe"), new StringBuffer("Nestle"), new StringBuffer("3ed"), new StringBuffer("Nestle"), new StringBuffer("Alimentos"), new StringBuffer("Super carregado 200g"), hoje, 250, 70);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Cebola"), new StringBuffer("Nacional"), new StringBuffer("yts"), new StringBuffer("Nacional"), new StringBuffer("Alimentos"), new StringBuffer("Fresca 10kg"), hoje, 250, 50);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Tomate"), new StringBuffer("Tomate Landia"), new StringBuffer("tom"), new StringBuffer("Tomate Landia"), new StringBuffer("Alimentos"), new StringBuffer("1kg"), hoje, 40, 50);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Laranja"), new StringBuffer("Laranja Landia"), new StringBuffer("laranja"), new StringBuffer("Laranja Landia"), new StringBuffer("Alimentos"), new StringBuffer("1kg"), hoje, 80, 50);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Manteiga de Amendoim"), new StringBuffer("Cat"), new StringBuffer("73ys"), new StringBuffer("Tropigalia"), new StringBuffer("Alimento"), new StringBuffer("100 cal/g 2kg"), hoje, 180, 20);

        menuProduto.produtos.adicionarProduto(new StringBuffer("Tv LG Led 64'' smart "), new StringBuffer("LG"), new StringBuffer("3t6d"), new StringBuffer("LG Mocambique"), new StringBuffer("Electronicos"), new StringBuffer("Inteligente e com suporte a Alexa"), hoje, 62000, 15);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Tv Sony Bravia Led 82'' smart "), new StringBuffer("Sony"), new StringBuffer("hsw3"), new StringBuffer("Sony Mocambique"), new StringBuffer("Electronicos"), new StringBuffer("Inteligente e com suporte a Alexa e Google Home"), hoje, 62000, 15);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Calculadora científica"), new StringBuffer("CASIO"), new StringBuffer("783dby"), new StringBuffer("Casio"), new StringBuffer("Electronicos"), new StringBuffer("suporta a calculo avancado"), hoje, 1200, 24);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Alto - falante Bluetooth JBL Flip 5"), new StringBuffer("JBL"), new StringBuffer("7bl5"), new StringBuffer("Mozimpor"), new StringBuffer("Electronicos"), new StringBuffer("Suporte Bluetooth 4.0 Ios & Android"), hoje, 8900, 20);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Mouse Gamer bluetooth"), new StringBuffer("ACER"), new StringBuffer("7wg"), new StringBuffer("Acer lda"), new StringBuffer("Computador e acessorios"), new StringBuffer("Optimo para gamers"), hoje, 2400, 26);

        menuProduto.produtos.adicionarProduto(new StringBuffer("Macbook Pro 16'' 1TB"), new StringBuffer("Apple"), new StringBuffer("8ue2"), new StringBuffer("Apple lda"), new StringBuffer("Computador e acessorios"), new StringBuffer("Tela 4k intel Ci9 10600"), hoje, 230000, 4);
        menuProduto.produtos.adicionarProduto(new StringBuffer("HP elitebook 15'' 2TB"), new StringBuffer("HP"), new StringBuffer("7hye9"), new StringBuffer("Hp lda"), new StringBuffer("Computador e acessorios"), new StringBuffer("Super fino"), hoje, 200000, 13);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Camera professional Sony alfa 7"), new StringBuffer("Sony"), new StringBuffer("7ztd7"), new StringBuffer("Sony lda"), new StringBuffer("Computador e acessorios"), new StringBuffer("100X zooom"), hoje, 78000, 67);
        menuProduto.produtos.adicionarProduto(new StringBuffer("Saxofone"), new StringBuffer("CASIO"), new StringBuffer("78w89e"), new StringBuffer("Casio lda"), new StringBuffer("Musica"), new StringBuffer("Tons graves"), hoje, 8000, 20);
        menuProduto.produtos.adicionarProduto(new StringBuffer("WWE 2K20 PS4"), new StringBuffer("2K"), new StringBuffer("hgv8"), new StringBuffer("2K"), new StringBuffer("Jogos"), new StringBuffer("Luta livre"), hoje, 3500, 26);
*/
   /*     menuPrincipal();
        escreverTodasAsOperacoesDoSistema(menuCliente.clientes, menuProduto.produtos);
    }

    public static void menuPrincipal() throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("======Menu=====");
        System.out.println("1- Clientes");
        System.out.println("2- Produtos");
        System.out.println("3- Inventarios");
        System.out.println("4- Vendas");
        System.out.println("5- Relatorios");
        System.out.println("6- Sair");
        System.out.println("Escolha uma das operacoes ");
        int escolha = entrada.nextInt();
        boolean sair = false;

       // while (!sair) {
            switch (escolha) {
                case 1:
                    menuCliente.menuCliente();
                    break;

                case 2:
                    menuProduto.menuProduto();
                    break;
                case 3:
                    menuProduto.menuInventario();
                    break;
                case 4:
                    menuProduto.vender();
                    break;
                case 5:
                    menuProduto.relatarStock();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("ERRO OPERACAO INVALIDA!");
                    System.out.println("Introduza uma das operacoes");
                    break;
            }
        //}
    }

    public static void escreverTodasAsOperacoesDoSistema(Clientes cliente, Produtos produto) throws Exception {
        FileOutputStream clientes = new FileOutputStream(new File("Clientes"));
        FileOutputStream produtos = new FileOutputStream(new File("Produtos"));
        FileOutputStream produtosVendidos = new FileOutputStream(new File("produtosVendidos"));

        ObjectOutputStream saidaStreamClientes = new ObjectOutputStream((clientes));
        //saidaStreamClientes.writeObject(cliente.getClientes());//Os clientes suas operacoes como por exemplo produtos comprados e etc
        saidaStreamClientes.close();
        clientes.close();

        ObjectOutputStream saidaStreamProdutos = new ObjectOutputStream((produtos));
        saidaStreamProdutos.writeObject(produto.getProdutos());//Todos produtos existentes no sistema
        saidaStreamProdutos.close();
        produtos.close();

        ObjectOutputStream saidaStreamProdutosVendidos = new ObjectOutputStream((produtosVendidos));
        saidaStreamProdutosVendidos.writeObject(produto.getProdutosVendidos()); //Toda informacao relacionada a produtos vendidos
        saidaStreamProdutosVendidos.close();
        produtosVendidos.close();
    }
}*/
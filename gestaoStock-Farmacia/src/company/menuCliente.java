/*package company;

import java.io.IOException;
import java.util.Scanner;

public class menuCliente {

    static Clientes clientes = new Clientes();

    public static void menuCliente() throws IOException {
        Scanner input=new Scanner(System.in);*/

        /*boolean saida = false;
        while (!saida){
            System.out.println("======Clientes=====");
            System.out.println("1- Criar Clientes");
            System.out.println("2- Actualizar Cliente");
            System.out.println("3- Remover Cliente");
            System.out.println("4- Listar Clientes");
            System.out.println("5- Depositar saldo do cliente ");
            System.out.println("6- Verificar Saldo ");
            System.out.println("7- Adicionar produtos ao carrinho ");
            System.out.println("8- Listar conta corrente ");
            System.out.println("9- Voltar ");
            System.out.println("Escolha uma das opções");
            int escolhaMenuCliente=input.nextInt();

            switch(escolhaMenuCliente) {
                case 1:
                    System.out.println("Insira o nome do cliente: ");
                    String nome=input.next();
                    StringBuffer nome1 = new StringBuffer();
                    nome1.append(nome);

                    input.nextLine();
                    System.out.println("Insira o sexo do cliente: ");
                    String sexoString = input.next();
                    char sexo=sexoString.charAt(0);

                    System.out.println("Insira o numero de identificacao do cliente: ");
                    String id=input.next();
                    StringBuffer id1=new StringBuffer();
                    id1.append(id);

                    if (clientes.adicionarCliente(nome1, sexo, id1)) {
                        System.out.println("Operacao efectuada com sucesso!...");
                    }else {
                        System.out.println("ERRO! Nao foi possivel criar o cliente, o id fornecido já foi usado...");
                    }
                    break;

                case 2:

                    System.out.println("Insira a identificação(id) do cliente: ");
                    String encontrarId=input.next();
                    StringBuffer encontrarId1=new StringBuffer();;
                    encontrarId1.append(encontrarId);

                    System.out.println("Insira o nome do cliente: ");
                    String nomeNovo=input.next();
                    StringBuffer nomeNovo1=new StringBuffer();;
                    nomeNovo1.append(nomeNovo);

                    System.out.println("Insira o sexo do cliente: ");
                    String sexoStringActualizar = input.next();
                    char sexoNovo=sexoStringActualizar.charAt(0);

                    if(clientes.actualizarCliente(encontrarId1, nomeNovo1, sexoNovo)) {
                        System.out.println("Cliente actualizado com sucesso!...");
                    }else {
                        System.out.println("ERRO! nao foi possivel actualizar o cliente!, o id fornecido não existe");
                    }
                    break;

                case 3:
                    System.out.println("Insira a identificação do cliente que deseja remover: ");
                    String idRemover=input.next();

                    StringBuffer idRemover1=new StringBuffer();
                    idRemover1.append(idRemover);

                    if(clientes.removerCliente(idRemover1)) {
                        System.out.println("Remoção do cliente efecutada com sucesso!...");
                    }else {
                        System.out.println("Erro! Nao foi possivel remover o cliente, este não exite!...");
                    }

                case 4:
                    System.out.println("CLIENTES DA LOJA");

                    clientes.listarClientes();
                    break;

                case 5:
                    System.out.println("Insira a identificacao do cliente que deseja depositar: ");
                    String idDepositar=input.next();
                    StringBuffer idDepositar1=new StringBuffer();
                    idDepositar1.append(idDepositar);

                    System.out.println("Insira o valor que deseja depositar");
                    double valorDepositar=input.nextDouble();

                    if(clientes.depositar(idDepositar1, valorDepositar)) {
                        System.out.println("Valor depositado com sucesso!...");
                    }else {
                        System.out.println("Erro! Não foi possível efectuar o depósito...");
                    }
                    break;
                case 6:
                    System.out.println("Insira a identificação do cliente: ");
                    String idSaldo=input.next();
                    StringBuffer idSaldo1=new StringBuffer();
                    idSaldo1.append(idSaldo);

                    clientes.verificarSaldo(idSaldo1);
                    break;

                case 7:
                    System.out.println("Insira o id do cliente: ");
                    String idCliente=input.next();
                    StringBuffer idCliente1=new StringBuffer();
                    idCliente1.append(idCliente);


                    System.out.println("Insira o id do produto: ");
                    String idProduto=input.next();
                    StringBuffer idProduto1=new StringBuffer();
                    idProduto1.append(idProduto);

                    System.out.println("Insira a quantidade do produto: ");
                    int quantidade=input.nextInt();

                    if(clientes.adicionarAoCarrinho(idCliente1, idProduto1, quantidade)) {
                        System.out.println("Produto adicionado ao carrinho");
                    }else {
                        System.out.println("Erro! Nao foi possivel adicionar o produto ao carrinho...");
                    }
                    break;
                case 8:
                    System.out.println("Insira o id do cliente: ");
                    String idClienteAlistar=input.next();
                    StringBuffer idClienteAlistar1=new StringBuffer();
                    idClienteAlistar1.append(idClienteAlistar);
                    clientes.contaCorrente(idClienteAlistar1);
                    break;
                case 9:
                    saida = true;
                    Main.menuPrincipal();
                    break;
                default:
                    System.out.println("ERRO... Opção Inválida");
                    break;
            }
        }

    }
}*/

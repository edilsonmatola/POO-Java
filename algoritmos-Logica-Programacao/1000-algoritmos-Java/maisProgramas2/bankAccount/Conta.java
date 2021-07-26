import java.util.*;


public class Conta {


    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome_cliente;
        float saldo_inicial;

        Scanner entrada_ler_dados = new Scanner(System.in);

        // Funcao Random que servira para criar numeros aleatorios
        Random numero = new Random();

        int num_conta = 1 + numero.nextInt(100003444);

        //Pegando os dados iniciais do Cliente, que ira servir de teste
        System.out.println("                       ******************");
        System.out.println("                       ******************");

        System.out.println("***************Bem vindo ao ATM Boa Vida");
        System.out.println("");
        System.out.println("***********Por favor Cadastre um novo cliente. ************");
        System.out.print("Por favor digite o seu nome-> ");
        nome_cliente = entrada_ler_dados.next();
        System.out.println("        ******************");
        System.out.print("Por favor digite o valor do depositado inicial para sua conta -> ");
        saldo_inicial = entrada_ler_dados.nextFloat();

        //Criando a conta de um cliente
        ContaBancaria backaccount = new ContaBancaria(nome_cliente, num_conta, saldo_inicial);
        backaccount.iniciar();
    }


}
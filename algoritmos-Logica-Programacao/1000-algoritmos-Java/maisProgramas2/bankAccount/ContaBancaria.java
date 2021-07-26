import java.util.Scanner;


//criando os objectos
public class ContaBancaria{
    public  String nome;
    public  int num_conta;
    public  int saques;
    public  float saldo;

    Scanner entrada = new Scanner(System.in);

    public ContaBancaria(String nome, int num_conta, float saldo_inicial){
        this.nome=nome;
        this.num_conta=num_conta;
        saldo=saldo_inicial;
        saques=0;
    }

    //metodo conta pupaca 
    public void contapoupanca(float taxa_red_poupaca){
    	if (taxa_red_poupaca > 0) {
    		
    		saldo = saldo + taxa_red_poupaca;

    	}else{
    		System.out.println("Por favor digite uma taxa valida");
    	}
        
    }
   //Criando o metodo contaespecial
    public void contaEspecial(float limite){
        if(saldo >= limite){
            saldo = saldo - limite;
            saques++;
            //System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    // Mostrado os dados da conta/extrato
    public void daddos_conta(){
    	System.out.println("");
    	System.out.println("");
        System.out.println("\t Dados da conta do Sir(e) : "+ this.nome);
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero da conta: " + this.num_conta);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");

    }


    //metodo lenvantar/sacar se o saldo for maior que o valor
    public void sacar(float valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            saques++;
            System.out.println("Levantamento Feito com Sucesso");
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente, por favor Faca um deposito! Obrigado\n");
        }
    }

    //metodo depositar se o valor for maior que 0
    public void depositar(float valor)
    {
        if (valor > 0) {
        	saldo = valor + saldo;
        	System.out.println("");
        	System.out.println("Depositado Feito com Sucesso");
        	System.out.println("Depositado: " + valor);
        	System.out.println("Novo saldo: " + saldo + "\n");
        }else{
        	System.out.println("Por favor tente novamente");
        }
    }


    // Iniciar(mostar o menu ate que o user queira sair)
    public void iniciar(){
        int opcao;

        do{
            mostarMenu();
            opcao = entrada.nextInt();
            escolher_opcao(opcao);
        }while(opcao!=4);
    }

    /// funcao do menu
    public void mostarMenu(){

    	System.out.println("");
        System.out.println("\t Escolha a opcao que deseja realizar");
        System.out.println("1 - Consultar Dados da Conta");
        System.out.println("2 - Sacar/Levantar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Depositar Conta Poupaca");
        System.out.println("5 - Sair\n");
        System.out.print("Coloque a Opcao: ");

    }

    /// funcao que coloc o menu a funcionar atraves do switch case
    public void escolher_opcao(int opcao){
        float valor;

        switch(opcao){
            case 1:    
                    daddos_conta();
                    break;
            case 2: 
                    if(saques<3){
                        System.out.print("Por favor digite o valor a sacar: ");
                        valor = entrada.nextFloat();
                        sacar(valor);
                    } else{
                        System.out.println("Limite de saques diarios atingidos. Por favor tente noutro momento \n");
                    }
                    break;

            case 3:
                    System.out.print("Quanto deseja depositar?: ");
                    valor = entrada.nextFloat();
                    depositar(valor);
                    break;

            case 4: 
                    System.out.println("Quanto deseja depositar na conta Poupaca. ?");
                    valor = entrada.nextFloat();
                    contapoupanca(valor);
                    break;
            case 5: 
                    System.out.println("Sistema encerrado com Sucesso.");
                    System.exit(1);
                    break;

            default:
                    System.out.println("Opcaoo invalida, Por favor tente novamente");
        }
    }
}

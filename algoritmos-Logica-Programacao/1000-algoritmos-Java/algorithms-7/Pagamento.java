//Sydney Madope
import java.io.*;
import java.util.*;
public class Pagamento{
	public static double valor;
	public static double valorIni;
	public static int pinIni;
	public static int pin;
	public static int confirm;
	public static int numero;
	public static int agente;
	public static String produto;
	public static int valorproduto;
	public static void main(String args[]) throws IOException{
		
		registar();
		menu();
		opcao();
		
	}
	
	//Metodo para registar o usuario de modo a ter o pin e o valor inicial
	public static void registar()throws IOException{
		System.out.println("Bem vindo ao Mpesa, proceda ao registo para poder usar os nossos servicos");
		Scanner in = new Scanner(System.in);
		Conta registar = new Conta();
		System.out.println("Insira o pin: ");
		pinIni = in.nextInt();
		registar.criarPin(pin);
		
		System.out.println("Insira o valor inicial: ");
		valorIni = in.nextDouble();
		registar.criarValor(valorIni);
		
	}
	
	//Metodo para confirmar a compra/transferencia
	public static void confirmar(){
		Scanner in = new Scanner(System.in);
		Conta conta = new Conta();
		System.out.println("Digite o valor");
		valor = in.nextDouble();
		
		
		if(valor > valorIni){
			System.out.println("Saldo insuficiente.");
		
		}
		else{
			valorIni = valorIni - valor;
			System.out.println("Digite o pin");
			pin = in.nextInt();
			if (pin != pinIni){
				do{
					System.out.println("Pin incorrecto. Digite novamente");
					pin = in.nextInt();
				}while(pin != pinIni);
			}
		}
	}
	
	//Metodo para confirmar so o pin
	public static void confirmarPin(){
		Scanner in = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("Digite o pin");
		pin = in.nextInt();
		if (pin != pinIni){
			do{
				System.out.println("Pin incorrecto. Digite novamente");
				pin = in.nextInt();
			}while(pin != pinIni);
		}
	}
	
	//Metodo para finalizar a operacao
	public static void finalizar(){
		Scanner in = new Scanner(System.in);
		System.out.println("O seu pedido foi processado.");
		minhaConta();
		System.out.println(" ");
			
		System.out.println("Deseja realizar outra operacao?");
		System.out.println("1-Sim");
		System.out.println("2-Nao");
		int op = in.nextInt();
			
		if(op==1){
			menu();
			opcao();
		}
			
		else{
			System.out.println("Tudo bom para ti!");
		}
	}
		
		
		public static void finalizar_tv(){
			
			Scanner in = new Scanner(System.in);
			System.out.println("O seu pedido foi processado.");
			relatorioTv();
			System.out.println(" ");
				
			System.out.println("Deseja realizar outra operacao?");
			System.out.println("1-Sim");
			System.out.println("2-Nao");
			int op = in.nextInt();
				
			if(op==1){
				menu();
				opcao();
			}
				
			else{
				System.out.println("Tudo bom para ti!");
			}
		}

		
	
	//Metodo para apresentar o menu
	public static void menu(){
			System.out.println(" ");
			System.out.println("M-pesa");
			System.out.println("1.Transferir dinheiro");
			System.out.println("2.Levantar dinheiro");
			System.out.println("3.Comprar credito");
			System.out.println("4.Jackpot e Internet");
			System.out.println("5.Comprar CREDILEC");
			System.out.println("6.Pagamentos");
			System.out.println("7.Minha conta");
			
	}
	
	//Metodo para selecionar uma das opcoes do menu
	public static void opcao(){
		Scanner in = new Scanner(System.in);
		int op = in.nextInt();
		
		switch(op){
			case 1: transferirDinheiro();
			break;
			case 2: levantarDinheiro();
			break;
			case 3: comprarCredito();
			break;
			case 4: jackpotInternet();
			break;
			case 5: comprarCredilec();
			break;
			case 6: pagarContas();
			break;
			case 7: minhaConta();
			break;
		}
	}
	
	public static void transferirDinheiro(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("1.Digitar Numero");
		System.out.println("2.Procurar na lista");
		System.out.println("3.Para banco");
		System.out.println("4.Voltar");
		int op11 = in.nextInt();
		if(op11 == 1){
			System.out.println("Digita o numero");
			numero = in.nextInt();
			String nr = ""+numero;
			int tamanhoNr = nr.length();
				if (tamanhoNr != 9){
					do{
						System.out.println("Numero invalido. Tente novamente");
						System.out.println("Digite o numero");
						numero = in.nextInt();
						nr = ""+numero;
						tamanhoNr = nr.length();
					}while(tamanhoNr != 9);
				}

			confirmar();
			

			System.out.println("Confima que quer enviar "+valor+"mts"+" para "+numero+"?");
			System.out.println("1.Sim");
			System.out.println("2.Nao");
			confirm= in.nextInt();

			if(confirm == 1){
				finalizar();
			}


		}
		
		else if(op11 == 4){
			menu();
			opcao();
		}
	}
	
	public static void levantarDinheiro(){
		Scanner in = new Scanner(System.in);
		System.out.println("1.No Agente");
		System.out.println("2.No ATM");
		System.out.println("3.Voltar");
		int opleva= in.nextInt();

		if(opleva==1){
			System.out.println("Digite o numero do agente");
			agente = in.nextInt();
			String ag = ""+agente;
			int tamanhoAg = ag.length();
			if(tamanhoAg!=5){
				do{
					System.out.println("Codigo invalido. Digite novamente");
					agente = in.nextInt();
					ag = ""+agente;
					tamanhoAg = ag.length();

				}while(tamanhoAg!=5);
			}
			
			confirmar();

			System.out.println("Quer levantar "+valor+"mts no agente "+agente+"?");
			System.out.println("1-Sim");
			System.out.println("2-Nao");
			confirm = in.nextInt();

			if(confirm==1){
				finalizar();
			}
		}
		
		else if(opleva == 3){
			menu();
			opcao();
		}
	}
	
	public static void comprarCredito(){
		Scanner in = new Scanner(System.in);
		System.out.println("1.Para meu numero");
		System.out.println("2.Para outro numero");
		int op = in.nextInt();

		if(op == 1){
			
			confirmar();
			
			System.out.println("Confirma que quer comprar "+valor+"mts de credito?");
			System.out.println("1-Sim");
			System.out.println("2-Nao");
			confirm = in.nextInt();

			if (confirm == 1){
				finalizar();
			}
		}

		else if(op == 2){
			System.out.println("Digita o numero");
			numero = in.nextInt();
			String nr = ""+numero;
			int tamanhoNr = nr.length();

			if (tamanhoNr != 9){
				do{
					System.out.println("Numero invalido. Tente novamente");
					System.out.println("Digite o numero");
					numero = in.nextInt();
					nr = ""+numero;
					tamanhoNr = nr.length();
				}while(tamanhoNr != 9);
			}
			
			confirmar();

			System.out.println("Confima que quer enviar "+valor+"mts"+" para "+numero+"?");
			System.out.println("1.Sim");
			System.out.println("2.Nao");
			confirm = in.nextInt();
			if(confirm == 1){
				finalizar();
			}
		}
		
		else if(op == 3){
			menu();
			opcao();
		}
	}

	
	public static void jackpotInternet(){
		
	}
	
	public static void comprarCredilec(){
		
	}
	
	public static void pagarContas(){
		Scanner in = new Scanner(System.in);
        System.out.println("Escolha o provedor de servico:");
		System.out.println("1.Comerciante Paga Facil");
		System.out.println("2.Vodacom Pos-Pago");
		System.out.println("3.Agua");
		System.out.println("4.TV");
		System.out.println("5.UEM");
		System.out.println("6.ISPG");
		System.out.println("7.Digitar o codigo do servico");
		System.out.println("8.Procurar na lista");
		System.out.println("9.Voltar");
        int op = in.nextInt();
        switch(op){
            case 1:
                comerciantEpagafacil();
            break;
            case 2:
                vodacomPospago();
            break;
            case 3:
                agua();
            break;
            case 4:
                tv();
            break;
            case 5:
                uem();
            break;
            case 6:
                ispg();
            case 7:
                digitarOcodigodoservico();
            break;
			case 8:
				procurarNaLista();
			break;
			case 9:
				menu();
				opcao();
			}
		}
	
	
	public static void comerciantEpagafacil(){
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o codigo do comerciante");
		agente = in.nextInt();
		
		confirmar();
		
		finalizar();
	}
	public static void vodacomPospago(){
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o numero pos-pago");
		numero = in.nextInt();
		
		confirmar();
		
		finalizar();
	}
	public static void agua(){
		Scanner in = new Scanner(System.in);
		System.out.println("Insira a entidade: ");
		int ent = in.nextInt();
		String en = ""+ent;
		
		if(en.length() != 5){
			do{
				System.out.println("Entidade invalida, insira novamente");
				ent = in.nextInt();
			}while(en.length() != 5);
		}
			
		System.out.println("Insira a referencia: ");
		long ref = in.nextLong();
		
		
		confirmar();
		
		System.out.println("Confima que quer enviar pagar "+valor+"mts"+" para a referencia "+ref+"?");
		System.out.println("1.Sim");
		System.out.println("2.Nao");
		confirm= in.nextInt();

		if(confirm == 1){
			finalizar();
		}
		
	}
	public static void tv(){
		Scanner in = new Scanner(System.in);
		System.out.println("1.DSTV");
		System.out.println("2.ZAP");
		System.out.println("3.STARTIMES");
		System.out.println("4.Gotv");
		System.out.println("5.TVCabo");
		int op = in.nextInt();
		
		switch(op){
			case 1:
			System.out.println("         DSTV");
			System.out.println("       Pacotes         "); 
			System.out.println("1- Mega               "); 
			System.out.println("2- Premium            ");
			System.out.println("3- Grande             ");
			System.out.println("4- Medio              ");
			System.out.println("5- Basico             ");				
			int dstv = in.nextInt();
			switch(dstv){
			case 1:
				valorproduto = 9000;
				produto = "Mega";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
			case 2:
				valorproduto = 7500;
				produto = "Premium";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");	
				finalizar_tv();
				}
				break;
			case 3:
				valorproduto = 5000;
				produto = "Grande";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
			case 4:
				valorproduto = 3000;
				produto = "Bue";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");	
				finalizar_tv();
				}
				break;
			case 5:
				valorproduto = 1000;
				produto = "Basico";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
			default:
				break;
			}
			
			case 2: 
			System.out.println("         ZAP");
			System.out.println("       Pacotes         "); 
			System.out.println("1- Mega               "); 
			System.out.println("2- Premium            ");
			System.out.println("3- Grande             ");
			System.out.println("4- Medio              ");
			System.out.println("5- Basico             ");				
			int zap = in.nextInt();
			switch(zap){
			case 1:
				valorproduto = 9000;
				produto = "Mega";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
				case 2:
				valorproduto = 7500;
				produto = "Premium";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");	
				finalizar_tv();
				}
				break;
				case 3:
				valorproduto = 5000;
				produto = "Grande";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
				case 4:
				valorproduto = 3000;
				produto = "Medio";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");	
				finalizar_tv();
				}
				break;
				case 5:
				valorproduto = 1000;
				produto = "Basico";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
			default:
				break;
			}
			case 3:
			System.out.println("       STARTIMES");
			System.out.println("       Pacotes         "); 
			System.out.println("1- Unico             ");
			System.out.println("2- Classico             ");
			System.out.println("3- Basico             ");				
			int star = in.nextInt();
			switch(star){
			case 1:
				valorproduto = 800;
				produto = "Unico";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
			case 2:
				valorproduto = 460;
				produto = "Classico";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");	
				finalizar_tv();
				}
				break;
			case 3:
				valorproduto = 300;
				produto = "Basico";
				confirmarPin();
				System.out.println("Deseja efectuar o pagamento do pacote "+produto+" no valor de: "+valorproduto+"mts?");
				System.out.println("1.Sim");
				System.out.println("2.Nao");
				confirm = in.nextInt();
				if(confirm == 1){
				System.out.println("O seu pedido foi processado. Tudo bom para ti!");
				finalizar_tv();
				}
				break;
			default:
				break;
			}
		}
	}
	
	
	public static void uem(){
	
	}
    public static void ispg(){
	
	}
    public static void digitarOcodigodoservico(){
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o codigo do serviço pretendido");
		int cod = in.nextInt();
		
	}
	public static void procurarNaLista(){
		System.out.print("Lista vazia!");
	}
	//Metodo para disponibilizar o saldo
	public static void minhaConta(){
		System.out.println("Saldo da conta: "+valorIni+"mts");
	}
	//Metodo para disponibilizar o saldo apos alguma operacao realizada para pagamento de tv
	public static void relatorioTv(){
		valorIni = valorIni - valorproduto;
		System.out.println("O seu saldo e: "+ valorIni+"mts");
	}
}	
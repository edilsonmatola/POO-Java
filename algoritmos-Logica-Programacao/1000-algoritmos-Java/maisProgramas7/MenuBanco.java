//Parte 2
import java.util.Scanner;
public class MenuBanco{
	static Scanner dx=new Scanner(System.in); 
	static int saldo=500;
	public static void consultar(){
		System.out.println(" o seu saldo e de "+saldo+" MT ");
	}
	public static void transferir(int trans){
		System.out.println(" quanto deseja tranferir");
		trans=dx.nextInt();
		if(trans>saldo){
			System.out.println(" saldo insuficiente ");
		}else{
			System.out.println(" tranferiu com sucesso os "+trans+" MT ");
		saldo=saldo-trans;
		System.out.println(" o seu novo saldo e de "+saldo+" MT ");
		}
	}
	public static void levantar(int lev){
		System.out.println(" quanto deseja levantar ");
		lev=dx.nextInt();
		if(lev>saldo){
			System.out.println(" saldo insuficiente ");
		}else{
		saldo=saldo-lev;
		System.out.println(" levantou com sucesso os "+lev+" MT ");
		System.out.println(" o seu novo saldo e de "+saldo+" MT ");
		}
	} 
	
	public static void depositar(int deposito){
		System.out.println(" quanto deseja depositar ");
		deposito=dx.nextInt();
		saldo=saldo+deposito;
		System.out.println(" o seu novo saldo e de "+saldo+" MT ");
	}
	
	public static void main(String[]args){
		int opcao=5;
		do{
		System.out.println(" 1-Consulta ");
		System.out.println(" 2-transferencia ");
		System.out.println(" 3-levantar ");
		System.out.println(" 4-deposito ");
		System.out.println(" 5-sair ");
		System.out.println(" escolha opcao ");
		opcao=dx.nextInt();
		System.out.println(" ------------------------------ ");
			int lev=0;
			int deposito=0;
			int trans=0;
			switch(opcao){
				
				case 1:
				consultar();
				System.out.println(" ------------------------------ ");
				break;
				case 2:
				transferir(trans);
					System.out.println(" ------------------------------ ");
				break;
				case 3:
				levantar(lev);
					System.out.println(" ------------------------------ ");
				break;
				case 4:
				depositar(deposito);
					System.out.println(" ------------------------------ ");
				break;
				case 5:
				System.out.println(" obrigado volte sempre ");
				break;
				default:
				System.out.println(" opcao invalida ");
				break;
			}
			
		}while(opcao!=5);
	}
	
}
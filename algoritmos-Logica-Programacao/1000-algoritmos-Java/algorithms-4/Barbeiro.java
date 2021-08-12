import java.util.*;
public class Barbeiro{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		int saldoo=0;
		double montante=0;
		Random saldo=new Random();
		System.out.println("Insira o seu nome");
		String nome=teclado.nextLine();
		System.out.println("Muito Bem "+nome+" Abaixo Encontrara as opcoes disponiveis");
		System.out.println("************Pacote Simples************");
		System.out.println("1-Escovinha");
		System.out.println("2-Punk");
		System.out.println("3-Careca");
		System.out.println("************Pacote Combo************");
		System.out.println("4-Escovinha + Barba");
		System.out.println("5-Punk + Barba");
		System.out.println("6-Careca + Barba");
		System.out.println("************Especial************");
		System.out.println("7-Corte Especial ");
		System.out.println("EScolha A Opcao desejada");
		int opcao=teclado.nextInt();
		switch(opcao){
			case 1:
			System.out.println("Valor A Pagar-70MT");
			System.out.println("Duracao:30minutos");
			System.out.println("Aguardo A Sua Vez");
				break;
			case 2:
			System.out.println("Valor A Pagar-100MT");
			System.out.println("Duracao:40minutos");
			System.out.println("Aguardo A Sua Vez");
				break;
			default:System.out.println("Indisponivel");
		}
	}
}
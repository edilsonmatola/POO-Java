// Zenildo Nhabomba

import java.util.Scanner;
public class TestaSeleccaoMultipla{
	public static void main(String []args){
		int a,b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao programa do enginheira Priscila");
		System.out.println("siga os passos os passos abaixo para executar o programa");
		System.out.println("introduza, 1 para (soma); 2 para (subtracao); 3 para (multiplicacao); 4 para (divisao); e 5 para (raiz quadrada do primeiro nr.)");
		int opcao = entrada.nextInt();
		int opcao2 = entrada.nextInt();

		System.out.println("insira o valor de a");
		a = entrada.nextInt();
		System.out.println("insira o valor de b");
		b = entrada.nextInt();
		
		switch (opcao){
			case 1:
			System.out.println("o valor da soma e:" +(a+b));
			break;

			case 2:
			System.out.println("o valor da subtracao e:" +(a-b));
			break;
			
			case 3:
			System.out.println("o valor da multiplicaco e:" +(a*b));
			break;

			case 4:
			System.out.println("o valor da divisao e:" +(a/b));
			break;

			case 5:
			a = entrada.nextInt();
			System.out.println("o valor da raiz Quadrada de " +a+ " e: " +(Math.sqrt(a)));

			defult:
			System.out.println("OPERACAO INVALIDA... (Tente escolher valor de 1 a 5");
			break;
		}
	}
}


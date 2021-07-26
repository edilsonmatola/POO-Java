//Chelsea Manjate I11
//Imprime o preco descontado de um artigo comprado numa loja de roupas

import java.util.Scanner;

public class Artigos{
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		System.out.println("POr favor insira o nome do artigo");
		String nome=input.nextLine();
		System.out.println("Por favor insira o preco deste artigo");
		double preco=input.nextDouble();
		System.out.println("Insira o desconto correspondente a esse artigo");
		double desconto=input.nextDouble();

		double desconto2=preco*(desconto/100);
		double precoDescontado=preco-desconto2;

		System.out.println("O preco descontado de "+nome+" e: "+precoDescontado);
	}
}
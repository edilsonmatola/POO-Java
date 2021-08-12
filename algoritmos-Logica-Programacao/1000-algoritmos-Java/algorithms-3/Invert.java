//Zenildo Nhabomba I12
//Imprime o inverso de uma palavra com a inicial invertida maiuscula

import java.util.Scanner;
public class Invert{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a palavra: ");
		String palavra=sc.nextLine();

		String letra=palavra.substring(0, 1).toUpperCase();
		String palavranova=palavra.replace(palavra.substring(0, 1), letra);
		System.out.println("A palavra com inicial em maiuscula e: "+palavranova);
		String letranova=palavra.substring(palavra.length()-1).toUpperCase();
		String concatenar="";
		String nova=letranova+concatenar;

		for (int i=palavra.length()-2;i>-1;i--) {
			concatenar=concatenar+palavra.charAt(i);
		}System.out.println("A palavra covertida e: "+(nova+concatenar));
	}
}

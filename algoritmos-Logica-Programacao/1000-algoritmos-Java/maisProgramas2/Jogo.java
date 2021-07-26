//Zenildo Nhabomba I12
//Imprimi o resultado de um jogo da sorte usando o Random

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Jogo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int b, vezes;
		vezes = 0;
		Random a = new Random();
		int c = a.nextInt(101);
		System.out.print("Insira o numero da sua sorte ate 50: ");
		b = in.nextInt();
		if(c==b) {
			System.out.println("Voce ganhou na primeira tentativa");
		}else {
			while(c<b) {
				System.out.print("Numero maior, tente de novo: ");
				b = in.nextInt();
				vezes = vezes+1;
				if(c==b) {
					System.out.println("Parabens, voce ganhou com "+vezes+" Tentativas");break;
				}
				while(c>b) {
					System.out.print("Numero menor, tente de novo: ");
					b = in.nextInt();
					vezes = vezes+1;
					if(c==b) {
						System.out.println("Parabens, voce ganhou com "+vezes+" Tentativas");break;
					}
				}
			}System.out.println("Ate a Proxima!!");
		}
	}

}

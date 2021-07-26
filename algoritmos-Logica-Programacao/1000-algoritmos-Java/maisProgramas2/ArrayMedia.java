//Zenildo Nhabomba  I12
//Imprimi a media de 4 notas inseridas num array

import java.util.Scanner;
public class ArrayMedia{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int notas[]={14,13,12,11};

		int soma=0;
		for(int i=0;i<notas.length;i++) {
			
			soma=soma+notas[i];

		}
		int media=(soma/notas.length);
		System.out.println(media);
	}
}

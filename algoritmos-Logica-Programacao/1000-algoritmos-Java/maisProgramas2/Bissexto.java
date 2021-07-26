//Zenildo Nhabomba
//Verifica se o ano e ou nao bissexto

import java.util.Scanner;
public class Bissexto{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o ano: ");
		int ano=sc.nextInt();

		if(ano%4==0 && ano%100!=0 || ano%400==0){
			System.out.println(ano+" e um ano bissexto");
		}else{
			System.out.println(ano+" nao e um ano bissexto");
		}
	}
}
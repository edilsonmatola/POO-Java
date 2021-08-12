package com.testes.doubled;

import java.util.Scanner;
import java.util.Random;

public class RandomSor {
	public static void main (String[] args){
		Random random = new Random();
		Scanner in= new Scanner(System.in);
		int i=1;
		int sort= random.nextInt(101);
		System.out.println("Descobre o numero sorteado de 1 a 100");
		int num= in.nextInt();
		if(num>=0 && num<=100){
				while(num!=sort){
					if(num>sort){
						System.out.println("Errado, O numero sorteado eh inferior que "+num);
						num = in.nextInt();
					}
					if(num<sort){
						System.out.println("Errado, O numero sorteado eh superior que "+num);
						num = in.nextInt();
					}
					i=i+1;
					if(num==sort){
						System.out.println("Finalmente, mas teve "+i+" tentativas falhadas");
					}
				}
			}
		else{
			System.out.println("Valor invalido");
			
		}
	}
}

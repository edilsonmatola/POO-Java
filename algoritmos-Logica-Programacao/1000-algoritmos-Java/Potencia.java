//Zenildo Nhabomba I12
//Imprimi a potencia de um numero

import java.util.Scanner;
class Potencia{
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);

		int mult=1;
		int contador=0;
		int numero=2;
		int potencia=6;

		while(contador<potencia){
			mult=mult*numero;
			contador=contador+1;
		}
		System.out.println(mult);
	}
}

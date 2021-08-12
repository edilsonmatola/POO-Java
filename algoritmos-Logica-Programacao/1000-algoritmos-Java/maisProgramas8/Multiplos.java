//Chelsea Manjate I11
//Imprimi os multiplos positivos de um numero lido por teclado inferiores a 1000;


import java.util.Scanner;


public class Multiplos{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Caro cliente insira o numero");
		int numero=input.nextInt();

		for (int i=1;i<=numero;i++) {
				do{
					if(numero%i==0){
						System.out.println("Os multiplos de "+numero+" sao: "+i+" e "+numero);break;
					}
				}while(i>0);
		}			
	}
}
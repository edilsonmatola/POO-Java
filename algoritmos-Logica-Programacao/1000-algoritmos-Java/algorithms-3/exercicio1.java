import java.util.Scanner;
public class Exercicio1{
	public static void main(String args[]){
		float maior, num;
		int count=2; 
		int soma = 0;
		Scanner entrada = new Scanner(System.in);
 
		System.out.print("Numero 1: ");
		num = entrada.nextFloat();
		maior = num;
 
		do{
			System.out.print("Numero " + count + ": ");
			num = entrada.nextFloat();
			soma += num;
 
			if(num > maior){
				maior = num;
			}
			count++;
		} while(num != 0);
		System.out.println("O maior numero digitado eh: "+maior);
		System.out.println("O valor da soma sera : " +soma);
 		
	}
}
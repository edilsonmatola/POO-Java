//Faca um progrma que imprima os multiplos positivos de 7, inferiores a 1000.

public class Multiplos{
	public static void main (String[]args){
		for (int i=1; i<1000; i++){
			if (7%i==0){
				System.out.println("E multiplo de 7" +i);
			}
		}
	}
}

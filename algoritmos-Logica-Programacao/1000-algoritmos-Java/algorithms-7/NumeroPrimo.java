import java.util.Scanner;
public class NumeroPrimo{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduza um numero: ");
		int a = in.nextInt();
		int count = 0;
		
		while(a < 100){
			count++;
			if(a % count == 0){
				System.out.print("É primo");
			}
			else{
				System.out.print("Não é primo");
			}
		}
	}
}
		
		
		
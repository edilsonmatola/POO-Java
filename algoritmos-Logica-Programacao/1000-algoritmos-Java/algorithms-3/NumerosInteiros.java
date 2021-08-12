import java.util.Scanner;

public class NumerosInteiros{
	public static void main(String[]args){
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero");
		int numero1=scan.nextInt();
		System.out.println("Enre com o segundo numero");
		int numero2=scan.nextInt();
		
		for (int i=numero1; i<=numero2; i++){
			System.out.println(i);
		}
	}
}

		
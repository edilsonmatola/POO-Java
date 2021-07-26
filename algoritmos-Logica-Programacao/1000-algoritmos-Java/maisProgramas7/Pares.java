import java.util.Scanner;

public class Pares {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int num;
		double soma = 0;
		double resto = 0;
		System.out.println("Introduza o numero: ");
		num = in.nextInt();
		while(num!=0) {
			resto = num%10;
			if(resto%2==0) {
				soma = soma+resto;
			}
			num = num/10;
		}
		System.out.println(soma);
	}

}

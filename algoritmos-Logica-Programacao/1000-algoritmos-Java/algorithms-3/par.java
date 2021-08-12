import java.util.Scanner;
import java.util.Arrays;

public class par{
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		double numero , soma=1;


		for(byte i=2;i<=20;i++){

			/*System.out.println("Digite o numero :->"+i);
			numero = ler.nextDouble();*/

			if(i%2 != 0){

				soma=soma+i;
			}

				
		}
			System.out.println(soma);
		}
}

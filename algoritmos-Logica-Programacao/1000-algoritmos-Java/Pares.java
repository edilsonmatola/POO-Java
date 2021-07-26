
import java.util.Scanner;

public class Pares{
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.println("Caro cliente insira o numero que pretende extrair os pares e impares");
		int numero=input.nextInt();

		for (int i=1;i<=numero;i++) {
			if(i%2==0){
				System.out.println("Par: "+i);
			}else{
				System.out.println("Impar: "+i);
			}
		}
	}
}
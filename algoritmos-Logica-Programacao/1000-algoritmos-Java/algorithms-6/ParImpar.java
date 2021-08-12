//Alberto Matola I13
//Este programa mostra os numeros pares e impares de um certo numero inserido pelo o ususario.
import java.util.Scanner;
public class ParImpar{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Insira um numero e conheca os seus pares e impares: ");
		int num=scan.nextInt();

		for (int i=1;i<=num;i++) {
			if(i%2==0){
				System.out.print("\nPar: "+i);
			}else{
				System.out.print("\nImpar: "+i);
			}
		}
	}
}
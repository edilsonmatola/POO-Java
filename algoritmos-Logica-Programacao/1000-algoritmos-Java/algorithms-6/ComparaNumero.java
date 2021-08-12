//Alberto Matola I13
/*Este programa compara dois numeros inseridos pelo o usuario.*/
import java.util.Scanner;
public class ComparaNumero{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		System.out.print("Digite o 1o numero: ");
		num1=scan.nextInt();
		System.out.print("Digite o 2o numero: ");
		num2=scan.nextInt();
		if (num1>num2){
			System.out.print("Maior: "+num1);
			System.out.print("Menor: "+num2);
		}
		else if (num1<num2) {
			System.out.print("Maior: "+num2);
			System.out.print("Menor: "+num1);
		}
		else {
			System.out.print("O numeros sao iguais!");
		}
	}
}
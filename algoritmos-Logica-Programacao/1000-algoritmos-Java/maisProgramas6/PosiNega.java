//Alberto Matola
//Este programa verifica se um numero e positivo ou negativo.
import java.util.Scanner;
public class PosiNega{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.print("Insira um numero: ");
		num=scan.nextInt();
		if (num>0) {
			System.out.print("Positivo.");
		}
		else{
			System.out.print("Negativo.");
		}
	}
}
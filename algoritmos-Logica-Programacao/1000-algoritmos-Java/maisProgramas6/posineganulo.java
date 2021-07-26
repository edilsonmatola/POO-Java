//Alberto Matola I13
/*Este programa verifica se um numero e positivo,negativo ou nulo*/
import java.util.Scanner;
public class posineganulo{
	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira um numero: ");
		num=scan.nextInt();
		if (num>0) {
			System.out.print("Positivo");
		}
		else if (num<0) {
			System.out.print("Negativo");
		}
		else{
			System.out.print("Nulo");
		}

	}
}
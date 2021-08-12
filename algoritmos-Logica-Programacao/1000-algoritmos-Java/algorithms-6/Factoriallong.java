//Alberto Matola I13
/*Este programa calcula factorial de um numero usando long*/
import java.util.*;
public class Factoriallong{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long f;
		long factorial=1;
		System.out.print("Insira o limite do factorial: ");
		f=scan.nextInt();
		for (int i=1;i<=f ;i++ ) {
			factorial=factorial*f;
			System.out.print("\nFactorial de "+f+": "+factorial);
		}
	}
}
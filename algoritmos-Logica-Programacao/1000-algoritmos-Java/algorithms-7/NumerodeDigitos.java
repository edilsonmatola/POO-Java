import java.util.Scanner;
public class NumerodeDigitos{
	public static void main(String[]args){
		int num, c=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Introduza um numero: ");
		num=in.nextInt();
		while(num!=0){
			num/=10;
			c++;
		}
		System.out.println("numero de digitos: "+c);
	}
}
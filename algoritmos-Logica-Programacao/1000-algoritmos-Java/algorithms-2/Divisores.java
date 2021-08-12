//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Divisores{
	public static void main(String[] args){
		int a;
		int divisor=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira o valor de a");
		a=teclado.nextInt();
		for(int i=1;i<=a;++i){
			if (a%i==0){
				divisor=i;
	System.out.println("Divisor:" + divisor);			
			}
		}
	}
}
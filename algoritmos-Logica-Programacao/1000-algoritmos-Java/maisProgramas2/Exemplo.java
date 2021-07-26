import java.util.Scanner;
public class Exemplo{
	public static void main (String[]args){
		Scanner k=new Scanner(System.in);
		double a,y;
		System.out.print("Introduza um numero");
		a=k.nextDouble();
		y=2*a;
		System.out.println("");
		System.out.println("Dobro do numero:"+y);
	}
}
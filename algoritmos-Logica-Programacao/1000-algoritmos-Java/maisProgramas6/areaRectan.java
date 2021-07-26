//Alberto Matola I13
/*Este programa calcula a area de um rectangulo*/
import java.util.Scanner;
public class areaRectan{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int c,l,area;
		System.out.print("Valor do cumprimento: ");
		c=scan.nextInt();
		System.out.print("\nValor da largura: ");
		l=scan.nextInt();
		area=c*l;
		System.out.print("\nArea do Rectangulo: "+area);
	}
}
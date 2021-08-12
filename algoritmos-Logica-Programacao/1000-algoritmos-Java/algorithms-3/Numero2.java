import java.util.Scanner;
public class Numero2{
	public static void main(String[]args){
		int n,x,i,y;
		x=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduza o numero de vezes");
		n=entrada.nextInt();
		for(i=1;i<=n;i++){
		System.out.println("Introduza umnumero");
		y=entrada.nextInt();
		x=x+y;
		}
		System.out.println(x);
	}
}
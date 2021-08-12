import java.util.Scanner;
import java.lang.Math;

public class Raizes {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double delta, x1, x2, resultado;
		System.out.println("Introduza o numero a: ");
		a = in.nextInt();
		System.out.println("Introduza o numero b: ");
		b = in.nextInt();
		System.out.println("Introduza o numero c: ");
		c = in.nextInt();
		delta = (b*b)-4*a*c;
		resultado = Math.sqrt(delta);
		if(a!=0) {
			if (resultado>0) {
				x1 = (-b+resultado)/(2*a);
				x2 = (-b-resultado)/(2*a);
				System.out.println("Raiz 1: "+x1+" Raize 2: "+x2);
			}
			else if(resultado==0) {
				x1 = (-b+resultado)/2*a;
				x2 = x1;
				System.out.println("As raizes sao iguas: "+x1);
			}
			else if(resultado<0) {
				System.out.println("Nao existem raizes");
			}
		}
		else {
			System.out.println("Coeficiente invalido");
		}
	}
}
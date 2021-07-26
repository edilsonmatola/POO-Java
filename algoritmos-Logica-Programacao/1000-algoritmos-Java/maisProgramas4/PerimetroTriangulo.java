import java.util.*;
public class PerimetroTriangulo{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Valor Do Lado");
		double lado=teclado.nextDouble();
		double perimetro=3*lado;
		System.out.println("O Perimetro do Triangulo e: "+perimetro);
	}
}
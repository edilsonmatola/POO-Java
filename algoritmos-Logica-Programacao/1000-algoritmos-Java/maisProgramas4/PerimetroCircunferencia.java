import java.util.*;
public class PerimetroCircunferencia{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Valor Do Raio");
		double raio=teclado.nextDouble();
		double perimetro=2*Math.PI*raio;
		System.out.println("O Perimetro da cinrcunferencia e: "+perimetro);
			
	}
}
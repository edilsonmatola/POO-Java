import java.util.*;
public class PerimetroRectangulo{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Valor Da Base");
		double base=teclado.nextDouble();
		System.out.println("Insira O Valor da Altura");
		double altura=teclado.nextDouble();
		double perimetro=(base*altura);
		System.out.println("O Perimetro do Rectangulo e: "+perimetro);
		
	}
}
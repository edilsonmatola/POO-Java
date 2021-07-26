import java.util.Scanner;
public class TesteArea{
	public static void main (String[]args){
		Scanner entrada=new Scanner(System.in);
		double base,altura,areaRectangulo;
		System.out.println("Insira o valor da base ");
		base=entrada.nextDouble();
		System.out.println("Insira o valor da altura ");
		altura=entrada.nextDouble();
		areaRectangulo=base*altura;
		System.out.println("area de um rectangulo "+areaRectangulo);

	}
}
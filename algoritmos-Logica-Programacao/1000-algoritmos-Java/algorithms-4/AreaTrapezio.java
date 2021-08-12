import java.util.*;
public class AreaTrapezio{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Valor Da Base Maior");
		double baseM=teclado.nextDouble();
		System.out.println("Insira O Valor da Base Menor");
		double basem=teclado.nextDouble();
		System.out.println("Insira O Valor da Altura");
		double altura=teclado.nextDouble();
		double area=((baseM+basem)/2)*altura;
		System.out.println("A Area do trapezio e: "+area);
			
	}
}
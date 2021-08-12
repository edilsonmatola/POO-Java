import java.util.*;
public class AreaLosangulo{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Valor Da Diagonal Maior");
		double diagM=teclado.nextDouble();
		System.out.println("Insira O Valor Da Diagonal Menor");
		double diam=teclado.nextDouble();
		double area=(diagM*diam)/2;
		System.out.println("A Area do Losangulo e: "+area);
		
	}
}
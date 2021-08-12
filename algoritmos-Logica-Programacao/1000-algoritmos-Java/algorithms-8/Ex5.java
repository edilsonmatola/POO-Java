import java.util.Scanner;
public class Ex5{
	public static void main(String [] args){
	Scanner in= new Scanner(System.in);
	System.out.println("Este e o programa do calculo da Energia Cinetica");
	System.out.println("Qual e a velocidade da particula?");
	float velocidade=in.nextFloat();
	System.out.println("____________________________________");
	
	System.out.println("Indique a massa da particula:");
	float massa=in.nextFloat();
	System.out.println("____________________________________");
	
	float energia=(massa*velocidade*velocidade)/2;
	System.out.println("Tido os dados, a energia cinetica sera: "+ energia+"J");
	}
}
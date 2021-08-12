//Alberto Matola
//Este programa calcula faz o calcula de energia cinetica.
import java.util.Scanner;
public class EnergCinetica{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Insira o valor da velocidade da particula: ");
	double velocidade=scan.nextDouble();
	System.out.println("Indique a massa da particula:");
	double massa=scan.nextDouble();
	double energia=(massa*velocidade*velocidade)/2;
	System.out.print("\nValor da Energia cinetica: "+ energia+"J");
	}
}
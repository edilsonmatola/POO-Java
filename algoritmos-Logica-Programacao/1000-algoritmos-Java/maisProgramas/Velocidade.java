//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Velocidade{
	public static void main(String args[]){
		System.out.println("Bem vindo ao sistema de conversão de velocidade em km/h para m/s.");
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira a velocidade em km/h:");
		double velocidade=teclado.nextDouble();
		System.out.println("A velocidade "+velocidade+"km/h equivalem a "+(velocidade/3.6)+"m/s");
	}
}
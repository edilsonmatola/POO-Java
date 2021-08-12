//Alberto Matola I13
// Este programa transforma kilograma para gramas.
import java.util.Scanner;
public class kgparaGrama{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double kg, gram;
		System.out.print("Insira o valor em Kilograma:");
		kg=scan.nextDouble();
		gram=kg*1000;
		System.out.print("O Valor em Grama(s) = "+gram+"g");
	}
}
//Criei um programa que transforma os precos decimais em numeros inteiros usando casting
import java.util.Scanner;
public class Preco{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		double preco = (int) in.nextDouble();
		int precoint = (int) preco;
		System.out.println(precoint);
		
	}
}
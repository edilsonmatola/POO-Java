//Eugenia Nhacuonga I11
import java.util.Scanner;
public class PesoIdeal{
	public static void main(String[] args){
		double altura;
		double metros;
		double pesoIdeal=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira a sua altura em cm:");
		altura=teclado.nextDouble();
		metros=altura/100;
		pesoIdeal=(72.7*metros)-58;
		System.out.print("O peso Ideal para a altura de "+metros+" e de:"+pesoIdeal);
	}
}

		
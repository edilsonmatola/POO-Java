//Alberto Matola I13
//Este programa converte valores em metros para centimetros.
import java.util.*;
public class MetrosCentimetros{
	public static void main(String[] args) {
		double metros,centimetros;
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira o valor em metros: \n");
		metros=scan.nextDouble();
		centimetros=metros*100;
		System.out.print("O valor em Centimetros: "+centimetros+"cm");
	}
}
//Zenildo Nhabomba I11
//Calcula a Hipotenusa(teorema de Pitagoras)

import java.util.Scanner;
public class Pitagoras{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro cateto: ");
		double cateto1=sc.nextDouble();

		System.out.println("Insira o segundo cateto: ");
		double cateto2=sc.nextDouble();

	
	//	double hipotenusa=sc.nextDouble();

		double hipotenusa=Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
		System.out.println("HipotenuHa: "+hipotenusa);

	}
}

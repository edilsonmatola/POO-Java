//Zenildo Nhabomba I12
//Calcula a raiz quadrada de um numero

import java.util.Scanner;
public class RaizQuadrada{
	public static void main(String[] args){
		Raizquadrada();
	}
	public static void Raizquadrada(){
	double x;
	Scanner input = new Scanner(System.in);
	System.out.println("Introduza o numero que pretenda calcular a raiz quadrada:");
	x = input.nextDouble();
	double Raizquadrada = Math.sqrt(x);
	System.out.println("A raiz quadrada e: "+Raizquadrada);

}
}

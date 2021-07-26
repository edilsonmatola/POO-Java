 //Eugenia Nhacuonga I11
import java.util.Scanner;
public class Litros{
	public static void main(String[] args){
		int tempo;
		int velocidade;
		int distancia=0;
		double litros;
		int distPorLit=12;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira o tempo de viagem:");
		tempo=teclado.nextInt();
		System.out.print("Insira a velocidade do carro:");
		velocidade=teclado.nextInt();
		distancia=tempo*velocidade;
		litros=distancia/distPorLit;
	System.out.print("A quantidade de litros gasto e:" + litros);
	}
}
		
		
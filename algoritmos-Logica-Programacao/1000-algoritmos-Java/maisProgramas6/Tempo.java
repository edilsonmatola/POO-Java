//Alberto Edilson Matola Turma I13 
//Este programa transforma o tempo dado em minutos para segundos.
import java.util.*;
public class Tempo{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double min,resultado;
		System.out.print("Insira o valor do tempo em minutos: ");
		min=scan.nextDouble();
		resultado=min*60;
		System.out.print("Tempo em segundos = "+resultado+"segundos");
	}
}
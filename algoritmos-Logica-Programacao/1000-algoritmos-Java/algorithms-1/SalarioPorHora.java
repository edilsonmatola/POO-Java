//Zenildo Nhabomba I12
import java.util.Scanner;
public class SalarioPorHora{
	public static void main(String[] args){
		int salarioHora, horas, salarioFinal=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira o valor ganho por hora:");
		salarioHora=teclado.nextInt();
		System.out.print("Insira o numero de horas trabalhadas no mes:");
		horas=teclado.nextInt();
		salarioFinal=salarioHora*horas;
		System.out.print("O salario ganho pelas "+ horas + " horas trabalhadas no mes sera de:"+salarioFinal);
	}
}
		
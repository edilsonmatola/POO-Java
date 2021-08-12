//Zenildo Turma I12
import java.util.Scanner;
public class TestaSomar{

	public static void main (String[]args){

		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira um numero");
		double a=entrada.nextDouble();
		System.out.println("Insira mais um numero");
		double b=entrada.nextDouble();
		double soma=0;
		for(double i=a;i<=b;i++){
			soma=soma+a;
		}
		System.out.println("A soma dos numeros compreendidos entre "+a+" e "+b+ " e "+soma);
	}
}
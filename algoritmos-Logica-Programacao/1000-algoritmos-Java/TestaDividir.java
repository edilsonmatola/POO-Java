//Zenildo Nhantumbo Turma I12
import java.util.Scanner;
public class TestaDividir{

	public static void main (String[]args){
		Scanner entrada=new Scanner(System.in);
		double a,b;
		System.out.println("Introduza o primeiro numero");
		a=entrada.nextDouble();
		do{
		System.out.println("Introduza o segundo numero");
		b=entrada.nextDouble();
	}while(b==0);
	double divisao=a/b;
	System.out.println("Resultado="+divisao);

	}
}
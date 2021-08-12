//Alberto Matola I13
/*Este programa calcula o salario semanal de um trabalhador com base nas horas que trabalha
e no pagamento por hora que recebe.*/
import java.util.Scanner;
public class horaTrabalho{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int hora;
		double pag,salario;
		System.out.print("Quantas horas trabalha por dia? : ");
		hora=scan.nextInt();
		System.out.print("\nQuanto recebe por dia? : ");
		pag=scan.nextDouble();
		salario=(hora*pag)*7;
		System.out.print("\nSalario Semanal: "+salario);
	}
}
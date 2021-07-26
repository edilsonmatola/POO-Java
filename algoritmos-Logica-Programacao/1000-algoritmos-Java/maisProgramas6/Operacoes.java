//Alberto Matola
//Calculadora basica
import java.util.Scanner;
public class Operacoes{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int opcao,multi,div,soma,sub,num1,num2;
		System.out.print("Escolhe a operacao que deseja:\n1-Multiplicacao\n2-Divisao\n3-Soma\n4-Subtracao");
		opcao=scan.nextInt();
		if (opcao==1) {
			System.out.print("Insira um numero:");
			num1=scan.nextInt();
			System.out.print("O outro numero:");
			num2=scan.nextInt();
			multi=num1*num2;
			System.out.print("O valor da Multiplicacao:"+multi);
		}

		else if (opcao==2) {
			System.out.print("Insira um numero:");
			num1=scan.nextInt();
			System.out.print("O outro numero:");
			num2=scan.nextInt();
			div=num1/num2;
			System.out.print("O valor da Divisao:"+div);
		}

		else if (opcao==3) {
			System.out.print("Insira um numero:");
			num1=scan.nextInt();
			System.out.print("O outro numero:");
			num2=scan.nextInt();
			soma=num1+num2;
			System.out.print("O valor da Multiplicacao:"+soma);
		}

		else if (opcao==4) {
			System.out.print("Insira um numero:");
			num1=scan.nextInt();
			System.out.print("O outro numero:");
			num2=scan.nextInt();
			sub=num1-num2;
			System.out.print("O valor da Multiplicacao:"+sub);
		}

		else {
			System.out.print("Insira uma opcao valida!");
		}
	}
}
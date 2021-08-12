import java.util.Scanner;
public class CalculadoraSimples{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2,opcao;
		double resultado;
		System.out.print("Digite: \n1-Adicao\n2-Subtracao\n3-Divisao\n4-Multiplicacao\nOpcao: ");
		opcao=scan.nextInt();
		System.out.print("Insira o primeiro numero: ");
		num1=scan.nextInt();
		System.out.print("Insira o segundo numero: ");
		num2=scan.nextInt();
			switch (opcao) {
				case 1: resultado=num1+num2;
					System.out.print("Resultado: "+resultado);
				break;
				case 2: resultado=num1-num2;
					System.out.print("Resultado: "+resultado);
				break;
				case 3: resultado=num1/num2;
					System.out.print("Resultado: "+resultado);
				break;
				case 4: resultado=num1*num2;
					System.out.print("Resultado: "+resultado);
				break;
				default:
					System.out.print("Escolha fora do parametro!");
				break;
			}
		}
	}
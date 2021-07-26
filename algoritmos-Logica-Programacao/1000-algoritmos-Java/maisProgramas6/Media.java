//Alberto Matola I13
/*Este programa calcula a media de 3 numeros usando o metodo*/
import java.util.Scanner;
public class Media{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira o primeiro numero: ");
		double num1=scan.nextDouble();
		System.out.print("\nInsira o segundo numero: ");
		double num2=scan.nextDouble();
		System.out.print("\nInsira o Terceiro numero: ");
		double num3=scan.nextDouble();
		System.out.print("A media: "+media(num1, num2, num3)+"\n");

	}
	public static double media(double num1, double num2, double num3){

			return (num1+num2+num3)/3;
		}
}
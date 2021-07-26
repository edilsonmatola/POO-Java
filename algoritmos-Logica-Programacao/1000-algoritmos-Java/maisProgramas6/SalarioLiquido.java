import java.util.Scanner;
public class SalarioLiquido{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double si,sf,acrescimo;
		int ncolchoes;
		System.out.println("Quantos colchoes vendeu? :");
		ncolchoes=scan.nextInt();
		si=7000;
		sf=ncolchoes*7500;
		acrescimo=sf*0.006;
		sf=si+acrescimo;
		System.out.println("Salario inicial: "+si);
		System.out.print("Salario final: "+sf);
	}
}
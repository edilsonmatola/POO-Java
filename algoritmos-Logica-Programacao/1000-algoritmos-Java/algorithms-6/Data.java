//Alberto Matola I13
/*Este programa*/
import java.util.Scanner;
public class Data{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int opcao,data,mes,dia,ano;
		System.out.print("Insira o dia: ");
		dia=scan.nextInt();
		if (dia<0 && dia>31) {
			System.out.print("\nInsira um numero do dia valido, entre 1 a 31: ");
			dia=scan.nextInt();
		}
		dia=scan.nextInt();
		System.out.print("Insira o mes: ");
		mes=scan.nextInt();
		if (mes<0&& mes>12) {
			System.out.print("\nInsira um mes valido, entre 1 a 12: ");
			mes=scan.nextInt();
		}
		System.out.print("Insira o ano: ");
		ano=scan.nextInt();
		System.out.print("Que formato deseja?\n1 - Dia/Mes/Ano\n2- Mes/Dia/Ano\n3- Ano/Mes/Dia: ");
		opcao=scan.nextInt();
		if (opcao==1) {
			System.out.print("\n"+dia+"/"+mes+"/"+ano);
		}
		else if (opcao==2) {
			System.out.print("\n"+mes+"/"+dia+"/"+ano);
		}
		else {
			System.out.print("\n"+ano+"/"+mes+"/"+ano);
		}
	}
}
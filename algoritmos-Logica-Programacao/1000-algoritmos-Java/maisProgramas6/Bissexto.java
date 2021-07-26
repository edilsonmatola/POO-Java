// Alberto Matola I13
//Este programa verifica se o ano e bissexto ou Nao.
import java.util.Scanner;
public class Bissexto{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira o ano: ");
		int ano=scan.nextInt();

		if(ano%4==0 && ano%100!=0 || ano%400==0){
			System.out.print(ano+" Bissexto.");
		}else{
			System.out.println(ano+" Nao e Bissexto.");
			scan.close();
		}
	}
}
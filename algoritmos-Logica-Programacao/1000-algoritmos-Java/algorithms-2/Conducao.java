//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Conducao{
	public static void main(String[] args){
		int AnoNasc;
		int AnoAct;
		int idade=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira o ano do seu nascimento:");
		AnoNasc=teclado.nextInt();
		System.out.println("Insira o ano actual:");
		AnoAct=teclado.nextInt();
		idade=AnoAct-AnoNasc;
		if (idade>=18){
			System.out.print("Parabens, pode tirar a sua carta de conducao.");
		}
		else{
			idade=18-idade;
			System.out.print("Lamentamos, mas faltam " +idade+ "ano para poder tirar a tua carta de conducao");
		}
	}
}
		
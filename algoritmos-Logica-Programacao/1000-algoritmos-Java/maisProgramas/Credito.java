//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Credito{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira o saldo medio");
		int saldoMed=teclado.nextInt();;
		double credito=0;
		if (saldoMed<=200){
			System.out.println("Nao tem credito");
		}
		else if (saldoMed<=400){
			credito=saldoMed*0.2;
			System.out.println("Valor do saldo sera de:"+credito);
		}
		else if (saldoMed<=600){
            credito=saldoMed+0.3;
            System.out.println("O credito sera:"+credito);
		}
		credito=saldoMed*0.4;
		 System.out.println("O credito sera:"+credito);
	}
}
//Eugenia Nhacuonga I11
import java.util.Scanner;
public class NAlgarismos{
	public static void main(String args[]){
		System.out.println("Bem vindo ao sistema de inversao dos numeros!");
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira o numero : ");
		int numero=teclado.nextInt();
		int resto,n=numero;
		double p;
		String inverso= " ";
		do{
			resto=n%10;
			p=n/10;
			inverso+=""+resto;
			n=(int)p;
		}while(p!=0);
		System.out.println("O inverso de "+numero+" : "+inverso);
	}
}
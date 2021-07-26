 //Eugenia Nhacuonga I11
import java.util.Scanner;
public class Multiplos{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira o numero em que deseja calcular o seu multiplo");
		int n=teclado.nextInt();
		System.out.println("Insira o inicio do intervalo");
		int a=teclado.nextInt();
		System.out.println("Insira o fim do intervalo");
		int b=teclado.nextInt();
		System.out.println("Multiplos de "+n+" sao: ");
		for(int i=a; i<=b; i++){
			if(i%n==0){
				System.out.print(i+", ");
			}
		}
	}
}
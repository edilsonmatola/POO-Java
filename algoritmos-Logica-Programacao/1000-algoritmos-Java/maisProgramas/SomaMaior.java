//Eugenia Nhacuonga I11
import java.util.Scanner;
public class SomaMaior{
	public static void main(String[] args){
		int a;
		int b;
		int c;
		int soma=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira um numero:");
		a=teclado.nextInt();
		System.out.print("Insira um numero:");
		b=teclado.nextInt();
		System.out.print("Insira um numero:");
		c=teclado.nextInt();
		soma=a+b;
		if(soma>c){
			System.out.print("A soma e maior que o terceiro numero digitado");
		}
		if(soma<c){
			System.out.print("A soma e menor que o terceiro numero digitado");
		}
		if(soma==c){
			System.out.print("A soma e igual que o terceiro numero digitado");
		}
	}
}

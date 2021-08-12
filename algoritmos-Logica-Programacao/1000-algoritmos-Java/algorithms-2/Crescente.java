//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Crescente{
	public static void main(String[] args){
		int a;
		int b;
		int c;
		Scanner teclado= new Scanner(System.in);
		System.out.print("Insira um numero:");
		a=teclado.nextInt();
		System.out.print("Insira um numero:");
		b=teclado.nextInt();
		System.out.print("Insira um numero:");
		c=teclado.nextInt();
		if(a>b && b>c){
			System.out.print(c+","+b+","+a);
		}
		if(a<b && b<c){
			System.out.print(a+","+b+","+c);
		}
		if(a>c && c>b){
			System.out.print(b+","+c+","+a);
		}
		if(a<c && c<b){
			System.out.print(a+","+c+","+b);
		}
		if(c<a && c<b){
			System.out.print(c+","+a+","+b);
		}
		if(b<a && a<c){
			System.out.print(b+","+a+","+c);
		}
	}
}
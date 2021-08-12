//Alberto Matola I13
//Este programa ordena 3 numeros inseridos pelo o usuario em ordem decrescente.
import java.util.Scanner;
public class Decrescente{
	public static void main(String[] args){
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira o primeiro numero:");
		a=scan.nextInt();
		System.out.print("Insira o segundo numero:");
		b=scan.nextInt();
		System.out.print("Insira o terceiro numero:");
		c=scan.nextInt();
		if(a>b && b>c){
			System.out.print(a+","+b+","+c);
		}
		if(a<b && b<c){
			System.out.print(c+","+b+","+a);
		}
		if(a>c && c>b){
			System.out.print(a+","+c+","+b);
		}
		if(a<c && c<b){
			System.out.print(b+","+c+","+a);
		}
		if(c<a && c<b){
			System.out.print(b+","+a+","+c);
		}
		if(b<a && a<c){
			System.out.print(c+","+a+","+b);
		}
	}
}
 //Eugenia Nhacuonga I11
import java.util.Scanner;
public class MaiorTres{
	public static void main(String[] args){
		int n;
		int a;
		int v;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira o primeiro valor:");
		n=teclado.nextInt();
		System.out.print("Insira o segundo valor:");
		a=teclado.nextInt();
		System.out.print("Insira o terceiro valor:");
		v=teclado.nextInt();
		if(n>a && a>v){
			System.out.print("O maior valor e:"+n);
		}
		else if(n<a && a<v){
			System.out.print("O maior valor e:"+v);
		}
		else{
			System.out.print("O maior valor e:"+a);
		}
	}
}
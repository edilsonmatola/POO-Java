//Zenildo Nhabomba I12
import java.util.Scanner;
public class QuadradoQuarto{
	public static void main(String args[]){
		System.out.println("Bem vindo ao sistema de calculo do quadrado do quarto de um numero.");
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira um numero: ");
		double numero=teclado.nextInt();
		System.out.println("O quadrado do quarto de "+numero+" e:"+Math.pow((numero/4),2));
	}
}
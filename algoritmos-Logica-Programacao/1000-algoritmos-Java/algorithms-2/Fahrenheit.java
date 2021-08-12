//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Fahrenheit{
	public static void main(String[] args){
		double c,f=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira uma temperatura em graus celsius:");
		c=teclado.nextDouble();
		f=(9*c+160)/5;
		System.out.print("A temperatura convertida para fahrenheit e:"+f);
	}
}
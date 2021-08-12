 //Eugenia Nhacuonga I11
import java.util.Scanner;
public class Maiuscula{
	public static void main(String[] args){
		String palavra="";
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira uma palavra:");
		palavra=teclado.next();
		palavra=palavra.toUpperCase();
		System.out.print(palavra);
	}
}
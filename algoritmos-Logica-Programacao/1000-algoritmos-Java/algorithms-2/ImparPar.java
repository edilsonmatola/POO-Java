 //Eugenia Nhacuonga I11
import java.util.Scanner;
public class ImparPar{
	public static void main(String[] args){
		int numero;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira o um numero inteiro:");
		numero=teclado.nextInt();
		if (numero%2==0){
			System.out.print("O Numero " +numero+ " e par");
		}
		else{
			System.out.print("O Numero " +numero+ " e impar");
		}
	}
}
			
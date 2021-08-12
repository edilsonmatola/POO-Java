//Alberto Matola I13
/*Este programa recebe um conjunto de letras e retorna o mesmo mas o seu inverso
Ex: Eddy, ira mostrar yddE*/
import java.util.Scanner;
public class CaracteresReverse{
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Insira os caracteres e veja-os invertidos: ");
			char[] letras=scan.nextLine().toCharArray();
			System.out.print("Cadeia revertida: ");
			for (int i=letras.length-1;i>=0 ;i-- ) {
				System.out.print(letras[i]);
			}
			System.out.print("\n");
	}
}
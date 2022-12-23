
//Mack Banze
import java.util.Scanner;

public class AlturaIdeal {
	public static void main(String Args[]) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Insira o seu peso");
			String peso = teclado.nextLine();
			String altura = "";
			// StringTokenizer token=new StringTokenizer(dados,".");
			for (int i = 0; i < peso.length(); i++) {
				if (i == 0) {
					altura = peso.substring(i, i + 2);
				}
			}
			System.out.println("A sua altura ideal e: 1." + altura + "metros");
		}
	}
}
//Alberto Matola I13
/*Este programa verifica os dias que o usuario ja viveu*/
import java.util.*;
public class Viveu{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira a sua idade: ");
		int idade=scan.nextInt();
		int life=idade*365;
		System.out.print("\nVoce ja viveu: "+life+"dias");
	}
}
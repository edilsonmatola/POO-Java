import javax.swing.JOptionPane;
import java.util.*;
public class AntecessorSucessor{
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Insira o numero em que deseja saber o seu antecessor e sucessor: ");
		int numero=teclado.nextInt();
		System.out.println("Antecessor do numero "+numero+" e: "+(numero-1));
		System.out.print("Sucessor do numero "+numero+" e: "+(numero+1));
		JOptionPane.showMessageDialog(null,"Volte Sempre!");
	}
}
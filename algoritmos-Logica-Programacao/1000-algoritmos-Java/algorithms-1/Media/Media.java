import javax.swing.JOptionPane;
import java.util.*;
public class Media{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira Seu Nome");
		String nome=teclado.nextLine();
		System.out.println("Quantos Teste Fez?");
		int teste=teclado.nextInt();
		double media=0,nota=0;
		for (int i=0;i<teste ;i++ ) {
			System.out.println("Insere a "+(i+1)+" Nota");
			nota=nota+teclado.nextDouble();
		}
		media=nota/teste;
		System.out.println(media);
	JOptionPane.showMessageDialog(null,"Volte Sempre!");
	}
}
//Mack Banze
import java.util.*;
import javax.swing.JOptionPane;
public class Inverso{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduza Uma Sequecia de Caracteres");
		String palavra=teclado.nextLine();
		String inverso="";
		for (int i=palavra.length()-1;i>=0 ;i-- ) {
			inverso=inverso+palavra.charAt(i);	
		}
		System.out.println("O Inverso da palavra e: "+inverso);
		JOptionPane.showMessageDialog(null,"Seu Babaca");
	}
}
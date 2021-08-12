//Mack Banze
import java.util.*;
import javax.swing.JOptionPane;
public class Maior{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduza O Primeiro Nr");
		int num1=teclado.nextInt();
		System.out.println("Introduza O Segundo Nr");
		int num2=teclado.nextInt();
		if(num1>num2){
			System.out.println("O Maior numero e: "+num1);
			System.out.println("O Menor numero e: "+num2);

		}else{
		System.out.println("O Maior numero e: "+num2);
			System.out.println("O Menor numero e: "+num1);
		}
		JOptionPane.showMessageDialog(null,"Seu Babaca");
	}
}
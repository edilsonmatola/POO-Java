//Mack Banze
import java.util.*;
import javax.swing.JOptionPane;
public class Padaria{
	public static void main(String args[]){
		int quantidade=0,total=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("**********************");
		System.out.println("1-Paezinho=7mt");
		System.out.println("2-Pao Comprido=10mt");
		System.out.println("3-Pao de forma=75mt");
		System.out.println("**********************");
		System.out.println("Insira a opcao desejada");
		int opcao=teclado.nextInt();
		switch(opcao){
			case 1:
			System.out.println("Inisra a quantidade de paezinhos");
			quantidade=teclado.nextInt();

			total=quantidade*7;
			System.out.println("Quantidade de paezinhos: "+quantidade);
			System.out.println("O total a pagar e: "+total);break;
			case 2:
			System.out.println("Inisra a quantidade de paes Cumpridos");
			quantidade=teclado.nextInt();

			total=quantidade*10;
			System.out.println("Quantidade de paes Compridos: "+quantidade);
			System.out.println("O total a pagar e: "+total);break;
			case 3:
			System.out.println("Inisra a quantidade de paes de forma");
			quantidade=teclado.nextInt();

			total=quantidade*75;
			System.out.println("Quantidade de paes de forma: "+quantidade);
			System.out.println("O total a pagar e: "+total);break;

			default:System.out.println("A Opcao Desejada Nao Existe! Favor de escolher uma opcao disponivel");


		}
		//JOptionPane.showMessageDialog(null,"Adeus");
	}
}
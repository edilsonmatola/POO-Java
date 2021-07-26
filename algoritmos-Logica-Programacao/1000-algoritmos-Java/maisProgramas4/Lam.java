import javax.swing.JOptionPane;
import java.util.*;
import java.util.Random;
public class Lam{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduza O Nome");
		String nome=teclado.nextLine();
		System.out.println("Destinos Disponiveis");
		System.out.println("1-Inhambane");
		System.out.println("2-Beira");
		System.out.println("3-Chimoio");
		System.out.println("4-Nampula");
		System.out.println("5-Quelimane");
		System.out.println("Escolha A Opcao");
		int opcao=teclado.nextInt();
		switch(opcao){
			case 1:
			System.out.println("Horas De Voo: 1h45Min");
			System.out.println("Preco Por Pessoa: 3,699.00MT");
			break;
			case 2:
			System.out.println("Horas De Voo: 3h45Min");
			System.out.println("Preco Por Pessoa: 5,699.00MT");
			break;
			case 3:
			System.out.println("Horas De Voo: 6h45Min");
			System.out.println("Preco Por Pessoa: 6,699.00MT");
			break;
			case 4:
			System.out.println("Horas De Voo: 7h45Min");
			System.out.println("Preco Por Pessoa: 5,699.00MT");
			break;
			case 5:
			System.out.println("Horas De Voo: 8h45Min");
			System.out.println("Preco Por Pessoa: 6,699.00MT");
			break;
			default: System.out.println("Voo Indisponivel");
		}
		JOptionPane.showMessageDialog(null,"Volte Sempre!  "+nome);
	}
}
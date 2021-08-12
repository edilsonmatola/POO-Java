import java.util.*;
import javax.swing.JOptionPane;
public class Cambio{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		double compra=0, venda=0;
		System.out.println("Introduza O Montante Que Deseja");
		double montante=teclado.nextDouble();
		System.out.println("Moedas Disponiveis");
		System.out.println("1-Dollar");
		System.out.println("2-Randes");
		System.out.println("3-Euros");
		System.out.println("4-Libras");
		System.out.println("Escolha A Opcao Desejada");
		int opcao=teclado.nextInt();
		switch (opcao) {
			case 1:
				compra=montante*59.85;
				venda=montante*61.05;
				System.out.println("A Compra: "+compra);
				System.out.println("A Venda: "+venda);break;
			case 2:
			compra=montante*4.16;
				venda=montante*4.24;
				System.out.println("A Compra: "+compra);
				System.out.println("A Venda: "+venda);break;
			case 3:
			compra=montante*69.25;
				venda=montante*70.63;
				System.out.println("A Compra: "+compra);
				System.out.println("A Venda: "+venda);break;
			case 4:
			compra=montante*78.70;
				venda=montante*80.28;
				System.out.println("A Compra: "+compra);
				System.out.println("A Venda: "+venda);break;
			
			default: System.out.println("Moeda Indisponivel Na Minha Casa De Cambios");
			
		}

		JOptionPane.showMessageDialog(null,"Volte Sempre!");
	}
}
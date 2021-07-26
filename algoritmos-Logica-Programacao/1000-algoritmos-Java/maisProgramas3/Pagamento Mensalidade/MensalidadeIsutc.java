import javax.swing.JOptionPane;
import java.util.*;
public class MensalidadeIsutc{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira A Entidade");
		int entidade=teclado.nextInt();
		System.out.println("Insira A Referencia");
		int referencia=teclado.nextInt();
		System.out.println("Insira O Montante");
		double montante=teclado.nextDouble();
		Random sald=new Random();
		int saldo=0;
		for (int i=0;i<1 ;i++ ) {
			saldo=sald.nextInt();
		}
		if(saldo<montante){
			System.out.println("Sem Sucesso! Saldo Indisponivel");
		}else{
			System.out.println("Pagamentos Efectuados Com Sucesso!");
		}
		System.out.println(saldo);
	JOptionPane.showMessageDialog(null,"Volte Sempre!");
	}
}
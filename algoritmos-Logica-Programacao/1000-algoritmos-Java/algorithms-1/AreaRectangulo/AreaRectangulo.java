import java.util.*;
import javax.swing.JOptionPane;
public class AreaRectangulo{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Valor Da Base");
		double base=teclado.nextDouble();
		System.out.println("Insira O Valor da Altura");
		double altura=teclado.nextDouble();
		double area=(base*altura);
		System.out.println("A Area do Rectangulo e: "+area);
			JOptionPane.showMessageDialog(null,"Volte Sempre!");
	}
}
import java.util.*;
import javax.swing.JOptionPane;
public class AreaCircunferencia{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Valor Do Raio");
		double raio=teclado.nextDouble();
		double area=2*Math.PI*raio;
		System.out.println("A Area da cinrcunferencia e: "+area);
	    System.out.println("Volte Sempre!");
	}
}
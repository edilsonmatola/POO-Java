import java.util.*;
import javax.swing.JOptionPane;
public class AreaCircunferencia{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira o Valor do raio: ");
		double raio=scan.nextDouble();
		double area=2*3.14*raio;
		System.out.print("Area da circunferencia: "+area);
		scan.close();
	}
}
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;
public class solidao{
	public static void main(String[]args){
		
Scanner entrada=new Scanner(System.in);
           int n;
		
		int a,b,c,d;
System.out.println("                  ConversãoTemperatura ");
System.out.println("              1-Grau Celsius Para  Celsius");
System.out.println("\n");
System.out.println("              2-Grau Fahrenheit para  CKelven");
System.out.println("\n");
System.out.println("              3-Grau Celsius para Fahrenheit");
System.out.println("\n");
System.out.println("              4-Grau Celsius para Celsius");
System.out.println("\n");
System.out.println("              Escolha a opcao para converter");
n=entrada.nextInt();
                   
	switch(n){
		case 1:
		System.out.println("introduza o dado em graus Celsuius");
		c=entrada.nextInt();
		int	K=c+273;
		do{
		c=c;	
		}while(c!=c);
	JOptionPane.showMessageDialog(null, "Hola mundo!!!");
	
				System.out.println("         K="+K );
		break;
		case 2:
		System.out.println("Fevereiro");
		break;
		case 3:
		System.out.println("Marco");
		break;
		case 4:
		System.out.println("Testando");
		default:
		System.out.println("Opcao errada tente Novamnte.....!");
	}
	}
}

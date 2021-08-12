import java.util.Scanner;
public class Radioactivo{
	public static void main(String[]args){
			Scanner scan=new Scanner(System.in);
		System.out.println("Insira a massa inicial em gramas:");
		float massa=scan.nextFloat();
		double tempo=(0.04*50)/(massa/2);
		System.out.println("O tempo necessario para que essa massa se torne menor que 0.05 e:" +tempo);
	}
}

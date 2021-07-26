import javax.swing.JOptionPane;
import java.util.Scanner;
public class DiasMes{
	public static void main(String args[]){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de ilustracao de dias de cada mes!");
		System.out.println("Insira o ano: ");
		int ano=teclado.nextInt();
		if(ano%4==0){
			System.out.println("Insira o numero do mes desejado: ");
			int x=teclado.nextInt();
			System.out.println();
			switch(x){
				case 1:System.out.println("Janeiro, 31 dias");break;
				case 2:System.out.println("Fevereiro, 29 dias");break;
				case 3:System.out.println("Março, 31 dias");break;
				case 4:System.out.println("Abril, 30 dias");break;
				case 5:System.out.println("Maio, 31 dias ");break;
				case 6:System.out.println("Junho, 30 dias");break;
				case 7:System.out.println("Julho, 31 dias");break;
				case 8:System.out.println("Agosto, 31 dias");break;
				case 9:System.out.println("Setembro, 30 dias");break;
				case 10:System.out.println("Outubro, 31 dias");break;
				case 11:System.out.println("Novembro, 30 dias");break;
				case 12:System.out.println("Dezembro, 31 dias");break;
				default:System.out.println("Insira entre 1 a 12");break;
			}

		}
		else{
			System.out.println("Insira o numero do mes desejado: ");
			int y=teclado.nextInt();
			System.out.println();
			switch(y){
				case 1:System.out.println("Janeiro, 31 dias");break;
				case 2:System.out.println("Fevereiro, 28 dias");break;
				case 3:System.out.println("Março, 31 dias");break;
				case 4:System.out.println("Abril,30 dias");break;
				case 5:System.out.println("Maio, 31 dias ");break;
				case 6:System.out.println("Junho, 30 dias");break;
				case 7:System.out.println("Julho, 31 dias");break;
				case 8:System.out.println("Agosto, 31 dias");break;
				case 9:System.out.println("Setembro, 30 dias");break;
				case 10:System.out.println("Outubro, 31 dias");break;
				case 11:System.out.println("Novembro, 30 dias");break;
				case 12:System.out.println("Dezembro, 31 dias");break;
				default:System.out.println("Insira entre  1 a 12");break;
			}
		}
		JOptionPane.showMessageDialog(null,"Volte Sempre!");	
	}
}
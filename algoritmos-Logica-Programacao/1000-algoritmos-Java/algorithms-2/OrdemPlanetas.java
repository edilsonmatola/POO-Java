//Eugenia Nhacuonga I11
import java.util.Scanner;
public class OrdemPlanetas{
	public static void main(String[] args){
		int OrdemPlanetas=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira o numero da posicao do planeta:");
		OrdemPlanetas=teclado.nextInt();
		switch(OrdemPlanetas){
		case 1:System.out.println("Mercurio");break;
		case 2:System.out.println("Venus");break;
		case 3:System.out.println("Terra");break;
		case 4:System.out.println("Marte");break;
		case 5:System.out.println("Jupiter");break;
		case 6:System.out.println("Saturno");break;
		case 7:System.out.println("Uranio");break;
		case 8:System.out.println("Neptuno");break;
		case 9:System.out.println("Plutao");break;
		default:System.out.println("numero invalido: Insira numero de 1-9");
		}
	}
}
		
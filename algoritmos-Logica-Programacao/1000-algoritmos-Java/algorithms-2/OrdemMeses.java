//Eugenia Nhacuonga I11
import java.util.Scanner;
public class OrdemMeses{
	public static void main(String[] args){
		int OrdemMeses=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira o numero do mes:");
		OrdemMeses=teclado.nextInt();
		switch(OrdemMeses){
		case 1:System.out.print("Janeiro");break;
		case 2:System.out.print("Fevereiro <3");break;
		case 3:System.out.print("Marco");break;
		case 4:System.out.print("Abril");break;
		case 5:System.out.print("Maio");break;
		case 6:System.out.print("Junho");break;
		case 7:System.out.print("Julho");break;
		case 8:System.out.print("Agosto");break;
		case 9:System.out.print("Setembro");break;
		case 10:System.out.print("Octubro");break;
		case 11:System.out.print("Novembro");break;
		case 12:System.out.print("Dezembro");break;
		default:System.out.println("OPCCAO INVALIDA: Insira numero entre 1-12");
		}
}
}

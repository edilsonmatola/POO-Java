//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Resultados{
	public static void main(String args[]){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de controle de medias!");
		System.out.println(" ");
		System.out.println("Introduza o nome:");
		String nome= teclado.nextLine();
		int numero=0;
		do{
				System.out.println("Introduza o numero de avaliacoes maior ou igual a 3:");
				numero= teclado.nextI;
		}while(numero<3);
		double avaliacao=0;
		double media;
		for(int i=1; i<numero+1; i++){
			System.out.println("Introduza a avaliacao "+i+":");
			double nota= teclado.nextDouble();
			avaliacao= avaliacao+nota;
		}
		media=avaliacao/numero;
		if(media>=10){
			System.out.println(nome+" Aprova com a media "+media);
		}
		else{
			System.out.println(nome+" Reprova com a media "+media);
		}
	}
}
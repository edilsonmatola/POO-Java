 //Eugenia Nhacuonga I11
import java.util.Scanner;
public class MediaResultado{
	public static void main(String[] args){
		int nota1;
		int nota2;
		int nota3;
		double media=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira a primeira nota: ");
		nota1=teclado.nextInt();
		System.out.print("Insira a segunda nota: ");
		nota2=teclado.nextInt();
		System.out.print("Insira a terceira nota: ");
		nota3=teclado.nextInt();
		media=(nota1+nota2+nota3)/3;
		if(media>14){
			System.out.println("Aluno aprovado com media: "+media);
		}
		else if(media<10){
			System.out.println("Aluno Reprovadocom media: "+media);
		}
		else if(media>=10 && media<14){
			System.out.println("O aluno devera realizar o exame, com media:"+media);
		}
	}
}
		
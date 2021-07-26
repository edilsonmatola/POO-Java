//Eugenia Nhacuonga I11
import java.util.Scanner;
public class QualquerFigura{
	public static void main(String args[]){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Insira o simbolo");
		String simbolo = teclado.nextLine();
		System.out.println("Insira o numero de linhas ");
		int linha= teclado.nextInt();
		System.out.println("Insira o numero de colunas");
		int coluna= teclado.nextInt();
		//i controlador para linhas
		//j controlador para colunas
		for(int i=0; i<linha; i++){
			System.out.println(simbolo);
			for(int j=0; j<coluna-1; j++){
				System.out.print(simbolo+" ");
			}	
		}	System.out.print(simbolo+" ");
	}
}
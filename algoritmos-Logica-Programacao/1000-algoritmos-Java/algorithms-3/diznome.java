import java.util.Scanner;

public class diznome{
	
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o numero");
		String nome = ler.nextLine();

		if(nome.length()<=5){
			System.out.println("Nome curto");
		}else{
			System.out.println("Nome Longo");
		}
	}
}
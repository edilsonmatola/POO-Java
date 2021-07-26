import java.util.Scanner;

public class comPala{
	
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o numero");
		int nome = ler.next();

		if(nome.length()>5){
			System.out.println("Nome curte");
		}else{
			System.out.println("Nome Longo");
		}
	}
}
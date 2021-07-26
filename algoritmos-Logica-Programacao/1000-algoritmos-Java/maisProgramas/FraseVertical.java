//Eugenia Nhacuonga I11
import java.util.Scanner;
public class FraseVertical{
	public static void main(String args[]){
		Scanner teclado= new Scanner(System.in);
		System.out.println();
		System.out.println("Bem Vindo ao sistema de impressap de uma frase para forma vertical");
		String opccao=" ";
		do{
			if(opccao.isEmpty()==false){
				System.out.println();
				System.out.println("Insira 1 para continuar");
				System.out.println("Insira enter para sair");
				System.out.println();
				System.out.println("Introduza a opcao desejada");
				opccao=teclado.nextLine();
				if(opccao.isEmpty()==false){
					System.out.println();
					System.out.println("Insira a frase: ");
					String frase=teclado.nextLine();
					char letra=' ';
					for(int i=0; i<frase.length(); i++){
						letra =frase.charAt(i);
						System.out.println("  "+letra);
					}
				}
			}
		}while(opccao.isEmpty()==false);
		if(opccao.isEmpty()==true){
			System.out.println("Volte Sempre!");	
		}
	}
}
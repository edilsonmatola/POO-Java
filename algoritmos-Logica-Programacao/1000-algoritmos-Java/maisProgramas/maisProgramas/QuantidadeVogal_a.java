//Eugenia Nhacuonga I11
import java.util.Scanner;
public class QuantidadeVogal_a{
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Insira a palavra");
		String palavra1=teclado.nextLine();
		String palavra=palavra1.toLowerCase();
		char vogal;
		int cont=0;
		for(int i=0; i<palavra1.length(); i++){
				vogal=palavra.charAt(i);
				if(vogal=='a'){
					cont++;
				}
			
		}
		if(cont==0){
			System.out.println("A palavra "+palavra1+" nao contem vogal(a).");
		}
		else if(cont>1){
			System.out.println("A palavra "+palavra1+" contem "+cont+" vogais(a).");
		}
		else{
			System.out.println("A palavra "+palavra1+" contem "+cont+" vogal (a).");
		}
	}
}
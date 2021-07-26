//Alberto Matola I13
//Este programa compara duas palavras inseridas pelo o usuario.
import java.util.Scanner;
public class CaracterIguais{
	public static void main(String[] args){
		String palavra1="";
		String palavra2="";
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira a primeira palavra: ");
		palavra1=scan.next();
		System.out.print("Insira a Segunda palavra: ");
		palavra2=scan.next();
		if(palavra1.equalsIgnoreCase(palavra2)){
			System.out.print("As palavras sao iguais.");
		}
		else{
			System.out.print("As palavras sao diferentes.");
		}
	}
}
		
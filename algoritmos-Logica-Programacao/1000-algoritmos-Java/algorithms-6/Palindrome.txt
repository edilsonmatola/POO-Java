
import java.util.Scanner;
public class Palindrome{
     public static void main(String [] args){

	    String nome="";
		String nomeInvertido="";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduza a palavra");
		nome=entrada.nextLine();
		 
		for(int i=nome.length()-1; i>=0 ; i--){

		    nomeInvertido = nomeInvertido+nome.charAt(i);
		}
		System.out.print(nomeInvertido);
		if(nomeInvertido.equals(nome)){
			   System.out.println(" A palavra e palindrome");
		}else{
			   System.out.println("A palavra nao e palindrome");
		}
	}
}
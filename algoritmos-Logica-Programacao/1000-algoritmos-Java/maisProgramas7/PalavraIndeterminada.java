import java.util.*;
public class PalavraIndeterminada{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		String palavra;
		do{
			System.out.print("insira a palavra: ");
			palavra=in.next();
			System.out.println("a primeira e ultima letra sao: " + palavra.charAt(0) + " " + palavra.charAt(palavra.length()-1));
			
		}while(!(palavra.startsWith("F")) || !(palavra.startsWith("f")));
		System.out.println("fim");
	}
}
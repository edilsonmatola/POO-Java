import java.util.Scanner;

public class Identidade{
	public static void main (String[]args){
		Scanner in=new Scanner (System.in);
		
		System.out.println("Introduza seu primeiro nome");
		String nome=in.next();
		int tamanho=nome.length();
		
		System.out.println("Introduza o seu apelido");
		String apelido=in.next();
		int estrutura=apelido.length();
		
		System.out.println("O tamanho da string e " +tamanho+ "caracteres");
		System.out.println("A estruturada string e " +tamanho+ "caracteres");
	}
}	
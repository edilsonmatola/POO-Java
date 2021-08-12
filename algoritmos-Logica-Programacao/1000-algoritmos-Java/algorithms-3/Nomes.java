import java.util.Scanner;

public class Nomes{
	public static void main (String[]args){
		Scanner input=new Scanner (System.in);
		
		System.out.println ("Qual e o seu primeiro nome");
		String primeiroNome=input.next();
		
		System.out.println("Qual e o seu ultimo nome");
		String ultimoNome=input.next();
		
		System.out.println("Qual e a sua idade");
		int idade=input.nextInt();
		
		System.out.println(" Ola " + primeiroNome + " " + ultimoNome + " de " + idade + " anos ");
	}
}

import java.util.Scanner;

public class Nomes{
	public static void main (String[]args){
		Scanner input=new Scanner (System.in);
		
		System.out.println ("Qual e o seu primeiro nome");
		String primeiroNome=input.next();
		
		System.out.println("Qual e o seu ultimo nome");
		String ultimoNome=input.next();
		
		System.out.println("Qual e seu ano de nascimento");
		int ano=input.nextInt();
		
		System.out.println(" Ola " + primeiroNome + " " + ultimoNome + " de " + (2018-ano )+ " anos ");
	}
}

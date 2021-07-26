import java.util.Scanner;
public class Motorista{
   public static void main(String[] args){

   	Scanner input = new Scanner(System.in);

   	System.out.println("Por favor insira os nomes dos motoristas");
	String nome1 = input.nextLine();
	String nome2 = input.nextLine();

	System.out.println("Por favor insira o ano de nascimento de "+nome1);
	int anonascimento1=input.nextInt();

	System.out.println("Por favor insira o ano de nascimento de "+nome2);
	int anonascimento2=input.nextInt();

	int anoactual=2018;

    int idade1 = anoactual-anonascimento1;
    int idade2 = anoactual-anonascimento2;
    System.out.println("Motorista: " + nome1);
    System.out.println("Idade: " +idade1);
    System.out.println("Motorista: " + nome2);
    System.out.println("Idade: " +idade2);
}
}
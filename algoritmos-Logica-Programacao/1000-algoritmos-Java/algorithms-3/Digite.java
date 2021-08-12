import java.util.Scanner;

public class Digite{
	public static void main (String[]args){
		Scanner input=new Scanner (System.in);
		
		System.out.println("Qual o seu nome");
		String nome=input.nextLine();
		
		System.out.println("Qual e a sua idade");
		int idade=input.nextInt();
		
		if (idade<1){
			System.out.println("Idade informada nao e valida");
		}else if (idade < 18){
			System.out.println(nome +"e menor de idade");
		}else{
			System.out.println(nome + "e maior de idade");
		}
	}
}

		
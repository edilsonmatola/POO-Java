//Chelsea Manjate I11
//Imprimi a esperanca de vida de um cidadao

import java.util.Scanner;
public class EsperancaVida{
	public static void main(String[] args){
		double idade;
		double prazo=200;
		double anodenascimento;
		double esperanca;

		Scanner input = new Scanner(System.in);

		System.out.println("introduza a idade");
		idade = input.nextDouble();

		System.out.println("introduza o ano de nascimento");
		anodenascimento = input.nextDouble();

		esperanca = (prazo - idade) *anodenascimento/(anodenascimento-1);
		System.out.println("A esperanca de vida eh: "+esperanca);

		if(esperanca >= 30){
			System.out.println("Disfrute mais a vida");
		}
		else{	
		System.out.println("Comece a procurar a Deus pelo menos, resta pouco tempo");
		}
	}
}
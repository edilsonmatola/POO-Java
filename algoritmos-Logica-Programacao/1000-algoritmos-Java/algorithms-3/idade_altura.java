import java.util.Scanner;

public class idade_altura{
	public static void main(String args[]){

	Scanner ler = new Scanner(System.in);
	/*Faca um programa java que recebe a idade e altura e
	 o peso de 10 pessoas, calcule e 
	mostre a quantidade de pessoes superior a 50, a media 
	das alturas das pessoas com idade entre 10 e 20 anos,
	 a percemtagem de pessoas com peso inferior a 40kg
	*/

	int indSup50,medentre2010;

	double somaid50 = 0;
	double somaid1020 = 0;
	double contid1020 = 0;

	double somapeso = 0;
	int contpeso = 0;

	double altura,peso,mediaaltura,percid;

	for (int s=0;s<5; s++) {

		System.out.println("Digite a Idade da "+s+ "Pessoa");
		int idade = ler.nextInt();

		System.out.println("Digite a Altura da "+s+ "Pessoa");
		altura = ler.nextDouble();

		System.out.println("Digite o peso da "+s+ "Pessoa");
		peso = ler.nextDouble();

		if(idade > 50){

			somaid50 = somaid50 + 1;
		}else{
			if(idade > 10 && idade < 20){

			contid1020 = contid1020 + 1;
			somaid1020 = somaid1020 + idade; 
		}
		}

		if (peso < 40) {
			
			contpeso = contpeso + 1;
			somapeso = somapeso + peso;
			
		}
		
	}

		mediaaltura = somaid1020/contid1020;

		double somp = somapeso/contpeso;
		percid = somp*100;

	System.out.println("A quantidade quantidade de pessoes superior a 50 e de :=>"+ somaid50 + "pessoas");
	System.out.println("A media das alturas das pessoas com idade entre 10 e 20 anos e de :=>"+ mediaaltura + "pessoas");
	System.out.println("A percemtagem de pessoas com peso inferior a 40kg"+ percid + "pessoas");	
	}
}
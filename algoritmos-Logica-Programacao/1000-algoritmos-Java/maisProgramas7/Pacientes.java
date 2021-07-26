import java.util.Scanner;
public class Pacientes {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int quant_pac = 0;
		int quant_altpes = 0;
		int quant_idad = 0;
		int soma_idad = 0;
		int idad_max = 0;
		int i = 0;
		String sexo;
		double alt_baix=0;
		String mulh_baix= "";
		String idad_nome="";
		String nome="";
		while (!nome.equals("fim")){
			System.out.println("Digite o seu nome: ");
			nome = in.next();
			System.out.println("Sexo: Digite M para Masculino ou F para Feminino");
			sexo = in.next();
			while (!sexo.equals("M") && !sexo.equals("F")){
				System.out.println("Opcao Ivalida: Re-introduza M para Masculino ou F para Feminino");
				sexo = in.next();
			}
			System.out.println("Digite o seu peso: ");
			double peso = in.nextDouble();
			System.out.println("Digite a sua idade: ");
			int idade = in.nextInt();
			System.out.println("Digite a sua altura: ");
			double altura = in.nextDouble();
			while(i<1){
				alt_baix = altura;
				i=i+1;
			}
			quant_pac = quant_pac + 1;
			soma_idad = soma_idad + idade;
			
			if (sexo.equals("F") && (altura>=1.60 && altura<=1.70) && peso >=70){
				quant_altpes = quant_altpes + 1;
			}
			if (idade>=18 && idade<=25){
				quant_idad = quant_idad + 1;
			}
			if (idad_max<idade){
				idad_max = idade;
				idad_nome=nome;
			}
			if(altura<alt_baix && sexo.equals("F")){
				alt_baix= altura;
				mulh_baix=nome;
			}
			
		}
		double media_idad = soma_idad/quant_pac;
		System.out.println("A Clinica tem "+quant_pac+" pacientes");
		System.out.println("A media de Idades eh de "+media_idad+" anos");
		System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 com peso acima de 70 eh de "+quant_altpes);
		System.out.println("A quantidade de pessoas com idade entre 18 e 25 eh de "+ quant_idad);
		System.out.println("O nome do paciente mais velho eh"+idad_nome);
		System.out.println("A nome da mulher mais baixa eh tem o nome de "+ mulh_baix);
	}
}

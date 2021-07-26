import java.util.Scanner;
public class Pessoas10 {
	public static void main (String[] args){
		Scanner in=new Scanner (System.in);
		int countM=0; 
		int countF=0;
		String nome;
		String sexo = "";
		int idade;
		for (int i=0; i<10; i++){
			System.out.println("Digite o seu nome: ");
			nome=in.next();
			while (!sexo.equals("M") || !sexo.equals("F")){
				System.out.println("Sexo: Digite M para Masculino ou F para Feminino");
				sexo = in.next();
			}
			System.out.println("Digite a sua Idade: ");
			idade=in.nextInt();
			if(sexo.equals("M") && idade>=18){
				countM=countM+1;
			}
			if(sexo.equals("F") && idade>=18){
				countF=countF+1;
			}
			sexo="";
		}
		System.out.println("A quantidade de homens com maior idade sao "+countM+" e mulheres sao "+countF);
	}
}

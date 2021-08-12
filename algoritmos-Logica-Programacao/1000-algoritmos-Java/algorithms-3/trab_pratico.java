import java.util.Scanner;

class notas{

	public static String nota(double n1,double n2,double n3,int fal){

		double soma = n1+n2+n3;

		double media = soma/3;

		if(media < 10){
			return "Reprovado por media";
		}else if (fal == 10) {
			return "Reprovado por faltas";
		}

		return "Aprovado";
	}
	
}



public class trab_pratico{

	public static void main(String[] args){

		Scanner f = new Scanner(System.in);

		notas n = new notas();

		System.out.println("Digite a primeira");
		double prin = f.nextDouble();

		System.out.println("Digite a segunda");
		double segin = f.nextDouble();

		System.out.println("Digite a terceira");
		double terin = f.nextDouble();
		
		System.out.println("Digite a n faltas");
		int falta = f.nextInt();

		


		
			System.out.println(n.nota(prin,segin,terin,falta));

		
	}
}
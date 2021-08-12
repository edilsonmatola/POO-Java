//Eugenia Nhacuonga I11
import java.util.Scanner;
public class Operacoes{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("1.Soma");
		System.out.println("2.Multiplicacao");
		System.out.println("3.Divisao");
		System.out.println("4.Subtraccao");
		System.out.println("Insira a opccao desejada:");
		int opccao=teclado.nextInt();
		double a=0;
		double b=0;
		switch(opccao){
			case 1:
					System.out.println("Insira o primeiro valor: ");
					a=teclado.nextDouble();
					System.out.println("Insira o segundo valor: ");
					b=teclado.nextDouble();
					double soma=a+b;
					System.out.println("A soma e:" + soma);
					break;
			case 2:

					System.out.println("Insira o primeiro valor: ");
					a=teclado.nextDouble();
					System.out.println("Insira o segundo valor: ");
					b=teclado.nextDouble();
					double multiplicacao=a*b;
					System.out.println("A multiplcacao e:" + multiplicacao);
					break;
			case 3:
					System.out.println("Insira o primeiro valor: ");
					a=teclado.nextDouble();
					System.out.println("Insira o segundo valor: ");
					b=teclado.nextDouble();
					do{
						if(b==0){
							System.out.println("O valor do segundo valor tem que ser diferente de 0");
							System.out.println("Insira o segundo valor: ");
							b=teclado.nextDouble();
						}
					}while(b==0);
					double divisao=a/b;
					System.out.println("A divisao e:" + divisao);
					break;
			case 4:
					System.out.println("Insira o primeiro valor: ");
					a=teclado.nextDouble();
					System.out.println("Insira o segundo valor: ");
					b=teclado.nextDouble();
					double subtracao=a-b;
					System.out.println("A subtracao e:" + subtracao);
					break;
			default:System.out.println("Insira opccpes validas!");
					break;
		}	
	}
}
		

		 
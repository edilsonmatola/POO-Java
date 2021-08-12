//Zenildo Nhabomba I12
import java.util.Scanner;
public class SomaExtenso {
	public static void main(String args[]){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Bem vindo ao Sistema de soma de numeros em extenso ");
		System.out.println();
		//Declarar uma variavel que vai receber um numero por extenso via teclado;
		System.out.println("Insira o primeiro numero por extenso");
		String primeiro=teclado.nextLine();
		System.out.println();

		//Declarar uma variavel que vai receber um numero por extenso via teclado;
		System.out.println("Insira o segundo numero por extenso");
		String segundo=teclado.nextLine();
		//Verificar se o primeiro numero introduzido por teclado e igual a um zero, um, dois, tres, quatro ou um cinco
		//Declerar duas variaveis do tipo int que vao receber os numeros que estao em extenso
		int a=0, b=0;
		//Declerar uma variavel do tipo int que vai receber a soma em inteiros
		int soma;
		//Declarar uma variavel que vai receber a moma e verificar se é 1:a variavel vai receber  um...
		String resultado="";
		if(primeiro.equalsIgnoreCase("zero")){
			a=0;
		}
		else if(primeiro.equalsIgnoreCase("um")){
			a=1;
		}
		else if(primeiro.equalsIgnoreCase("dois")){
			a=2;
		}
		else if(primeiro.equalsIgnoreCase("tres")){
			a=3;
		}
		else if(primeiro.equalsIgnoreCase("quatro")){
			a=4;
		}
		else if(primeiro.equalsIgnoreCase("cinco")){
			a=5;
		}

		//Verificar se o segundo numero introduzido por teclado e igual a um zero, um, dois, tres, quatro ou um cinco

		if(segundo.equalsIgnoreCase("zero")){
			b=0;
		}
		else if(segundo.equalsIgnoreCase("um")){
			b=1;
		}
		else if(segundo.equalsIgnoreCase("dois")){
			b=2;
		}
		else if(segundo.equalsIgnoreCase("tres")){
			b=3;
		}
		else if(segundo.equalsIgnoreCase("quatro")){
			b=4;
		}
		else if(segundo.equalsIgnoreCase("cinco")){
			b=5;
		}
		soma=a+b;
		//Verificar se o valor da soma e 1:fazer com que a variavel do resultado em extenso receba "um"
		switch(soma){
			case 0:resultado="zero";break;
			case 1:resultado="um";break;
			case 2:resultado="dois";break;
			case 3:resultado="tres";break;
			case 4:resultado="quatro";break;
			case 5:resultado="cinco";break;
			default:System.out.print(" Caro cliente: O programa so e capaz de fazer a somade dois numeros com resultado menor ou igual a cinco");break;
		}
		if(soma<6){
			System.out.println();

			System.out.println(primeiro+("+")+segundo+("=")+resultado);
		}
		
	}
}





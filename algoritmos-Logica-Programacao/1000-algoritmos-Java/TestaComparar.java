//Zenildo Nhantumbo Turma I12
import java.util.Scanner;
public class TestaComparar{

	public static void main (String[]args){

		Scanner entrada=new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("=======Programa de Comparacao=======");
		System.out.println("====================================");
		System.out.println("Introduza o primeiro numero");
		double a=entrada.nextDouble();
		System.out.println("Introduza o segundo numero");
		double b=entrada.nextDouble();
		System.out.println("Introduza o primeiro numero");
		double c=entrada.nextDouble();
		
		System.out.println("Menu");
		System.out.println("1. Achar Maior");
		System.out.println("2. Achar Menor");
		System.out.println("3. Sair");
		System.out.println("____________________________________");
		System.out.println("Escolha uma Opcao!");
	    int n=entrada.nextInt();

	    switch(n){
            
            case 1:
            double maior=a;
            if(maior<b){maior=b;}
            if(maior<c){maior=c;}	
            System.out.println("O Maior numero entre "+a+", "+b+" e "+c+" e "+maior);
            break;
             case 2:
             double menor=a;
            if(menor>b){menor=b;}
            if(menor>c){menor=c;}	
            System.out.println("O Menor numero entre "+a+", "+b+" e "+c+" e "+menor);
            break;
              case 3:
              System.exit(0);
            break;
            default:
            System.out.println("A opcao e invalida, Selecione uma opcao valida");
            break;

	    }

	}
}
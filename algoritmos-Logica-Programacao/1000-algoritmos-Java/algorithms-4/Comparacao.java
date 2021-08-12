import java.util.*;
public class Comparacao{
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		int opcao;
		do{
		System.out.println("Introduza O Numero");
		int numero1=teclado.nextInt();
		System.out.println("Introduza O Segundo Numero");
		int numero2=teclado.nextInt();
		if (numero1==numero2) {
			System.out.println("Os Numeros Sao Iguais");
		}else if(numero1>numero2){
			System.out.println("O Primeiro Numero e Maior");
		}else{
			System.out.println("O Segundo Numero e Maior");
		}
		System.out.println("Deseja Continuar? Se Sim Pressiona 1, caso contrario 0");
		opcao=teclado.nextInt();
		}while(opcao==1);
		
	}
}
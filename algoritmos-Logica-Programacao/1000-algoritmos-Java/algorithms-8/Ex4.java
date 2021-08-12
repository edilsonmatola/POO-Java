

import java.util.Scanner;
public class Ex4{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);

	System.out.println("Welcome ");
	System.out.println("Insira o valor:");
	int numero=in.nextInt();
	int constante=1;

	System.out.print("Os divisores de "+numero+" sao: ");
	while(constante<numero){
		if(numero%constante==0){

			System.out.print(constante+",");
		}constante++;

	}
}	
}
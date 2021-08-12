//Chelsea Manjate I11
//Imprimi se a pessoa esta ou nao em condicao de conduzir com base na idade

import java.util.Scanner;
public class CondicaoParaConduzir{
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Insira a idade");
	int idade = sc.nextInt();
	boolean temCarta= true;

	if(idade>= 18 && temCarta== true){
		System.out.println(" Pode conduzir");
	}else{
		System.out.println(" Cresce um pouco mais cliente");
	}


}

}
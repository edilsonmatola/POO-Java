//Zenildo Nhabomba I12
//Imprimi o valor calculado em IVA para uma padaria(por semana)

import java.util.Scanner;
public class Iva{
    public static void main(String [] args){

    	Scanner input= new Scanner(System.in);

    	double iva= 0.17;
    	System.out.println("Por favor insira a quantidade de paes comprados");
	  	int quantidade = input.nextInt();

	  	System.out.println("Por favor insira o preco de cada pao");
	  	double preco = input.nextInt();

	  	double calculoTotal = quantidade*preco;
	    System.out.println("O valor a pagar calculado com IVA e= "+calculoTotal *iva);	 
	}
}

import java.util.Scanner;
import java.util.Arrays;
public class Ordem{
	public static void main(String[] args){
	Scanner numeros = new Scanner(System.in);

	int[] listaDeNumeros = new int[4];

	           for (int i=1; i<listaDeNumeros.length;i++) {
		           System.out.print("Digite o "+ i + " numero: "); 
		           listaDeNumeros[i] = (numeros.nextInt());
		       }Arrays.sort(listaDeNumeros);

	          	System.out.print("Ordem crescente:    "); 
	       	  	for (int j=1; j<listaDeNumeros.length;j++) {
	       		System.out.print(listaDeNumeros[j]+ "  ");       		
			  	}
}
}
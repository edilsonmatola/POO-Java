//Alberto Matola
//Este programa recebe 4 numeros e coloca em um vector e sem seguida ordena em ordem crescente.
import java.util.*;
public class Ordem{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int[] lista= new int[4];
	           for (int i=1; i<lista.length;i++) {
		           System.out.print("Digite o "+ i + "o numero: "); 
		           lista[i]= (scan.nextInt());
		       }Arrays.sort(lista);

	          	System.out.print("Ordem crescente:    "); 
	       	  	for (int j=1; j<lista.length;j++) {
	       		System.out.print(lista[j]+ "  ");       		
			  	}
}
}
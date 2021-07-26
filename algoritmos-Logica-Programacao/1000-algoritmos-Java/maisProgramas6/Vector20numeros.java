/*Alberto Matola
Este programa recebe 20 valores inseridos pelo o usuario e os coloca em um vector, e em seguida faz a soma deles*/
import java.util.*;
public class Vector20numeros{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int soma=0;
		int[]vector=new int[20];
		for(int i=0;i<20;i++){
			System.out.print("Insira os valores a guardar na "+(i+1)+"a posicao :");
			vector[i]=scan.nextInt();
		}
		for(int i=0;i<20;i++){
			soma=soma+vector[i];
		}System.out.print("Somatorio dos valores no vector: "+soma);
	}
}
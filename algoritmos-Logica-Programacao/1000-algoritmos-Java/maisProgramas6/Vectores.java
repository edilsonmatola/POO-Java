//Alberto Matola I13
// Este programa 
import java.util.*;
public class Vectores{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numeros[]=new int[10];
		System.out.print("Insira os valores que deseja colocar no vector:");
		for (int i=0;i<=10;i++ ) {
			numeros[i]=scan.nextInt();
		}
		System.out.print(""+numeros);
	}
}
import java.util.Scanner;
public class Lendas{
	public static void main(String[]args){
		int k[]=new int [5];
		int y=0;
		for(int i=0;i<k.length;i++){
		System.out.println("INTRODUZ OS NUMEROS");
		k[0]=new Scanner(System.in).nextInt();
		y=y+k[0];	
		}
		int M=y/k.length;
		System.out.println("SOMA IGUAL AH:"+M);	
		System.out.println("TERCEIRO NUMERO IQUAL:"+k[0]);	
		}
	}

	
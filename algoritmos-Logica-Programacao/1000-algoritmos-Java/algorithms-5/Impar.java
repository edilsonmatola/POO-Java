
import java.util.Scanner;
public class Impar{
	public static void main (String[]args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira um numero");
		int numero=entrada.nextInt();
			
			if (numero%2==0){
				System.out.println("O proximo Impar e "+(numero+1));
			}else{
				System.out.println("O proximo Impar e "+(numero+2));
				}
		
	}
}

			
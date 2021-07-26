import java.util.Scanner;
public class Divisor{
	
	public static void main(String[]args){
		Scanner teclado= new Scanner(System.in);
		int n,i;
		//secao de comandos
		
		System.out.println("DIGITE O NUMERO");
		n=teclado.nextInt();
		 for (i=1;i<=n;i++){
			 if (n%i==0){
				 System.out.println(i);
			 }
		 }
		
		
	}
	
}


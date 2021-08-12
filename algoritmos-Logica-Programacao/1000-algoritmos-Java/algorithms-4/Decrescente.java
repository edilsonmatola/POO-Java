import java.util.*;
public class Decrescente{
	public static void main(String []args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduza Um Numero");
		int numero=teclado.nextInt();
		System.out.println("-------------------");
		for(int i=numero;i>0;i--){
			System.out.println(i);
		}
	}
}
//Zenildo Nhabomba Turma I12
import java.util.Scanner;
public class TestaPar{

	public static void main (String[]args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira um numero!");
		int a=entrada.nextInt();
		System.out.print("Pares("+a+")=");
		for(int i=1;i<=a;i++){
			if(i%2==0){
				System.out.print(i+", ");
			}

		}

	}
}
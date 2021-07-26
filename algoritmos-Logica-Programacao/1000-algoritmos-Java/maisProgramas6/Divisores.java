//Alberto Matola I13
//Primeiro programa imprime os divisores de um numero inserido pelo o usuario.
import java.util.Scanner;
public class Divisores{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Insira um valor e conheca os seus divisores: ");
	int num=scan.nextInt();
	int constant=1;

	System.out.print("Os divisores de "+num+" sao: ");
	while(constant<num){
		if(num%constant==0){
			System.out.print(constant+",");
		}constant++;

	}
}	
}
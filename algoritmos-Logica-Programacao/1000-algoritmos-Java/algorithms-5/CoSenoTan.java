import java.util.Scanner;
public class CoSenoTan{

public static void main (String[]args){
	Scanner entrada=new Scanner(System.in);
	System.out.println("Insira um numero");
	double numero=entrada.nextDouble();
	
	System.out.println("O Seno de "+numero+" e "+Math.sin(numero));
	System.out.println("O Cosseno de "+numero+" e "+Math.cos(numero));
	System.out.println("A Tangente de "+numero+" e "+Math.tan(numero));
	
}
}

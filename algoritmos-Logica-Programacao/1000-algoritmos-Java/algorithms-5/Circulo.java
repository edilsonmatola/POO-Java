import java.util.Scanner;

public class Circulo{

public static void main (String[]args){
	
	Scanner input=new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		double raio=input.nextDouble();
		
		double area=raio*raio*Math.PI;
		System.out.println("O valor da area e="+area);
}
}

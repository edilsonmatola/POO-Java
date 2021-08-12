//Alberto Matola I13
// Este programa calcula a area de uma pizza.
import java.util.*;
public class RaioPizza{
	public static void main(String args[]){
		double raio,area;
		Scanner ler=new Scanner(System.in);
		System.out.print("Insira o valor do raio:");
		raio=ler.nextDouble();
		area=2*3.14*Math.pow(raio,2);
		System.out.println("A area da Pizza:"+area);
	}
}
		
		
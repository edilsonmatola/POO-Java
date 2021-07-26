import java.util.*;
public class raio{
	public static void main (String[]args){
		int n;
		double y;
		Scanner raio=new Scanner(System.in);
	System.out.println("Introduza o valor do Raio");
	n=raio.nextInt();
	y=(4*Math.PI*Math.pow(n,3));
	double p=y/3;
		System.out.println(p);
	}
}
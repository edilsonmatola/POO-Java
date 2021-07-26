

import java.util.Scanner;
public class Numero1{
	public static void main(String[]args){
  double s,x,t;
		double y=0;
          
		Scanner entrada=new Scanner(System.in);
		for(int a=1;a<=10;a++){
		System.out.println("Introduza outro numero");
		s=entrada.nextDouble();
		y=y+s;
		}
		System.out.println(y);
		double m=y/10;
		System.out.println(m);
	}
}
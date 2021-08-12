import java.util.Scanner;
public class Numero3{
	public static void main(String[]args){
		double y,v,a;
		y=0;
		for(v=1;v<=5;v++){
		System.out.println("introduza qualquer numero");
		a=new Scanner(System.in).nextDouble();
		y=y+a;
		}
		double x=y/5;
		System.out.println(x);
	}
}
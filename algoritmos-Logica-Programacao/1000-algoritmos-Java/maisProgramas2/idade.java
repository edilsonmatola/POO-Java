import java.util.*;
public class idade{
	public static void main(String[]args){
		double a,b,c,d,e,f,g;
		b=5;
		Scanner saida=new Scanner(System.in);
		System.out.println("Introduz a idade do nadador");
		a=saida.nextDouble();
	
	    if(a>18){
		System.out.println("adulto");
		}else{
			System.out.println("Infantil");
		}
		
	}
}
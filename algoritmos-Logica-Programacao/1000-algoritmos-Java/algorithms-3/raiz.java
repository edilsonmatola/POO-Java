import java.lang.*;
import java.util.Scanner;

public class raiz{
	public static void main(String[]args){
		
			Scanner estrica=new Scanner(System.in);

			double a,b,c,delta,delta_riaz,x1,x2;

			System.out.println("Digite o Valor de A");
			a=estrica.nextDouble();

			System.out.println("Digite o Valor de B");
			b=estrica.nextDouble();

			System.out.println("Digite o Valor de C");
			c=estrica.nextDouble();

		if(b==0){

			
			delta_riaz=Math.sqrt(c);

			System.out.println("O Valor de x1,sera:-"+delta_riaz+"e o do x2 sera:"+delta_riaz);
		}else{

		delta=Math.pow(b,2)-(4*a*c);

		//double delta_riaz=Math.pow(delta,0.5);
		delta_riaz=Math.sqrt(delta);

		if(delta<0){

			System.out.println("O valor de delta de menor de 0,por favor ligue mais tarde");

		}else{

			x1=-b+delta_riaz/2*a;

			x2=-b-delta_riaz/2*a;

			System.out.println("O Valor de x1,sera:"+x1+" "+"e o do x2 sera:"+x2);

		}

		}
		if(a==0){

					delta=a/b;
					delta_riaz=Math.sqrt(delta);

			System.out.println("O Valor de x1,sera:-"+delta_riaz+"e o do x2 sera:"+delta_riaz);
				}
		
	}
}
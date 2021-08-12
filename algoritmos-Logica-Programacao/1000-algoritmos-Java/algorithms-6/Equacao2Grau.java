import java.util.*;
public class Equacao2Grau{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a,b,c,delta,x1,x2;
		System.out.print("Insira o valor de a:");
		a=scan.nextDouble();
		while(a==0){
			System.out.print("O valor de a nao pode ser igual a zero!\nDigite outro valor!");
			System.out.print("Insira o valor de a:");
			a=scan.nextDouble();
		}
		
		System.out.print("Insira o valor de b:");
		b=scan.nextDouble();
		System.out.print("Insira o valor de c:");
		c=scan.nextDouble();

		delta=((b*b)-(4*a*c));
		if(delta>0){
			x1=(-b+delta*(1/2))/(2*a);
			x2=(-b-delta*(1/2))/(2*a);
			System.out.print("Valor de Delta:"+delta);
			System.out.print("\nx1:"+x1+"\nx2:"+x2);
		}
		
		else if (delta==0) {
			x1=(-b+delta*(1/2))/(2*a);
			x2=(-b-delta*(1/2))/(2*a);
			System.out.print("\nx1:"+x1+"\nx2:"+x2);
		}

		else{
			System.out.print("Nao tem solucao Real");
		}
	}
}	
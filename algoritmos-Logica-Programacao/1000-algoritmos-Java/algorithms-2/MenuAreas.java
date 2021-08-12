//Eugenia Nhacuonga I11
import java.util.Scanner;
public class MenuAreas{
	public static void main(String args[]){
		Scanner teclado=new Scanner(System.in);

		System.out.println("1.Area do rectangulo");
		System.out.println("2.Area do triangulo");
		System.out.println("2.Area da circunferencia");
		//area1 referente a area do rectangulo.
		int c=6,l=4, area1;
		area1=c*l;
		//area2 referente a area do triangulo.
		int b=4,h=5,area2;
		area2=b*h/2;
		//area3 referente a area da circunferencia.
		double pi=3.14, area3;
		int r=4;
		area3=pi*r*r;
		System.out.println("Insira a opccao desejada:");
		int x=teclado.nextInt();
		switch(x){
			case 1:System.out.println("A area do rectangulo é "+area1); break;
			case 2:System.out.println("A area do triangulo é "+area2); break;
			case 3:System.out.println("A area da circunferencia é "+area3); break;
			default: System.out.println("Insira o caso desejado entre 1,2 e 3"); break;
		}
		
	}
}
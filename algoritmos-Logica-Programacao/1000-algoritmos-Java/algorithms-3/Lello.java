import java.util.Scanner;
public class OrdemDecrescente
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		int n1 , n2 , n3;
		
		System.out.print("Introduza um numero: ");
		n1 = in.nextInt();
		System.out.print("Introduza um numero: ");
		n2 = in.nextInt();
		System.out.print("Introduza um numero: ");
		n3 = in.nextInt();
		
		if(n1 > n2 && n1>n3)
		{
			if(n2>n3)
			{
				System.out.println("decrescente: "+n1+" "+n2+" "+n3);
				System.out.println("crescente: "+n3+" "+n2+" "+n1);
			}
			else
			{
				System.out.println("decrescente: "+n1+" "+n3+" "+n2);
				System.out.println("crescente: "+n2+" "+n3+" "+n1);
				
			}
		}
		if(n2>n1 && n2>n3)
		{
			if(n1>n3)
			{
				System.out.println("decrescente: "+n2+" "+n1+" "+n3);
				System.out.println("crescente: "+n3+" "+n1+" "+n2);
			}
			else
			{
				System.out.println("decrescente: "+n2+" "+n3+" "+n1);
				System.out.println("crescente: "+n1+" "+n3+" "+n2);
			}
		}
		if(n3>n1 && n3>n2)
		{
			if(n1>n2)
			{
				System.out.println("decrescente: "+n3+" "+n1+" "+n2);
				System.out.println("crescente: "+n2+" "+n1+" "+n3);
			}
			else
			{
				System.out.println("decrescente: "+n3+" "+n2+" "+n1);
				System.out.println("crescente: "+n1+" "+n2+" "+n3);
			}
		}
	}
}
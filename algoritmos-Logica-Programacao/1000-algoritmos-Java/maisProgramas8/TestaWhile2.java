import java.util.*;
public class TestaWhile2{
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		int a,b;

		System.out.println("Introduza o Primeiro numero ");
		a=entrada.nextInt();
        System.out.println("Introduza o Segundo numero ");
		b=entrada.nextInt();
		if(b>a){
		while(a<(b+1)){
			System.out.print(a+" ");
			a++1;
		}
	}else{}
				while(b<(a+1)){
					
                System.out.print(a+" ");
                a=a++1;
			
		}
	}
}

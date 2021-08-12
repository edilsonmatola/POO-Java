import java.util.*;
public class TestaDoWhile{

	public static void main (String[]args){

	    Scanner entrada=new Scanner(System.in);
		int a,b;
        do{
		System.out.println("Introduza o Primeiro numero ");
		a=entrada.nextInt();
		if(a<0){
			System.out.println("Introduza apenas valores positivos");
			System.out.println("_____________________________________");
		}
	     }

	     while(a<0);
	     do{
        System.out.println("Introduza o Segundo numero ");
		b=entrada.nextInt();
		if(b<0){
			System.out.println("Introduza apenas valores positivos");
			System.out.println("_____________________________________");
		}
	      }while(b<0);
	    if(b>a){
		   while(a<(b+1)){
			System.out.print(a+" ");
			a++;
		      }
	    }else{
	    	while(b<(a+1)){
			System.out.print(b+" ");
			b++;
		      }

	    }
    }	
}

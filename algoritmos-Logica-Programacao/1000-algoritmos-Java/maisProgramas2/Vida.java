import java.util.*;
public class Vida{
	public static void main(String[]args){
		int a,b,c,bb;
		double n=0;
	
		for(a=1;a<=4;a++){
			System.out.print(+(a+0)+"NUMERO:");
	  	bb=InputReader.readInt();
			if(bb>=18){
				n=n+1;
			}
		}
		System.out.println("IDADE MAIOR DE 18 ANOS EH:"+n);
	}
}
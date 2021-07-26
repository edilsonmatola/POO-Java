import java.util.Scanner;
public class quadrado{
	public static void main(String[]args){
		int a,f,b,c,d,e;
		e=0;
		Scanner  mulheres=new Scanner(System.in);
		for(a=1;a<=4;a++){
		System.out.println("Introduz o numero");
		f=mulheres.nextInt();
		e=f*2;
		if(e>=1000){
		System.out.println(e);
		}else{
		System.out.print("o quadrado de"  +f);
		System.out.print("-----");
		System.out.println(e);
		}	
		}
		
	}
}
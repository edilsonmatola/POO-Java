import java.util.Scanner;
public class OpAritmeticas{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("valor de a: ");
		float a=in.nextFloat();
		System.out.print("valor de b: ");
		float b=in.nextFloat();
		System.out.print("valor de c: ");
		float c=in.nextFloat();
		System.out.print("valor de d: ");
		float d=in.nextFloat();
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("a/b= "+(a/b));
		System.out.println("a%b= "+(a%b));
		System.out.println("a+c= "+(a+c));
		System.out.println("c+d= "+(c+d));
		System.out.println("c%d= "+(c%d));
		System.out.println("-a%b= "+(-a%b));
		System.out.println("-a%-b= "+(-a%-b));
		System.out.println("b%a= "+(b%a));
		System.out.println("a%-b= "+(a%-b));
		
	}
}
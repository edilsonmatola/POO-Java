import java.util.Scanner;
public class NrFactorial{
	public static void main(String[]args){
		System.out.print("introduza um numero: ");
		Scanner in=new Scanner(System.in);
		int nr=in.nextInt();
		int fact=nr;
		for(int i=(nr-1);i>1;i--){
			fact*=i;
		}
		System.out.println("factorial de "+nr+" eh: "+fact );
	}
}
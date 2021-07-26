import java.util.Scanner;
public class Piramide2{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Insira");
		int l=scan.nextInt();
		int i;
		int j;
		for(i=l;i>=1;i--){
			for(j=1;j<=i;j++){
			System.out.print(i+" ");
			}
		System.out.println(" ");	
		}
		
	}
}
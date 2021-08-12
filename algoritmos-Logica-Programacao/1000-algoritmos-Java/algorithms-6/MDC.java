import java.util.Scanner;
public class MDC{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Insira x= ");
		int x=scan.nextInt();

		System.out.print("Insira y= ");
		int y=scan.nextInt();
		System.out.print(mdc(x,y));

		public static int mdc(int x, int y){
			if(y==0){
				return x;
			}
			else {
				return mdc(y,x % y);
			}
		}
	}
}
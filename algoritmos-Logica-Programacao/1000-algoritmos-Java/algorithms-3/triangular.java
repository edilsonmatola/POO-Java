import java.util.Scanner;
public class triangular{
	public static void main(String[]args){
		int n,p;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("DIGITE NUMERO");
		n=teclado.nextInt();
		
		for(int i=1;i*(i+1)*(i+2)<=n; i++){
			p=(i*(i+1)*(i+2));
			if(p==n){
				System.out.println("E UM NUMERO TRIANGULAR, POIS:"+i+"*"+(i+1)+"*"+(i+2)+"="+i*(i+1)*(i+2));
				
			}
			else {
				System.out.println("O NUMERO NAO E TRIANGULAR");
			}
		}
		
	}
}
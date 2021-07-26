import java.util.Scanner;
public class PP {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num = in.nextInt();
		int div=0;
		int i=1;
		int j=1;
		int count=0;
		while (num>div){
			if(num%i==0){
				div=div+i;
			}
			i=i+1;
		}
		if(num==div){
			
			System.out.println("Eh Perfeito o nr "+num);
		}else{
			System.out.println("Nao eh Perfeito o nr "+num);
			while(num%j==0) && (num>=j){
				count=count+1;
				j=j+1;
			}if(count==2){
				System.out.println("Eh Primo o nr "+num);
			}else{
				System.out.println("Nao eh Primo o nr "+num);
			}
		}
	}
}

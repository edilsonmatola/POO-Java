import java.util.Scanner;
public class ParesZeros {
	public static int Zeros(int numero){
		int count=0;
		int count2=0;
		int i=0;
		while(numero!=0){
			int x = numero%10;
			if (i<2){
				if(x!=0){
					i=0;
					count=0;
				}
				if(x==0){
					count = count +1;
					if(count==2){
						count2=count2+1;
						count = count -1;
					}
				}
			}
			numero=numero/10;
			i=i+1;
			if (i==2){
				i=0;
			}
		}
		return count2;
	}
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.print("Digite o numero: ");
		int num = in.nextInt();
		System.out.println(Zeros(num));
	}
}

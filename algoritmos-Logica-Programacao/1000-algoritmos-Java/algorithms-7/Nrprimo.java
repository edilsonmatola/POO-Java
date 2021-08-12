import java.util.Scanner;
public class Nrprimo{
	public static void main(String[]args){
		int i=0,num=0;
		String primo="";
		Scanner in=new Scanner(System.in);
		System.out.print("insira um nr: ");
		int nr=in.nextInt();
		for(i=1; i<nr;i++){
			int count=0;
			for(num=i;num>=1;num--){
				if(i%num==0){
					count+=1;
				}
			}
			if(count==2){
				System.out.println(i+" eh primo");
			}
		}
		
	}
}
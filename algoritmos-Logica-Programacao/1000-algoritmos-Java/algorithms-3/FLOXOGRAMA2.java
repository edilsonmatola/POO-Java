import java.util.*;
public class FLOXOGRAMA2{
	public static void main(String[]args){
		int N,NR,Y,i;
		Scanner input=new Scanner(System.in);
	do{
			System.out.print("Introduza o primeiro Numero");
		N=input.nextInt();
	}while(N>0);
	Y=0;
		for(i=1;i<=N;i++);
		do{
		System.out.print("Itroduza o Proximo Numero");
		NR=input.nextInt();
		}while (NR>0);
		Y=Y+NR;
	}
}
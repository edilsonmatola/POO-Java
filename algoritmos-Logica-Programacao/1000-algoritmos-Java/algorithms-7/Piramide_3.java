import java.util.Scanner;
public class Piramide_3{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("insira o nr de linhas ");
		int linhas=in.nextInt();
		System.out.print("insira o nr de colunas ");
		int colunas=in.nextInt();
		for(int i=1;i<=linhas;i++){
			for(int j=1;j<=colunas;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
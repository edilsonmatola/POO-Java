import java.util.Scanner;
public class Piramide_7{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("insira o nr de linhas ");
		int linhas=in.nextInt();
		System.out.print("insira o nr de colunas ");
		int colunas=in.nextInt();
		for(int i=linhas;i>=1;i--){
			for(int j=colunas;i>=1;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
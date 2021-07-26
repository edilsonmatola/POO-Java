//
import java.util.Scanner;
public class CalculoMedia{
	
	static String M[][];
	static Scanner dx=new Scanner(System.in);
	
	public static void preencher(int linhas,int colunas){
		M=new String[linhas][colunas];
		for(int i=0;i<M.length;i++){
			System.out.println(" linha nr "+(i+1));
			for(int j=0;j<M[i].length;j++){
				System.out.println(" valor "+(j+1+" : "));
				M[i][j]=dx.next();
			}
		}
	}
	public static void imprimir(){
		for(int i=0;i<M.length;i++){
			for(int j=0;j<M[i].length;j++){
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void calcularMedia(){
			int soma;
			float media;
			for(int i=0;i<M.length;i++){
				soma=0;
			for(int j=1;j<M[i].length;j++){
				soma=soma+Integer.parseInt(M[i][j]);
			}
				media=soma/(M[i].length-1);
				System.out.println(M[i][0]+" teve media "+media);
		}
	}
	
	public static void main(String[]args){
		System.out.println(" insira nr de linhas ");
		int linhas=dx.nextInt();
		System.out.println(" insira nr de colunas ");
		int colunas=dx.nextInt();
		preencher(linhas,colunas);
		System.out.println(" ");
		imprimir();
		System.out.println(" ");
		calcularMedia();
	}	
}
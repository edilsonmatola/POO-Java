import java.util.Scanner;
public class Operacao{
	
	public static int contar_operadores(String sss){
		
		int tamanho = (int) sss.length();
		int posicao = 0;
		int i=0;
		int count=0; 
		while(posicao<tamanho){
			if(sss.charAt(posicao)=='+'){
				count=count+1;
			}
			if(sss.charAt(posicao)=='-'){
				count=count+1;
			}
			if(sss.charAt(posicao)=='/'){
				count=count+1;
			}
			if(sss.charAt(posicao)=='*'){
				count=count+1;
			}
			posicao = posicao + 1;
		}
		return count;
	}
	
	
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		String x = in.next();
		System.out.print(contar_operadores(x));
	
	}



}
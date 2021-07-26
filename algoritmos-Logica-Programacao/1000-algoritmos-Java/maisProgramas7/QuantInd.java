import java.util.*;
public class QuantInd{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		String palavra;
		
		do{
			System.out.print("insira uma palavra: ");
			palavra=in.next();	
			int tamanho=palavra.length();
			int metade=(int)(tamanho/2);
			if(tamanho%2==0){
				System.out.println(palavra.substring(1,metade)+palavra.substring(metade,tamanho-1));
			}else{
				if(tamanho==3){
					System.out.println(palavra.substring(1,tamanho-1));
				}else{
					System.out.println(palavra.substring(1,metade)+palavra.substring(metade,tamanho-2));
				}
			}
			
			
		}while(!(palavra.startsWith("F")) && !(palavra.startsWith("f")));
	}
}

	
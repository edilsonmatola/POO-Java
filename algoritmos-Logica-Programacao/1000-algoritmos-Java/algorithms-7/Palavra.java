import java.util.Scanner;
public class Palavra{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String palavra ="sdfdfs";
		while(palavra.charAt(0) != 'f'){
			palavra = in.next();
			int qtd = palavra.length();
			int num = qtd/2;
			for(int i = 0; i<num-1; i++){
				if(qtd%2==0){
					String primeira = ""+palavra.charAt(i);
					System.out.print(primeira);
				}
			}
			for(int i = 0; i<num-1; i++){
				if(qtd%2==0){
					String ultima = ""+palavra.charAt(num+(1+i));
					System.out.print(ultima);
				} 
			}
			System.out.print("\n");
			
			
			for(int i = 0; i<num; i++){
				if(qtd%2!=0){
					String primeira = ""+palavra.charAt(i);
					System.out.print(primeira);
				}
			}
			for(int i = 0; i<num; i++){
				if(qtd%2!=0){
					String ultima = ""+palavra.charAt(num+(1+i));
					System.out.print(ultima);
				} 
			}
			System.out.print("\n");
		}
	}
}
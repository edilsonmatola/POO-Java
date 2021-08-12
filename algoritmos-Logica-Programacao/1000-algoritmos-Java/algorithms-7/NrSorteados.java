
import java.util.Scanner;
public class NrSorteados {
	public static void main (String[] args){
		Scanner in= new Scanner(System.in);
		int i=1;
		int sort=44;
		System.out.println("Descobre o numero sorteado de 1 a 100");
		int num= in.nextInt();
		if(num>=0 && num<=100){
			while(num!=sort){
				if(num>sort){
					System.out.println("Errado, O numero sorteado eh inferior que "+num);
					num = in.nextInt();
				}
				if(num<sort){
					System.out.println("Errado, O numero sorteado eh superior que "+num);
					num = in.nextInt();
				}
				i=i+1;
			}
			System.out.println("Foi necessario "+i+" tentativas");
		}
		else{
			System.out.println("Valor invalido");
		}
	
	}
}

//Mack Banze
import java.util.*;
public class PesoIdeal{
	public static void main(String Args[]){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira a Sua Altura");
		String altura=teclado.nextLine();
		String peso="";
		//StringTokenizer token=new StringTokenizer(dados,".");
		for (int i=0;i<altura.length() ;i++ ) {
			if (altura.charAt(i)=='.') {
				peso=altura.substring(i+1,i+3);
				System.out.println("O Seu peso ideal e: "+peso+"kg");
			}
			
		}
	}
}
import java.util.Random;
import java.util.Scanner;

public class userdados{
	
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		Random rand = new Random();

		System.out.println("Digite o numero");
		String nome = ler.next();

		int me  = 0;

		for (int i = 0; i < 10; i++) {
             me = me + rand.nextInt();
        }
		
        System.out.println("User name->"+nome+"Password->"+me);
		
	}
}
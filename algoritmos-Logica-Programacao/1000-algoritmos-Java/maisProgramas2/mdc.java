import java.util.Scanner;
public class mdc{
	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int prin_num = teclado.nextInt();

		System.out.println("Digite o primeiro numero");
		int seg_num = teclado.nextInt();

		int resto;

		while( seg_num != 0){

			resto = prin_num%seg_num;

			prin_num = seg_num;

			seg_num = resto;
		}
		System.out.println(prin_num);
		
	}
}
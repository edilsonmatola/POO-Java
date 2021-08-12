import java.util.Scanner;
public class Piramide22 {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Que quantidade de Linhas desejas?");
		int linhas=in.nextInt();
		for (int i=0; i<=linhas; i++){
			System.out.println("");
			for(int j=1;j<=i; j++){
				System.out.print(j);
			}
		}
	}
}

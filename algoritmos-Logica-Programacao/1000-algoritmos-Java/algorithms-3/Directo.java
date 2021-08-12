import java.util.*;

public class Directo{
	public static void main(String[]args){
		int numero, contador, palpite;
		Scanner ler= new Scanner (System.in);
		Random rand=new Random();
		numero=rand.nextInt(100);
		contador=0;
		palpite= -1;
		while (palpite!=numero){
			System.out.println("Digite o palpite");
			palpite=ler.nextInt();
			contador++;
			if (palpite>numero){
				System.out.println("Digite um numero menor");
			}else{
				if (palpite<numero){
					System.out.println("Digite um numero maior");
				}else{
					System.out.println("Parabens");
					System.out.println("Voce acertou com" +contador+ "tentativas");
				}
			}
		}
		ler.close();
	}
}


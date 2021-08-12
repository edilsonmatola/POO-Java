import java.util.*;
public class Combustivel{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Bem Vindo!");
		System.out.println("Deseja Combustivel de quanto?");
		double quantia=teclado.nextDouble();
		System.out.println("Gasolina ou Gasolio?");
		String tipo=teclado.next();
		int saldo=0;
		Random sald=new Random();
		for (int i = 0; i < 1; i++) {
            saldo=sald.nextInt();
        }
        if (saldo<quantia) {
        	System.out.println("Sem Sucesso");
        }else{
        	System.out.println("Muito Obrigado! Dirige-se Ao Posto e mostre o recibo");
        }
	
	}
}
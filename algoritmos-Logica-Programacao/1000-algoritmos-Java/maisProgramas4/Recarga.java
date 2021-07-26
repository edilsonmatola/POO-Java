import java.util.*;
public class Recarga{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random recarg=new Random();
		Random sald=new Random();
		int recarga=0;
		int saldo=0;
		for (int i = 0; i < 1; i++) {
            recarga=recarg.nextInt();
            saldo=sald.nextInt();
        }
		System.out.println("Insira A Operadora");
		String operadora=teclado.nextLine();
		System.out.println("Recargas Disponiveis:50,100,200,500");
		System.out.println("insira A Recarga Que Deseja");
		int quantia=teclado.nextInt();
		if (saldo<quantia) {
			System.out.println("Sem Sucesso, Ausencia de valores");
		}else{
		System.out.println("Com sucesso! O Valor da recarga e: "+recarga);
		
			}
	
	}
}
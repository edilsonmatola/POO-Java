import java.util.*;
public class MensalidadeAgua{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira O Numero do Contador");
		int contador=teclado.nextInt();
		System.out.println("Insira O Montante");
		double montante=teclado.nextDouble();
		Random sald=new Random();
		
		int saldo=0;
		for (int i=0;i<1 ;i++ ) {
			saldo=sald.nextInt();
		}
		if(saldo<montante){
			System.out.println("Sem Sucesso! Saldo Indisponivel");
		}else{
			System.out.println("Pagamentos Efectuados Com Sucesso!");
		}
		System.out.println(saldo);
	
	}
}
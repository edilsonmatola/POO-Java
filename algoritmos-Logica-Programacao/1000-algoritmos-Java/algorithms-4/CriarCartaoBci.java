import java.util.*;
public class CriarCartaoBci{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int saldo=0;
		Random sald=new Random();
		for (int i = 0; i < 1; i++) {
            saldo=sald.nextInt();
        }
        int conta=0;
		Random cont=new Random();
		for (int i = 0; i < 1; i++) {
            conta=cont.nextInt();
        }
        System.out.println("Insira O Seu Nome");
        String nome=teclado.nextLine();
        System.out.println("Insira A Sua Idade");
        int idade=teclado.nextInt();
        System.out.println("Insira A Sua Morada");
        String morada=teclado.next();
        System.out.println("Trabalha?");
        String  trabalhador=teclado.next();
        if (idade<18) {
        	System.out.println("Contacte Alguem Maior de 18!");
        }else{
        	System.out.println("Com Sucesso "+nome+"A Sua Conta e :"+conta+"e Tem: "+saldo+"MT!");
        }
	}
}
 //Zenildo Nhabomba
import java.util.Scanner;
public class NomeCompleto{
	public static void main(String[] args){
		String nome;
		String apelido;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira o seu primeiro nome:");
		nome=teclado.next();
		System.out.print("Insira o seu apelido:");
		apelido=teclado.next();
		System.out.println("O seu nome completo e:"+nome+" "+apelido);
	}
}
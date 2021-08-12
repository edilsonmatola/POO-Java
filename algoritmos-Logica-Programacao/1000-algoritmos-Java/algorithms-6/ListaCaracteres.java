//Alberto Matola I13
//Este programa cria uma lista que recebe strings e as imprime.
import java.util.*;
public class ListaCaracteres{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<String>agenda=new ArrayList();
		String nome="";
		while (!nome.equals("fim")) {
			System.out.print("Para terminar de inserir os nomes, escreva a palavra 'fim' \n");
			System.out.print("Insira os nomes a guardar: ");
			nome=scan.nextLine();
			agenda.add(nome);
		}
		int i;
		System.out.print("Percorrendo a lista\n");
		for (i=0;i<agenda.size()-1 ;i++ ) {
			System.out.print(i+":"+agenda.get(i)+"");
		}
	}
}
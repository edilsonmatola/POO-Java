import java.util.Scanner;

public class Baby{

public static void main (String[]args){
	
	Scanner in=new Scanner (System.in);
	System.out.println("Digite o seu nome:");

    String nome= in.nextLine();
	for (int i=0; i<nome.length(); i++){
    System.out.println("Nome:"+(int)nome.charAt(i));
	}
	
}
}


import java.util.Scanner;

public class Gramas{

public static void main (String[]args){
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Insira um valor em gramas");
	int gramas=input.nextInt();
	
	int kilos=gramas/1000;
	gramas=gramas%1000;
	
	System.out.println("O total de kilos e="+ kilos);
	System.out.println("O total de gramase="+ gramas);
	
}
}


import java.util.Scanner;
public class Horas{
public static void main(String[]args){
	Scanner ler= new Scanner(System.in);
	
	System.out.println("Insira a hora");
	
	int hora=ler.nextInt();
	
	System.out.println("Minutos:"+hora*60);
	
	System.out.println("Segundos:"+hora*3600);	

}

}
import java.util.Random;

public class TestaAleatorio{
	
	
	public static int Aleatorio(){
		Random gerador= new Random();
	
		int numero= gerador.nextInt(10);
		
		return numero;
	}
		
	public static void main(String[]args){
		
		
		System.out.println("Numero aleatorio de 1 a 10");
		System.out.println("|=>"+Aleatorio());
		
		
	}
}
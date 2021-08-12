import java.util.*;
public class Hms_test{
	public static void main(String [] agrs){
		Scanner x=new Scanner(System.in);
		Hms introduzir=new Hms();
		introduzir.imprimir();
		introduzir.segundos=x.nextInt();
		System.out.println ("Voce digitou o segundo");
		
	}
}
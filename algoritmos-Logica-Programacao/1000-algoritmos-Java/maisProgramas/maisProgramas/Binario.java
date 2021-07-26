//Zenildo Nhabomba I12
import java.util.Scanner;
public class Binario{
	public static void main(String[] args){
		int numero;
		String binario="";
		Scanner teclado= new Scanner(System.in);
		System.out.print("Insira um numero:");
		numero=teclado.nextInt();
		while(numero !=0){
			if(numero%2==0){
				binario=binario+"0";
				numero=numero/2;
			}
			else{
				binario=binario+"1";
				numero=numero/2;
			}
		}
		for(int i=binario.length()-1; i>=0; i--){
			System.out.print(binario.charAt(i));
		}
	}
}
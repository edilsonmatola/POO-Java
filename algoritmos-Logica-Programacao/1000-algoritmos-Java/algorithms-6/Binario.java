//Alberto Matola I13
/*Este programa converte um numero binario qualquer em um numero decimal usando long*/
import java.util.Scanner;
public class Binario{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long numBi,numDeci=0,i=1,resto;
		System.out.print("Insira um numero Binario: ");
		numBi=scan.nextLong();
		while (numBi!=0) {
			resto=numBi%10;
			numDeci=numDeci+resto*i;
			i=i*2;
			numBi=numBi/10;
		}
		System.out.print("Numero Decimal: "+numDeci);
	}
}
//Alberto Matola I13
//Este programa calcula a raiz quadrada de um numero usando metodo.
import java.util.Scanner;
public class RaizQuadrada{
	public static void main(String[] args){
		Raizquadrada();
	}
	public static void Raizquadrada(){
	double num;
	Scanner scan=new Scanner(System.in);
	System.out.print("Insira um numero e conheca a sua a raiz quadrada: ");
	num=scan.nextDouble();
	double raizq = Math.sqrt(num);
	System.out.print("A raiz quadrada: "+raizq);

}
}

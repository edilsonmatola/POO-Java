 //Alberto Matola I13
//Este programa calcula o multiplo de um numero inserido pelo usuario e ele indica o inicio do intervalo e o seu limite.
import java.util.Scanner;
public class Multiplo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int numero,inicio,limite;
		System.out.print("Insira um numero e conheca os seu(s) multiplo(s): ");
		numero=scan.nextInt();
		System.out.print("Insira o inicio do intervalo: ");
		inicio=scan.nextInt();
		System.out.print("Insira o limite do intervalo: ");
		limite=scan.nextInt();
		System.out.print("Multiplos do "+numero+"= ");
		for(int i=inicio; i<=limite; i++){
			if(i%numero==0){
				System.out.print(i+",");
			}
		}
	}
}
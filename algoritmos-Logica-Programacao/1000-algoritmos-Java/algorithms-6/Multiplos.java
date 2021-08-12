//Alberto Matola I13
//Este programa imprimi os multiplos positivos de um numero inserido pelo usuario, inferiores a 1000;
import java.util.Scanner;
public class Multiplos{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira um numero e conheca os seus multiplos: ");
		int num=scan.nextInt();
		for (int i=1;i<=num;i++) {
				do{
					if(num%i==0){
						System.out.print("Os multiplos de "+num+" sao: "+i+" e "+num);break;
					}				}while(i>0);
					scan.close();
		}			
	}
}
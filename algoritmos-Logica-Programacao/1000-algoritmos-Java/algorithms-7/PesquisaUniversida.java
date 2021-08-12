import java.util.Scanner;
public class PesquisaUniversida{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int count=0,countA=0,countB=0,countC=0, nr, nrAlnos, resulA=0,resulB=0,resulC=0;
		System.out.print("Insira o numero de alunos: ");
		nrAlnos=in.nextInt();
		while(nrAlnos>count){
			System.out.print("quantas vezes usou o restaurante da universide: ");
			nr=in.nextInt();
			if(nr<10){
				countA++;
				resulA=(countA*100)/nrAlnos;
			}else{
				if(nr>=10 && nr<=15){
					countB++;
					resulB=(countB*100)/nrAlnos;	
				}else{
					countC++;
					resulC=(countC*100)/nrAlnos;
				}
			}
			count++;
		}
		System.out.println("a) "+resulA);
		System.out.println("b) "+resulB);
		System.out.println("c) "+resulC);
	}
}
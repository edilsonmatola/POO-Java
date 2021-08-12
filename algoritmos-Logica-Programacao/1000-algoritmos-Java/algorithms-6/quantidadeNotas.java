/*Alberto Matola I13
Este programa cria um vector de n posicoes, inseridas pelo o usuario, recebe notas e
calcula a sua media e mostra os melhores e piores estudantes*/
import java.util.Scanner;
public class quantidadeNotas{
	public static void main(String args[]){
		int quantidade;
		double media=0;
		System.out.print("Quantidade de notas: ");
		quantidade=new Scanner(System.in).nextInt();
		double vector[];
		vector=new double[quantidade];
		for(int i=0;i<quantidade;i++){
			System.out.print("Informe a " +(i+1)+"a nota: ");
			vector[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<quantidade;i++){
			media=media+vector[i];
		}
		media=media/quantidade;
		System.out.print("A media:"+media);
		String maior="\nNota(s) acima da media  :", menor="Nota(s) abaixo da media  :";
		for(int i=0;i<quantidade;i++){
			if(vector[i]>media){
				maior=maior+vector[i]+"   ";
			}else{
				menor=menor+vector[i]+"   ";
			}
		}
		System.out.print(maior);
		System.out.print(menor);
	}
}
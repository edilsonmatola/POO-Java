/*Alberto Matola I13
Este programa cria um vector que recebe strings com 5 posicoes e as imprime.*/
import java.util.*;
public class vectorAlunos{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String aluno[]=new String[5];
		for(int i=0;i<5;i++){
		  System.out.print("Insira o seu nome: ");
		  aluno[i]=scan.nextLine();
		}
		for(int i=0;i<5;i++){
			System.out.print("Os nomes inseridos:\n "+aluno[i]);
		}
	}
}
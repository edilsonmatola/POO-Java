/*Escreva um programa que leia 3 notas e numero de faltas de um aluno.
/ calcule a sua media e determine e exiba  sua situacao.
/ caso o aluno tenha mais de 10 faltas ele esta reprovado por faltas
/ caso contrario estara reprovado se sua media dera inferior que 10 ou aprovado se sua media for superior 
/ que 10

/Obs: Utilize metodos para calcular a  media e determine e exibir a situacao do aluno.
*/
import java.util.Scanner;

public class countFalta {
	
	public static void media(){
		Scanner in = new Scanner(System.in);
		System.out.print("Insira o numero de falta: ");
		byte falta=in.nextByte();
		int nota, soma=0;

		for (int i=1; i<=3 ; i++) {
			System.out.print("Insira nota "+i+": ");
			nota = in.nextInt();
			soma += nota;
		}
		double media = soma/3;

		if (falta>10) {
			System.out.println("\nO aluno reprovou por faltas");
		}
		else if(falta<10 && media<10) {
			System.out.println("\nA media eh de ´"+media+"`, entao o aluno rerova por ter media negativa");
		}
		else {
			System.out.println("\nO aluno foi aprovado com media: "+media);
		}
	}
}


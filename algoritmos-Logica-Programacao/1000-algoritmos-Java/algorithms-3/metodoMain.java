/*Escreva um programa que leia 3 notas e numero de faltas de um aluno.
/ calcule a sua media e determine e exiba  sua situacao.
/ caso o aluno tenha mais de 10 faltas ele esta reprovado por faltas
/ caso contrario estara reprovado se sua media dera inferior que 10 ou aprovado se sua media for superior 
/ que 10

/Obs: Utilize metodos para calcular a  media e determine e exibir a situacao do aluno.
*/
import java.util.Scanner;

class metodoMain {
	public static void main(String[] args) {
		countFalta contar = new countFalta();
		contar.media();
	}
}


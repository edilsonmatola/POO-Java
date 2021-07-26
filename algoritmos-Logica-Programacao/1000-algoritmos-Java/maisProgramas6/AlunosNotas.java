//Alberto Matola I13
//Este programa calcula media de 10 alunos, calcula a media e mostra os(as) melhores e piores aluno(a)s.
import java.util.Scanner;
public class AlunosNotas{
	public static void main(String[]args){
	Scanner scan= new Scanner(System.in);
	String[] alunos=new String[10];
	for(int i=0;i<10;i++){
	System.out.print("Insira o nome do "+(i+1)+"o aluno: ");
	alunos[i]=scan.nextLine();}
	int[][] notas= new int[10][5];
	for(int j=0;j<10;j++){
		System.out.print("Insira as suas notas,aluno(a) "+alunos[j]+": ");
		for(int k=0;k<5;k++){
			notas[j][k]=scan.nextInt();
		}}
		double[] medias=new double[10];
		for(int a=0;a<10;a++){
			double soma=0;
			for(int b=0;b<5;b++){
				soma=soma+notas[a][b];
			}
			medias[a]=soma/5;
		}
		for(int c=0;c<10;c++){
			System.out.print("\nO/A aluno(a) "+alunos[c]+" teve a media de: " +medias[c]);
		}
		double melhor=0;
		int melhorlugar=0;
		double pior=medias[0];
		int piorlugar=0;
		for(int d=0;d<10;d++){
			if(medias[d]>melhor){
				melhor=medias[d];
				melhorlugar=d;
			}
			if(medias[d]<pior){
				pior=medias[d];
				piorlugar=d;
			}}
			System.out.print("\nO/A melhor aluno(a) foi: "+alunos[melhorlugar]+" e teve media de: "+melhor);
			System.out.print("\nO/A pior aluno(a) foi"+alunos[piorlugar]+" teve de media: "+pior);
		}
}
//Alberto Matola Turma I13
//Este programa faz a Serie Fibonacci
import java.util.*;
public class SerieFibonacci{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i,limite,anterior,proximo,resultado;
		System.out.print("Insira o limite da serie Fibonacci: ");
		limite=scan.nextInt();
		anterior=0; proximo=1; resultado=0;i=3;
		System.out.print(anterior);
		System.out.print(proximo);
		while (i<=limite) {
			resultado=anterior+proximo;
			System.out.print(resultado);
			anterior=proximo;
			proximo=resultado;
			i=i+1;
		}

	}
}
//Alberto Matola Turma I13
//Este programa calcula asua idade
import java.util.*;
public class Idade{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int anoN,anoA,idade;
		System.out.print("Insira o seu ano de nascimento: ");
		anoN=scan.nextInt();
		System.out.print("Insira o ano actual: ");
		anoA=scan.nextInt();
		if (anoN>anoA) {
			System.out.print("Ano de nascimento invalido!");
		}
		else{
			idade=anoA-anoN;
			System.out.print("Idade: "+idade);
		}
	}
}
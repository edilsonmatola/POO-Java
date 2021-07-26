//Alberto Edilson Matola Turma:I13
//Este programa identifica o tipo de triangulo de acordo com os dados inseridos pelo o usuario
import java.util.*;
public class LadosTriangulo{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int l1,l2,l3;
		System.out.print("Insira o valor de um dos lados: ");
		l1=scan.nextInt();
		System.out.print("Insira o valor do outro lado: ");
		l2=scan.nextInt();
		System.out.print("Insira o valor do ultimo lado: ");
		l3=scan.nextInt();

		if (l1==l2 && l2==l3 && l3==l1) {
			System.out.print("Triangulo Equilatero");
		}

		else if (l1!=l2 && l2!=l3 && l3!=l1) {
			System.out.print("Triangulo Escaleno");
		}

		else{
			System.out.print("Triangulo Isosceles");
		}
	}
}
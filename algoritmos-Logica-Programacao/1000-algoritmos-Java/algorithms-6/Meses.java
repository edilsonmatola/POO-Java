//Alberto Matola I13
// Este programa contem o conjunto de meses num vector e exibe o mes inserido pelo usuario
import java.util.*;
public class Meses{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String meses[]={"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julhos", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int mes;
		do{
			System.out.print("Insira o numero do Mes que deseja:\n ");
			mes=scan.nextInt();
			if (mes>=1 && mes<=12) {
				System.out.print("\n"+meses[mes-1]+"\n");

			}
			else if (mes!=0) {
				System.out.print("Numero invalido");
			}

		}while(mes!=0);
		System.out.print("Fim");
		scan.close();
	}
}
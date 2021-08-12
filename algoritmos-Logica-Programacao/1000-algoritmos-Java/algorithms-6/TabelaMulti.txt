import java.util.*;
public class TabelaMulti{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num,contador,limit,tabela;
		contador=1;
		System.out.print("Insira o limite da tabela de multiplicacao:");
		limit=scan.nextInt();
		System.out.print("Insira o numero e conheca a tabela de multiplicacao:");
		num=scan.nextInt();
		while(contador<=limit){
			tabela=num*contador;
			System.out.print("\n"+num+"*"+contador+"="+tabela);
			contador=contador+1;
		}

	}
}
import java.util.Scanner;
public class TestaSelecaoMultipla{
	public static void main(String[] args){
		int x=5;
		int y=2;
		char operacao=System.out.print("introduza a operacao que deseja efectuar");
		switch(operacao){
			case'+';int soma=x+y;break
			case'-';int subtracao=x-y;break
			case '*';int multiplicacao=x*y;break
			case '/';int divisao=x/y;break
			default:System.out.print("operacao invalida");
			break;
		}
	}
}

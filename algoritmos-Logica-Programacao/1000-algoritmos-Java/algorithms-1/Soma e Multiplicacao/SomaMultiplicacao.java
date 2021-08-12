import javax.swing.JOptionPane;
import java.util.*;
public class SomaMultiplicacao{
	public static void main(String []args){
		int Multiplicacao=1, soma=0;
		for(int i=1;i<=10;i++){
			if (i%2==0) {
				Multiplicacao=Multiplicacao*i;
			}else{
				soma=soma+i;
			}
		}
		System.out.println("A Multiplicacao dos numero pares e: "+Multiplicacao);
		System.out.println("A soma dos numero impares e: "+soma);

		JOptionPane.showMessageDialog(null,"Obrigado, Volte Sempre!");
	}
}
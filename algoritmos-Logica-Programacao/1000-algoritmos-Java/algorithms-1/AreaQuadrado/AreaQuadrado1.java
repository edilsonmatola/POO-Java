import java.util.Scanner;

import javax.swing.JOptionPane;

public class AreaQuadrado1 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduza O Valor Do Lado");
			Double area = teclado.nextDouble();
			double resultado = Math.pow(area, 2);
			System.out.println(resultado);
		}
		JOptionPane.showMessageDialog(null, "Volte Sempre!");
	}
}
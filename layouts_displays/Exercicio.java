package aula4Layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercicio {
	
	private final JFrame frame;
	private JButton botao1, botao2, botao3, botao4,botao5, botao6, botao7, botao8,botao9,botao10,botao11,botao12;
	
	Exercicio() {
		
		frame = new JFrame();
		frame.setTitle("Untitled");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,4,10,10));

		botao1 = new JButton("Botao 1");
		botao2 = new JButton("Botao 2");
		botao3 = new JButton("Botao 3");
		botao4 = new JButton("Botao 4");
		botao5 = new JButton("Botao 5");
		botao6 = new JButton("Botao 6");
		botao7 = new JButton("Botao 7");
		botao8 = new JButton("Botao 8");
		botao9 = new JButton("Botao 9");
		botao10 = new JButton("Botao 10");
		botao11 = new JButton("Botao 11");
		botao12 = new JButton("Botao 12");
		
		frame.add(botao1);
		frame.add(botao2);
		frame.add(botao3);
		frame.add(botao4);
		frame.add(botao5);
		frame.add(botao6);
		frame.add(botao7);
		frame.add(botao8);
		frame.add(botao9);
		frame.add(botao10);
		frame.add(botao11);
		frame.add(botao12);
		
		frame.setVisible(true);
		
	}
}

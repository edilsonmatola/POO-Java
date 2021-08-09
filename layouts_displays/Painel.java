package aula4Layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel {
	
	private final JFrame frame;
	private JButton botao1, botao2, botao3, botao4;
	private JLabel labelNorte, labelSul, Label1, label2, label3;
	private JPanel painelEste, painelOeste;
	
	public Painel() {
		frame = new JFrame();
		frame.setTitle("Border Layout e Label");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		botao1 = new JButton("B1");
		botao2 = new JButton("B2");
		botao3 = new JButton("B3");
		botao4 = new JButton("B4");
		
		labelNorte = new JLabel("Pagina inicial do programa usando o Border Layout");
		labelSul = new JLabel("Direitos Reservados ao Edilson Matola");
		Label1 = new JLabel("Texto 1");
		label2 = new JLabel("Texto 2");
		label3 = new JLabel("Texto 3");
		
		painelEste = new JPanel();
		painelOeste = new JPanel();
		
		painelEste.setLayout(new GridLayout());
		painelOeste.setLayout(new GridLayout());
		
		frame.setVisible(true);
		
		
		
		
	}
	
}

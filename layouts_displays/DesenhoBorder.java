package aula4Layouts;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DesenhoBorder {
	
	private final JFrame jr;
	private final JButton btNorte;
	private final JButton btSul;
	private final JButton btCentro;
	private final JButton btEste;
	private final JButton btOeste;
	
	public DesenhoBorder() {
		
		jr = new JFrame();
		jr.setTitle("Border Layout");
		jr.setSize(450, 450);
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setLayout(new BorderLayout());
		
		btNorte = new JButton("Norte");
		btSul = new JButton("Sul");
		btCentro = new JButton("Centro");
		btEste = new JButton("Este");
		btOeste = new JButton("Oeste");
		
		jr.add("North", btNorte);
		jr.add("South", btSul);
		jr.add("Center", btCentro);
		
		jr.add("East", btEste);
		jr.add("West", btOeste);
		
		jr.setVisible(true);
	}
}

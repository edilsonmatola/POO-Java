package aula4Layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DesenhoGrid {
	
	private final JFrame jr;
	private final JButton btSubmeter;
	private final JTextField txtNome;
	private final JTextField txtSenha;
	private final JLabel lNome;
	private final JLabel lSenha;
	private final JLabel lTitulo;
	
	public DesenhoGrid() {
		
		jr = new JFrame();
		jr.setTitle("Grid Layout");
		jr.setSize(450, 150);
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setLayout(new GridLayout(4,2,10,10));
		
		lTitulo = new JLabel("Authentication");
		lSenha = new JLabel("Password:");
		lNome = new JLabel("User:");
		
		txtNome = new JTextField();
		txtSenha = new JTextField();
		
		btSubmeter = new JButton("Submit");
		
		jr.add(lTitulo);
		
		jr.add(new JLabel());
		
		jr.add(lNome);
		jr.add(txtNome);
		jr.add(lSenha);
		jr.add(txtSenha);
		
		jr.add(new JLabel());
		jr.add(btSubmeter);
		                                         
		jr.setVisible(true);
		
		                                  
		
	}
}

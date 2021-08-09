package aula4Layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DesenhoFlow {
	
	private final JFrame frame;
	private final JButton botao;
	private JTextField txtf;
	private final JLabel label;
	
	public DesenhoFlow() {
		
		frame = new JFrame();
		botao = new JButton("Gravar");
		label = new JLabel("Usuario: ");
		
		frame.setTitle("Gerenciador FlowLayout");
		frame.setSize(450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocale(null);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		frame.add(botao);
		frame.add(label);
		frame.add(txtf);
		
		frame.setVisible(true);
		
		
	}
}

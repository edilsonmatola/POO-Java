package numero7;


import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;

public class Listar extends JFrame{

	private Scores scores;
	
	Vector<Jogador> vector;
	
	Listar(){
		
		setTitle("Listar scores");
		setSize(750,650);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		vector = Scores.player;

		JList<Jogador> lista = new JList<>(vector);
		
		add(lista);

//		Colocar tela visivel
		setVisible(true);
	}
}

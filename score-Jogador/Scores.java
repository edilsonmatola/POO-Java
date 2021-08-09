package numero7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Scores extends JFrame implements ActionListener{

//	Atributos do JFrame
	private final JButton bt1,bt2;
	private final JMenuItem exibir;
	private final JMenuItem limpar;
	private final JMenuItem sair;
	private final JTextField tx1;
	private final JTextField tx2;
	static Vector<Jogador>player= new Vector<>();
	
	public Scores(){
		
		setTitle("Game Entry");
		setSize(550,250);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));

//		JFrame Bar
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);

//		JFrame Menu Options on the bar
		JMenu menu = new JMenu("Opcoes");
		barra.add(menu);
		
		exibir=new JMenuItem("Exibir scores");
		
		limpar=new JMenuItem("Limpar scores");
		
		sair=new JMenuItem("Sair");
		
		menu.add(exibir);
		menu.add(limpar);
		menu.add(sair);

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		JLabel lb1 = new JLabel("Nome:");
		tx1=new JTextField(40);
		
		p1.add(lb1);
		p1.add(tx1);

		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel lb2 = new JLabel("Score");
		tx2=new JTextField(8);
		bt1=new JButton("OK");
		bt2=new JButton("Cancel");
		
		p2.add(lb2);
		p2.add(tx2);
		p2.add(bt1);
		p2.add(bt2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		exibir.addActionListener(this);
		sair.addActionListener(this);
		limpar.addActionListener(this);
		
		add(p1);
		add(p2);
		setVisible(true);
	}

//	Metodo de criar jogadores
	public void criarJogador(){
		
		Jogador jogador = new Jogador();
		jogador.setNome(tx1.getText());
		jogador.setScore(Integer.parseInt(tx2.getText()));
		player.add(jogador);
		System.out.println(player.toString());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bt1){
			
			criarJogador();
		}
		
		if(e.getSource()==exibir){
			
			new Listar();
			dispose();
		}
		
		if(e.getSource()==limpar){
			
			player.clear();
		}
		
		if(e.getSource()==sair){
			
			System.exit(0);
		}
		
		if(e.getSource()==bt2){
			
			tx1.setText("");
			tx2.setText("");
		}
	}

}

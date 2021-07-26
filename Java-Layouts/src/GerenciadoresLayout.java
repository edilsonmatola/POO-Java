package numero5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GerenciadoresLayout extends JFrame implements ActionListener{
	private final JRadioButton rb1,rb2,rb3;
	private final JLabel lb1;
	private final JLabel lb2;
	private final JPanel pn,pc,ps,pb;
	private final ButtonGroup bg;
	private final JButton bt1,bt2,bt3;
	
	public GerenciadoresLayout(){
		
		setTitle("Gerenciadores de Layout");
		setSize(500,350);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		pn=new JPanel();
		pn.setLayout(new FlowLayout(FlowLayout.LEFT));
		lb1=new JLabel("Selecione o Layout que deseja.");
		pn.add(lb1);
		
		pc=new JPanel();
		pc.setLayout(new GridLayout(3,1));
		
		rb1=new JRadioButton("Flow Layout");
		rb1.setSelected(true);
		rb1.setMnemonic(KeyEvent.VK_F);
		
		rb2=new JRadioButton("Grid Layout 1");
		rb2.setMnemonic(KeyEvent.VK_G);
		
		rb3=new JRadioButton("Grid Layout 2");
		rb3.setMnemonic(KeyEvent.VK_R);
		bg=new ButtonGroup();
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		pc.add(rb1);
		pc.add(rb2);
		pc.add(rb3);
		
		pc.setBorder(BorderFactory.createEtchedBorder());
		
		ps=new JPanel();
		ps.setLayout(new GridLayout(2,1));
		ps.setBorder(BorderFactory.createEtchedBorder());
		
		pb=new JPanel();
		
		lb2=new JLabel("Botoes: ");
		bt1=new JButton("Botao 1");
		bt2=new JButton("Botao 2");
		bt3=new JButton("Botao 3");
		
		pb.add(bt1);
		pb.add(bt2);
		pb.add(bt3);
		ps.add(lb2);
		ps.add(pb);
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		
		add("North",pn);
		add("Center",pc);
		add("South",ps);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==rb1){
			
			if(rb1.isSelected()){
				
				pb.setLayout(new FlowLayout());
				bt1.setVisible(false);
				bt1.setVisible(true);
			}
			
			else{
				
			}
		}
		
		if(e.getSource()==rb2){
			
			if(rb2.isSelected()){
				
				pb.setLayout(new GridLayout(2,2));
				bt1.setVisible(false);
				bt1.setVisible(true);
			}	
		}
		
		if(e.getSource()==rb3){
			
			if(rb3.isSelected()){
				
				pb.setLayout(new GridLayout(3,1));
				bt1.setVisible(false);
				bt1.setVisible(true);
			}
		}
	}
}

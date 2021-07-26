package telasFarmacia;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Welcome extends JFrame implements ActionListener{
	JButton btnext, btnExit;
		
	public Welcome() {
		this.setTitle("Bem Vindo(a)");
		this.setSize(517,328);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
	
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);
	
		JLabel lblSejaBemVindao = new JLabel("Seja Bem Vinda(o) a Farmacia");
		lblSejaBemVindao.setForeground(Color.BLUE);
		lblSejaBemVindao.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSejaBemVindao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSejaBemVindao.setBounds(0, 47, 511, 95);
		panel.add(lblSejaBemVindao);
	
		btnext = new JButton("Log In");
		btnext.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
		btnext.setBounds(380, 249, 89, 23);
		panel.add(btnext);
	 
		btnExit= new JButton("Exit");
		btnExit.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
		btnExit.setBounds(260, 249, 89, 23);
		panel.add(btnExit);
	
		JLabel lblStayHomeLda = new JLabel("STAY HOME, Lda");
		lblStayHomeLda.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 23));
		lblStayHomeLda.setForeground(Color.BLUE);
		lblStayHomeLda.setBounds(121, 110, 324, 58);
		panel.add(lblStayHomeLda);
	

//		Add your own image path
		JLabel ima = new JLabel("");
		//ima.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\pro\\Wel.jpg"));
		ima.setIcon(new ImageIcon("G:\\ISUTC\\II Semestre\\Programa��o III\\Semana XI\\Farmacia\\pro\\Wel.jpg"));
		ima.setBounds(0, 0, 511, 300);
		panel.add(ima);
		
		btnExit.addActionListener(this);
		btnext.addActionListener(this);
		
		this.setVisible(true);
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnext) {
			new Login();
			this.dispose();
		}
		if(e.getSource()==btnExit) {
			System.exit(0);
		}
		
	}

}

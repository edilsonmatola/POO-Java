package Calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {
	
	private JPanel pp,p1,p2;
	private JLabel visor;
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,c,ce,sub,sum,div,mlt,eq,dot,exp,sqrt,eu,fact,prc,bas;
	
	public Calculadora(){
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(330,330);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout());
		
		visor=new JLabel("");
		visor.setFont(new Font("Consolas", Font.PLAIN, 24));
		visor.setHorizontalAlignment(SwingConstants.RIGHT);
		visor.setBorder(BorderFactory.createTitledBorder(""));
		visor.setPreferredSize(new Dimension(100,80));
		
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		c=new JButton("C");
		ce=new JButton("CE");
		sum=new JButton("+");
		sub=new JButton("-");
		mlt=new JButton("x");
		div=new JButton("/");
		eq=new JButton("=");
		dot=new JButton(".");
		exp=new JButton("a^b");
		sqrt=new JButton("SQRT");
		eu=new JButton("e^x");
		fact=new JButton("!");
		prc=new JButton("%");
		bas=new JButton("10^x");
		
		ManipulaBotoes mb=new ManipulaBotoes();
		b0.addActionListener(mb);
		b1.addActionListener(mb);
		b2.addActionListener(mb);
		b3.addActionListener(mb);
		b4.addActionListener(mb);
		b5.addActionListener(mb);
		b6.addActionListener(mb);
		b7.addActionListener(mb);
		b8.addActionListener(mb);
		b9.addActionListener(mb);
		c.addActionListener(mb);
		ce.addActionListener(mb);
		sum.addActionListener(mb);
		sub.addActionListener(mb);
		mlt.addActionListener(mb);
		div.addActionListener(mb);
		eq.addActionListener(mb);
		dot.addActionListener(mb);
		exp.addActionListener(mb);;
		sqrt.addActionListener(mb);
		eu.addActionListener(mb);
		
		
		pp=new JPanel();
		pp.setLayout(new BorderLayout());
		
		p1=new JPanel();
		p1.setBackground(Color.GRAY);
		p1.setLayout(new GridLayout(6,4,4,4));
		p1.add(sqrt);p1.add(exp);p1.add(c);p1.add(ce);
		p1.add(eu);p1.add(bas);p1.add(fact);p1.add(prc);
		p1.add(b7);p1.add(b8);p1.add(b9);p1.add(div);
		p1.add(b4);p1.add(b5);p1.add(b6);p1.add(mlt);
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(sub);
		p1.add(b0);p1.add(dot);p1.add(eq);p1.add(sum);
		
		
		p2=new JPanel();
		p2.add(p1);
		p2.setBackground(Color.darkGray);
		
		pp.add("North",visor);pp.add("Center",p2);
		add(pp);
		
		
		setVisible(true);
	}
	
	private class ManipulaBotoes implements ActionListener {
		private String cadeia="0";
		private String copiar="";
		private double num1,num2,res;
		private char Operacao='n';
		private int zerar, achou;
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if(evento.getSource()==b1){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"1";
			zerar=0;
		}
		if(evento.getSource()==b2){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"2";
			zerar=0;
		}
		if(evento.getSource()==b3){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"3";			
			zerar=0;
		}
		if(evento.getSource()==b4){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"4";
			zerar=0;
		}
		if(evento.getSource()==b5){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"5";
			zerar=0;
		}
		if(evento.getSource()==b6){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"6";
			zerar=0;
		}
		if(evento.getSource()==b7){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"7";			
			zerar=0;
		}
		if(evento.getSource()==b8){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"8";
			zerar=0;
		}	
		if(evento.getSource()==b9){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"9";			
			zerar=0;
		}
		if(evento.getSource()==b0){
			if(zerar==1){
				cadeia="";
			}
			if(cadeia.equals("0")){
				cadeia="";
			}
			cadeia=cadeia+"0";
			zerar=0;
		}
	if(evento.getSource()==dot){
		achou=0;
		if(zerar==1){
			cadeia="";
		}
	for (int i = 0; i <cadeia.length(); i++) {
		if(cadeia.charAt(i)=='.'){
			achou=1;
		}
	}
	if(cadeia.equals("")){
		cadeia=cadeia="0.";
	}else if (achou==0){
		cadeia=cadeia+".";
	}
	zerar=0;
	}
	if(evento.getSource()==c){
		cadeia="0";
		zerar=1;
	}
	if(evento.getSource()==ce){
		if(cadeia.length()>1){
			cadeia=cadeia.substring(0, cadeia.length()-1);
		}else{
			cadeia="0";
			zerar=1;
		}
	}
	if(evento.getSource()==sqrt){
		cadeia= String.valueOf(Math.sqrt(Double.parseDouble(cadeia)));
		zerar=1;
	}
	if(evento.getSource()==exp){
		num1=Double.parseDouble(visor.getText());
		Operacao='p';
		zerar=1;
	}
	if(evento.getSource()==eu){
		final double EULER=2.71828;
		num1=Double.parseDouble(visor.getText());
		cadeia= String.valueOf(Math.pow(EULER, num1));
		zerar=1;
	}
	if(evento.getSource()==sum){
		num1=Double.parseDouble(visor.getText());
		Operacao='+';
		zerar=1;
	}
	if(evento.getSource()==sub){
		num1=Double.parseDouble(visor.getText());
		Operacao='-';
		zerar=1;
	}
	if(evento.getSource()==mlt){
		num1=Double.parseDouble(visor.getText());
		Operacao='*';
		zerar=1;
	}
	if(evento.getSource()==div){
		num1=Double.parseDouble(visor.getText());
		Operacao='/';
		zerar=1;
	}
	if(evento.getSource()==eq){
		num2=Double.parseDouble(visor.getText());
		switch(Operacao){
		case'n':
			res=num2;break;
		case '+':
			res=num1+num2;break;
		case'-':
			res=num1-num2;break;
		case '*':
			res=num1*num2;break;
		case'/':
			res=num1/num2;break;
		case 'p':
			res=Math.pow(num1, num2);break;
	}
	cadeia=String.valueOf(res);
	zerar=1;
	}
	visor.setText(""+cadeia);
	}
}
public static void main(String[] args) {
	new Calculadora();
	}
}

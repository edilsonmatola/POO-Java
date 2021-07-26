import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Avaliacao extends JFrame{
	
	public JPanel Janelas = new JPanel();
	public JPanel Janela1 = new JPanel();
	public JPanel Janela2 = new JPanel();
	
	public JLabel lblCodigo = new JLabel("Codigo");
	public JLabel lblNome = new JLabel("Nome");
	public JLabel lblName = new JLabel("Nome");
	public JLabel lblSenha = new JLabel("Senha");
	
	public JTextField txtCodigo = new JTextField("hj",4);
	public JTextField txtNome = new JTextField();
	public JTextField txtName = new JTextField();
	public JPasswordField txtSenha = new JPasswordField();
	
	public JRadioButton radUser = new JRadioButton("User");
	public JRadioButton radAdmin = new JRadioButton("Admin");
	
	public JButton butAtribuir = new JButton("Atribuir");
	public JButton butActualizar = new JButton("Actualizar");
	public JButton butApagar = new JButton("Apagar");
	
	public Container contentor = getContentPane();
	
	public Avaliacao(){
		
			
		this.setVisible(true);
		this.setTitle("User-Gestao");
		this.setSize(500,300);
		this.setLocation(400,100);
		
		Janelas.add(lblSenha);
		contentor.add(Janelas);
	}	
	public static void main(String[]args){
			new Avaliacao();
	}
	
	
}
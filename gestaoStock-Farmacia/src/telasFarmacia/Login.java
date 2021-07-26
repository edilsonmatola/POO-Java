package telasFarmacia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener {
    private JTextField txtusername;
    private JPasswordField txtpassword;
    private JButton btnNext, btnSair;
    private JLabel erro;
    private JPanel panel;


    public Login() {

        this.setTitle("Log In");
        this.setSize(515,324);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

        //----------O panel deve estar visivel globalmente porque vou precisar de acede-lo para adicionar a MSG de erro de password-------------
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblPassword.setBounds(10, 94, 90, 27);
        panel.add(lblPassword);

        txtusername = new JTextField();
        txtusername.setBounds(10, 63, 199, 20);
        panel.add(txtusername);
        txtusername.setColumns(10);

        txtpassword = new JPasswordField();
        txtpassword.setBounds(10, 132, 199, 20);
        panel.add(txtpassword);

        JLabel lblusername = new JLabel("Username:");
        lblusername.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblusername.setBounds(10, 25, 90, 27);
        panel.add(lblusername);

        //---------OS BOTOES btnSair e btnNext DEVEM ESTAR VISIVEL FORA DO CONSTRUTOR PARA PODERMOS ALCANCA-LOS NA IMPLEMENTAACAO DA SUA FUNCIONALIDADE-----------//

        btnSair = new JButton("SAIR");
        btnSair.setBounds(10, 173, 89, 23);
        panel.add(btnSair);

        //---------NEXT para PROXIMO-----------//
        btnNext = new JButton("PROXIMO");
        btnNext.setBounds(120, 173, 89, 23);
        panel.add(btnNext);



        JLabel lblstayhom = new JLabel("#StayHome");
        lblstayhom.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblstayhom.setForeground(Color.RED);
        lblstayhom.setBounds(10, 253, 120, 14);
        panel.add(lblstayhom);
        JLabel lblStayHomeLda = new JLabel("STAY HOME, Lda");
        lblStayHomeLda.setHorizontalAlignment(SwingConstants.CENTER);
        lblStayHomeLda.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
        lblStayHomeLda.setForeground(Color.BLACK);
        lblStayHomeLda.setBounds(251, 241, 248, 55);
        panel.add(lblStayHomeLda);

//      Add your own picture by setting the path
        JLabel ima = new JLabel("");
        ima.setIcon(new ImageIcon("G:\\ISUTC\\II Semestre\\Programa��o III\\Semana XI\\Farmacia\\pro\\c.jpg"));
        ima.setBounds(0, 0, 509, 296);
        panel.add(ima);

        btnNext.addActionListener(this::actionPerformed);
        btnSair.addActionListener(this::actionPerformed);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext){
        	String username="admin";
            char [] segredo = {'4', '3', '2', '1'};
            char [] password = txtpassword.getPassword();
            if (Arrays.equals(segredo, password)){
            	if(txtusername.getText().equals(username)) {
            		//JOptionPane.showMessageDialog(null, "Great");
            		new MenuPrincipal();
            		this.dispose();
            	}else {
            		JOptionPane.showMessageDialog(null, "ERRO, o utilizador nao existente!");
            	}
            		
            }else{
                JOptionPane.showMessageDialog(null, "Password incorrecta. Tente novamente!");
            }
        }
    }
}

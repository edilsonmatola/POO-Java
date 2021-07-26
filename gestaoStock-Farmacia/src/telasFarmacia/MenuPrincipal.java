package telasFarmacia;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import company.Fornecedores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu, menuDados;
    private JLabel lbMenuPrincipal;
    private JButton btArmazem, btProdutos, btFornecedores, btFiltro, btCliente, btVenda, btSair;
    private JPanel panel;

    public MenuPrincipal() {
        this.setTitle("Menu Principal");
        this.setSize(696, 392);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        menu = new JMenu("Menu");
        menuBar.add(menu);

        menuDados = new JMenu("Maiss Dados");
        menuBar.add(menuDados);

        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);

        lbMenuPrincipal = new JLabel("Menu Principal");
        lbMenuPrincipal.setForeground(Color.BLACK);
        lbMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
        lbMenuPrincipal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
        lbMenuPrincipal.setBounds(161, 0, 529, 94);
        panel.add(lbMenuPrincipal);

        btArmazem = new JButton("Armazem ");
        btArmazem.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
        btArmazem.setBounds(280, 264, 89, 23);
        panel.add(btArmazem);

        btProdutos = new JButton("Produtos");
        btProdutos.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
        btProdutos.setBounds(431, 264, 89, 23);
        panel.add(btProdutos);

        btFornecedores = new JButton("Fornecedores");
        btFornecedores.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
        btFornecedores.setBounds(280, 298, 99, 23);
        panel.add(btFornecedores);

        btFiltro = new JButton("Filtro");
        btFiltro.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
        btFiltro.setBounds(431, 298, 89, 23);
        panel.add(btFiltro);

        btVenda = new JButton("Vendas");
        btVenda.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
        btVenda.setBounds(561, 234, 89, 23);
        panel.add(btVenda);

        btCliente = new JButton("Clientes");
        btCliente.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
        btCliente.setBounds(561, 264, 89, 23);
        panel.add(btCliente);

        btSair = new JButton("Sair");
        btSair.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("CheckBoxMenuItem.border")));
        btSair.setBounds(561, 298, 89, 23);
        panel.add(btSair);

        JLabel lblstayhome = new JLabel("#StayHome");
        lblstayhome.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblstayhome.setForeground(Color.RED);
        lblstayhome.setBounds(10, 313, 89, 14);
        panel.add(lblstayhome);

        JLabel lblFarmaciaStayHome = new JLabel("Farmacia Stay Home, Lda");
        lblFarmaciaStayHome.setForeground(Color.BLACK);
        lblFarmaciaStayHome.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 21));
        lblFarmaciaStayHome.setBounds(269, 76, 341, 36);
        panel.add(lblFarmaciaStayHome);

        //      Add your own picture by setting the path
        JLabel ima = new JLabel("");
        ima.setForeground(Color.DARK_GRAY);
        ima.setIcon(new ImageIcon("G:\\ISUTC\\II Semestre\\Programa��o III\\Semana XI\\Farmacia\\pro\\1.png"));
        ima.setBounds(0, 0, 690, 343);
        panel.add(ima);

        btSair.addActionListener(this);
        btFornecedores.addActionListener(this);
        btProdutos.addActionListener(this);
        btArmazem.addActionListener(this);
        btCliente.addActionListener(this::actionPerformed);
        btVenda.addActionListener(this::actionPerformed);


        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btSair) {
            System.exit(0);
        }
        if (e.getSource() == btFornecedores) {
            new RegistraFornecedor();
            this.dispose();
        }
        if (e.getSource() == btProdutos) {
            new RegistroProdutos();
            this.dispose();
        }
        if (e.getSource() == btArmazem) {
            new RegistroArmazem();
            this.dispose();
        }
        if (e.getSource() == btFiltro) {
            new StockMinimo();
            this.dispose();
        }
        if (e.getSource() == btCliente) {
            new RegistroCliente();
            this.dispose();
        }
        if (e.getSource() == btVenda) {
            new VendaProdutos();
            this.dispose();
        }


    }
}

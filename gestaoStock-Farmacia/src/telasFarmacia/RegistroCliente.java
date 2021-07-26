package telasFarmacia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import actualizacao.actualizacao;
import company.Cliente;
import company.Clientes;
import company.Fornecedor;
import company.Fornecedores;

public class RegistroCliente extends JFrame implements ActionListener, actualizacao{
    private JLabel lblNome, lblSexo, lbLId, lblSaldo, lblRegistroCliente;
    private JLabel lblActualizarNome, lblActualizarSexo, lblActualizarId, lbltextoActualizacao;
    private JTextField textActualizarNome, textActualizarSexo,textActualizarId, textActualizarSaldo;
    private JTextField textNome, textId,textSaldo;
    private JRadioButton rbMasculino, rbFemenino;
    private JRadioButton rbActualizarMasculino, rbActualizarFemenino;
    private JButton btnActualizar, btnGravar, btnEliminar, btnSair;
    private JScrollPane scrollPane;
    private ButtonGroup btnGrupo, btnGrupoActualizar;
    private static DefaultTableModel model;
    private JTable table_2;
    static int iteracaoSalvamento = 1;
    static Clientes clientes = new Clientes();

    public RegistroCliente(){
        this.setTitle("Registrador De Clientes");
        this.setSize(630,389);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
        this.setResizable(false);

        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);

        lblRegistroCliente = new JLabel("Operacoes cliente");
        lblRegistroCliente.setBackground(Color.WHITE);
        lblRegistroCliente.setForeground(Color.BLACK);
        lblRegistroCliente.setHorizontalAlignment(SwingConstants.CENTER);
        lblRegistroCliente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
        lblRegistroCliente.setBounds(317, 0, 256, 72);
        panel.add(lblRegistroCliente);

        scrollPane = new JScrollPane();
        scrollPane.setEnabled(false);
        scrollPane.setBounds(10, 222, 594, 102);
        panel.add(scrollPane);

        model = new DefaultTableModel();
        table_2 = new JTable();
        table_2.setEnabled(false);
        scrollPane.setViewportView(table_2);
        table_2.setModel(model);
        model.addColumn("Nome");
        model.addColumn("Sexo");
        model.addColumn("Codigo");
        model.addColumn("Saldo");

        lbLId = new JLabel("Id: ");
        lbLId.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lbLId.setBounds(11, 30, 75, 23);
        panel.add(lbLId);

        textId = new JTextField();
        textId.setBounds(80, 30, 90, 20);
        textId.setColumns(5);
        textId.setEditable(false);
        textId.setText(String.valueOf(iteracaoSalvamento));
        panel.add(textId);

        lblNome = new JLabel("Nome: ");
        lblNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblNome.setBounds(11, 60, 75, 23);
        panel.add(lblNome);

        textNome = new JTextField();
        textNome.setBounds(80, 63, 200, 20);
        panel.add(textNome);
        textNome.setColumns(10);

        lblNome = new JLabel("Sexo: ");
        lblNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblNome.setBounds(11, 90, 75, 23);
        panel.add(lblNome);

        rbMasculino = new JRadioButton("Masculino");
        rbFemenino = new JRadioButton("Femenino");
        btnGrupo = new ButtonGroup();btnGrupo.add(rbMasculino);btnGrupo.add(rbFemenino);
        rbMasculino.setBounds(80, 90, 85, 23);
        rbMasculino.setSelected(true);
        rbFemenino.setBounds(170, 90, 85, 23);
        panel.add(rbMasculino);
        panel.add(rbFemenino);

        lblSaldo = new JLabel("Saldo: ");
        lblSaldo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblSaldo.setBounds(11, 120, 75, 23);
        panel.add(lblSaldo);

        textSaldo = new JTextField();
        textSaldo.setBounds(80, 120, 200, 20);
        textSaldo.setColumns(10);
        panel.add(textSaldo);

        btnGravar = new JButton("Gravar");
        btnGravar.setBounds(28, 155, 75, 20);
        panel.add(btnGravar);




        lblActualizarId = new JLabel("Id Do cliente por actualizar: ");
        lblActualizarId.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblActualizarId.setBounds(320, 65, 220, 23);
        panel.add(lblActualizarId);

        textActualizarId = new JTextField();
        textActualizarId.setBounds(530, 65, 70, 20);
        textActualizarId.setColumns(5);
        panel.add(textActualizarId);

        lblActualizarNome = new JLabel("Nome: ");
        lblActualizarNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblActualizarNome.setBounds(320, 95, 75, 23);
        panel.add(lblActualizarNome);

        textActualizarNome = new JTextField();
        textActualizarNome.setBounds(400, 95, 200, 20);
        panel.add(textActualizarNome);
        textActualizarNome.setColumns(10);

        lblActualizarSexo = new JLabel("Sexo: ");
        lblActualizarSexo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblActualizarSexo.setBounds(320, 125, 50, 23);
        panel.add(lblActualizarSexo);

        rbActualizarMasculino = new JRadioButton("Masculino");
        rbActualizarFemenino = new JRadioButton("Femenino");
        btnGrupoActualizar = new ButtonGroup();
        btnGrupoActualizar.add(rbActualizarMasculino);btnGrupoActualizar.add(rbActualizarFemenino);
        rbActualizarMasculino.setBounds(395, 125, 85, 23);
        rbActualizarFemenino.setSelected(true);
        rbActualizarFemenino.setBounds(485, 125, 85, 23);
        panel.add(rbActualizarMasculino);
        panel.add(rbActualizarFemenino);

        lblSaldo = new JLabel("Saldo: ");
        lblSaldo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        lblSaldo.setBounds(320, 155, 75, 23);
        panel.add(lblSaldo);

        textActualizarSaldo = new JTextField();
        textActualizarSaldo.setBounds(400, 155, 200, 20);
        textActualizarSaldo.setColumns(10);
        panel.add(textActualizarSaldo);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(320, 185, 100, 20);
        panel.add(btnActualizar);

        btnSair = new JButton("Sair");
        btnSair.setBounds(506, 325, 89, 23);
        panel.add(btnSair);


        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(440, 185, 100, 20);
        panel.add(btnEliminar);

        btnGravar.addActionListener(this::actionPerformed);
        btnEliminar.addActionListener(this::actionPerformed);
        btnActualizar.addActionListener(this::actionPerformed);
        btnSair.addActionListener(this::actionPerformed);

        actualizarTabela();

        this.setVisible(true);
    }


    @Override
    public void actualizarTabela() {
        for (int i=model.getRowCount(); 0<i;i--){
            model.removeRow(i-1);
        }
        for (int i = Clientes.getClientes().size()-1; 0<=i; i--){
            Cliente adicionarTabela = Clientes.getClientes().get(i);
            model.addRow(new Object[]{adicionarTabela.getNome(),adicionarTabela.getSexo(),
                    adicionarTabela.getId(),adicionarTabela.getSaldo()});
        }
        SwingUtilities.updateComponentTreeUI(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGravar){
            StringBuffer nome = new StringBuffer(textNome.getText());
            char sexo;
            if (rbMasculino.isSelected()){
                sexo=rbMasculino.getText().charAt(0);
            }else {
                sexo=rbFemenino.getText().charAt(0);
            }
            StringBuffer id = new StringBuffer(String.valueOf(iteracaoSalvamento));
            double saldo = Double.parseDouble(textSaldo.getText());
            System.out.println(nome + " "+saldo + " " + id);


            if (clientes.adicionarCliente(nome, sexo, id)){
                clientes.depositar(id, saldo);
                iteracaoSalvamento++;
                textId.setText(String.valueOf(iteracaoSalvamento));
                actualizarTabela();
                textSaldo.setText("");
                textNome.setText("");
            }else {
                JOptionPane.showMessageDialog(null, "Cliente Ja existe");
            }

        }
        if (e.getSource() == btnActualizar){
            StringBuffer nome = new StringBuffer(textActualizarNome.getText());
            char sexo;
            if (rbActualizarMasculino.isSelected()){
                sexo=rbActualizarMasculino.getText().charAt(0);
            }else {
                sexo=rbActualizarFemenino.getText().charAt(0);
            }
            StringBuffer id = new StringBuffer(textActualizarId.getText());
            double saldo = Double.parseDouble(textActualizarSaldo.getText());
            System.out.println("Updating...!" +nome + " "+saldo + " " + id);

            if (clientes.actualizarCliente(id, nome, sexo)){
                clientes.depositar(id, saldo);;
                textActualizarId.setText("");
                textActualizarSaldo.setText("");
                textActualizarNome.setText("");
                actualizarTabela();
            }else {
                JOptionPane.showMessageDialog(null, "Cliente Nao existe");
            }
        }

        if (e.getSource() == btnEliminar){
            StringBuffer id = new StringBuffer(textActualizarId.getText());

            if (clientes.removerCliente(id)){
                textActualizarId.setText("");
                textActualizarSaldo.setText("");
                textActualizarNome.setText("");
                actualizarTabela();
            }else {
                JOptionPane.showMessageDialog(null, "Cliente Nao existe");
            }
        }

        if (e.getSource() == btnSair){
            new MenuPrincipal();
            this.dispose();
        }
    }
}

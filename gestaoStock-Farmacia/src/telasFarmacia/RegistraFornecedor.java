package telasFarmacia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import company.Fornecedor;
import company.Fornecedores;
import actualizacao.actualizacao;


public class RegistraFornecedor extends JFrame implements ActionListener, actualizacao{
	private JTable table_2;
	private JScrollPane scrollPane;
	private JLabel image, lblCodigo,lblNuit, lblNome,  lblstayhome,lblRegistroArmazem;
	private JTextField textCodigo, textNome, textNuit, textActualizar;
	private JButton btnActualizar, btnGravar, btnSair;
	private static DefaultTableModel model;
	public static Fornecedores fornecedores= new Fornecedores();
	private static int iteracaoSalvamentoFornecedor = 1;

	public RegistraFornecedor() {
		this.setTitle("Registrador De Fornecedores");
		this.setSize(630,389);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		this.setResizable(false);
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblRegistroArmazem = new JLabel("Registro Fornecedor");
		lblRegistroArmazem.setBackground(Color.WHITE);
		lblRegistroArmazem.setForeground(Color.BLACK);
		lblRegistroArmazem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroArmazem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblRegistroArmazem.setBounds(317, 0, 256, 72);
		panel.add(lblRegistroArmazem);
		
		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 222, 594, 102);
		panel.add(scrollPane);
		
		model = new DefaultTableModel();
		table_2 = new JTable();
		table_2.setEnabled(false);
		scrollPane.setViewportView(table_2);
		table_2.setModel(model);
		model.addColumn("Numero");
		model.addColumn("Nome");
		model.addColumn("Nuit");
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCodigo.setBounds(11, 11, 75, 23);
		panel.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(79, 14, 89, 20);
		textCodigo.setEditable(false);
		textCodigo.setText(String.valueOf(iteracaoSalvamentoFornecedor));
		panel.add(textCodigo);
		textCodigo.setColumns(10);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNome.setBounds(11, 44, 75, 29);
		panel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(79, 45, 221, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		lblNuit = new JLabel("Nuit:");
		lblNuit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNuit.setBounds(11, 84, 46, 14);
		panel.add(lblNuit);
		
		textNuit = new JTextField();
		textNuit.setBounds(79, 84, 86, 20);
		panel.add(textNuit);
		textNuit.setColumns(10);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(11, 133, 89, 23);
		panel.add(btnActualizar);
		
		btnGravar = new JButton("Gravar");
		btnGravar.setBounds(110, 133, 89, 23);
		panel.add(btnGravar);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(211, 133, 89, 23);
		panel.add(btnSair);

		textActualizar = new JTextField();
		textActualizar.setColumns(12);
		textActualizar.setToolTipText("Codigo do fornecedor que deseja actualizar");
		textActualizar.setBounds(11, 165, 89, 20);
		panel.add(textActualizar);

		
		lblstayhome = new JLabel("#StayHome");
		lblstayhome.setForeground(Color.RED);
		lblstayhome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblstayhome.setBounds(10, 197, 122, 14);
		panel.add(lblstayhome);

		//      Add your own picture by setting the path
		image = new JLabel("");
		image.setIcon(new ImageIcon("G:\\ISUTC\\II Semestre\\Programa��o III\\Semana XI\\Farmacia\\pro\\Prod.png"));
		image.setBounds(0, 0, 614, 351);
		panel.add(image);
		
		btnSair.addActionListener(this);
		btnGravar.addActionListener(this);
		btnActualizar.addActionListener(this);

		actualizarTabela();
		System.out.println("Montante linhas " + model.getRowCount());
	
		this.setVisible(true);	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSair) {
			new MenuPrincipal();
			this.dispose();
		}
		if(e.getSource()==btnGravar) {
			StringBuffer cod= new StringBuffer();
			cod.append(textCodigo.getText());
			StringBuffer nome=new StringBuffer();
			nome.append(textNome.getText());
			StringBuffer nuit=new StringBuffer();
			nuit.append(textNuit.getText());
			Fornecedor fornecedor= new Fornecedor(cod, nome, nuit);
	
			
			if(fornecedores.encontrarFornecedor1(cod)) {
				JOptionPane.showMessageDialog(null, "O fornecedor ja existe!");
				
			}else {
				if(fornecedores.adicionarFornecedor(cod, nome, nuit)) {
					JOptionPane.showMessageDialog(null, "Fornecedor criado com sucesso!!");
					actualizarTabela();
					iteracaoSalvamentoFornecedor++;
					textCodigo.setText(String.valueOf(iteracaoSalvamentoFornecedor));
				}else {
					JOptionPane.showMessageDialog(null, "Erro ao criar o fornecedor!");
				}
				textNome.setText("");
				textNuit.setText("");
			}
			SwingUtilities.updateComponentTreeUI(this);	
			
		}
		if(e.getSource()==btnActualizar) {
			StringBuffer cod= new StringBuffer();
			cod.append(textActualizar.getText());
			StringBuffer nome=new StringBuffer();
			nome.append(textNome.getText());
			StringBuffer nuit=new StringBuffer();
			nuit.append(textNuit.getText());
			
			if(fornecedores.actualizarFornecedor(cod, nome, nuit)) {
				JOptionPane.showMessageDialog(null, "Fornecedor actulizado com sucesso!");
				actualizarTabela();
			}else {
				JOptionPane.showMessageDialog(null, "ERRO! Nao foi possivel actualizar fornecedor.");
			}
			SwingUtilities.updateComponentTreeUI(this);	
		}
	}
	//administrador
	public void actualizarTabela(){
		for (int i=model.getRowCount(); 0<i;i--){
			model.removeRow(i-1);
		}
		for (int i=Fornecedores.getFornecedores().size()-1; 0<=i;i--){
			Fornecedor adicionarTabela = Fornecedores.getFornecedores().get(i);
			model.addRow(new Object[]{adicionarTabela.getCodigo(),adicionarTabela.getNome(),
					adicionarTabela.getNuit()});
		}
		SwingUtilities.updateComponentTreeUI(this);
	}
}

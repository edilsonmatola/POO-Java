package telasFarmacia;

import company.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import actualizacao.actualizacao;

public class RegistroProdutos extends JFrame implements ActionListener, MouseListener, actualizacao{
	private JLabel lblGravadocomsucesso,  lbcodigo, lblRegistroArmazem,
					imagem, lblstayhome,lblNome,lblStock, lblArmazens, lblPrecoUnitario, lblIdActualizar;
	private final JButton btnActualizar, btnGravar, btnSair;
	private final JTable table_2;
	private final JPanel panel_1;
	private final JScrollPane scrollPane;
	private  JTextField textArmazem, txtStockMinimo, textNome,txtcodigo, textPrecoUnitario, textId;
	private final DefaultTableModel model;
	private final JComboBox comboBox, comboBoxArmazem, categorias;
	static String[] nomeFornecedores, nomeArmazens, nomeCategorias;
	static int codigoIteracao=1;
	Date hoje = new Date();
	
		
	public RegistroProdutos() {
		this.setResizable(false);
		this.setTitle("Registro De Produtos");
		this.setSize(636,392);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblGravadocomsucesso = new JLabel("Gravado Com Sucesso!");
		lblGravadocomsucesso.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGravadocomsucesso.setForeground(Color.BLACK);
		lblGravadocomsucesso.setBounds(123, 331, 137, 14);
		panel.add(lblGravadocomsucesso);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(270, 328, 106, 23);
		panel.add(btnActualizar);
		
		btnGravar = new JButton("Gravar");
		btnGravar.setBounds(386, 328, 89, 23);
		panel.add(btnGravar);
		
		lbcodigo = new JLabel("Codigo:");
		lbcodigo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbcodigo.setBounds(10, 96, 68, 23);
		panel.add(lbcodigo);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(85, 98, 46, 20);
		txtcodigo.setText(String.valueOf(codigoIteracao));
		txtcodigo.setEditable(false);
		panel.add(txtcodigo);
		txtcodigo.setColumns(10);

		lblPrecoUnitario = new JLabel("Preco unitario:");
		lblPrecoUnitario.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPrecoUnitario.setBounds(190, 96, 100, 23);
		panel.add(lblPrecoUnitario);

		textPrecoUnitario = new JTextField();
		textPrecoUnitario.setBounds(290, 96, 76, 20);
		panel.add(textPrecoUnitario);
		
		lblRegistroArmazem = new JLabel("Registro De Produtos");
		lblRegistroArmazem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroArmazem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblRegistroArmazem.setBounds(123, 11, 323, 73);
		panel.add(lblRegistroArmazem);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 215, 607, 102);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 606, 102);
		panel_1.add(scrollPane);
	
		model= new DefaultTableModel();
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		table_2.setModel(model);
		model.addColumn("Codigo");
		model.addColumn("Nome");
		model.addColumn("Armazem");
		model.addColumn("Quantidade");
		model.addColumn("Fornecedor");
		model.addColumn("Categoria");
		model.addColumn("Preco unitario");
	
		btnSair = new JButton("Sair");
		btnSair.setBounds(506, 328, 89, 23);
		panel.add(btnSair);
		
		lblArmazens = new JLabel("Armazem:");
		lblArmazens.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblArmazens.setBounds(10, 130, 106, 23);
		panel.add(lblArmazens);


		comboBoxArmazem = new JComboBox();
		nomeArmazens= new String[Armazens.getArmazens().size()];
		for (int i = 0; i < Armazens.getArmazens().size(); i++) {
			nomeArmazens[i]=String.valueOf(Armazens.getArmazens().get(i).getNome());
		}
		comboBoxArmazem.setModel(new DefaultComboBoxModel(nomeArmazens));
		comboBoxArmazem.setToolTipText("Escolha um armazem");
		comboBoxArmazem.setBounds(90, 130, 240, 20);
		panel.add(comboBoxArmazem);


		lblIdActualizar = new JLabel("Id por actualizar");
		lblIdActualizar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIdActualizar.setBounds(360, 130, 150, 23);
		panel.add(lblIdActualizar);

		textId = new JTextField();
		textId.setBounds(490, 130, 46, 20);
		panel.add(textId);


	
		lblStock = new JLabel("Stock Minimo:");
		lblStock.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblStock.setBounds(10, 161, 119, 23);
		panel.add(lblStock);

		categorias = new JComboBox();
		nomeCategorias = new String[]{"Dermatologia", "Oftalmologia", "Infectologia", "Otorrinolaringologista", "outra"};
		categorias.setModel(new DefaultComboBoxModel(nomeCategorias));
		categorias.setToolTipText("Escolha a cetegoria");
		categorias.setBounds(377, 158, 220, 23);
		panel.add(categorias);
	
		txtStockMinimo = new JTextField();
		txtStockMinimo.setColumns(10);
		txtStockMinimo.setBounds(130, 160, 46, 20);
		panel.add(txtStockMinimo);
	
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNome.setBounds(10, 182, 68, 23);
		panel.add(lblNome);
	
		textNome = new JTextField();
		textNome.setBounds(73, 184, 280, 20);
		panel.add(textNome);
		textNome.setColumns(10);

		comboBox = new JComboBox();
		nomeFornecedores= new String[Fornecedores.getFornecedores().size()];
		for (int i = 0; i < Fornecedores.getFornecedores().size(); i++) {
			nomeFornecedores[i]=String.valueOf(Fornecedores.getFornecedores().get(i).getNome());
		}
		comboBox.setModel(new DefaultComboBoxModel(nomeFornecedores));
		comboBox.setToolTipText("Escolha um fornecedor");
		comboBox.setBounds(377, 184, 240, 20);
		panel.add(comboBox);

		if (Armazens.getArmazens().size() ==0 || Fornecedores.getFornecedores().size() == 0){
			btnGravar.setEnabled(false);
			btnActualizar.setEnabled(false);
		}
		else {
			btnGravar.setEnabled(true);
			btnActualizar.setEnabled(true);
		}


	
	
	
		lblstayhome = new JLabel("#StayHome");
		lblstayhome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblstayhome.setForeground(Color.BLACK);
		lblstayhome.setBounds(528, 95, 89, 23);
		panel.add(lblstayhome);

//		Add your own image path for the screen
		imagem = new JLabel("");
		imagem.setIcon(new ImageIcon("G:\\ISUTC\\II Semestre\\Programa��o III\\Semana XI\\Farmacia\\pro\\pro.jpg"));
		imagem.setBounds(0, 0, 630, 364);
		panel.add(imagem);
		
		btnSair.addActionListener(this);
		btnGravar.addActionListener(this);
		btnActualizar.addActionListener(this::actionPerformed);

		table_2.addMouseListener(this);

		actualizarTabela();
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSair) {
			new MenuPrincipal();
			this.dispose();
		}
		if (e.getSource() == btnGravar){
			StringBuffer codigo = new StringBuffer(txtcodigo.getText());
			StringBuffer nome = new StringBuffer(textNome.getText());
			StringBuffer armazem = new StringBuffer(comboBoxArmazem.getSelectedItem().toString());
			boolean stockMinimo;
			stockMinimo = Integer.parseInt(txtStockMinimo.getText()) <= 5;
			int stock = Integer.parseInt(txtStockMinimo.getText());
			StringBuffer fornecedor = new StringBuffer(comboBox.getSelectedItem().toString());
			StringBuffer categoria = new StringBuffer(categorias.getSelectedItem().toString());
			double precoUnitario = Double.parseDouble(textPrecoUnitario.getText());
			int idArmazemPertencente = 0;
			StringBuffer idfornecedorPertencente = null;

			for (int i=0; i<Armazens.getArmazens().size(); i++){
				Armazem armazemEncontrado = Armazens.getArmazens().get(i);
				if ((armazemEncontrado.getNome().toString()).equals(armazem.toString())){
					idArmazemPertencente = armazemEncontrado.getNumero();
				}
			}

			for(int j=0; j<Fornecedores.getFornecedores().size(); j++){
				Fornecedor fornecedorEncontrado = Fornecedores.getFornecedores().get(j);
				if ((fornecedorEncontrado.getNome().toString()).equals(fornecedor.toString())){
					idfornecedorPertencente = fornecedorEncontrado.getCodigo();
				}
			}

			if (Produtos.adicionarProduto(codigo, nome, armazem, idArmazemPertencente,stockMinimo, stock, fornecedor, idfornecedorPertencente, precoUnitario, hoje, categoria)){
				actualizarTabela();
				codigoIteracao++;
				txtcodigo.setText(String.valueOf(codigoIteracao));
			}else {
				System.out.println("Erro....");
				actualizarTabela();
			}

		}

		if (e.getSource() == btnActualizar){
			StringBuffer codigo = new StringBuffer(textId.getText());
			StringBuffer nome = new StringBuffer(textNome.getText());
			StringBuffer armazem = new StringBuffer(comboBoxArmazem.getSelectedItem().toString());
			boolean stockMinimo;
			stockMinimo = Integer.parseInt(txtStockMinimo.getText()) <= 5;
			int stock = Integer.parseInt(txtStockMinimo.getText());
			StringBuffer fornecedor = new StringBuffer(comboBox.getSelectedItem().toString());
			StringBuffer categoria = new StringBuffer(categorias.getSelectedItem().toString());
			double precoUnitario = Double.parseDouble(textPrecoUnitario.getText());

			if (Produtos.actualizarProduto(codigo, nome, armazem, stockMinimo, stock, fornecedor, precoUnitario, hoje, categoria)){
				Produto produtoActualizado = Produtos.encontrarProduto(codigo);
				actualizarIdsArmazemFornecedor(produtoActualizado, armazem, fornecedor);
				actualizarTabela();
				textId.setText("");
			}else {
				JOptionPane.showMessageDialog(null, "Produto nao encontrado!");
				actualizarTabela();
			}
		}
	}

	//Para que update de fornecedor e armazem se reflicta de verdade
	public static void actualizarProdutos(){
		ArrayList<Produto> produtosExistentes = new ArrayList<Produto>();
		for (int i=0; i<Armazens.getArmazens().size();i++){
			Armazem armazemExistente = Armazens.getArmazens().get(i);
			ArrayList<Produto> produtoExistente = armazemExistente.getProdutosArmazenados();
			for (int k=0; k<produtoExistente.size();k++){
				produtosExistentes.add(produtoExistente.get(k));
				int codigoProdutoExistente = produtoExistente.get(k).getCodigoArmazemPertencente();
				if ( codigoProdutoExistente == armazemExistente.getNumero()){
					produtoExistente.get(k).setArmazem(armazemExistente.getNome());
				}
			}
		}
		for (int j=0; j<Fornecedores.getFornecedores().size();j++){
			Fornecedor fornecedorExistente = Fornecedores.getFornecedores().get(j);
			for (int k=0; k<produtosExistentes.size();k++){
				Produto produtoExistente = produtosExistentes.get(k);
				if((fornecedorExistente.getCodigo().toString()).equals(produtoExistente.getCodigoFornecedorPertencente().toString())){
					produtoExistente.setFornecedor(fornecedorExistente.getNome());
				}
			}
		}


	}

	public void actualizarIdsArmazemFornecedor(Produto produto, StringBuffer armazem, StringBuffer fornecedor){
		for (int i=0; i<Armazens.getArmazens().size(); i++){
			if ((Armazens.getArmazens().get(i).getNome().toString()).equals(armazem.toString())){
				produto.setCodigoArmazemPertencente(Armazens.getArmazens().get(i).getNumero());
			}
		}

		for(int j=0; j<Fornecedores.getFornecedores().size(); j++){
			if ((Fornecedores.getFornecedores().get(j).getNome().toString()).equals(fornecedor.toString())){
				produto.setCodigoFornecedorPertencente(Fornecedores.getFornecedores().get(j).getCodigo());
			}
		}
	}

	public void actualizarTabela(){
		for (int i=model.getRowCount(); 0<i;i--){
			model.removeRow(i-1);
		}
		System.out.println("Quantidade de armazens " + Armazens.getArmazens().size());
		actualizarProdutos();
		for (int i=0; i<Armazens.getArmazens().size(); i++){
			for (int j=0; j<Armazens.getArmazens().get(i).getProdutosArmazenados().size();j++){
				Produto adicionarTabela = Armazens.getArmazens().get(i).getProdutosArmazenados().get(j);
				model.addRow(new Object[]{adicionarTabela.getId(), adicionarTabela.getNome(),
						adicionarTabela.getArmazem(), adicionarTabela.getStock(),
						adicionarTabela.getFornecedor(),adicionarTabela.getCategoria(),
						adicionarTabela.getPrecoUnitario()});
			}
		}
		SwingUtilities.updateComponentTreeUI(this);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == table_2){
			DefaultTableModel modelo = (DefaultTableModel) table_2.getModel();
			final int lihaSelecionada = table_2.rowAtPoint(e.getPoint());
			JOptionPane.showMessageDialog(null, model.getValueAt(lihaSelecionada, 1).toString());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}

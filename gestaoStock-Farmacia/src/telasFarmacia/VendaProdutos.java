package telasFarmacia;

import company.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VendaProdutos extends JFrame implements ActionListener, MouseListener {

	
	private JButton btnVender, btnSair, btnListarCarrinho;
	private JTable table_2;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTextField txtIdCliente,txtNomeCliente,txtPrecosemIva, txtPrecocomIva,txtPrecoTotal,txtSaldoCliente, txtQtProdutos, txtSaldoGerente;
	private JLabel lblstayhome,imagem, clienteInexistente, lblquantidadeProdutos;
	private String[] nomeCategorias;
	private JComboBox categorias;
	private DefaultTableModel model;
	private JPanel panel;
	private Cliente clienteEncontrado = null;
	public VendaProdutos() {
		this.setResizable(false);
		this.setTitle("Venda Produtos");
		this.setSize(636,392);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(402, 328, 89, 23);
		panel.add(btnVender);
		
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
		table_2.setEnabled(false);
		model.addColumn("Codigo");
		model.addColumn("Nome");
		model.addColumn("Quantidade");
		model.addColumn("Categoria");
		model.addColumn("Preco unitario");


		/*scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 606, 102);
		panel_1.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Armazem", "Stock Minimo", "Quantidade", "Nome", "Fornecedor"
			}
		));*/

		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBounds(200, 328, 89, 23);
		panel.add(btnApagar);

		btnListarCarrinho = new JButton("Carrinho");
		btnListarCarrinho.setBounds(303, 328, 89, 23);
		panel.add(btnListarCarrinho);

		btnSair = new JButton("Sair");
		btnSair.setBounds(506, 328, 89, 23);
		panel.add(btnSair);
		
		JLabel lblIdCliente = new JLabel("ID Cliente");
		lblIdCliente.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIdCliente.setBounds(10, 94, 110, 19);
		panel.add(lblIdCliente);

		clienteInexistente = new JLabel("Cliente nao encontrado");
		clienteInexistente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		clienteInexistente.setForeground(Color.RED);
		clienteInexistente.setBounds(220, 104, 180, 19);


		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(121, 95, 86, 20);
		panel.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeCliente.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNomeCliente.setBounds(10, 131, 125, 14);
		panel.add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(121, 125, 155, 20);
		txtNomeCliente.setEditable(false);
		panel.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);

		categorias = new JComboBox();
		nomeCategorias = new String[]{"Dermatologia", "Oftalmologia", "Infectologia", "Otorrinolaringologista","Todos"};
		categorias.setModel(new DefaultComboBoxModel(nomeCategorias));
		categorias.setToolTipText("Escolha a cetegoria");
		categorias.setBounds(402, 88, 220, 23);
		panel.add(categorias);
		
		JLabel lblPrecoSemIva = new JLabel("Preco sem IVA");
		lblPrecoSemIva.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPrecoSemIva.setBounds(402, 154, 119, 14);
		panel.add(lblPrecoSemIva);
		
		txtPrecosemIva = new JTextField();
		txtPrecosemIva.setBounds(531, 153, 86, 20);
		txtPrecosemIva.setEditable(false);
		panel.add(txtPrecosemIva);
		txtPrecosemIva.setColumns(10);
		
		JLabel lblPrecoComIva = new JLabel("Preco com IVA");
		lblPrecoComIva.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPrecoComIva.setBounds(402, 123, 119, 20);
		panel.add(lblPrecoComIva);
		
		txtPrecocomIva = new JTextField();
		txtPrecocomIva.setBounds(531, 117, 86, 20);
			txtPrecocomIva.setEditable(false);
		panel.add(txtPrecocomIva);
		txtPrecocomIva.setColumns(10);

		txtSaldoGerente = new JTextField();
		txtSaldoGerente.setBounds(10, 328, 86, 20);
		txtSaldoGerente.setEditable(false);
		txtSaldoGerente.setToolTipText("Saldo do gerente");
		txtSaldoGerente.setText(String.valueOf(Produtos.getSaldoDoGerente()));
		panel.add(txtSaldoGerente);
		txtSaldoGerente.setColumns(10);
		
		JLabel lblPrecoTotal = new JLabel("Preco Total");
		lblPrecoTotal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPrecoTotal.setBounds(402, 190, 119, 14);
		panel.add(lblPrecoTotal);
		
		txtPrecoTotal = new JTextField();
		txtPrecoTotal.setBounds(531, 184, 86, 20);
		txtPrecoTotal.setEditable(false);
		panel.add(txtPrecoTotal);
		txtPrecoTotal.setColumns(10);
		
		JLabel lblSaldoCliente = new JLabel("Saldo Cliente");
		lblSaldoCliente.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSaldoCliente.setBounds(10, 162, 110, 14);
		panel.add(lblSaldoCliente);

		JLabel lblqtProdutos = new JLabel("Qt de produtos");
		lblqtProdutos.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblqtProdutos.setBounds(10, 190, 120, 14);
		panel.add(lblqtProdutos);
		
		txtSaldoCliente = new JTextField();
		txtSaldoCliente.setBounds(121, 158, 86, 20);
		txtSaldoCliente.setEditable(false);
		panel.add(txtSaldoCliente);
		txtSaldoCliente.setColumns(10);

		txtQtProdutos = new JTextField();
		txtQtProdutos.setBounds(121, 188, 86, 20);
		panel.add(txtQtProdutos);
		txtQtProdutos.setColumns(10);


		txtQtProdutos.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				String value = txtQtProdutos.getText();
				int l = value.length();
				if ((ke.getKeyChar() >= '1' && ke.getKeyChar() <= '9') || ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
					txtQtProdutos.setEditable(true);
				}else {
					txtQtProdutos.setEditable(false);
				}
			}
		});


		
		JLabel lblVendaProdutos = new JLabel("Venda Produtos");
		lblVendaProdutos.setForeground(Color.BLUE);
		lblVendaProdutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendaProdutos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblVendaProdutos.setBounds(10, 11, 279, 82);
		panel.add(lblVendaProdutos);
		
		lblstayhome = new JLabel("#StayHome");
		lblstayhome.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblstayhome.setForeground(Color.RED);
		lblstayhome.setBounds(517, 11, 100, 19);
		panel.add(lblstayhome);

//		Add your own image path for the screen
		imagem = new JLabel("");
		imagem.setIcon(new ImageIcon("G:\\ISUTC\\II Semestre\\Programa��o III\\Semana XI\\Farmacia\\pro\\44.jpg"));
		imagem.setBounds(0, 0, 630, 364);
		panel.add(imagem);


		btnSair.addActionListener(this::actionPerformed);
		btnVender.addActionListener(this::actionPerformed);
		btnListarCarrinho.addActionListener(this::actionPerformed);
		categorias.addMouseListener(this);
		txtIdCliente.addMouseListener(this);
		table_2.addMouseListener(this);



		actualizarTabela(new StringBuffer("Todos"));

		this.setVisible(true);
	}

	public void actualizarTabela(StringBuffer categoria){
		for (int i=model.getRowCount(); 0<i;i--){
			model.removeRow(i-1);
		}
		RegistroProdutos.actualizarProdutos();
		for (int i=0; i<Armazens.getArmazens().size(); i++){
			for (int j=0; j<Armazens.getArmazens().get(i).getProdutosArmazenados().size();j++){
				Produto adicionarTabela = Armazens.getArmazens().get(i).getProdutosArmazenados().get(j);
				if (adicionarTabela.getCategoria().toString().equals(categoria.toString())){
					model.addRow(new Object[]{adicionarTabela.getId(), adicionarTabela.getNome(),
							adicionarTabela.getStock(),
							adicionarTabela.getCategoria(),
							adicionarTabela.getPrecoUnitario()});
				}else {
					if (categoria.toString().equals("Todos")){
						model.addRow(new Object[]{adicionarTabela.getId(), adicionarTabela.getNome(),
								adicionarTabela.getStock(),
								adicionarTabela.getCategoria(),
								adicionarTabela.getPrecoUnitario()});
					}
				}
			}
		}
		SwingUtilities.updateComponentTreeUI(this);
	}

	public void listarCarrinho(){
		if (clienteEncontrado != null){
			for (int i=model.getRowCount(); 0<i;i--){
				model.removeRow(i-1);
			}
			for (int j=0; j<clienteEncontrado.getCarrinhoCompras().size();j++){
				Produto adicionarTabela =clienteEncontrado.getCarrinhoCompras().get(j);
				model.addRow(new Object[]{adicionarTabela.getId(), adicionarTabela.getNome(),
						adicionarTabela.getQtCompra(),
						adicionarTabela.getCategoria(),
						adicionarTabela.getPrecoUnitario()});
			}
			SwingUtilities.updateComponentTreeUI(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSair){
			new MenuPrincipal();
			this.dispose();
		}

		if (e.getSource() == btnListarCarrinho){
			listarCarrinho();
			System.out.println("Crr");
		}

		if (e.getSource() == btnVender){
			Produtos.venderProduto(clienteEncontrado.getId());
			txtSaldoGerente.setText(String.valueOf(Produtos.getSaldoDoGerente()));
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == table_2){
			DefaultTableModel modelo = (DefaultTableModel) table_2.getModel();
			int lihaSelecionada = table_2.rowAtPoint(e.getPoint());
			int codigoDoProduto = Integer.parseInt(model.getValueAt(lihaSelecionada, 0).toString());
			System.out.println("CLICKED on " + new StringBuffer(String.valueOf(codigoDoProduto)));
			int qtProduto = Integer.parseInt(txtQtProdutos.getText());

			if (qtProduto!=0){
				if (clienteEncontrado != null){
					Clientes.adicionarAoCarrinho(new StringBuffer(clienteEncontrado.getId()),new StringBuffer(String.valueOf(codigoDoProduto)),qtProduto);
					double precoSemIva=0;
					double precoComIva=0;
					for (int i=0;i<clienteEncontrado.getCarrinhoCompras().size();i++){
						precoSemIva += clienteEncontrado.getCarrinhoCompras().get(i).getPrecoUnitario()*clienteEncontrado.getCarrinhoCompras().get(i).getQtCompra();
					}
					precoComIva = precoSemIva*1.17;
					txtPrecosemIva.setText(String.valueOf(precoSemIva));
					txtPrecocomIva.setText(String.valueOf(precoComIva));
					txtPrecoTotal.setText(String.valueOf(precoComIva));
				}
			}


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
		if (e.getSource() == categorias){
			StringBuffer categoriaSelecionada = new StringBuffer(categorias.getSelectedItem().toString());
			actualizarTabela(categoriaSelecionada);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == txtIdCliente){
			clienteEncontrado = Clientes.encontrarCliente(new StringBuffer(txtIdCliente.getText()));
			if (clienteEncontrado!= null){
				txtNomeCliente.setText(clienteEncontrado.getNome().toString());
				String saldo = String.valueOf(clienteEncontrado.getSaldo());
				txtSaldoCliente.setText(saldo);
				panel.remove(clienteInexistente);
				SwingUtilities.updateComponentTreeUI(this);
			}else {
				txtIdCliente.setText("");
				txtNomeCliente.setText("");
				txtSaldoCliente.setText("");
				txtPrecosemIva.setText("");
				txtPrecoTotal.setText("");
				txtPrecocomIva.setText("");
				panel.add(clienteInexistente);
				SwingUtilities.updateComponentTreeUI(this);
			}
		}
	}
}

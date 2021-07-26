package telasFarmacia;

import company.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import actualizacao.actualizacao;

public class StockMinimo extends JFrame implements ActionListener, actualizacao{
	private JLabel lblRegistroArmazem,  lblstayhome, lblListaDeProdutos, image;
	private JTable table_2;
	private JScrollPane scrollPane;
	private JButton btnListar,btnTopCinco, btnSair;
	private DefaultTableModel model;

	public StockMinimo() {
		this.setTitle("Stock Minimo");
		this.setSize(636,329);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		//this.setResizable(false);
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblRegistroArmazem = new JLabel("Stock Minimo");
		lblRegistroArmazem.setForeground(Color.WHITE);
		lblRegistroArmazem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroArmazem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblRegistroArmazem.setBounds(228, 0, 399, 73);
		panel.add(lblRegistroArmazem);
		
		
		
		lblstayhome = new JLabel("#StayHome");
		lblstayhome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblstayhome.setForeground(Color.BLACK);
		lblstayhome.setBounds(11, 247, 89, 23);
		panel.add(lblstayhome);
		
		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(11, 134, 606, 102);
		panel.add(scrollPane);

		model= new DefaultTableModel();
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		table_2.setModel(model);
		model.addColumn("Numero");
		model.addColumn("Stock Minimo");
		model.addColumn("Armazem");
		model.addColumn("Nome");
		model.addColumn("Quantidade de compra");
		
		lblListaDeProdutos = new JLabel("Lista De Produtos que o Stock e Minimo");
		lblListaDeProdutos.setForeground(Color.WHITE);
		lblListaDeProdutos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblListaDeProdutos.setBounds(356, 96, 254, 14);
		panel.add(lblListaDeProdutos);
		
		btnListar = new JButton("Stock Minimo");
		btnListar.setMnemonic(KeyEvent.VK_S);
		btnListar.setBounds(374, 257, 137, 23);
		panel.add(btnListar);

		btnTopCinco = new JButton("Top 5");
		btnTopCinco.setMnemonic(KeyEvent.VK_T);
		btnTopCinco.setToolTipText("Top 5 produtos mais vendidos");
		btnTopCinco.setBounds(224, 257, 137, 23);
		panel.add(btnTopCinco);
		
		btnSair = new JButton("Sair");
		btnSair.setMnemonic(KeyEvent.VK_S);
		btnSair.setBounds(521, 257, 89, 23);
		panel.add(btnSair);

//		add your own image path
		image = new JLabel("");
		image.setIcon(new ImageIcon("c:\\hugo\\pro\\2222.jpg"));
		image.setBounds(0, 0, 617, 291);
		panel.add(image);

		btnSair.addActionListener(this);
		btnTopCinco.addActionListener(this);
		btnListar.addActionListener(this::actionPerformed);

		actualizarTabela();

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSair) {
			new MenuPrincipal();
			this.dispose();
		}

		if (e.getSource() == btnTopCinco){
			Produto[] topCinco = Produtos.relatarCincoProdutosMaisVendidos();
			for (int i=model.getRowCount(); 0<i ; i--){
				model.removeRow(i-1);
			}

			if (topCinco!=null){
				for (int i=0; i<5; i++){
					Produto adicionarTabela = topCinco[i];
					model.addRow(new Object[]{adicionarTabela.getId(), adicionarTabela.getStock(),
							adicionarTabela.getArmazem(), adicionarTabela.getNome(),adicionarTabela.getQtCompra()});
				}
			}
			SwingUtilities.updateComponentTreeUI(this);
		}

		if (e.getSource() == btnListar){
			actualizarTabela();
		}
	}

	public void actualizarTabela(){
		for (int i=model.getRowCount(); 0<i;i--){
			model.removeRow(i-1);
		}

		for (int i=0; i<Armazens.getArmazens().size(); i++){
			for (int j=0; j<Armazens.getArmazens().get(i).getProdutosArmazenados().size();j++){
				Produto adicionarTabela = Armazens.getArmazens().get(i).getProdutosArmazenados().get(j);
				if (adicionarTabela.getStock()<=5){
					model.addRow(new Object[]{adicionarTabela.getId(), adicionarTabela.getStock(),
							adicionarTabela.getArmazem(), adicionarTabela.getNome(), adicionarTabela.getQtCompra()});
				}
			}
		}
		SwingUtilities.updateComponentTreeUI(this);
	}
}

package telasFarmacia;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import company.Armazem;
import company.Armazens;
import actualizacao.actualizacao;


public class RegistroArmazem extends JFrame implements ActionListener, MouseListener, actualizacao{
	private JTextField textNumero;
	private JLabel lblNome, lblNumero_1, lblRegistroArmazem, imagem, lblstayhome, lblFiltro, lblNome_1;
	private JTextField textNome;
	private JLabel lblGravadocomsucesso, lblNaoGravado;
	private JButton btnActualizar, btnGravar, btnLimpar, btnEliminar, btnProcurar, btnSair;
	private JTextField txtnome1, txtNumero2;
	private JTable table_2;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private JPanel panel;
	static int numero=1;
	public static Armazens armazens= new Armazens();

	
	public RegistroArmazem() {
		this.setResizable(false);
		this.setTitle("Log In");
		this.setSize(636,392);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setForeground(Color.BLACK);
		lblNumero.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNumero.setBounds(32, 23, 84, 14);
		panel.add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setBounds(126, 21, 54, 20);
		panel.add(textNumero);
		textNumero.setColumns(10);
		textNumero.setText(String.valueOf(numero));
		textNumero.setEditable(false);
		
		lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNome.setBounds(32, 54, 46, 14);
		panel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(94, 48, 86, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		lblGravadocomsucesso = new JLabel("GravadoComSucesso");
		lblGravadocomsucesso.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGravadocomsucesso.setForeground(Color.GREEN);
		lblGravadocomsucesso.setBounds(188, 68, 137, 14);

		lblNaoGravado = new JLabel("O armazem ja existe!");
		lblNaoGravado.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNaoGravado.setForeground(Color.RED);
		lblNaoGravado.setBounds(188, 68, 157, 14);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(10, 93, 106, 23);
		panel.add(btnActualizar);
		
		btnGravar = new JButton("Gravar");
		btnGravar.setBounds(120, 93, 89, 23);
		panel.add(btnGravar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(219, 90, 89, 23);
		panel.add(btnEliminar);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(318, 90, 89, 23);
		panel.add(btnLimpar);

		
		lblFiltro = new JLabel("Filtro");
		lblFiltro.setForeground(Color.BLACK);
		lblFiltro.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFiltro.setBounds(152, 123, 46, 14);
		panel.add(lblFiltro);
		
		lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNome_1.setBounds(10, 143, 46, 14);
		panel.add(lblNome_1);
		
		txtnome1 = new JTextField();
		txtnome1.setBounds(66, 141, 86, 20);
		panel.add(txtnome1);
		txtnome1.setColumns(10);
		
		lblNumero_1 = new JLabel("Numero:");
		lblNumero_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNumero_1.setBounds(10, 172, 84, 14);
		panel.add(lblNumero_1);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(76, 172, 86, 20);
		panel.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(219, 152, 89, 23);
		panel.add(btnProcurar);
		
		lblRegistroArmazem = new JLabel("Registro De Armazem");
		lblRegistroArmazem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroArmazem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblRegistroArmazem.setBounds(300, 18, 323, 73);
		panel.add(lblRegistroArmazem);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 215, 607, 102);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 606, 102);
		panel_1.add(scrollPane);


		scrollPane.getViewport().add(table_2, null);
		model = new DefaultTableModel();
		table_2 = new JTable();
		table_2.setEnabled(false);
		scrollPane.setViewportView(table_2);


		table_2.setModel(model);
		model.addColumn("Numero");
		model.addColumn("Nome");


		btnSair = new JButton("Sair");
		btnSair.setBounds(506, 328, 89, 23);
		panel.add(btnSair);
		
		lblstayhome = new JLabel("#StayHome");
		lblstayhome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblstayhome.setForeground(Color.RED);
		lblstayhome.setBounds(10, 332, 106, 19);
		panel.add(lblstayhome);

		//      Add your own picture by setting the path
		imagem = new JLabel("");
		imagem.setIcon(new ImageIcon("G:\\ISUTC\\II Semestre\\Programa��o III\\Semana XI\\Farmacia\\pro\\armazem.jpg"));
		imagem.setBounds(0, 0, 630, 364);
		panel.add(imagem);
		
		btnSair.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnGravar.addActionListener(this);
		btnEliminar.addActionListener(this::actionPerformed);
		btnActualizar.addActionListener(this);
		btnProcurar.addActionListener(this::actionPerformed);

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
		if(e.getSource()==btnLimpar) {
			textNome.setText("");
			actualizarTabela();
		}
		if(e.getSource()==btnGravar) {
			StringBuffer nome= new StringBuffer();
			nome.append(textNome.getText());

			if(armazens.adicionarArmazem(numero, nome)) {
				actualizarTabela();
				numero++;

				panel.add(lblGravadocomsucesso);
				SwingUtilities.updateComponentTreeUI(this);

				new java.util.Timer().schedule(
						new java.util.TimerTask() {
							@Override
							public void run() {
								panel.remove(lblGravadocomsucesso);
								actualizarFrame();
							}
						},
						1000
				);
			}else {

				panel.add(lblNaoGravado);
				SwingUtilities.updateComponentTreeUI(this);

				new java.util.Timer().schedule(
						new java.util.TimerTask() {
							@Override
							public void run() {
								panel.remove(lblNaoGravado);
								actualizarFrame();
							}
						},
						1000
				);
			}

			textNumero.setText(String.valueOf(numero));
			textNome.setText("");


			SwingUtilities.updateComponentTreeUI(this);	
		}
		
		if(e.getSource()==btnActualizar) {
			try{
				int numero=Integer.parseInt(txtNumero2.getText());
				StringBuffer nome=new StringBuffer();
				nome.append(txtnome1.getText());
				if(armazens.actualizarArmazem(numero, nome)) {
					JOptionPane.showMessageDialog(null, "Armazem actualizado com sucesso");
					actualizarTabela();
				}else {
					JOptionPane.showMessageDialog(null, "ERRO! Falha ao actualizar o armazem");
				}
				txtNumero2.setText("");
				txtnome1.setText("");
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "Caixa vazia " + ex.getMessage());
			}
			
			SwingUtilities.updateComponentTreeUI(this);	
			
		}

		if (e.getSource() == btnProcurar){
			Armazem armazemEncontradoPeloNome = null;
			Armazem armazemEncontradoPeloId = null;
			try {
				StringBuffer nome = new StringBuffer(txtnome1.getText());
				armazemEncontradoPeloNome = Armazens.encontrarArmazem(nome);
				int codigo = Integer.parseInt(txtNumero2.getText());
				armazemEncontradoPeloId = Armazens.encontrarArmazem(codigo);

			}catch (Exception ignored){

			}

			if (armazemEncontradoPeloNome != null){
				tabelarFiltro(armazemEncontradoPeloNome);
			}if (armazemEncontradoPeloId != null){
				tabelarFiltro(armazemEncontradoPeloId);
			}
			if (armazemEncontradoPeloNome == null && armazemEncontradoPeloId == null) {
				JOptionPane.showMessageDialog(null, "Armazem procurado nao existe");
			}
		}

		if (e.getSource() == btnEliminar){
			StringBuffer nome = new StringBuffer(textNome.getText());
			if (Armazens.encontrarArmazem(nome) != null){
				Armazens.getArmazens().remove(Armazens.encontrarArmazem(nome));
				actualizarTabela();
				JOptionPane.showMessageDialog(null,"Eliminado");
			}else {
				JOptionPane.showMessageDialog(null,"Nao encontrado");
			}
		}

	}

	public void actualizarFrame(){
		SwingUtilities.updateComponentTreeUI(this);
	}


	public void actualizarTabela(){
		for (int i=model.getRowCount(); 0<i;i--){
			model.removeRow(i-1);
		}
		for (int i=Armazens.getArmazens().size()-1; 0<=i;i--){
			Armazem adicionarTabela = Armazens.getArmazens().get(i);
			model.addRow(new Object[]{adicionarTabela.getNumero(),adicionarTabela.getNome()});
		}
		SwingUtilities.updateComponentTreeUI(this);
	}

	public void tabelarFiltro(Armazem armazem){
		for (int i=model.getRowCount(); 0<i;i--){
			model.removeRow(i-1);
		}

		model.addRow(new Object[]{armazem.getNumero(),armazem.getNome()});
		SwingUtilities.updateComponentTreeUI(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == table_2){
			DefaultTableModel model = (DefaultTableModel) table_2.getModel();
			final int selectedRow = table_2.rowAtPoint(e.getPoint());
			System.out.println("se " + selectedRow);
			JOptionPane.showMessageDialog(null, model.getValueAt(selectedRow, 1).toString());
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

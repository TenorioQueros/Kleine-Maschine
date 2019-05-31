package view;

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.processo;
import model.cpuMODEL;
import model.memoriaMODEL;
import model.processinhos;
import model.processosMODEL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import static java.lang.Thread.sleep;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import org.jfree.data.category.CategoryDataset;

public class Principal extends JFrame 
{
	public static DefaultTableModel modelo = new DefaultTableModel();
	public static JPanel pnlFundo;

	public static void main(String[] args) {
		//criaJTable();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal index = new Principal();
					index.setUndecorated(true);
					index.setVisible(true);
					index.setResizable(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		atualiza();

	}
	
	 private static void criaJTable() {
	        table = new JTable(modelo);
	        modelo.addColumn("PID");
	        modelo.addColumn("%CPU");
	        modelo.addColumn("%MEM");
	        modelo.addColumn("VSZ");
	        modelo.addColumn("RSS");
	        modelo.addColumn("Name");
	        table.getColumnModel().getColumn(0)
	        .setPreferredWidth(10);
	        table.getColumnModel().getColumn(1)
	        .setPreferredWidth(10);
	        table.getColumnModel().getColumn(2)
	        .setPreferredWidth(10);
	        table.getColumnModel().getColumn(3)
	        .setPreferredWidth(20);
	        table.getColumnModel().getColumn(4)
	        .setPreferredWidth(20);
	        table.getColumnModel().getColumn(5)
	        .setPreferredWidth(20);
	        atualiza();
//	      JPanel frame  = new JPanel();
//	        JScrollPane scrollPane = new JScrollPane(table);
//			
	        
//			frame.add(scrollPane, BorderLayout.CENTER);
//			frame.setBounds(260, 70, 455, 400);
//			frame.setVisible(true);
			
	    }

	public static void atualiza(){
		while (true) {
			try {
				nomeProc.setText(memoriaMODEL.nomeProcessador());
				so.setText(memoriaMODEL.sistemaOperacional());
				processo.qualquerCoisa();
				/*
				 * modelo.addRow(new Object [] {processo.ps.get(0).getPid(),
				 * processo.ps.get(1).getCpu(),processo.ps.get(2).getMemoria(),
				 * processo.ps.get(3).getVsz(),processo.ps.get(4).getRss(),processo.ps.get(5).
				 * getNome()});
				 */
				 sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	static JTable table = new JTable();
	static JLabel nomeProc = new JLabel();
	static JLabel so = new JLabel();

	public Principal() throws InterruptedException {
		cpuMODEL cpu = new cpuMODEL();
		//criaJTable();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 600);
		pnlFundo = new JPanel();
		pnlFundo.setForeground(new Color(255, 255, 255));
		pnlFundo.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(pnlFundo);
		pnlFundo.setLayout(null);
		pnlFundo.add(table);
		processosMODEL processosM = new processosMODEL();

		JPanel frame = new JPanel();

//		Object dados[][] = {{ processosMODEL.processos6(), processosMODEL.processos(), processosMODEL.processos2(),
//						processosMODEL.processos3(), processosMODEL.processos4(), processosMODEL.processos5() },
//				 };
		//Object colunas[] = { " PROGRAMA ", " PID", "CPU %", "MEMORIA % ", " VSZ", "RSS", };
		//table = new JTable(dados,colunas);
		

		

		// layout frufru

		// layout frufru
		// JLabel ID = new JLabel("ID DA MÁQUINA: "+cpu.cpuModel());
		// ID.setBounds(850, 10, 200, 100);
		// ID.setForeground(Color.black);
		// pnlFundo.add(ID);
		 table = new JTable(modelo);
	        modelo.addColumn("PID");
	        modelo.addColumn("%CPU");
	        modelo.addColumn("%MEM");
	        modelo.addColumn("VSZ");
	        modelo.addColumn("RSS");
	        modelo.addColumn("Name");
	        table.getColumnModel().getColumn(0).setPreferredWidth(30);
	        table.getColumnModel().getColumn(1)
	        .setPreferredWidth(30);
	        table.getColumnModel().getColumn(2)
	        .setPreferredWidth(30);
	        table.getColumnModel().getColumn(3)
	        .setPreferredWidth(30);
	        table.getColumnModel().getColumn(4)
	        .setPreferredWidth(30);
	        table.getColumnModel().getColumn(5)
	        .setPreferredWidth(30);
			table.setBounds(260, 100, 300, 300);
		  pnlFundo.add(table);
		  
		nomeProc.setText(memoriaMODEL.nomeProcessador());
		nomeProc.setBounds(720, 560, 300, 40);
		nomeProc.setFont(new Font("Cambria", Font.PLAIN, (14)));
		nomeProc.setForeground(Color.black);
		pnlFundo.add(nomeProc);

		so.setText(memoriaMODEL.sistemaOperacional());
		so.setBounds(600, 560, 300, 40);
		so.setFont(new Font("Cambria", Font.PLAIN, (14)));
		so.setForeground(Color.black);
		pnlFundo.add(so);

		JLabel btnAbrirMaximizado = new JLabel("");
		btnAbrirMaximizado.setBounds(10, 4, 60, 40);
		pnlFundo.add(btnAbrirMaximizado);
		btnAbrirMaximizado.setVisible(true);

		final JLabel esconder = new JLabel("");
		esconder.setVisible(true);
		esconder.setBounds(170, 510, 60, 80);
		pnlFundo.add(esconder);

		final JLabel btnCobrir = new JLabel("");
		// set bounds (DISTANCIA DA DIREITA PRA ESQUERDA, DISTANCIA DE CIMA PRA
		// BAIXO,tamanho da imagem, tamanho da imagem

		btnCobrir.setBounds(10, 4, 60, 40);
		pnlFundo.add(btnCobrir);
		btnCobrir.setVisible(false);
		btnCobrir.setIcon(new ImageIcon("img/002-list.png"));

		JLabel btnFechar = new JLabel("");
		// set bounds (DISTANCIA DA DIREITA PRA ESQUERDA, DISTANCIA DE CIMA PRA
		// BAIXO,tamanho da imagem, tamanho da imagem
		btnFechar.setBounds(965, 5, 40, 40);
		pnlFundo.add(btnFechar);

		final JLabel menu = new JLabel("");
		// set bounds (DISTANCIA DA DIREITA PRA ESQUERDA, DISTANCIA DE CIMA PRA
		// BAIXO,tamanho da imagem, tamanho da imagem
		menu.setBounds(2, 49, 233, 560);
		menu.setIcon(new ImageIcon("img/menuMaximizado.png"));
		menu.setVisible(false);
		pnlFundo.add(menu);

		final JLabel btnMonitoramentoMaquina = new JLabel("");
		btnMonitoramentoMaquina.setVisible(true);
		btnMonitoramentoMaquina.setBounds(2, 1, 225, 52);
		menu.add(btnMonitoramentoMaquina);

		final JLabel btnMonitoramentoTransacoes = new JLabel("");
		btnMonitoramentoTransacoes.setVisible(true);
		btnMonitoramentoTransacoes.setBounds(2, 60, 225, 52);
		menu.add(btnMonitoramentoTransacoes);

		final JLabel btnRelatorio = new JLabel("");
		btnRelatorio.setVisible(true);
		btnRelatorio.setBounds(1, 120, 225, 52);
		menu.add(btnRelatorio);

		final JLabel btnAjuda = new JLabel("");
		btnAjuda.setVisible(true);
		btnAjuda.setBounds(1, 177, 225, 52);
		menu.add(btnAjuda);

		final JLabel btnSair = new JLabel("");
		btnSair.setVisible(true);
		btnSair.setBounds(1, 235, 225, 52);
		menu.add(btnSair);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img/fundo.png"));
		label.setBounds(0, 0, 1031, 632);
		pnlFundo.add(label);

		// janela de monitoramento transações
		btnFechar.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
				login.setUndecorated(true);
				login.setVisible(true);
				dispose();
			}
		});

		btnAbrirMaximizado.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				menu.setVisible(true);
				btnCobrir.setVisible(true);

			}
		});

		esconder.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				menu.setVisible(false);
				btnCobrir.setVisible(false);
			}
		});

		btnMonitoramentoMaquina.addMouseListener((MouseListener) new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Maquina maquina = new Maquina();
				maquina.setUndecorated(true);
				maquina.setVisible(true);
				dispose();

			}
		});
		btnMonitoramentoTransacoes.addMouseListener((MouseListener) new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Transacoes trans = new Transacoes();
				trans.setUndecorated(true);
				trans.setVisible(true);
				dispose();

			}
		});
		btnRelatorio.addMouseListener((MouseListener) new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Relatorio relat = new Relatorio();
				relat.setVisible(true);
				dispose();

			}
		});
		btnAjuda.addMouseListener((MouseListener) new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Relatorio relat = new Relatorio();
				relat.setUndecorated(true);
				relat.setVisible(true);
				dispose();

			}
		});

		btnSair.addMouseListener((MouseListener) new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Object[] options = { "Sim", "Não" };
				int i = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Saída",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if (i == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		});

	}
}

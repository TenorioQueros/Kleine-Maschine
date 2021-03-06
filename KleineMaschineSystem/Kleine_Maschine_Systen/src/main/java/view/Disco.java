package view;

import static java.lang.Thread.sleep;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.cpuMODEL;
import model.discoMODEL;
import model.memoriaMODEL;

public class Disco extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disco disco = new Disco ();
					disco.setUndecorated(true);
					disco.setVisible(true);
					disco.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		atualiza();
	}
	public static void atualiza() {
		while(true) {
			try {
			//	nomeDisco.setText(discoMODEL.nomeDisco());
			//	tamanho.setText(discoMODEL.getDisksUsedPercentageAsString());
			
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
	}
	
	static JLabel nomeDisco = new JLabel();
	static JLabel tamanho = new JLabel();

	public Disco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 600);
		JPanel pnlFundo = new JPanel();
		pnlFundo.setForeground(new Color(255, 255, 255));
		pnlFundo.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(pnlFundo);
		pnlFundo.setLayout(null);
		
		
		//layout frufru
	
		
		//nomeDisco.setText(discoMODEL.nomeDisco());
		nomeDisco.setBounds(260, 401, 400, 100);
		nomeDisco.setFont(new Font("Cambria", Font.PLAIN, 20));
		nomeDisco.setForeground(Color.black);
		pnlFundo.add(nomeDisco);
		
		JLabel tamanhoDisk = new JLabel();
		tamanhoDisk.setText("Total");
		tamanhoDisk.setBounds(260, 490, 150, 40);
		tamanhoDisk.setFont(new Font("Cambria", Font.PLAIN, (14)));
		tamanhoDisk.setForeground(Color.black);
		pnlFundo.add(tamanhoDisk);

		tamanho.setText(discoMODEL.tamanhoDisco());
		tamanho.setBounds(260, 510, 70, 40);
		tamanho.setFont(new Font("Cambria", Font.PLAIN, (20)));
		tamanho.setForeground(Color.black);
		pnlFundo.add(tamanho);
		
		JLabel btnAbrirMaximizado = new JLabel("");
		btnAbrirMaximizado.setBounds(10, 4, 60, 40);	
		pnlFundo.add(btnAbrirMaximizado);
		btnAbrirMaximizado.setVisible(true);
		
		final JLabel esconder = new JLabel("");
		esconder.setVisible(true);
		esconder.setBounds(170,510,60, 80);
		pnlFundo.add(esconder);
		
		
		final JLabel btnCobrir = new JLabel("");
		//set bounds (DISTANCIA DA DIREITA PRA ESQUERDA, DISTANCIA DE CIMA PRA BAIXO,tamanho da imagem, tamanho da imagem

		btnCobrir.setBounds(10, 4, 60, 40);	
		pnlFundo.add(btnCobrir);
		btnCobrir.setVisible(false);
		btnCobrir.setIcon(new ImageIcon("img/002-list.png"));
	
		JLabel btnFechar = new JLabel("");
		//set bounds (DISTANCIA DA DIREITA PRA ESQUERDA, DISTANCIA DE CIMA PRA BAIXO,tamanho da imagem, tamanho da imagem
		btnFechar.setBounds(965, 5, 40, 40);	
		pnlFundo.add(btnFechar);
		
	
		
		final JLabel menu = new JLabel("");
		//set bounds (DISTANCIA DA DIREITA PRA ESQUERDA, DISTANCIA DE CIMA PRA BAIXO,tamanho da imagem, tamanho da imagem
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
		btnSair.setBounds(1, 120, 225, 52);
		//btnSair.setBounds(1, 235, 225, 52);
		menu.add(btnSair);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img/fundo - Disco.png"));
		label.setBounds(0, 0, 1031, 632);
		pnlFundo.add(label);
				
				//janela de monitoramento transa��es
	btnFechar.addMouseListener((MouseListener)new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				Principal relat = null;
				try {
					relat = new Principal();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				relat.setUndecorated(true);
				relat.setVisible(true);
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
						btnCobrir.setVisible(false);					}
				});
				
				
				btnMonitoramentoMaquina.addMouseListener((MouseListener)new MouseAdapter() {
					
					public void mouseClicked(MouseEvent e) {
						Maquina maquina = new Maquina();
						maquina.setUndecorated(true);
						maquina.setVisible(true);
						dispose();
						
					}
				});
				btnMonitoramentoTransacoes.addMouseListener((MouseListener)new MouseAdapter() {
					
					public void mouseClicked(MouseEvent e) {
						Transacoes trans = new Transacoes();
						trans.setUndecorated(true);
						trans.setVisible(true);
						dispose();
						
					}
				});
				//btnRelatorio.addMouseListener((MouseListener)new MouseAdapter() {
				
				//public void mouseClicked(MouseEvent e) {
					//Relatorio relat = new Relatorio();
					//relat.setVisible(true);
					//dispose();
	
//}
//});
//		btnAjuda.addMouseListener((MouseListener)new MouseAdapter() {
				
	//			public void mouseClicked(MouseEvent e) {
		//			Ajuda relat = new Ajuda();
			//		relat.setVisible(true);
				//	dispose();
	
//}
//});
			btnSair.addMouseListener((MouseListener)new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					Object[] options = { "Sim", "N�o" };
					int i = JOptionPane.showOptionDialog(null,
							"Tem certeza que deseja sair?", "Sa�da",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							options, options[0]);
					if (i == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
					
	
}
});
			
			
			
	}
}

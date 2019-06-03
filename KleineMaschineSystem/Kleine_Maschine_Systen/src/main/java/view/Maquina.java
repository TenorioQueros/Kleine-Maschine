package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Maquina extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maquina maquina = new Maquina();
					maquina.setUndecorated(true);
					maquina.setVisible(true);
					maquina.setResizable(false) ;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Maquina() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 600);
		JPanel pnlFundo = new JPanel();
		pnlFundo.setForeground(new Color(255, 255, 255));
		pnlFundo.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(pnlFundo);
		pnlFundo.setLayout(null);
		
		
		//layout frufru
		

		JLabel btncpu = new JLabel("");
		btncpu.setBounds(110, 60, 250, 500);	
		pnlFundo.add(btncpu);
		btncpu.setVisible(true);
		
		JLabel btnDisco = new JLabel("");
		btnDisco.setBounds(400, 60, 250, 500);	
		pnlFundo.add(btnDisco);
		btnDisco.setVisible(true);
		
		JLabel btnmemoria = new JLabel("");
		btnmemoria.setBounds(700, 60, 250, 500);	
		pnlFundo.add(btnmemoria);
		btnmemoria.setVisible(true);
		
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
		label.setIcon(new ImageIcon("img/fundo - Maquina.png"));
		label.setBounds(0, 0, 1031, 632);
		pnlFundo.add(label);
				
				//janela de monitoramento transações
		
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
				btncpu.addMouseListener((MouseListener)new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					CPU cpu = null;
					try {
						cpu = new CPU();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					cpu.setUndecorated(true);
					cpu.setVisible(true);
					dispose();
	
}
});
			
		btnDisco.addMouseListener((MouseListener)new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					Disco disc = new Disco();
					disc.setUndecorated(true);
					disc.setVisible(true);
					dispose();
	
}
});
		
		btnmemoria.addMouseListener((MouseListener)new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				Memoria mem = null;
				try {
					mem = new Memoria();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				mem.setUndecorated(true);
				mem.setVisible(true);
				dispose();

}
});
			
			
			btnSair.addMouseListener((MouseListener)new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					Object[] options = { "Sim", "Não" };
					int i = JOptionPane.showOptionDialog(null,
							"Tem certeza que deseja sair?", "Saída",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							options, options[0]);
					if (i == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
					
	
}
});
	}
}

package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import model.trans;





public class App extends JFrame
{ 
	JPanel painelzinho;
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App simulador = new App ();
					simulador.setVisible(true);
					simulador.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		JPanel painelzinho = new JPanel();
		painelzinho.setForeground(new Color(255, 255, 255));
		painelzinho.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(painelzinho);
		painelzinho.setLayout(null);
		
		
		JButton btnTrans5sec = new JButton("5 SEGUNDOS");
		btnTrans5sec.setBounds(90, 30, 200, 40);	
		painelzinho.add(btnTrans5sec);
		btnTrans5sec.setVisible(true);
		
		JButton btnTrans1sec = new JButton("1 SEGUNDO");
		btnTrans1sec.setBounds(90, 110,200, 40);	
		painelzinho.add(btnTrans1sec);
		btnTrans1sec.setVisible(true);
		
		JButton btnTrans1min = new JButton("1 MINUTO");
		btnTrans1min.setBounds(90, 190,200, 40);	
		painelzinho.add(btnTrans1min);
		btnTrans1min.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(350, 30,300, 200);
		painelzinho.add(panel);
		JScrollPane painelScroll = new JScrollPane(panel);
		painelScroll.setBounds(350, 30,0, 200);
		painelzinho.add(painelScroll);
		

		
				
		btnTrans5sec.addMouseListener((MouseListener) new MouseAdapter() {
				 public void mouseClicked(MouseEvent e) {
			          trans  simulador =  new trans();
			          simulador.transcoes5sec();
				}
				});
		
		btnTrans1sec.addMouseListener((MouseListener) new MouseAdapter() {
				 public void mouseClicked(MouseEvent e) {
			          trans  simulador =  new trans();
			          simulador.transcoes1sec();
			          
				}
				});
		btnTrans1min.addMouseListener((MouseListener) new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
		          trans  simulador =  new trans();
		          simulador.transcoes1min();
			}
			});
	
	}
	}
	


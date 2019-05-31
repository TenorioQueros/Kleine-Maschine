package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login();
					login.setUndecorated(true);
					//tela de login  sem poder maximizar
					login.setResizable(false) ;
					//tela de login de visivel
					login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static JTextField txtEmail=  new JTextField();
	static  JTextField txtSenha =  new JTextField();
	
	public Login() {
		setTitle("Tela de acesso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(4, 9, 2, 5));
		setContentPane(contentPane);
		//Jframe inicializando no meio (linha abaixo)
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JLabel btnSair = new JLabel("");
		//set bounds (DISTANCIA DA DIREITA PRA ESQUERDA, DISTANCIA DE CIMA PRA BAIXO,tamanho da imagem, tamanho da imagem
		btnSair.setBounds(250, 5, 40, 40);	
		contentPane.add(btnSair); 
		
		JLabel lblIMGFundo = new JLabel("New label");
		lblIMGFundo.setFont(new Font("Cambria", Font.PLAIN, 11));
		lblIMGFundo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIMGFundo.setIcon(new ImageIcon("img/loginIMG.PNG"));
		lblIMGFundo.setBounds(0, 0, 326, 339);
		contentPane.add(lblIMGFundo);
		
		JLabel btnEntrar = new JLabel("");
		btnEntrar.setBounds(198, 260, 85, 40);
		contentPane.add(btnEntrar);
	
		
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Cambria", Font.PLAIN, 11));
		txtEmail.setForeground(UIManager.getColor("Button.light"));
		txtEmail.setBackground(new Color(72, 68, 106));
		txtEmail.setBounds(72, 99, 182, 29);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		//senha com mascara de password
		txtSenha = new JPasswordField();
		txtSenha.setForeground(UIManager.getColor("Button.light"));
		txtSenha.setFont(new Font("Cambria", Font.PLAIN, 11));
		txtSenha.setBackground(new Color(72, 68, 106));
		txtSenha.setBounds(72, 186, 182, 29);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		 
		
			btnEntrar.addMouseListener((MouseListener) new MouseAdapter() {
			 public void mouseClicked(MouseEvent arg0) {
		        	 Principal index = null;
					try {
						index = new Principal();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					if(txtEmail.getText().equals("admin@agile.com") && txtSenha.getText().equals("123456789")){
						index.setVisible(true);  
			             dispose();
					}else {
						JOptionPane.showMessageDialog(rootPane, "Email ou senha inválido, tente novamente", "Atenção !", JOptionPane.ERROR_MESSAGE, null);
					}
		        }
		    });
			
		
		
		   btnSair.addMouseListener((MouseListener) new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
		        dispose();
		        }
			});
		   
		   
	}

	
}

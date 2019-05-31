package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import model.cpuMODEL;
import model.memoriaMODEL;

public class Grafico {
	public static void main(String[] args) {
		EventQueue.invokeLater(Grafico::run);
	}

	private static void run() {
		// Cria uma tela com uma panel vazia dentro. Usa esta panel para definir
		// o tamanho mínimo e preferencial da janela.
		JFrame frame = new JFrame("Olá, JFreeChart!");
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel raiz = new JPanel();
		raiz.setLayout(new BorderLayout());
		Dimension tamanho = new Dimension(700, 600);
		raiz.setPreferredSize(tamanho);
		raiz.setMinimumSize(tamanho);
		frame.add(raiz);
		frame.pack();
		Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((sd.width - frame.getWidth()) / 2, (sd.height - frame.getHeight()) / 2);

		// Cria o painel aonde o gráfico será mostrado.
		JPanel primeiroGrafico = new JPanel();
		// Dimension tamanhoArea = new Dimension(600, 450);
		primeiroGrafico.setBounds(260, 50, 600, 450);
		// primeiroGrafico.setPreferredSize(tamanhoArea);
		// primeiroGrafico.setMinimumSize(tamanhoArea);
		raiz.add(primeiroGrafico, BorderLayout.CENTER);

		DefaultPieDataset dpd = new DefaultPieDataset();
		dpd.setValue("Consumo", new Double(cpuMODEL.consumoCPU()));
		dpd.setValue("nao Usada", new Double(cpuMODEL.naoUsada()));

		JFreeChart grafico = ChartFactory.createPieChart("Memória", dpd, true, true, true);

		ChartPanel chartPanel = new ChartPanel(grafico);
		primeiroGrafico.add(chartPanel);
		primeiroGrafico.validate();

		// Mostra a tela.
		frame.setVisible(true);
	}
}
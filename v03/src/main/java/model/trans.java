package model;

import static java.lang.Thread.sleep;

import java.util.Random;

import javax.swing.JOptionPane;

public class trans {
public void transcoes5sec() {
	 String nome[] = {"JAIR MODAS","20TAO","BOTEQUIM DE ESQUINA","BAR DO TONHO","BAR DE ESQUINA","CARREFOUR","ROSSI","MERCADO","AÇOUGUE","PERFUMARIA","BIJUTERIA","SORVETES"};
		int valoresCompra[] = {10,15,20,25,30,35,40,45,50,55,60,65};
		String operadora[] = {"TIM","VIVO","CLARO","OI","NEXTEL",};
		int posTransacao[] = {1245,5325,2452,5452,5322};
		int nomeAleatorio;
		int valorAleatorio;
		int operadoraAletoria;
		int posicaoAletoria;
                 
		Random ramdom = new Random(3);
                 
		while(true){
			//escolhe uma posição de 0 a 6
			nomeAleatorio = 0 + ramdom.nextInt(7);
			valorAleatorio = 0 + ramdom.nextInt(12);
			posicaoAletoria  = 0 + ramdom.nextInt(5);
			operadoraAletoria  = 0 + ramdom.nextInt(5);
			
			
			System.out.println();
			//imprime um resultado aleatório
                         
			
                       
                         
            JOptionPane.showMessageDialog(null, "MAQUINA: " + nome[nomeAleatorio]+" , VALOR TRANSAÇÃO: "+ "R$    "  + valoresCompra[valorAleatorio]+ "OPERADORA: " + operadora[operadoraAletoria] +" TRANSAÇÃO N°: " + posTransacao[posicaoAletoria]);

                         try {
								sleep(5000);
							} catch (InterruptedException e1) {
																				e1.printStackTrace();
							}
		} 
                         
}

public void transcoes1sec() {
	 String nome[] = {"JAIR MODAS","20TAO","BOTEQUIM DE ESQUINA","BAR DO TONHO","BAR DE ESQUINA","CARREFOUR","ROSSI","MERCADO","AÇOUGUE","PERFUMARIA","BIJUTERIA","SORVETES"};
		int valoresCompra[] = {10,15,20,25,30,35,40,45,50,55,60,65};
		String operadora[] = {"TIM","VIVO","CLARO","OI","NEXTEL",};
		int posTransacao[] = {1245,5325,2452,5452,5322};
		int nomeAleatorio;
		int valorAleatorio;
		int operadoraAletoria;
		int posicaoAletoria;
                
		Random ramdom = new Random(3);
                
		while(true){
			//escolhe uma posição de 0 a 6
			nomeAleatorio = 0 + ramdom.nextInt(7);
			valorAleatorio = 0 + ramdom.nextInt(12);
			posicaoAletoria  = 0 + ramdom.nextInt(5);
			operadoraAletoria  = 0 + ramdom.nextInt(5);
			
			
			System.out.println();
			//imprime um resultado aleatório
                        
			
                      
                        
                        JOptionPane.showMessageDialog(null, "MAQUINA: " + nome[nomeAleatorio]+" , VALOR TRANSAÇÃO: "+ "R$    "  + valoresCompra[valorAleatorio]+ "OPERADORA: " + operadora[operadoraAletoria] +" TRANSAÇÃO N°: " + posTransacao[posicaoAletoria]);
                    
                        
                        try {
								sleep(1000);
							} catch (InterruptedException e1) {
																				e1.printStackTrace();
							}
		} 
                        
}

public void transcoes1min() {
	 String nome[] = {"JAIR MODAS","20TAO","BOTEQUIM DE ESQUINA","BAR DO TONHO","BAR DE ESQUINA","CARREFOUR","ROSSI","MERCADO","AÇOUGUE","PERFUMARIA","BIJUTERIA","SORVETES"};
		int valoresCompra[] = {10,15,20,25,30,35,40,45,50,55,60,65};
		String operadora[] = {"TIM","VIVO","CLARO","OI","NEXTEL",};
		int posTransacao[] = {1245,5325,2452,5452,5322};
		int nomeAleatorio;
		int valorAleatorio;
		int operadoraAletoria;
		int posicaoAletoria;
                
		Random ramdom = new Random(3);
                
		while(true){
			//escolhe uma posição de 0 a 6
			nomeAleatorio = 0 + ramdom.nextInt(7);
			valorAleatorio = 0 + ramdom.nextInt(12);
			posicaoAletoria  = 0 + ramdom.nextInt(5);
			operadoraAletoria  = 0 + ramdom.nextInt(5);
			
			
			System.out.println();
			//imprime um resultado aleatório
                        
			
                      
                        
            JOptionPane.showMessageDialog(null, "MAQUINA: " + nome[nomeAleatorio]+" , VALOR TRANSAÇÃO: "+ "R$    "  + valoresCompra[valorAleatorio]+ "OPERADORA: " + operadora[operadoraAletoria] +" TRANSAÇÃO N°: " + posTransacao[posicaoAletoria]);

                        try {
								sleep(10000);
							} catch (InterruptedException e1) {
																				e1.printStackTrace();
							}
		} 
                        
}
}

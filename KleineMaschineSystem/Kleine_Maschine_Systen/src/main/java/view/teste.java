package view;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
 
/**
 * @author Rosicléia Frasson
 */
public class teste extends JFrame {
    JTable tabela;
    
    JScrollPane barraRolagem;
   //a private Principal principal = new Principal();
    Object [] colunas = {"PID","Name"};
    
    Object [][] dados = { {"aa","aa"},
    						{"aa","aa"}	};
     
    public JTable criaJanela(){
    	TableModel model = new DefaultTableModel(dados, colunas);
		
    	//teste lc = new teste();
        TableColumnModel columnModel = new DefaultTableColumnModel();
        
        TableColumn firstColumn = new TableColumn(1);
        firstColumn.setHeaderValue(colunas[1]);columnModel.addColumn(firstColumn);
        TableColumn secondColumn = new TableColumn(0);
        firstColumn.setHeaderValue(colunas[0]);columnModel.addColumn(secondColumn);
        
		 JTable table = new JTable(model, columnModel);
        
        barraRolagem = new JScrollPane(table);
    	
		table.setBounds(260,90,600,450);
		
        return table;
    }
   
  
}
package frame;

import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import frame.toolbar.CustomToolBarPanel;
import frame.toolbox.ToolBox;
import frame.tree.TreePanel;
import frame.workspace.Workspace;

/**
 * Glavni panel
 * @author Grupa1
 * @see MainFrame 
 */
public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MainPanel() {
	setLayout(new BorderLayout());
	
	//ovdje dodajemo panele u svaki region glavnog panela:
	add(new Workspace(),BorderLayout.CENTER); //dodavanje radne površine
	
	add(new CustomToolBarPanel(),BorderLayout.NORTH); //dodavanje palete alatki
	
	add(new ToolBox(),BorderLayout.EAST); //dodavanje palete objekata
	
	JScrollPane scrollPane = new JScrollPane(new TreePanel()); //kreiranje stabla na panelu sa scroll trakama
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	add(scrollPane, BorderLayout.WEST); //dodavanje scroll panela na glavni panel
	
	//izrada statusne linije
	JPanel statusLinePanel = new JPanel(); 	
	statusLinePanel.setBackground(Color.decode("#b5b3b3"));
	statusLinePanel.setPreferredSize(new Dimension(0,20));		
	statusLinePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	JLabel status=new JLabel("Spreman");
	status.setFont(new Font("Times New Roman",1,14));
	status.setForeground(Color.white);
	status.setBounds(0, 0, 100, 12);
    statusLinePanel.add(status);
    add(statusLinePanel,BorderLayout.SOUTH); //dodavanje statusne linije

	}

}

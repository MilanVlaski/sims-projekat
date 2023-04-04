package frame.toolbox;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/** Prilagodjeni panel za paletu objekata
 * 
 *  @author Grupa1
 *  */
public class ToolBox extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private Tools tools = new Tools();
	private JButton header = new JButton("Paleta objekata");
	
	public ToolBox() {
		setPreferredSize(new Dimension(140,0)); // Podesavanje dimenzije palete objekata
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(20, 5, 5, 5));
		
		//Podesavanje header dugmeta
		Font f = header.getFont();
		header.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
		header.setPreferredSize(new Dimension(150,28));
		header.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tools.setVisible(!tools.isVisible());
				
			}
		});
		//Dodavanje elemenata
		this.add(header,BorderLayout.NORTH);
		this.add(tools, BorderLayout.CENTER);
	}
}

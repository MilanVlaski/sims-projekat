package frame.workspace;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/** Radna povrsina 
 * 
 * @author Grupa1
 */
public class Workspace extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	public Workspace() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBorder(BorderFactory.createEmptyBorder(0, 0,5, 5));
		setPreferredSize(new Dimension(screenSize.width*3/4, screenSize.height));
		this.AddTabs();
	}
	// Dodavanje te podesavanje detalja tabova
	public void AddTabs() {
		JScrollPane scrollPane = new JScrollPane(new TabPanel("PanelSlike/fakultetv2.png"));
		this.addTab("FakultetKoncModel.qvi",scrollPane ); 
		this.setTabComponentAt(this.indexOfComponent(scrollPane), getTabHeader("FakultetKoncModel.qvi"));
		JScrollPane scrollPane1 = new JScrollPane(new TabPanel("PanelSlike/prodavnica.png"));
		this.addTab("ProdavnicaKoncModel.qvi",scrollPane1 );
		this.setTabComponentAt(this.indexOfComponent(scrollPane1), getTabHeader("ProdavnicaKoncModel.qvi"));
	}
	private JPanel getTabHeader(String title) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image closeTab = toolkit.getImage("icons/close-option.png");
		closeTab=closeTab.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		  JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		  titlePanel.setOpaque(false);
		  JLabel titleLbl = new JLabel(title);
		  titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		  titlePanel.add(titleLbl);
		  JButton closeButton = new JButton(new ImageIcon(closeTab));
		  closeButton.setPreferredSize(new Dimension(16,16));
		  titlePanel.add(closeButton);
		  return titlePanel;
	}
}

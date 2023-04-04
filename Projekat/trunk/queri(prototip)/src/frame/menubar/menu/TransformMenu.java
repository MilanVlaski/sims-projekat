package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.menu.TransformMenuActionListener;

/**
* Prilagodjeni podmeni u sastavu menija "Model"
* @author Grupa1
* @see MenuModel
*/
public class TransformMenu extends JMenu {


	JMenuItem conceptualMenuItem=null;
	JMenuItem logicalMenuItem=null;
	JMenuItem scriptMenuItem=null;
	
	private static final long serialVersionUID = 1L;
	
	public TransformMenu() {
		//postavljanje osnovnih parametara
		setText("Transformiši u...");
		setMnemonic(KeyEvent.VK_T);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		TransformMenuActionListener transformMenuListener = new TransformMenuActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		//konfiguracija pojedinacne stavke menija
		conceptualMenuItem = new JMenuItem("Konceptualni model");
		Image conceptualIcon = toolkit.getImage("icons/conceptual model.png");
		conceptualIcon=conceptualIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		conceptualMenuItem.setIcon(new ImageIcon(conceptualIcon));
		conceptualMenuItem.setMnemonic(KeyEvent.VK_K);
		conceptualMenuItem.setActionCommand("conceptual");
		conceptualMenuItem.addActionListener(transformMenuListener);
		add(conceptualMenuItem);
		
		logicalMenuItem = new JMenuItem("Logički model");
		Image logicalIcon = toolkit.getImage("icons/logical model.png");
		logicalIcon=logicalIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		logicalMenuItem.setIcon(new ImageIcon(logicalIcon));
		logicalMenuItem.setMnemonic(KeyEvent.VK_L);
		logicalMenuItem.setActionCommand("logical");
		logicalMenuItem.addActionListener(transformMenuListener);
		add(logicalMenuItem);
		
		scriptMenuItem = new JMenuItem("SQL skriptu");
		Image scriptIcon = toolkit.getImage("icons/sql_icon.png");
		scriptIcon=scriptIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		scriptMenuItem.setIcon(new ImageIcon(scriptIcon));
		scriptMenuItem.setMnemonic(KeyEvent.VK_S);
		scriptMenuItem.setActionCommand("script");
		scriptMenuItem.addActionListener(transformMenuListener);
		add(scriptMenuItem);
	}

}

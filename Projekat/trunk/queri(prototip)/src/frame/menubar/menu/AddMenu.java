package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.menu.AddMenuActionListener;

/**
* Prilagodjeni podmeni u sastavu menija "Uredjivanje"
* @author Grupa1
* @see MenuUredjivanje
*/
public class AddMenu extends JMenu {

	EntityMenu entityMenu=null;
	JMenuItem linkMenuItem=null;
	JMenuItem attributeMenuItem=null;
	JMenuItem connectorMenuItem=null;
	
	private static final long serialVersionUID = 1L;
	
	public AddMenu() {
		//postavljanje osnovnih parametara
		setText("Dodaj objekat");
		setMnemonic(KeyEvent.VK_D);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image addIcon = toolkit.getImage("icons/plus.png");
		addIcon=addIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		setIcon(new ImageIcon(addIcon));
		
		AddMenuActionListener addMenuListener = new AddMenuActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		entityMenu=new EntityMenu(); //inicijalizacija podmenija
		add(entityMenu);
		
		//konfiguracija pojedinacne stavke menija
		linkMenuItem = new JMenuItem("Veza");
		linkMenuItem.setMnemonic(KeyEvent.VK_V);
		linkMenuItem.setActionCommand("link");
		linkMenuItem.addActionListener(addMenuListener);
		add(linkMenuItem);
		
		attributeMenuItem = new JMenuItem("Atribut");
		attributeMenuItem.setMnemonic(KeyEvent.VK_A);
		attributeMenuItem.setActionCommand("attribute");
		attributeMenuItem.addActionListener(addMenuListener);
		add(attributeMenuItem);
		
		connectorMenuItem = new JMenuItem("Spojnica");
		connectorMenuItem.setMnemonic(KeyEvent.VK_S);
		connectorMenuItem.setActionCommand("connector");
		connectorMenuItem.addActionListener(addMenuListener);
		add(connectorMenuItem);
		
		
	}


}

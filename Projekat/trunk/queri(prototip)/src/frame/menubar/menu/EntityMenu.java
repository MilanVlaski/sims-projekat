package frame.menubar.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.menu.EntityMenuActionListener;

/**
* Prilagodjeni podmeni u sastavu podmenija "Dodaj objekat"
* @author Grupa1
* @see AddMenu
*/
public class EntityMenu extends JMenu {

	private static final long serialVersionUID = 1L;
	
	JMenuItem strongEntityMenuItem=null;
	JMenuItem weakEntityMenuItem=null;
	
	public EntityMenu() {
		//postavljanje osnovnih parametara
		setText("Entitet");
		setMnemonic(KeyEvent.VK_E);
		
		EntityMenuActionListener entityMenuListener = new EntityMenuActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		//konfiguracija pojedinacne stavke menija
		strongEntityMenuItem = new JMenuItem("Čvrsti Entitet");
		strongEntityMenuItem.setMnemonic(KeyEvent.VK_E);
		strongEntityMenuItem.setActionCommand("strong");
		strongEntityMenuItem.addActionListener(entityMenuListener);
		add(strongEntityMenuItem);
	
		weakEntityMenuItem = new JMenuItem("Slabi Entitet");
		weakEntityMenuItem.setMnemonic(KeyEvent.VK_E);
		weakEntityMenuItem.setActionCommand("weak");
		weakEntityMenuItem.addActionListener(entityMenuListener);
		add(weakEntityMenuItem);
	}
}

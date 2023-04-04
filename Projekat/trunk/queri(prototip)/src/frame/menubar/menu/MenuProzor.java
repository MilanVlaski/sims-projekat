package frame.menubar.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;


import listeners.menu.MenuProzorActionListener;

/**
* Prilagodjeni meni
* @author Grupa1
*/
public class MenuProzor extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem lngMenuItem = null;
	JMenuItem fontMenuItem = null;
	JMenuItem surfaceMenuItem = null;

	public MenuProzor() {
		//postavljanje osnovnih parametara
		setText("Prozor");
		setMnemonic(KeyEvent.VK_R);

		MenuProzorActionListener menuProzorListener = new MenuProzorActionListener(); //inicijalizacija odgovarajuceg listener-a

		//konfiguracija pojedinacne stavke menija
		lngMenuItem = new JMenuItem("Podešavanje jezika");
		lngMenuItem.setMnemonic(KeyEvent.VK_J);
		lngMenuItem.setActionCommand("language");
		lngMenuItem.addActionListener(menuProzorListener);
		add(lngMenuItem);

		fontMenuItem = new JMenuItem("Podešavanje fonta");
		fontMenuItem.setMnemonic(KeyEvent.VK_F);
		fontMenuItem.setActionCommand("font");
		fontMenuItem.addActionListener(menuProzorListener);
		add(fontMenuItem);

		surfaceMenuItem = new JMenuItem("Podešavanje radne površine");
		surfaceMenuItem.setMnemonic(KeyEvent.VK_R);
		surfaceMenuItem.setActionCommand("surface");
		surfaceMenuItem.addActionListener(menuProzorListener);
		add(surfaceMenuItem);
	}
}

package frame.menubar;

import javax.swing.JMenuBar;

import frame.menubar.menu.*;

/**
 * Prilagodjeni MenuBar
 * @author Grupa 1
 */
public class CustomMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	MenuModel menuModel=new MenuModel();
	MenuUredjivanje menuUredjivanje=new MenuUredjivanje();
	MenuProzor menuProzor=new MenuProzor();
	MenuPomoc menuPomoc=new MenuPomoc();
	
	public CustomMenuBar() {
		//dodavanje pojedinacnih menija
		add(menuModel);
		add(menuUredjivanje);
		add(menuProzor);
		add(menuPomoc);
	}
	
}

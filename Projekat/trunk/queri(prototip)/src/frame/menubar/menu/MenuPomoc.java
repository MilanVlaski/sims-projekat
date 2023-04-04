package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.menu.MenuPomocActionListener;

/**
* Prilagodjeni meni
* @author Grupa1
*/
public class MenuPomoc extends JMenu {
	private static final long serialVersionUID = 1L;
	
	JMenuItem onlineHelpMenuItem = null;
	JMenuItem aplicationMenuItem = null;
	JMenuItem faqMenuItem = null;
	
	public MenuPomoc() {
		//postavljanje osnovnih parametara
		setText("Pomoć");
		setMnemonic(KeyEvent.VK_P);
		
		MenuPomocActionListener menuPomocListener = new MenuPomocActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//konfiguracija pojedinacne stavke menija
		onlineHelpMenuItem = new JMenuItem("Online pomoć");
		Image helpIcon = toolkit.getImage("icons/question-frame.png");
		onlineHelpMenuItem.setIcon(new ImageIcon(helpIcon));	
		onlineHelpMenuItem.setMnemonic(KeyEvent.VK_P);
		onlineHelpMenuItem.setActionCommand("help");
		onlineHelpMenuItem.addActionListener(menuPomocListener);
		add(onlineHelpMenuItem);
		
		faqMenuItem = new JMenuItem("FAQ");
		Image faqIcon = toolkit.getImage("icons/faq.png");
		faqMenuItem.setIcon(new ImageIcon(faqIcon));
		faqMenuItem.setMnemonic(KeyEvent.VK_F);
		faqMenuItem.setActionCommand("faq");
		faqMenuItem.addActionListener(menuPomocListener);
		add(faqMenuItem);
		
		aplicationMenuItem = new JMenuItem("O queri alatu");
		Image appIcon = toolkit.getImage("icons/logo-queri.png");
		appIcon=appIcon.getScaledInstance(32,32,Image.SCALE_SMOOTH);
		aplicationMenuItem.setIcon(new ImageIcon(appIcon));
		aplicationMenuItem.setMnemonic(KeyEvent.VK_Q);
		aplicationMenuItem.setActionCommand("app");
		aplicationMenuItem.addActionListener(menuPomocListener);
		add(aplicationMenuItem);
		
	}
}

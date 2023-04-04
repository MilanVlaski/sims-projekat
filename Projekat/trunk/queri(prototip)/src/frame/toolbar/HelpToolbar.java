package frame.toolbar;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.menu.MenuPomocActionListener;

/**
* Prilagodjena paleta alatki
* @author Grupa1
* @see CustomToolBarPanel
*/
public class HelpToolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	JButton faq = null;
	JButton onlineHelp = null;

	public HelpToolbar() {
		
		MenuPomocActionListener menuPomocListener = new MenuPomocActionListener(); //inicijalizacija odgovarajuceg listener-a

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		//konfiguracija pojedinacne stavke toolbar-a
		Image faqIcon = toolkit.getImage("icons/faq.png");
		faq = new JButton(new ImageIcon(faqIcon));
		faq.setToolTipText("FAQ-Često postavljana pitanja");
		faq.setActionCommand("faq");
		faq.addActionListener(menuPomocListener);
		add(faq);

		Image onlineHelpIcon = toolkit.getImage("icons/question-frame.png");
		onlineHelp = new JButton(new ImageIcon(onlineHelpIcon));
		onlineHelp.setToolTipText("Online pomoć");
		onlineHelp.setActionCommand("help");
		onlineHelp.addActionListener(menuPomocListener);
		add(onlineHelp);
	}
}

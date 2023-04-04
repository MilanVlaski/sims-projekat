package frame;

import java.awt.*;

import javax.swing.JFrame;

import frame.menubar.CustomMenuBar;

import listeners.CustomWindowListener;

/**
 * Glavni prozor
 * 
 * @author Grupa1
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		// postavljanje osnovnih parametara prozora
		setTitle("queri");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image iconImage = toolkit.getImage("icons/LogoSimsFinal.png");
		setIconImage(iconImage);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// postavljanje dimenzija prozora
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension(1000, 700);
		setSize(frameSize);
		Point location = new Point((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);
		setLocation(location);
		setMinimumSize(frameSize);
		setExtendedState(MAXIMIZED_BOTH);

		setContentPane(new MainPanel()); // dodavanje glavnog panela
		setJMenuBar(new CustomMenuBar()); // dodavanje trake menija

		addWindowListener(new CustomWindowListener()); // dodavanje prilagodjenog listener-a

		setVisible(true); // prozor vidljiv
	}

}

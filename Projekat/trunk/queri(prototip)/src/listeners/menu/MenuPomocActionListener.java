package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import frame.MainFrame;
import frame.menubar.menu.MenuPomoc;

/**
 * Prilagodjeni listener za rad sa menijem "Pomoc"
 * @author Grupa1
 * @see MenuPomoc
 */
public class MenuPomocActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
		switch (e.getActionCommand()) {
		case "help":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "app":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "faq":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}

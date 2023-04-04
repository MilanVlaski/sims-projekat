package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import frame.MainFrame;
import frame.menubar.menu.AddMenu;

/**
* Prilagodjeni listener za rad sa podmenijem "Dodaj objekat"
* @author Grupa1
* @see AddMenu
*/
public class AddMenuActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
		switch (e.getActionCommand()) {
		case "link":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "attribute":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "connector":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}

package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import frame.MainFrame;
import frame.menubar.menu.EntityMenu;

/**
* Prilagodjeni listener za rad sa podmenijem "Entitet"
* @author Grupa1
* @see EntityMenu
*/
public class EntityMenuActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
		switch (e.getActionCommand()) {
		case "strong":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "weak":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}

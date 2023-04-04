package listeners.menu;
import java.awt.Component;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import frame.MainFrame;
import frame.menubar.menu.MenuUredjivanje;

/**
* Prilagodjeni listener za rad sa menijem "Uredjivanje"
* @author Grupa1
* @see MenuUredjivanje
*/
public class MenuUredjivanjeActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
		switch (e.getActionCommand()) {
		case "undo":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "redo":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "cut":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "copy":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "paste":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "select":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "delete":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "modify":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		
	}

}

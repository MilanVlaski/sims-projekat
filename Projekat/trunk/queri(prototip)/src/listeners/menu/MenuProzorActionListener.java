package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import frame.menubar.menu.MenuProzor;

/**
* Prilagodjeni listener za rad sa menijem "Prozor"
* @author Grupa1
* @see MenuProzor
*/
public class MenuProzorActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "language":
			JOptionPane.showMessageDialog((Component)e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "font":
			JOptionPane.showMessageDialog((Component)e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "surface":
			JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}

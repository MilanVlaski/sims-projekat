package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import frame.menubar.menu.TransformMenu;

/**
* Prilagodjeni listener za rad sa menijem "Transformisi u.."
* @author Grupa1
* @see TransformMenu
*/
public class TransformMenuActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "conceptual":
			JOptionPane.showMessageDialog((Component)e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "logical":
			JOptionPane.showMessageDialog((Component)e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "script":
			JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		
	}

}

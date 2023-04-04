package listeners.menu;

import java.awt.Component;
import java.awt.event.*;


import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import frame.MainFrame;
import frame.menubar.menu.MenuModel;

/**
* Prilagodjeni listener za rad sa menijem "Model"
* @author Grupa1
* @see MenuModel
*/
public class MenuModelActionListener implements ActionListener {	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame frame = (MainFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
		switch (e.getActionCommand()) {
		case "new":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "open":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "close":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "delete":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "save":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "saveAs":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "print":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "import":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "export":
			JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "exit":
			
			String[] opcije = { "Da", "Ne", "Odustani" };
			int result = JOptionPane.showOptionDialog(frame, "Da li želite da sačuvate promjene?", "Izlaz",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcije, opcije[0]);
			if (result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(frame, "Funkcionalnost u fazi implementacije", "Poruka",
						JOptionPane.INFORMATION_MESSAGE);
				
			} else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
			
			break;
		}
	}

}

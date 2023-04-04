package listeners;

import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frame.MainFrame;

/**
 * Prilagodjeni listener glavnog prozora
 * @author Grupa 1
 * @see MainFrame
 */
public class CustomWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		MainFrame frame = (MainFrame) e.getSource();
		String[] opcije = { "Da", "Ne", "Odustani" };
		int result = JOptionPane.showOptionDialog(frame, "Da li želite da sačuvate promjene?", "Izlaz",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcije, opcije[0]);
		if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcionalnost u fazi implementacije", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (result == JOptionPane.NO_OPTION) {
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}

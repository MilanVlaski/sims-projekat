package frame.toolbar;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.menu.MenuUredjivanjeActionListener;

/**
* Prilagodjena paleta alatki
* @author Grupa1
* @see CustomToolBarPanel
*/
public class EditToolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	JButton undo = null;
	JButton redo = null;
	JButton cut = null;
	JButton copy = null;
	JButton paste = null;

	public EditToolbar() {

		MenuUredjivanjeActionListener menuUredjivanjeListener = new MenuUredjivanjeActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		//konfiguracija pojedinacne stavke toolbar-a
		Image undoIcon = toolkit.getImage("icons/arrow-curve-180-left.png");
		undo = new JButton(new ImageIcon(undoIcon));
		undo.setToolTipText("Vrati korak unazad");
		undo.setActionCommand("undo");
		undo.addActionListener(menuUredjivanjeListener);
		add(undo);

		Image redoIcon = toolkit.getImage("icons/arrow-curve.png");
		redo = new JButton(new ImageIcon(redoIcon));
		redo.setToolTipText("Vrati korak unaprijed");
		redo.setActionCommand("redo");
		redo.addActionListener(menuUredjivanjeListener);
		add(redo);

		addSeparator();

		Image cutIcon = toolkit.getImage("icons/scissors.png");
		cut = new JButton(new ImageIcon(cutIcon));
		cut.setToolTipText("Isijeci");
		cut.setActionCommand("cut");
		cut.addActionListener(menuUredjivanjeListener);
		add(cut);

		Image copyIcon = toolkit.getImage("icons/document-copy.png");
		copy = new JButton(new ImageIcon(copyIcon));
		copy.setToolTipText("Kopiraj");
		copy.setActionCommand("copy");
		copy.addActionListener(menuUredjivanjeListener);
		add(copy);

		Image pasteIcon = toolkit.getImage("icons/clipboard-paste.png");
		paste = new JButton(new ImageIcon(pasteIcon));
		paste.setToolTipText("Zalijepi");
		paste.setActionCommand("paste");
		paste.addActionListener(menuUredjivanjeListener);
		add(paste);
	}
}

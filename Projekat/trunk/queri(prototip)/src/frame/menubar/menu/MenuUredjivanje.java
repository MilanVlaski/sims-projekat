package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


import listeners.menu.MenuUredjivanjeActionListener;

/**
* Prilagodjeni meni
* @author Grupa1
*/
public class MenuUredjivanje extends JMenu {

	private static final long serialVersionUID = 1L;
	
	JMenuItem undoMenuItem = null;
	JMenuItem redoMenuItem = null;
	JMenuItem cutMenuItem = null;
	JMenuItem copyMenuItem = null;
	JMenuItem pasteMenuItem = null;
	JMenuItem selectAllMenuItem = null;
	AddMenu addMenu = null;
	JMenuItem deleteSelectedMenuItem = null;
	JMenuItem modifyMenuItem = null;
	
	
	public MenuUredjivanje() {
		//postavljanje osnovnih parametara
		setText("Uređivanje");
		setMnemonic(KeyEvent.VK_U);
		
		MenuUredjivanjeActionListener menuUredjivanjeListener = new MenuUredjivanjeActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//konfiguracija pojedinacne stavke menija
		undoMenuItem = new JMenuItem("Vrati korak unazad");
		Image undoIcon = toolkit.getImage("icons/arrow-curve-180-left.png");
		undoMenuItem.setIcon(new ImageIcon(undoIcon));
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
		undoMenuItem.setMnemonic(KeyEvent.VK_V);
		undoMenuItem.setActionCommand("undo");
		undoMenuItem.addActionListener(menuUredjivanjeListener);
		add(undoMenuItem);
		
		redoMenuItem = new JMenuItem("Vrati korak unaprijed");
		Image redoIcon = toolkit.getImage("icons/arrow-curve.png");
		redoMenuItem.setIcon(new ImageIcon(redoIcon));
		redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK));
		redoMenuItem.setMnemonic(KeyEvent.VK_V);
		redoMenuItem.setActionCommand("redo");
		redoMenuItem.addActionListener(menuUredjivanjeListener);
		add(redoMenuItem);
		
		addSeparator();
		
		cutMenuItem = new JMenuItem("Isijeci");
		Image cutIcon = toolkit.getImage("icons/scissors.png");
		cutMenuItem.setIcon(new ImageIcon(cutIcon));
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
		cutMenuItem.setMnemonic(KeyEvent.VK_I);
		cutMenuItem.setActionCommand("cut");
		cutMenuItem.addActionListener(menuUredjivanjeListener);
		add(cutMenuItem);
		
		copyMenuItem = new JMenuItem("Kopiraj");
		Image copyIcon = toolkit.getImage("icons/document-copy.png");
		copyMenuItem.setIcon(new ImageIcon(copyIcon));
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		copyMenuItem.setMnemonic(KeyEvent.VK_K);
		copyMenuItem.setActionCommand("copy");
		copyMenuItem.addActionListener(menuUredjivanjeListener);
		add(copyMenuItem);
		
		pasteMenuItem = new JMenuItem("Zalijepi");
		Image pasteIcon = toolkit.getImage("icons/clipboard-paste.png");
		pasteMenuItem.setIcon(new ImageIcon(pasteIcon));
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
		pasteMenuItem.setMnemonic(KeyEvent.VK_K);
		pasteMenuItem.setActionCommand("paste");
		pasteMenuItem.addActionListener(menuUredjivanjeListener);
		add(pasteMenuItem);
		
		selectAllMenuItem = new JMenuItem("Označi sve");
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
		selectAllMenuItem.setMnemonic(KeyEvent.VK_O);
		selectAllMenuItem.setActionCommand("select");
		selectAllMenuItem.addActionListener(menuUredjivanjeListener);
		add(selectAllMenuItem);
		
		addSeparator();
		
		addMenu=new AddMenu(); //inicijalizacija podmenija
		add(addMenu);
		
		deleteSelectedMenuItem = new JMenuItem("Obriši označene objekte");
		Image deleteSelectedIcon = toolkit.getImage("icons/eraser_icon.png");
		deleteSelectedIcon=deleteSelectedIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		deleteSelectedMenuItem.setIcon(new ImageIcon(deleteSelectedIcon));
		deleteSelectedMenuItem.setMnemonic(KeyEvent.VK_O);
		deleteSelectedMenuItem.setActionCommand("delete");
		deleteSelectedMenuItem.addActionListener(menuUredjivanjeListener);
		add(deleteSelectedMenuItem);
		
		modifyMenuItem = new JMenuItem("Modifikuj objekat");
		Image modifyIcon = toolkit.getImage("icons/modify_tool_edit_pen_icon.png");
		modifyIcon=modifyIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		modifyMenuItem.setIcon(new ImageIcon(modifyIcon));
		modifyMenuItem.setMnemonic(KeyEvent.VK_M);
		modifyMenuItem.setActionCommand("modify");
		modifyMenuItem.addActionListener(menuUredjivanjeListener);
		add(modifyMenuItem);
		
		
	}
}

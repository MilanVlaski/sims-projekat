package frame.popupmenu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import frame.menubar.menu.AddMenu;
import frame.workspace.Workspace;
import listeners.menu.MenuModelActionListener;
import listeners.menu.MenuUredjivanjeActionListener;

/** Kontekstni meni radne povrsine 
 * 
 * @author Grupa1
 * @see Workspace
 * */
public class MenuPopUp extends JPopupMenu{

		// Dodavanje elemenata u Kontekstni meni
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
		
		public MenuPopUp() {

			MenuUredjivanjeActionListener listener = new MenuUredjivanjeActionListener(); //inicijalizacija odgovarajuceg listener-a
			MenuModelActionListener closeListener = new MenuModelActionListener(); //inicijalizacija odgovarajuceg listener-a
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			//konfiguracija pojedinacne stavke kontekstnog menija
			undoMenuItem = new JMenuItem("Vrati korak unazad");
			Image undoIcon = toolkit.getImage("icons/arrow-curve-180-left.png");
			undoMenuItem.setIcon(new ImageIcon(undoIcon));
			undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
			undoMenuItem.setMnemonic(KeyEvent.VK_V);
			undoMenuItem.setActionCommand("undo");
			undoMenuItem.addActionListener(listener);
			add(undoMenuItem);
			
			redoMenuItem = new JMenuItem("Vrati korak unaprijed");
			Image redoIcon = toolkit.getImage("icons/arrow-curve.png");
			redoMenuItem.setIcon(new ImageIcon(redoIcon));
			redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK));
			redoMenuItem.setMnemonic(KeyEvent.VK_V);
			redoMenuItem.setActionCommand("redo");
			redoMenuItem.addActionListener(listener);
			add(redoMenuItem);
			
			addSeparator();
			
			cutMenuItem = new JMenuItem("Isijeci");
			Image cutIcon = toolkit.getImage("icons/scissors.png");
			cutMenuItem.setIcon(new ImageIcon(cutIcon));
			cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
			cutMenuItem.setMnemonic(KeyEvent.VK_I);
			cutMenuItem.setActionCommand("cut");
			cutMenuItem.addActionListener(listener);
			add(cutMenuItem);
			
			copyMenuItem = new JMenuItem("Kopiraj");
			Image copyIcon = toolkit.getImage("icons/document-copy.png");
			copyMenuItem.setIcon(new ImageIcon(copyIcon));
			copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
			copyMenuItem.setMnemonic(KeyEvent.VK_K);
			copyMenuItem.setActionCommand("copy");
			copyMenuItem.addActionListener(listener);
			add(copyMenuItem);
			
			pasteMenuItem = new JMenuItem("Zalijepi");
			Image pasteIcon = toolkit.getImage("icons/clipboard-paste.png");
			pasteMenuItem.setIcon(new ImageIcon(pasteIcon));
			pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
			pasteMenuItem.setMnemonic(KeyEvent.VK_K);
			pasteMenuItem.setActionCommand("paste");
			pasteMenuItem.addActionListener(listener);
			add(pasteMenuItem);
			
			selectAllMenuItem = new JMenuItem("Označi sve");
			selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
			selectAllMenuItem.setMnemonic(KeyEvent.VK_O);
			selectAllMenuItem.setActionCommand("select");
			selectAllMenuItem.addActionListener(listener);
			add(selectAllMenuItem);
			
			addSeparator();
			
			deleteSelectedMenuItem = new JMenuItem("Obriši označene objekte");
			Image deleteSelectedIcon = toolkit.getImage("icons/eraser_icon.png");
			deleteSelectedIcon=deleteSelectedIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			deleteSelectedMenuItem.setIcon(new ImageIcon(deleteSelectedIcon));
			deleteSelectedMenuItem.setMnemonic(KeyEvent.VK_O);
			deleteSelectedMenuItem.setActionCommand("delete");
			deleteSelectedMenuItem.addActionListener(listener);
			add(deleteSelectedMenuItem);
			
			modifyMenuItem = new JMenuItem("Modifikuj objekat");
			Image modifyIcon = toolkit.getImage("icons/modify_tool_edit_pen_icon.png");
			modifyIcon=modifyIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			modifyMenuItem.setIcon(new ImageIcon(modifyIcon));
			modifyMenuItem.setMnemonic(KeyEvent.VK_M);
			modifyMenuItem.setActionCommand("modify");
			modifyMenuItem.addActionListener(listener);
			add(modifyMenuItem);
			
			
			modifyMenuItem = new JMenuItem("Zatvori");
			modifyMenuItem.setMnemonic(KeyEvent.VK_M);
			modifyMenuItem.setActionCommand("close");
			modifyMenuItem.addActionListener(closeListener);
			add(modifyMenuItem);
		}

	}
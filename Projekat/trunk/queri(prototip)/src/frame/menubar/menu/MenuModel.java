package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import listeners.menu.MenuModelActionListener;

/**
* Prilagodjeni meni
* @author Grupa1
*/
public class MenuModel extends JMenu {
	private static final long serialVersionUID = 1L;
	
	JMenuItem newMenuItem = null;
	JMenuItem openMenuItem = null;
	JMenuItem closeMenuItem = null;
	JMenuItem deleteMenuItem=null;
	JMenuItem saveMenuItem = null;
	JMenuItem saveAsMenuItem = null;
	JMenuItem printMenuItem=null;
	JMenuItem importMenuItem=null;
	JMenuItem exportMenuItem=null;
	JMenuItem exitMenuItem = null;
	TransformMenu transformMenu=null;
	
	public MenuModel() {
		//postavljanje osnovnih parametara
		setText("Model");
		setMnemonic(KeyEvent.VK_M);
		
		MenuModelActionListener menuModelListener = new MenuModelActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//konfiguracija pojedinacne stavke menija
		newMenuItem = new JMenuItem("Novi");
		Image documentIcon = toolkit.getImage("icons/data-model-icon.png");
		newMenuItem.setIcon(new ImageIcon(documentIcon));
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.setActionCommand("new");
		newMenuItem.addActionListener(menuModelListener);
		add(newMenuItem);
		
		openMenuItem = new JMenuItem("Otvori...");
		Image openIcon = toolkit.getImage("icons/folder_opened_icon.png");
		openIcon=openIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH); //prilagodjavanje velicine slike
		openMenuItem.setIcon(new ImageIcon(openIcon));
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.setActionCommand("open");
		openMenuItem.addActionListener(menuModelListener);
		add(openMenuItem);
		
		addSeparator(); 
		
		closeMenuItem = new JMenuItem("Zatvori");
		closeMenuItem.setMnemonic(KeyEvent.VK_Z);
		closeMenuItem.setActionCommand("close");
		closeMenuItem.addActionListener(menuModelListener);
		add(closeMenuItem);
		
		deleteMenuItem = new JMenuItem("Obriši");
		Image deleteIcon = toolkit.getImage("icons/cross.png");
		deleteMenuItem.setIcon(new ImageIcon(deleteIcon));
		deleteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		deleteMenuItem.setMnemonic(KeyEvent.VK_O);
		deleteMenuItem.setActionCommand("delete");
		deleteMenuItem.addActionListener(menuModelListener);
		add(deleteMenuItem);
		
		addSeparator();
		
		saveMenuItem = new JMenuItem("Sačuvaj");
		Image saveIcon = toolkit.getImage("icons/disk-black.png");
		saveMenuItem.setIcon(new ImageIcon(saveIcon));
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		saveMenuItem.setActionCommand("save");
		saveMenuItem.addActionListener(menuModelListener);
		add(saveMenuItem);
		
		saveAsMenuItem = new JMenuItem("Sačuvaj kao...");
		Image saveAsIcon = toolkit.getImage("icons/disks-black.png");
		saveAsMenuItem.setIcon(new ImageIcon(saveAsIcon));
		saveAsMenuItem.setMnemonic(KeyEvent.VK_S);
		saveAsMenuItem.setActionCommand("saveAs");
		saveAsMenuItem.addActionListener(menuModelListener);
		add(saveAsMenuItem);
		
		addSeparator();
		
		printMenuItem = new JMenuItem("Štampaj...");
		Image printIcon = toolkit.getImage("icons/printer.png");
		printMenuItem.setIcon(new ImageIcon(printIcon));
		printMenuItem.setMnemonic(KeyEvent.VK_P);
		printMenuItem.setActionCommand("print");
		printMenuItem.addActionListener(menuModelListener);
		add(printMenuItem);
		
		addSeparator();
		
		importMenuItem = new JMenuItem("Uvezi...");
		Image importIcon = toolkit.getImage("icons/import_save_down_storage_icon.png");
		importIcon=importIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		importMenuItem.setIcon(new ImageIcon(importIcon));
		importMenuItem.setMnemonic(KeyEvent.VK_U);
		importMenuItem.setActionCommand("import");
		importMenuItem.addActionListener(menuModelListener);
		add(importMenuItem);
		
		exportMenuItem = new JMenuItem("Izvezi...");
		Image exportIcon = toolkit.getImage("icons/export_share_upload_up_icon.png");
		exportIcon=exportIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		exportMenuItem.setIcon(new ImageIcon(exportIcon));
		exportMenuItem.setMnemonic(KeyEvent.VK_I);
		exportMenuItem.setActionCommand("export");
		exportMenuItem.addActionListener(menuModelListener);
		add(exportMenuItem);
		
		transformMenu = new TransformMenu();
		add(transformMenu);
		
		addSeparator();
		
		exitMenuItem = new JMenuItem("Izlaz");
		Image exitIcon = toolkit.getImage("icons/exit.png");
		exitMenuItem.setIcon(new ImageIcon(exitIcon));
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
		exitMenuItem.setMnemonic(KeyEvent.VK_I);
		exitMenuItem.setActionCommand("exit");
		exitMenuItem.addActionListener(menuModelListener);
		add(exitMenuItem);
	}
}

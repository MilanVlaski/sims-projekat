package frame.toolbar;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeners.menu.MenuModelActionListener;

/**
* Prilagodjena paleta alatki
* @author Grupa1
* @see CustomToolBarPanel
*/
public class ModelToolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	JButton newModel = null;
	JButton openModel = null;
	JButton save = null;
	JButton saveAs = null;

public ModelToolbar() {
		
		MenuModelActionListener menuModelActionListener = new MenuModelActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//konfiguracija pojedinacne stavke toolbar-a
		Image newIcon = toolkit.getImage("icons/data-model-icon.png");
		newModel = new JButton("Novi", new ImageIcon(newIcon));
		newModel.setToolTipText("Novi model");
		newModel.setActionCommand("new");
		newModel.addActionListener(menuModelActionListener);
		add(newModel);
		
		Image openIcon = toolkit.getImage("icons/folder_opened_icon.png");
		openIcon=openIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		openModel = new JButton(new ImageIcon(openIcon));
		openModel.setToolTipText("Otvori model");
		openModel.setActionCommand("open");
		openModel.addActionListener(menuModelActionListener);
		add(openModel);
		
		addSeparator();
		
		Image diskIcon = toolkit.getImage("icons/disk-black.png");
		save = new JButton(new ImageIcon(diskIcon));
		save.setToolTipText("Sačuvaj");
		save.setActionCommand("save");
		save.addActionListener(menuModelActionListener);
		add(save);
		
		Image disksIcon = toolkit.getImage("icons/disks-black.png");
		saveAs = new JButton(new ImageIcon(disksIcon));
		saveAs.setToolTipText("Sačuvaj kao...");
		saveAs.setActionCommand("saveAs");
		saveAs.addActionListener(menuModelActionListener);
		add(saveAs);
		
		setFloatable(false);
	}
}

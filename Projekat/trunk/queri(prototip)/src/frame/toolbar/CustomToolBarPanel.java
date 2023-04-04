package frame.toolbar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
* Prilagodjena paleta alatki
* @author Grupa1
*/
public class CustomToolBarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	ModelToolbar menuToolbar = null;
	EditToolbar editToolbar=null;
	HelpToolbar helpToolbar = null;
	
	public CustomToolBarPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		//dodavanje pojedinacne palete alatki
		menuToolbar = new ModelToolbar();
		add(menuToolbar);
		
		editToolbar = new EditToolbar();
		add(editToolbar);
		
		add(Box.createHorizontalGlue()); //kreiranje praznog prostora izmedju toolbar-ova
		
		helpToolbar = new HelpToolbar();
		add(helpToolbar);
	}
}

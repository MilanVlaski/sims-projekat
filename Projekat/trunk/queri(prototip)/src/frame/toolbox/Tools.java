package frame.toolbox;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listeners.menu.AddMenuActionListener;
import listeners.menu.EntityMenuActionListener;


/** Prilagodjena paleta alatki koja sadrzi elemente palete objekata
 * 
 *  @author Grupa1
 *  @see ToolBox
 *  */
public class Tools extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton atribut;
	private JButton veza;
	private JButton slabiEntitet;
	private JButton entitet;
	private JButton line;
	
	public Tools() {
		//postavljanje osnovnih parametara
		setPreferredSize(new Dimension(150,0));
		setLayout(new FlowLayout(3));
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		AddMenuActionListener addMenuListener = new AddMenuActionListener(); //inicijalizacija odgovarajuceg listener-a
		EntityMenuActionListener entityMenuListener = new EntityMenuActionListener(); //inicijalizacija odgovarajuceg listener-a
		
		// Dodavanje i podesavanje izgleda objekata u kutiji alatki(paleti objekata)
		Image entitetIcon = toolkit.getImage("icons/entitetv1.png");
		entitetIcon=entitetIcon.getScaledInstance(100,100,Image.SCALE_SMOOTH);
		entitet = new JButton();
		entitet.setIcon(new ImageIcon(entitetIcon));
		entitet.setPreferredSize(new Dimension(100,100));
		entitet.setToolTipText("Entitet");
		entitet.setActionCommand("strong");
		entitet.setOpaque(false);             
		entitet.setContentAreaFilled(false);  
		entitet.setBorderPainted(false);
		entitet.addActionListener(entityMenuListener);
		add(entitet);
		

		Image slabiEntitetIcon = toolkit.getImage("icons/slabientitetv1.png");
		slabiEntitetIcon=slabiEntitetIcon.getScaledInstance(100,120,Image.SCALE_SMOOTH);
		slabiEntitet = new JButton();
		slabiEntitet.setIcon(new ImageIcon(slabiEntitetIcon));
		slabiEntitet.setPreferredSize(new Dimension(100,120));
		slabiEntitet.setToolTipText("Slabi entitet");
		slabiEntitet.setActionCommand("weak");
		slabiEntitet.setOpaque(false);             
		slabiEntitet.setContentAreaFilled(false);  
		slabiEntitet.setBorderPainted(false);
		slabiEntitet.addActionListener(entityMenuListener);
		add(slabiEntitet);
		
		
		
		Image atributIcon = toolkit.getImage("icons/atributv1.png");
		atributIcon=atributIcon.getScaledInstance(90,90,Image.SCALE_SMOOTH);		
		atribut = new JButton();
		atribut.setIcon(new ImageIcon(atributIcon));
		atribut.setPreferredSize(new Dimension(90,90));
		atribut.setToolTipText("Atribut");
		atribut.setActionCommand("attribute");
		atribut.setOpaque(false);             
		atribut.setContentAreaFilled(false);  
		atribut.setBorderPainted(false);
		atribut.addActionListener(addMenuListener);
		add(atribut);
		
		
		Image vezaIcon = toolkit.getImage("icons/vezav1.png");
		vezaIcon=vezaIcon.getScaledInstance(90,90,Image.SCALE_SMOOTH);
		veza = new JButton();
		veza.setIcon(new ImageIcon(vezaIcon));
		veza.setPreferredSize(new Dimension(90,90));
		veza.setToolTipText("Veza");
		veza.setActionCommand("link");
		veza.setOpaque(false);             
		veza.setContentAreaFilled(false);  
		veza.setBorderPainted(false);
		veza.addActionListener(addMenuListener);
		add(veza);
		
		
		
		
		
		Image lineIcon = toolkit.getImage("icons/linev1.png");
		lineIcon=lineIcon.getScaledInstance(90,90,Image.SCALE_SMOOTH);
		line = new JButton();
		line.setIcon(new ImageIcon(lineIcon));
		line.setPreferredSize(new Dimension(90,90));
		line.setToolTipText("Spojnica");
		line.setActionCommand("connector");
		line.setOpaque(false);             
		line.setContentAreaFilled(false);  
		line.setBorderPainted(false);
		line.addActionListener(addMenuListener);
		add(line);
	}
	

}

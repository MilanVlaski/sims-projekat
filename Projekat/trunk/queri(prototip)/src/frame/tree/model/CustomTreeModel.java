package frame.tree.model;

import javax.swing.tree.DefaultMutableTreeNode;

import frame.tree.TreePanel;

/**
* Prilagodjeni model stabla
* @author Grupa1
* @see TreePanel
*/
public class CustomTreeModel extends DefaultMutableTreeNode {
	
	private static final long serialVersionUID = 1L;

	public CustomTreeModel() {
		super("root");
		//dodavanje elemenata(cvorova) stabla
		DefaultMutableTreeNode fakultet = new DefaultMutableTreeNode("Fakultet");
		add(fakultet);
		DefaultMutableTreeNode konceptualni2 = new DefaultMutableTreeNode("FakultetKoncModel.qvi");
		fakultet.add(konceptualni2);
		DefaultMutableTreeNode logicki2 = new DefaultMutableTreeNode("FakultetLogModel.qvi");
		fakultet.add(logicki2);
		DefaultMutableTreeNode skripta2 = new DefaultMutableTreeNode("FakultetSkripta.sql");
		fakultet.add(skripta2);
		
		DefaultMutableTreeNode prodavnica = new DefaultMutableTreeNode("Prodavnica");
		add(prodavnica);
		DefaultMutableTreeNode konceptualni1 = new DefaultMutableTreeNode("ProdavnicaKoncModel.qvi");
		prodavnica.add(konceptualni1);
		DefaultMutableTreeNode logicki1 = new DefaultMutableTreeNode("ProdavnicaLogModel.qvi");
		prodavnica.add(logicki1);
		DefaultMutableTreeNode skripta1 = new DefaultMutableTreeNode("ProdavnicaSkripta.sql");
		prodavnica.add(skripta1);
		
		

		
	}
}

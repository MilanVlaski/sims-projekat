package frame.tree;

import java.awt.Color;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTree;

import javax.swing.tree.TreeSelectionModel;


import frame.tree.model.CustomTreeModel;
import frame.tree.renderer.CustomTreeCellRenderer;

/**
* Prilagodjeni panel na kom se nalazi stablo sa modelima
* @author Grupa1
*/
public class TreePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	JTree tree = null;
	
	public TreePanel() {
		//postavljanje osnovnih parametara
		setBackground(Color.white);
		Dimension size = new Dimension(200,750);
		setPreferredSize(size);
		
		//kreiranje stabla na panelu i postavljanje osnovnih parametara stabla
		tree = new JTree(new CustomTreeModel()); 
		tree.setRootVisible(false);
		tree.setShowsRootHandles(true);
		tree.setPreferredSize(size);
		tree.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));	
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setCellRenderer(new CustomTreeCellRenderer());
		tree.setRowHeight(22);
		add(tree);
		

	}
}

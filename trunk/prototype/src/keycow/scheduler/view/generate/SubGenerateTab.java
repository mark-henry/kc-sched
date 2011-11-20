package keycow.scheduler.view.generate;

import javax.swing.*;
import java.awt.*;

public class SubGenerateTab extends JPanel {
	private static int rows = 25;

	public SubGenerateTab(){
	JPanel panel = new JPanel();
	JPanel conflictPanel = new JPanel();      	
	this.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	JList conflictList = new JList();
	JList conflictDetails = new JList();
	
	JScrollPane GeneratePane = new JScrollPane(conflictList);
       	
	conflictList.setVisibleRowCount(rows);
	conflictDetails.setVisibleRowCount(rows);	

	GeneratePane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	
	conflictPanel.add(conflictDetails);
	conflictPanel.add(new JLabel("foo"));
	
	panel.add(GeneratePane);	
	panel.add(conflictPanel);


	panel.setVisible(true);
	this.add(panel);
	}
}

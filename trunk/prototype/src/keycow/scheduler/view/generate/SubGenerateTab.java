package keycow.scheduler.view.generate;

import javax.swing.border.*;

import javax.swing.*;
import java.awt.*;

public class SubGenerateTab extends JPanel {
	private static int rows = 25;

	public SubGenerateTab(){
	//setLayout(new BoxLayout (this, BoxLayout.X_AXIS));
	JPanel panel = new JPanel();
	JPanel conflictPanel = new JPanel();
	JButton generateButton = new JButton("Generate");
	
	conflictPanel.setBorder(new TitledBorder("Details for conflict"));

	
	JList conflictList = new JList();
	conflictList.setVisibleRowCount(rows);

	JScrollPane GeneratePane = new JScrollPane(conflictList);
	GeneratePane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	

	
	GeneratePane.setPreferredSize(new Dimension(550,600));



	conflictPanel.add(new JLabel("Details for Conflict: ?"));
	conflictPanel.setPreferredSize(new Dimension(200,600));
	
	//panel.add(GeneratePane);	
	//panel.add(conflictPanel);

	//panel.add(Box.createHorizontalGlue());
	//panel.add(generateButton);


panel.add(GeneratePane, BorderLayout.WEST);
panel.add(conflictPanel, BorderLayout.EAST);

panel.add(generateButton, BorderLayout.SOUTH);

	panel.setVisible(true);
	this.add(panel);
	}
}

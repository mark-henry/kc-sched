package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SchedulerUI extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane();

    public SchedulerUI() {
   
       createMenuBar();
       createTabs();

        setMinimumSize(new Dimension(1024, 768));
        setPreferredSize(new Dimension(1024, 768));
        setContentPane(tabbedPane);
        setTitle("KeyCow Scheduler");
        pack();
       
       
    }

    public void createTabs() {
        tabbedPane.addTab(BigTabs.paddedTitle("Data", 15, 8),     new DataTab());
        tabbedPane.addTab(BigTabs.paddedTitle("Generate", 15, 8), new GenerateTab());
        tabbedPane.addTab(BigTabs.paddedTitle("Edit", 15, 8),     new EditTab());
        tabbedPane.addTab(BigTabs.paddedTitle("Publish", 15, 8),  new PublishTab());
    }
	
	public void createMenuBar(){   
		JMenuBar menuBar = new JMenuBar();
       JMenu dropDown = new JMenu("==");
       menuBar.add(Box.createHorizontalGlue());
	   menuBar.add(dropDown);
	   JMenu file = new JMenu("File");
	   file.add(new JMenuItem("New"));
	   file.add(new JMenuItem("Open"));
	   file.add(new JMenuItem("Save, Save As"));
	   file.add(new JMenuItem("Export"));
	   file.add(new JMenuItem("Print"));
	   dropDown.add(file);
	    JMenu edit = new JMenu("Edit");
	   edit.add(new JMenuItem("Undo"));
	   edit.add(new JMenuItem("Redo"));
	   edit.add(new JMenuItem("Cut"));
	   edit.add(new JMenuItem("Copy"));
	   edit.add(new JMenuItem("Paste"));
	   dropDown.add(edit);
	   dropDown.addSeparator();
	   JMenu view = new JMenu("View");
	   dropDown.add(view);
	   view.add(new JMenuItem("Data"));
	   view.add(new JMenuItem("Generate"));
	   view.add(new JMenuItem("Edit"));
	   view.add(new JMenuItem("Publish"));
		dropDown.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            int n =JOptionPane.showConfirmDialog(null, "Would you like to Exit?", "Confirm", JOptionPane.YES_NO_OPTION);
         if(n == JOptionPane.NO_OPTION)
			return;
		System.exit(0);
		 }
      });
		
       
	   
		JMenuItem about = new JMenuItem("About");
		about.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "This feature brought to you by Andy Crafts","About", JOptionPane.WARNING_MESSAGE);
     
		 }
      });
		dropDown.add(about);
	   dropDown.add(exit);
	   
       this.setJMenuBar(menuBar);
	   }
	
	
	
    
}

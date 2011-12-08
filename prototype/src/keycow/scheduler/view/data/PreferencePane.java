package keycow.scheduler.view.data;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class PreferencePane extends JFrame {
   
   public PreferencePane() {
      JPanel panel = new JPanel();
      panel.add(createPreferenceList());
      panel.add(createPreferenceDetails());
      
      JButton close = new JButton("Close");
      close.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            dispose();
         }
      });
      panel.add(close);
      
      setMinimumSize(new Dimension(815, 480));
      setPreferredSize(new Dimension(815, 480));
      setContentPane(panel);
      setTitle("Instructor Preferences");
      pack();
   }
   
   public JPanel createPreferenceList() {
      
      JPanel prefList = new JPanel();
      /*
       * This is the left of the two main windows
       */
      prefList.setPreferredSize(new Dimension(400, 260));
      prefList.setLayout(new BoxLayout(prefList, BoxLayout.Y_AXIS));
      prefList.setBorder(new TitledBorder("Preference List"));
      
      /*
       * Hard coded info
       * Table holds all teacher info
       */
      String columns[] = {"Preference ID", "Preference Name"};
      Object data[][] = {{"1", "Prefer to teach early morning"}, 
         {"2", "Prefer to teach Mondays"}, {"3", "Prefer to teach Wednesdays"},
         {"4", "Prefer to teach CPE 453"}, {"5", "Prefer to teach CPE 102"}};
      JTable table = new JTable(data, columns);
      
      /*
       * JPanel to hold the add / delete button
       */
      JPanel button_panel = new JPanel();
      button_panel.setLayout(new BoxLayout(button_panel, BoxLayout.X_AXIS));
      button_panel.add(new JButton("+"));
      button_panel.add(new JButton("-"));
      
      /*
       * add the table and button panel to the left window
       */
      prefList.add(table);
      prefList.add(button_panel);
      
      /*
       * add the window to the main frame
       */
      
      return prefList;
   }
   
   public JPanel createPreferenceDetails() {
      JPanel prefDetails = new JPanel();
      prefDetails.setPreferredSize(new Dimension(400, 260));
      prefDetails.setBorder(new TitledBorder("Preference Details"));
      
      /*
       * hard-coded labels
       */
      String labels[] = {"Preference Name: ", "Preference Type: ", 
         "Time Preference: ", "Course Preference: ", "Day Preference: "};
      
      /*
       * construct 6 JPanels and add each label / textfield to it
       * then add the row to the right window
       */
      for (int i = 0; i < labels.length; i++) {
         JPanel row = new JPanel();
         row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
         if (i == 0) {
            row.add(new JLabel(labels[i], SwingConstants.LEFT));
            row.add(new JTextField(20));
         }
         if (i == 1 || i == 3 || i == 4) {
            row.add(new JLabel(labels[i], SwingConstants.LEFT));
            String[] possibleValues = { "Time Preference Type", "Course Preference Type", 
               "Day Preference Type"};
            row.add(new JComboBox (possibleValues));
         }
         if (i == 2) {
            JPanel titleRow = new JPanel();
            titleRow.setLayout(new BoxLayout(titleRow, BoxLayout.X_AXIS));
            titleRow.add(new JLabel("Time Preference: "));
            prefDetails.add(titleRow);
            
            row.add(new JLabel("Between "));
            row.add(new JTextField(5));
            row.add(new JLabel(" and "));
            row.add(new JTextField(5));
         }
         prefDetails.add(row);
      }
      
      /*
       * add buttons 
       */
      JPanel row = new JPanel();
      row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
      
      row.add(new JButton("Commit"));
      row.add(new JButton("Restore"));
      prefDetails.add(row);
      
      
      return prefDetails;
   }
}
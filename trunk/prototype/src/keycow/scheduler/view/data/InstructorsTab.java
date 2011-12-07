package keycow.scheduler.view.data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class InstructorsTab extends JPanel {
   private JPanel instructor_list, instructor_details;
   
   public InstructorsTab() {
      createInstructorList();
      createInstructorDetails();
   }
   
   public void createInstructorList() {
      
      /*
       * This is the left of the two main windows
       */
      instructor_list = new JPanel();
      instructor_list.setPreferredSize(new Dimension(400, 650));
      instructor_list.setLayout(new BoxLayout(instructor_list, BoxLayout.Y_AXIS));
      instructor_list.setBorder(new TitledBorder("Instructor List"));
      
      /*
       * Hard coded info
       * Table holds all teacher info
       */
      String columns[] = {"Last Name", "First Name"};
      Object data[][] = {{"Workman", "Julie"}, {"Fisher", "Gene"}, {"Bellardo", "John"}};
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
      instructor_list.add(table);
      instructor_list.add(button_panel);
      
      /*
       * add the window to the main frame
       */
      
      add(instructor_list);
   }
   
   public void createInstructorDetails() {
      instructor_details = new JPanel();
      instructor_details.setPreferredSize(new Dimension(400, 650));
      instructor_details.setBorder(new TitledBorder("Instructor Details"));
      
      /*
       * hard-coded labels
       */
      String labels[] = {"First Name: ", "Last Name: ", "Phone Number: ", "Office: ", "Department: ", 
         "Email Address: ", "WTUs: "};
      
      /*
       * construct 6 JPanels and add each label / textfield to it
       * then add the row to the right window
       */
      for (int i = 0; i < labels.length; i++) {
         JPanel row = new JPanel();
         row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
         row.add(new JLabel(labels[i], SwingConstants.LEFT));
         row.add(new JTextField(20));
         instructor_details.add(row);
      }
 
      /*
       * add buttons 
       */
       JPanel row = new JPanel();
       row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
       JButton preferences = new JButton("Preferences");
       Object[] possibleValues = { "CPE 101", "CPE 102", "CPE 103", "CPE 141", "CPE 308" };
       preferences.addActionListener(new ActionListener() {
 		
            public void actionPerformed(ActionEvent e)
            {
                /*JOptionPane.showInputDialog(null,
    				"Choose one", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleValues, possibleValues[0]);*/
					
				Object[] possibleValues = { "Test Schedule1", "Final Schedule Spring 11", "Final Schedule Fall 11", "Temp Schedule Winter 12", "Final Schedule Winter 12" };
				Object selectedValue = JOptionPane.showInputDialog(null,
					"Choose a schedule", "Instructor Preferences",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleValues, possibleValues[0]);
            }
        }); 
       
       
       row.add(preferences);
       row.add(new JButton("Commit"));
       row.add(new JButton("Restore"));
       instructor_details.add(row);

       
      /*
       * add the right window to the main frame
       */
      add(instructor_details);
   }
}
package keycow.scheduler.view.generate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentsTab extends JPanel {

   private static int rows = 35;
   private JPanel panel, insPanel, coursesPanel, roomsPanel;

   public ComponentsTab()
   {
      panel = new JPanel();
      insPanel = new JPanel();
      coursesPanel = new JPanel();
      roomsPanel = new JPanel();
      
      panel.setLayout(new BoxLayout (panel, BoxLayout.X_AXIS));
      insPanel.setLayout(new BoxLayout(insPanel, BoxLayout.Y_AXIS));
      coursesPanel.setLayout(new BoxLayout(coursesPanel, BoxLayout.Y_AXIS));
      roomsPanel.setLayout(new BoxLayout(roomsPanel, BoxLayout.Y_AXIS));
      
      JLabel instructorsLabel = new JLabel("Instructors");
      JLabel coursesLabel = new JLabel("Courses");
      JLabel roomsLabel = new JLabel("Rooms");
      
      String [] options = {"+", "Import All Marked Current", "Select Individual"};
      
      JList instructorsList = new JList();
      JScrollPane InstructorsScrollPane = new JScrollPane(instructorsList);
      
      instructorsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      instructorsList.setLayoutOrientation(JList.VERTICAL);
      instructorsList.setVisibleRowCount(rows);
      //instructorsList.setBackground (Color.blue);
      //instructorsList.setForeground (Color.blue);
      
      JComboBox instructorsBox = new JComboBox (options);

      
      JList coursesList = new JList();
      JScrollPane CoursesScrollPane = new JScrollPane(coursesList);
      
      coursesList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      coursesList.setLayoutOrientation(JList.VERTICAL);
      coursesList.setVisibleRowCount(rows);
      //coursesList.setBackground (Color.blue);
      //coursesList.setForeground (Color.blue);
      
      JComboBox coursesBox = new JComboBox (options);
      
      JList roomsList = new JList();
      JScrollPane RoomsScrollPane = new JScrollPane(roomsList);
      
      roomsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      roomsList.setLayoutOrientation(JList.VERTICAL);
      roomsList.setVisibleRowCount(rows);
      //roomsList.setBackground (Color.blue);
      //roomsList.setForeground (Color.blue);
      
      JComboBox roomsBox = new JComboBox (options);
      
      instructorsBox.setEditable(false);
      coursesBox.setEditable(false);
      roomsBox.setEditable(false);
      
      ComponentsActionListener insAction = new ComponentsActionListener();
      ComponentsActionListener coursesAction = new ComponentsActionListener();
      ComponentsActionListener roomsAction = new ComponentsActionListener();
      
      instructorsBox.addActionListener(insAction);
      coursesBox.addActionListener(coursesAction);
      roomsBox.addActionListener(roomsAction);
      
      insPanel.add(instructorsLabel);
      coursesPanel.add(coursesLabel);
      roomsPanel.add(roomsLabel);

      insPanel.add(InstructorsScrollPane);
      coursesPanel.add(CoursesScrollPane);
      roomsPanel.add(RoomsScrollPane);
      insPanel.add(instructorsBox);
      coursesPanel.add(coursesBox);
      roomsPanel.add(roomsBox);

      panel.add(insPanel);
      panel.add(coursesPanel);
      panel.add(roomsPanel);

      panel.setVisible(true);

      insPanel.setVisible(true);
      coursesPanel.setVisible(true);
      roomsPanel.setVisible(true);
      
      this.add(panel);
   }
   
   class ComponentsActionListener implements ActionListener {

      public void actionPerformed(ActionEvent evt) {
         JComboBox cb = (JComboBox)evt.getSource();
         Object newItem = cb.getSelectedItem();
         
         if("comboBoxChanged".equals(evt.getActionCommand()))
            if(newItem.equals("Select Individual"))
               System.out.println("Select Individual was selected");
            else if(newItem.equals("Import All Marked Current"))
               System.out.println("Import All Marked Current selected");
      }
   }
}


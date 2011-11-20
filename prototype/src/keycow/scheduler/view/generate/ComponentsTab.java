package keycow.scheduler.view.generate;

import javax.swing.*;
import java.awt.*;

public class ComponentsTab extends JPanel {

   private static int rows = 35;

   public ComponentsTab()
   {
      JPanel panel = new JPanel();
      setLayout(new BoxLayout (this, BoxLayout.X_AXIS));
      JLabel instructorsLabel = new JLabel("Instructors");
      JLabel coursesLabel = new JLabel("Courses");
      JLabel roomsLabel = new JLabel("Rooms");
      
      String [] options = {"+", "Import All Marked Current", "Select Individual"};
      
      JList instructorsList = new JList();
      JScrollPane InstructorsScrollPane = new JScrollPane(instructorsList);
      
      instructorsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      instructorsList.setLayoutOrientation(JList.VERTICAL);
      instructorsList.setVisibleRowCount(rows);
      instructorsList.setBackground (Color.blue);
      instructorsList.setForeground (Color.blue);
      
      JComboBox instructorsBox = new JComboBox (options);

      
      JList coursesList = new JList();
      JScrollPane CoursesScrollPane = new JScrollPane(coursesList);
      
      coursesList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      coursesList.setLayoutOrientation(JList.VERTICAL);
      coursesList.setVisibleRowCount(rows);
      coursesList.setBackground (Color.blue);
      coursesList.setForeground (Color.blue);
      
      JComboBox coursesBox = new JComboBox (options);
      
      JList roomsList = new JList();
      JScrollPane RoomsScrollPane = new JScrollPane(roomsList);
      
      roomsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      roomsList.setLayoutOrientation(JList.VERTICAL);
      roomsList.setVisibleRowCount(rows);
      roomsList.setBackground (Color.blue);
      roomsList.setForeground (Color.blue);
      
      JComboBox roomsBox = new JComboBox (options);
      
      
/*      
      panel.add(instructorsLabel);
      panel.add(coursesLabel);
      panel.add(roomsLabel);
//*/
      panel.add(InstructorsScrollPane);
      panel.add(CoursesScrollPane);
      panel.add(RoomsScrollPane);
      panel.add(instructorsBox);
      panel.add(coursesBox);
      panel.add(roomsBox);
      panel.setVisible(true);
      
      this.add(panel);
   }
}

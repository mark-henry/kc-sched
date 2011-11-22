package keycow.scheduler.view.data;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class CoursesTab extends JPanel {
   private JPanel coursesAdded, courseDetails;
   
   public CoursesTab() {
      createCoursesAdded();
      createCourseDetails();
   }
   
   public void createCoursesAdded() {
      
      coursesAdded = new JPanel();
      coursesAdded.setPreferredSize(new Dimension(400, 650));
      coursesAdded.setLayout(new BoxLayout(coursesAdded, BoxLayout.Y_AXIS));
      coursesAdded.setBorder(new TitledBorder("Courses Added"));
      
      
      String columns[] = {"Course Code", "Course Title"};
      Object data[][] = {{"CPE 357", "Systems Programming"}, {"CSC 308", "Software Engineering 1"}, {"CPE 315", "Computer Architecture"}};
      JTable table = new JTable(data, columns);
      
      JPanel button_panel = new JPanel();
      button_panel.setLayout(new BoxLayout(button_panel, BoxLayout.X_AXIS));
      button_panel.add(new JButton("+"));
      button_panel.add(new JButton("-"));
      
      coursesAdded.add(table);
      coursesAdded.add(button_panel);

      
      add(coursesAdded);
   }
   
   public void createCourseDetails() {
      courseDetails = new JPanel();
      courseDetails.setPreferredSize(new Dimension(400, 650));
      courseDetails.setBorder(new TitledBorder("Course Information"));
      
      String labels[] = {"Course Name: ", "Course Number: ", "Accompanying Lab: ", "Department: ", "Units: ", "Comments: "};
      
      for (int i = 0; i < 6; i++) {
         JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT));
         JLabel label = new JLabel(labels[i]);
         label.setAlignmentX(Component.LEFT_ALIGNMENT);
         row.add(label);
         if (i == 2)
            row.add(new JRadioButton());
         else if (i == 5)
            row.add(new JTextArea(10, 20));
         else
            row.add(new JTextField(20));
         courseDetails.add(row);
         row.setAlignmentX(Component.LEFT_ALIGNMENT);
      }
      
      JPanel row = new JPanel();
      row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
      row.add(new JButton("Commit"));
      row.add(new JButton("Restore"));
      courseDetails.add(row);
      
      add(courseDetails);
   }
}

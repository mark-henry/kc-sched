package keycow.scheduler.view.data;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class InstructorsTab extends JPanel {
   private JPanel instructor_list, instructor_details;
   private JButton b1, b2;
   
   public InstructorsTab() {
      instructor_list = new JPanel();
      instructor_list.setPreferredSize(new Dimension(400, 650));
      instructor_list.setLayout(new BoxLayout(instructor_list, BoxLayout.Y_AXIS));
      instructor_list.setBorder(new TitledBorder("Instructor List"));
      String columns[] = {"Last Name", "First Name"};
      Object data[][] = {{"Workman", "Julie"}, {"Fisher", "Gene"}, {"Bellardo", "John"}};
      JTable table = new JTable(data, columns);
      
      JPanel button_panel = new JPanel();
      button_panel.setLayout(new BoxLayout(button_panel, BoxLayout.X_AXIS));
      button_panel.add(new JButton("+"));
      button_panel.add(new JButton("-"));
      
      instructor_list.add(table);
      instructor_list.add(button_panel);
      
      instructor_details = new JPanel();
      instructor_details.setPreferredSize(new Dimension(400, 650));
      instructor_details.setBorder(new TitledBorder("Instructor Details"));
      instructor_details.add(new JLabel("First Name"));
      instructor_details.add(new JTextField(20));
      instructor_details.add(new JLabel("Last Name"));
      instructor_details.add(new JTextField(20));
      instructor_details.add(new JLabel("Phone Number"));
      instructor_details.add(new JTextField(20));
      instructor_details.add(new JLabel("Office"));
      instructor_details.add(new JTextField(20));
      instructor_details.add(new JLabel("Department"));
      instructor_details.add(new JTextField(20));
      instructor_details.add(new JLabel("Email Address"));
      instructor_details.add(new JTextField(20));
      instructor_details.add(new JLabel("WTUs"));
      instructor_details.add(new JTextField(20));
      instructor_details.add(new JButton("Commit"));
      instructor_details.add(new JButton("Restore"));
      
      add(instructor_list);
      
      add(instructor_details);
   }
}

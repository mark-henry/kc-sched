package keycow.scheduler.view.data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class RoomsTab extends JPanel {
   private JPanel room_list, room_details;
   
   public RoomsTab() {
      createRoomList();
      createRoomDetails();
   }
   
   public void createRoomList() {
      
      /*
       * This is the left of the two main windows
       */
      room_list = new JPanel();
      room_list.setPreferredSize(new Dimension(400, 650));
      room_list.setLayout(new BoxLayout(room_list, BoxLayout.Y_AXIS));
      room_list.setBorder(new TitledBorder("Room List"));
      
      /*
       * Hard coded info
       * Table holds all teacher info
       */
      String columns[] = {"Building Number", "Room Number"};
      Object data[][] = {{"16", "256"}, {"16", "301"}, {"16", "302"}, {"16", "303"}};
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
      room_list.add(table);
      room_list.add(button_panel);
      
      /*
       * add the window to the main frame
       */
      
      add(room_list);
   }
   
   public void createRoomDetails() {
      room_details = new JPanel();
      room_details.setPreferredSize(new Dimension(400, 650));
      room_details.setBorder(new TitledBorder("Room Details"));
      
      /*
       * hard-coded labels
       */
      String labels[] = {"Building Number: ", "Room Number: ", "Capacity: ", 
      	"Lab: ", "Stations: ", "Features: "};
      
      /*
       * construct 6 JPanels and add each label / textfield to it
       * then add the row to the right window
       */
      for (int i = 0; i < labels.length; i++) {
         JPanel row = new JPanel();
         row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
         row.add(new JLabel(labels[i], SwingConstants.LEFT));
         
         if (labels[i].equals("Lab: ")) 
         	row.add(new JCheckBox());
         else
         	row.add(new JTextField(20));
         room_details.add(row);
      }
 
      /*
       * add buttons 
       */
       JPanel row = new JPanel();
       row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
       row.add(new JButton("Commit"));
       row.add(new JButton("Restore"));
       room_details.add(row);

       
      /*
       * add the right window to the main frame
       */
      add(room_details);
   }
}

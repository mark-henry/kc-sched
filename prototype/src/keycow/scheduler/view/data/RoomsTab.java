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
      

      room_list = new JPanel();
      room_list.setPreferredSize(new Dimension(400, 650));
      room_list.setLayout(new BoxLayout(room_list, BoxLayout.Y_AXIS));
      room_list.setBorder(new TitledBorder("Room List"));
      

      String columns[] = {"Building Number", "Room Number"};
      Object data[][] = {{"16", "256"}, {"16", "301"}, {"16", "302"}, {"16", "303"}};
      JTable table = new JTable(data, columns);
      

      JPanel button_panel = new JPanel();
      button_panel.setLayout(new BoxLayout(button_panel, BoxLayout.X_AXIS));
      button_panel.add(new JButton("+"));
      button_panel.add(new JButton("-"));
      

      room_list.add(table);
      room_list.add(button_panel);
      
      
      add(room_list);
   }
   
   public void createRoomDetails() {
      room_details = new JPanel();
      room_details.setPreferredSize(new Dimension(400, 650));
      room_details.setBorder(new TitledBorder("Room Details"));
      

      String labels[] = {"Building Number: ", "Room Number: ", "Capacity: ", 
      	"Lab Room: ", "Stations: ", "Features: "};
      

      for (int i = 0; i < labels.length; i++) {
         JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT));
          JLabel label = new JLabel(labels[i]);
          label.setAlignmentX(Component.LEFT_ALIGNMENT);
          row.add(label);
          
         if (labels[i].equals("Lab Room: ")) 
         	row.add(new JCheckBox());
         else if (labels[i].equals("Features: "))
             row.add(new JTextArea(10, 20));
         else
         	row.add(new JTextField(20));
         room_details.add(row);
          row.setAlignmentX(Component.LEFT_ALIGNMENT);
      }
 

       JPanel row = new JPanel();
       row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
       row.add(new JButton("Commit"));
       row.add(new JButton("Restore"));
       room_details.add(row);


      add(room_details);
   }
}

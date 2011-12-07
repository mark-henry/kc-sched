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
      
       JButton plus = new JButton("+");
       plus.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showConfirmDialog(null, "Empty all information field to begin adding new Room?", "+", JOptionPane.YES_NO_OPTION);
           }
       });
       
       JButton minus = new JButton("-");
       minus.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showConfirmDialog(null, "Remove this class from the permanent data list?", "-", JOptionPane.YES_NO_OPTION);
           }
       });
       
      button_panel.add(plus);
      button_panel.add(minus);
      

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
       
       JButton commit = new JButton("Commit");
       commit.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showConfirmDialog(null, "Commit information and add a new Room?", "Commit", JOptionPane.YES_NO_OPTION);
           }
       });       
       
       
       JButton restore = new JButton("Restore");
       restore.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showConfirmDialog(null, "Empty all information fields?", "Restore", JOptionPane.YES_NO_OPTION);
           }
       });
       
       row.add(commit);
       row.add(restore);
       room_details.add(row);


      add(room_details);
   }
}

package keycow.scheduler.view.data;

import javax.swing.*;
import java.awt.*;

public class RoomsTab extends JPanel {
	private JPanel room_list, room_details;
	private JButton b1, b2;
	
	public RoomsTab() {
		room_list = new JPanel();
	    room_list.setPreferredSize(new Dimension(400, 650));
	    room_list.setLayout(new BoxLayout(room_list, BoxLayout.Y_AXIS));
	    room_list.setBorder(new TitledBorder("Room List"));
	    String columns[] = {"Building", "Room"};
	    Object data[][] = {{"16", "256"}, {"16", "301"}, {"16", "302"}};
	    JTable table = new JTable(data, columns);
	      
	    JPanel button_panel = new JPanel();
	    button_panel.setLayout(new BoxLayout(button_panel, BoxLayout.X_AXIS));
	    button_panel.add(new JButton("+"));
	    button_panel.add(new JButton("-"));
	      
	    room_list.add(table);
	    room_list.add(button_panel);
	    
	    room_details = new JPanel();
	    room_details.setPreferredSize(new Dimension(400, 650));
	    room_details.setBorder(new TitledBorder("Room Details"));
	    room_details.add(new JLabel("Buildinge"));
	    room_details.add(new JTextField(20));
	    room_details.add(new JLabel("Room Number"));
	    room_details.add(new JTextField(20));
	    room_details.add(new JLabel("Capacity"));
	    room_details.add(new JTextField(20));
	    room_details.add(new JLabel("Lab"));
	    room_details.add(new JCheckBox());
	    room_details.add(new JLabel("Stations"));
	    room_details.add(new JTextField(20));
	    room_details.add(new JLabel("Features"));
	    room_details.add(new JTextPane(20));
	    room_details.add(new JButton("Commit"));
	    room_details.add(new JButton("Restore"));
	      
	    add(room_list);
	      
	    add(room_details);
	}
}

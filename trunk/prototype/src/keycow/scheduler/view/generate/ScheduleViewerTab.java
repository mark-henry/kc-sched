package keycow.scheduler.view.generate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ScheduleViewerTab extends JPanel {

   private JPanel schedule_view;
	
	public ScheduleViewerTab() {
		createScheduleTab();
	}
	
	public void createScheduleTab() {
         schedule_view = new JPanel();
      	//schedule_view.setPreferredSize(new Dimension(850, 650));
      	schedule_view.setBorder(new TitledBorder("Schedule Viewer"));
      schedule_view.setLayout(new BoxLayout(schedule_view, BoxLayout.Y_AXIS));
      	
      	String[] possibleValues = { "Test Schedule1", "Final Schedule Spring 11", 
      		"Final Schedule Fall 11", "Temp Schedule Winter 12", 
      		"Final Schedule Winter 12" };
      	JComboBox schedulePicker = new JComboBox (possibleValues);
      //schedulePicker.setPreferredSize(new Dimension(100, 200));
      
      	schedule_view.add(schedulePicker);
      	schedule_view.add(create_week_view());
      	
      	add(schedule_view);
	}
	
	public JPanel create_week_view() {
      JPanel panel = new JPanel();
      
      String[] columnNames = {"", "Monday",
         "Tuesday",
         "Wednesday",
         "Thursday",
         "Friday"};
      
      Object[][] data = {
         {"", "Monday",
            "Tuesday", "Wednesday", "Thursday", "Friday"},
         {"8am-9am", "",
            "","", "", ""},
         {"9am-10am", "",
            "", "", "",""},
         {"10am-11am", "",
            "", "", "",""},
         {"11am-12pm", "",
            "", "", "",""},
         {"12pm-1pm", "",
            "", "", "",""},
         {"1pm-2pm", "",
            "", "", "",""},
         {"2pm-3pm", "",
            "", "", "",""},
         {"3pm-4pm", "",
            "", "", "",""},
         {"4pm-5pm", "",
            "", "", "",""},
         {"5pm-6pm", "",
            "", "", "",""},
         {"6pm-7pm", "",
            "", "", "",""},
         {"7pm-8pm", "",
            "", "", "",""},
         {"8pm-9pm", "",
            "", "", "",""}
      };
      
      JTable table = new JTable(data, columnNames);
      
      panel.add(table);
      
      return panel;
   }
}

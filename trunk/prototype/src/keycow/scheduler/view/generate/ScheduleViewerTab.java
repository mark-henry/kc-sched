package keycow.scheduler.view.generate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ScheduleViewerTab extends JPanel {

	public class SmallDayViewDisplay extends JPanel {

		/**
		 * Construct this as vbox of date number and item-descriptor list.
		 */
		SmallDayViewDisplay(String dateString) {
	
			/*
			 * Set this' layout to a vertical box.
			 */
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	
			/*
			 * Create the date number label and attach its mouse listener.
			 */
			JLabel label = new JLabel(dateString);
	
			/*
			 * Construct a (for now empty) list of items.
			 */
			JList list = new JList();
	
			/*
			 * Finish the layout.
			 */
			add(label);
			add(list);
			setBackground(Color.white);
			setBorder(BorderFactory.createLineBorder(Color.black));
	
		}
	
	}
	private JPanel schedule_view;
	
	public ScheduleViewerTab() {
		createScheduleTab();
	}
	
	public void createScheduleTab() {
		schedule_view = new JPanel();
      	schedule_view.setPreferredSize(new Dimension(850, 650));
      	//schedule_view.setLayout(new BoxLayout(schedule_view, BoxLayout.Y_AXIS));
      	schedule_view.setBorder(new TitledBorder("Schedule Viewer"));
      	
      	String[] possibleValues = { "Test Schedule1", "Final Schedule Spring 11", 
      		"Final Schedule Fall 11", "Temp Schedule Winter 12", 
      		"Final Schedule Winter 12" };
      	JComboBox schedulePicker = new JComboBox (possibleValues);
      	JPanel row = new JPanel();
       	row.setLayout(new BoxLayout(row, BoxLayout.Y_AXIS));
       	row.add(schedulePicker);
      	schedule_view.add(row);
      	schedule_view.add(create_month_grid());
      	
      	
      	add(schedule_view);
	}
	
	public Box create_month_grid() {
        JPanel grid = new JPanel(new GridLayout(5, 7));
        Box outerBox = Box.createVerticalBox();
        JLabel label = new JLabel(
            "Initial approximation of a month layout ...");
        Dimension defaultSize = new Dimension(
            7 * defaultCellWidth, 5 * defaultCellHeight);

        /*
         * Insert a couple grey days up front.
         */
        grid.add(greyDay());
        grid.add(greyDay());

        /*
         * Insert 30 small days in the grid.
         */
        for (int i = 1; i <= 30; i++) {
            grid.add(new SmallDayViewDisplay(" " + Integer.toString(i)));
        }

        /*
         * Finish the last row with three grey days.  Yes, these absolute
         * numbers are bad style, but this is a RAPID prototype we're building
         * here.
         */
        grid.add(greyDay());
        grid.add(greyDay());
        grid.add(greyDay());

        /*
         * Layout the overall window.  Don't forget to call JFrame.pack(), or
         * the window could be improperly sized.
         */
        grid.setBackground(Color.white);
        grid.setPreferredSize(defaultSize);
        outerBox.add(label);
        outerBox.add(grid);
        return outerBox;
        //setContentPane(outerBox);
        //setTitle("Monthy Agenda");
        //pack();
    }

    /**
     * Build an empty grey-background, black-border day display.  A fresh one
     * of these needs to be allocated for each use since JFC doesn't play
     * reuses of a components in containers.
     */
    protected JPanel greyDay() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        return panel;
    }

    /** Default constant for the height of one day display cell. */
    protected final int defaultCellHeight = 75;

    /** Default constant for the width of one day display cell. */
    protected final int defaultCellWidth = 75;

}

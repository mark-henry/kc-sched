package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

public class SchedulerUI extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane();

    private final int padding_x = 15;
    private final int padding_y = 8;

    private String paddedTitle(String title) {
        return "<html><body" + 
            " leftmargin="   + padding_x + 
            " marginwidth="  + padding_x + 
            " topmargin="    + padding_y +
            " marginheight=" + padding_y + "><b>" +
            title + "</b></body></html>";
    }


    public SchedulerUI() {
        createTabs();

        setMinimumSize(new Dimension(1024, 768));
        setPreferredSize(new Dimension(1024, 768));
        setContentPane(tabbedPane);
        setTitle("KeyCow Scheduler");
        pack();
    }

    public void createTabs() {
        tabbedPane.addTab(paddedTitle("Data"),     new DataTab());
        tabbedPane.addTab(paddedTitle("Generate"), new GenerateTab());
        tabbedPane.addTab(paddedTitle("Edit"),     new EditTab());
        tabbedPane.addTab(paddedTitle("Publish"),  new PublishTab());
    }
    
}

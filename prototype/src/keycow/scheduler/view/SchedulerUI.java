package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

public class SchedulerUI extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane();

    public SchedulerUI() {
        createTabs();

        setMinimumSize(new Dimension(800, 600));
        setPreferredSize(new Dimension(1024, 768));
        setContentPane(tabbedPane);
        setTitle("KeyCow Scheduler");
        pack();
    }

    public void createTabs() {
        tabbedPane.addTab("Data",     new DataTab());
        tabbedPane.addTab("Generate", new GenerateTab());
        tabbedPane.addTab("Edit",     new EditTab());
        tabbedPane.addTab("Publish",  new PublishTab());
    }
    
}

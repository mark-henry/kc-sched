package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

public class SchedulerUI extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane();

    public SchedulerUI() {
        createTabs();

        setMinimumSize(new Dimension(1024, 768));
        setPreferredSize(new Dimension(1024, 768));
        setContentPane(tabbedPane);
        setTitle("KeyCow Scheduler");
        pack();
    }

    public void createTabs() {
        tabbedPane.addTab(BigTabs.paddedTitle("Data", 15, 8),     new DataTab());
        tabbedPane.addTab(BigTabs.paddedTitle("Generate", 15, 8), new GenerateTab());
        tabbedPane.addTab(BigTabs.paddedTitle("Edit", 15, 8),     new EditTab());
        tabbedPane.addTab(BigTabs.paddedTitle("Publish", 15, 8),  new PublishTab());
    }
    
}

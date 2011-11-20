package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

public class SchedulerUI extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane();

    public SchedulerUI() {
        createTabs();

        setContentPane(tabbedPane);
        setTitle("KeyCow Scheduler");
        pack();
    }

    public void createTabs() {
        tabbedPane.addTab("Data", new JButton("DataTab"));
        tabbedPane.addTab("Generate", new JButton("GenerateTab"));
    }
    
}

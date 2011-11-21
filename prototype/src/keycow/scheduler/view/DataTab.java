package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

import keycow.scheduler.view.data.*;

public class DataTab extends JTabbedPane {
    public DataTab() {
        super(JTabbedPane.LEFT);
        createTabs();
    }

    public void createTabs() {
        addTab(BigTabs.paddedTitle("Instructors", 50, 50), new InstructorsTab());
        addTab(BigTabs.paddedTitle("Courses", 50, 50),     new CoursesTab());
        addTab(BigTabs.paddedTitle("Rooms", 50, 50),       new RoomsTab());
    }

}

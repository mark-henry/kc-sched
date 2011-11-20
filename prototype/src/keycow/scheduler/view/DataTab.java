package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

import keycow.scheduler.view.data.*;

public class DataTab extends JTabbedPane {
    private final int padding_x = 50;
    private final int padding_y = 50;

    private String paddedTitle(String title) {
        return "<html><body" + 
            " leftmargin="   + padding_x + 
            " marginwidth="  + padding_x + 
            " topmargin="    + padding_y +
            " marginheight=" + padding_y + ">" +
            title + "</body></html>";
    }

    public DataTab() {
        super(JTabbedPane.LEFT);
        createTabs();
    }

    public void createTabs() {
        addTab(paddedTitle("Instructors"), new InstructorsTab());
        addTab(paddedTitle("Courses"),     new CoursesTab());
        addTab(paddedTitle("Rooms"),       new RoomsTab());
    }

}

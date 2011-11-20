package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

import keycow.scheduler.view.generate.*;

public class GenerateTab extends JTabbedPane {
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

    public GenerateTab() {
        super(JTabbedPane.LEFT);
        createTabs();
    }

    public void createTabs() {
        addTab(paddedTitle("Components"),  new ComponentsTab());
        addTab(paddedTitle("Preferences"), new PreferencesTab());
        addTab(paddedTitle("Generate"),    new SubGenerateTab());
    }

}

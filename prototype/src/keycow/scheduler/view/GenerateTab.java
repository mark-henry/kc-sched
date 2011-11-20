package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

import keycow.scheduler.view.generate.*;

public class GenerateTab extends JTabbedPane {
    private final int padding_x = 50;
    private final int padding_y = 50;

    private String padded_title(String title) {
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
        addTab(padded_title("Components"),  new ComponentsTab());
        addTab(padded_title("Preferences"), new PreferencesTab());
        addTab(padded_title("Generate"),    new SubGenerateTab());
    }

}

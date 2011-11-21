package keycow.scheduler.view;

import javax.swing.*;
import java.awt.*;

import keycow.scheduler.view.generate.*;

public class GenerateTab extends JTabbedPane {
    public GenerateTab() {
        super(JTabbedPane.LEFT);
        createTabs();
    }

    public void createTabs() {
        addTab(BigTabs.paddedTitle("Components", 50, 50),  new ComponentsTab());
        addTab(BigTabs.paddedTitle("Preferences", 50, 50), new PreferencesTab());
        addTab(BigTabs.paddedTitle("Generate", 50, 50),    new SubGenerateTab());
    }

}

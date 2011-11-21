package keycow.scheduler.view;

import javax.swing.*;

public class Main {
    /**
     * Construct a SchedulerUI and make it visible
     */
    public static void main(String[] args) {
       try {
          // Set cross-platform Java L&F (also called "Metal")
          UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
       } 
       catch (UnsupportedLookAndFeelException e) {
          // handle exception
       }
       catch (ClassNotFoundException e) {
          // handle exception
       }
       catch (InstantiationException e) {
          // handle exception
       }
       catch (IllegalAccessException e) {
          // handle exception
       } 
       
       new SchedulerUI().setVisible(true);
    }
   
}

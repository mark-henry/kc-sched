package keycow.scheduler.view;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;



public class PublishTab extends JPanel implements ActionListener{
   private JPanel panel;
   private JTextField fileNameField;
   private JButton selectionButton;
   private JButton exportButton;
   private JFileChooser fChoose;
    
   public PublishTab()
   {
      panel = new JPanel();
      add(panel);
      
      Box vbox = Box.createVerticalBox();
      Box buttonBox = Box.createHorizontalBox();
      //Box fileNameBox
      
      fChoose = new JFileChooser();
      fileNameField = new JTextField();
      //fChoose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      
      //selectionButton = new JButton("Change Directories");
      exportButton = new JButton("Export");
      
      //buttonBox.add(selectionButton);
      //buttonBox.add(Box.createHorizontalStrut(15));
      buttonBox.add(exportButton);
      
      //selectionButton.addActionListener(this);
      exportButton.addActionListener(this);
      
      
      
      vbox.add(buttonBox);
      
      
      //vbox.add(fChoose);
      
      panel.add(vbox);
      
      
      
      
   }

   public void actionPerformed(ActionEvent e) {

     //Handle open button action.
     if (e.getSource() == exportButton) {
         int returnVal = fChoose.showSaveDialog(PublishTab.this);

         if (returnVal == JFileChooser.APPROVE_OPTION) {
             File file = fChoose.getSelectedFile();
             System.out.println("saving: " + file.getName() + ".\n");
         } else {
             System.out.println("Export command cancelled by user.\n");
         }
      }
   }
}

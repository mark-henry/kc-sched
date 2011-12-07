/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keycow.scheduler.view;

import javax.swing.*;

/**
 *
 * @author Mark Henry
 */
public class SectionEditor extends JFrame {
    private JTextField jTextField1;
    private JLabel jLabel1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel2;
    private JTextField jTextField2;
    private JLabel jLabel3;
    private JButton jButton3;
    private JLabel jLabel4;
    private JTextField jTextField3;
    private JPanel panel;
    
    public SectionEditor()
    {
        initComponents();
        setVisible(true);
    }
    
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel("Room");
        jLabel2 = new javax.swing.JLabel("Course");
        jLabel3 = new javax.swing.JLabel("Instructor");
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton("OK");
        jButton2 = new javax.swing.JButton("Cancel");
        jButton3 = new javax.swing.JButton("Delete This Section");
        
        panel = new javax.swing.JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel subpanel1 = new JPanel();
        subpanel1.setLayout(new BoxLayout(subpanel1, BoxLayout.X_AXIS));
        subpanel1.add(jLabel1);
        subpanel1.add(jTextField1);
        panel.add(subpanel1);
        
        JPanel subpanel2 = new JPanel();
        subpanel2.setLayout(new BoxLayout(subpanel2, BoxLayout.X_AXIS));
        subpanel2.add(jLabel2);
        subpanel2.add(jTextField2);
        panel.add(subpanel2);
        
        JPanel subpanel3 = new JPanel();
        subpanel3.setLayout(new BoxLayout(subpanel3, BoxLayout.X_AXIS));
        subpanel3.add(jLabel3);
        subpanel3.add(jTextField3);
        panel.add(subpanel3);
        
        panel.add(jButton3);

        JPanel subpanel4 = new JPanel();
        subpanel4.setLayout(new BoxLayout(subpanel4, BoxLayout.X_AXIS));
        subpanel4.add(jButton3);
        subpanel4.add(jButton1);
        subpanel4.add(jButton2);
        panel.add(subpanel4);
        
        jButton3.setVisible(false);
        
        setTitle("Add Section");
        add(panel);
        pack();
    }
}

package com.mycompany.progtechbeadando;

import java.awt.*;
import javax.swing.*;

/**
 * A sample application showing a JTable.
 *
 * @author Zachary Seguin
 * @version 1.0 (6/6/2012)
 */
public class JTable extends JFrame
{
    /**
     * This title label.
     *
     * @since 1.0
     */
    private JLabel lblTitle;

    /**
     * Scroll pane to hold the JTable, so a scroll bar is shown when the data exceeds the visible size.
     *
     * @since 1.0
     */
    private JScrollPane scrollPane;
    /**
     * Self explanatory...
     */
    private javax.swing.JTable jTable;

    /**
     * Manages the layout of the application.
     *
     * @since 1.0
     */
    private SpringLayout layout;

    /**
     * Contructs and initalizes the GUI interface.
     *
     * @since 1.0
     */
    public JTable()
    {
        //SETUP JTABLE
        String [] columnNames = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
        String [][] data = {
                { "","", "","","","","","","","","","","","","","","" },
        };

        Map map = Map.getInstance();
        String [][] finalMap = new String[16][32];
        for(int i = 0;i < 16;i++) {
            for (int j = 0; j < 32; j++) {
                finalMap[i][j] = String.valueOf(map.getInstance());
            }
        }




        this.jTable = new javax.swing.JTable(data, columnNames);

        this.scrollPane = new JScrollPane(this.jTable);

        //SETUP TITLE
        this.lblTitle = new JLabel("JTable Test");
        this.lblTitle.setFont(new Font("sansserif", Font.BOLD, 24));

        //SET THE LAYOUT MANAGER
        this.layout = new SpringLayout();
        this.getContentPane().setLayout(this.layout);

        //ADD ELEMENTS TO SCREEN
        this.add(this.lblTitle);
        this.add(this.scrollPane);

        //PLACE THE ELEMENTS
        this.layout.putConstraint(SpringLayout.NORTH, this.lblTitle, 10, SpringLayout.NORTH, this.getContentPane());
        this.layout.putConstraint(SpringLayout.WEST, this.lblTitle, 10, SpringLayout.WEST, this.getContentPane());

        this.layout.putConstraint(SpringLayout.NORTH, this.scrollPane, 50, SpringLayout.NORTH, this.getContentPane());
        this.layout.putConstraint(SpringLayout.WEST, this.scrollPane, 10, SpringLayout.WEST, this.getContentPane());
        this.layout.putConstraint(SpringLayout.EAST, this.scrollPane, -10, SpringLayout.EAST, this.getContentPane());
        this.layout.putConstraint(SpringLayout.SOUTH, this.scrollPane, -10, SpringLayout.SOUTH, this.getContentPane());

        //SETUP THE JFRAME
        this.setTitle("JTable Test");
        this.setSize(600, 400);
        this.setMinimumSize(new Dimension(400, 200));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }//End of constructor method

    public static void main (String [] args)
    {
        new JTable();
    }//End of main method
}//End of class
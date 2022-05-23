package com.mycompany.progtechbeadando;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class JTable extends JFrame
{

    private JLabel lblTitle;


    private JScrollPane scrollPane;

    private static javax.swing.JTable jTable;


    private SpringLayout layout;


    public static String [][] dataa=new String[16][32];
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
        data= dataToMap.GetStringMapValue();
        dataa=dataToMap.GetStringMapValue();



        this.jTable = new javax.swing.JTable(dataa, columnNames);

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
        this.setTitle("JTable");
        this.setSize(600, 400);
        this.setMinimumSize(new Dimension(400, 200));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }//End of constructor method

    public void Repaint(){
        jTable.repaint();

    }
    public static void Refresh(){
        String [] columnNames = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
        //this.jTable = new javax.swing.JTable(dataa, columnNames);
        jTable.revalidate();

    }
    public static void main (String [] args)
    {
        System.out.println(dataa[1][1]);
        //new JTable();
    }//End of main method
}//End of class
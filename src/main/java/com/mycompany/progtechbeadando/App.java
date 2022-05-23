package com.mycompany.progtechbeadando;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
/**
 * Created by:
 * Florian & Szabolcs
 */
public class App extends JTableTest {
    private JButton evolutionButton;
    private JPanel panelMain;
    private JTable table1;
    private JTextField textField1;
    private JScrollPane table;
    private JComboBox comboBox1;

    List<String> ActualRow = new ArrayList<String>();
    List<String> dummyRow = new ArrayList<String>();
    DefaultTableModel model = new DefaultTableModel();

    public App() {
        evolutionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new GetData();

            }
        });
    }
    public static void main(String[]args){
        JFrame frame=new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        String NumberOfIterations="0";


        int iteration=parseInt(NumberOfIterations);
        while (iteration!=0) {

            Map map = Map.getInstance();
            map.beginEvolution();
            iteration=iteration-1;


        }





    }



}




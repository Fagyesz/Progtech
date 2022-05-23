package com.mycompany.progtechbeadando;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
/**
 * Created by:
 * Florian & Szabolcs
 */
public class App extends JTable {
    private JButton evolutionButton;
    private JPanel panelMain;
    private JButton loadButton;
    private JButton saveButton;
    private JComboBox comboBox1;

    List<String> ActualRow = new ArrayList<String>();
    List<String> dummyRow = new ArrayList<String>();
    DefaultTableModel model = new DefaultTableModel();

    public App() {


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




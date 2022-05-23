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
public class App extends JTable {
    private JButton evolutionButton;
    private JPanel panelMain;
    private JButton loadButton;
    private JButton saveButton;
    private JComboBox cbLoad;
    private JButton loadLatestButton;
    private JComboBox cbEvo;

    List<String> ActualRow = new ArrayList<String>();
    List<String> dummyRow = new ArrayList<String>();
    DefaultTableModel model = new DefaultTableModel();

    public App() {


        loadLatestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataToMap.DataToMapFromDBLatest();
            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp= (String) cbLoad.getSelectedItem();
                int tmp2= Integer.parseInt(tmp);
                dataToMap.DataToMapFromDB(tmp2);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PostData.PostDataToDB(MapToData.MapToDataValue());

            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //PostData.PostDataToDB();
            }
        });
        evolutionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int iteration=0;
                String tmp= (String) cbEvo.getSelectedItem();
                int tmp2= Integer.parseInt(tmp);
                iteration=tmp2;

                while (iteration!=0) {

                    Map map = Map.getInstance();
                    map.beginEvolution();
                    iteration=iteration-1;


                }
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




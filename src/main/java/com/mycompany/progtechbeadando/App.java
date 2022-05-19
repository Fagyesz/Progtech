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
                //getdummyRow();
                new DataImporter();

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

        JTable jt;



    }
    private void getRow() {

        Map map = Map.getInstance();
        for (int i = 0; i < 8; i++) {
            System.out.print(map.getMap()[0][i]);
            ActualRow.add(Character.toString(map.getMap()[0][i]));
        }
        model.addRow(ActualRow.toArray());
        table1.setModel(model);
    }
    private void getdummyRow() {
        Map map = Map.getInstance();

        for (int i = 0; i < 16; i++) {
            System.out.print(map.getMap()[0][i]);
            dummyRow.add(Character.toString(map.getMap()[0][i]));
        }
        for (int i = 0; i < 16; i++) {
            System.out.print(dummyRow.get(i));

        }
        String[] tblHead={"Item Name","Price","Qty","Discount"};
        DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
        JTable tbl=new JTable(dtm);
        String[] item={"A","B","C","D"};
        dtm.addRow(item);
/*
        String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", new Integer(5), new Boolean(false)},
                {"John", "Doe",
                        "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black",
                        "Knitting", new Integer(2), new Boolean(false)},
                {"Jane", "White",
                        "Speed reading", new Integer(20), new Boolean(true)},
                {"Joe", "Brown",
                        "Pool", new Integer(10), new Boolean(false)}
        };
        JTable table = new JTable(data, columnNames);


*/

    }


}

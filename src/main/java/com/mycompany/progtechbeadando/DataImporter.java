package com.mycompany.progtechbeadando;

import java.io.IOException;
import java.sql.*;
import java.util.Observable;

public class DataImporter {

    static String[] row=new String[32];
    static String[][] savedMap = new String[16][32];
    static int column=0;
    public static void main(String[]args) {
        try {
             int i=0;int tmp=0;
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "Otakufaj1");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from data ");
                while (resultSet.next()) {

                    //System.out.println(resultSet.getString("id"));
                    for (int j = 2; j < 18; j++) {

                        row[i] = resultSet.getString(j);
                        savedMap[i][tmp] = row[i];
                       // System.out.print(savedMap[i][tmp]);
                        System.out.println(row[i]);
                        if (tmp!=31)
                        tmp++;
                        if (i!=15)
                            i++;
                    }
                }
            i=0;

                for (int j = 0; j < 32; j++) {
                   // System.out.print(row[15]);
                    System.out.print(savedMap[1][1]);
                }
               // System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void dataToArray() {
        char emptyCellTexture = '.';

        Map map = Map.getInstance();

        for (int j = 0; j < 32; j++) {
            savedMap[column][j] = row[j];
        }
    }





}






















package com.mycompany.progtechbeadando;

import java.sql.*;

public class GetData {

    static String[] data=new String[3];




    public static void GetDataFromDB() {
        try {
            int i = 1;
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "Otakufaj1");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from saves ");
            while (resultSet.next()) {

                //System.out.println(resultSet.getString("id"));
                //i 1től kezdődik (hanyadik oszlop a db ben)
                while (i <= 2) {

                    data[i] = resultSet.getString(i);
                  //  System.out.println(data[i]);

                    i++;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public static String [] returnData(){

    GetDataFromDB();
    return data;
    }






}






















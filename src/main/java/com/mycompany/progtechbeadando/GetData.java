package com.mycompany.progtechbeadando;

import java.sql.*;

public class GetData {

    static String[] data=new String[3];
    static int GlobalID;
    public static void main(String[]args) {
        //GetDataFromDB(3);
       // GetLatestDataFromDB();

    }


    public static void GetDataFromDB(int id) {
        try {
            int i = 1;
            GlobalID =id;
            String select="select * from saves",where=" where id=",
                    limit=" ORDER BY id DESC LIMIT 1";

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "Otakufaj1");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(select+where+ GlobalID);
            while (resultSet.next()) {

                //System.out.println(resultSet.getString("id"));
                //i 1től kezdődik (hanyadik oszlop a db ben)
                while (i <= 2) {

                    data[i] = resultSet.getString(i);
                    System.out.println(data[i]);

                    i++;
                }

            }


        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    public static void GetLatestDataFromDB() {
        try {
            int i = 1;

            String select="select * from saves",where=" where id=",
                    order=" ORDER BY " ,
                    limit=" DESC LIMIT 1";

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progtech", "root", "Otakufaj1");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(select+order+"id"+limit);
            while (resultSet.next()) {

                //System.out.println(resultSet.getString("id"));
                //i 1től kezdődik (hanyadik oszlop a db ben)
                while (i <= 2) {

                    data[i] = resultSet.getString(i);
                    System.out.println(data[i]);

                    i++;
                }

            }


        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public static String [] returnData(){
    GetDataFromDB(GlobalID);
    return data;
    }
    public static String [] returnLatestData(){
        GetLatestDataFromDB();
        return data;
    }






}






















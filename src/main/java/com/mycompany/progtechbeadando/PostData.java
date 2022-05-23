package com.mycompany.progtechbeadando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class PostData {
    static String data;
    static String sql;
    /*
    public static void main(String[] args) {
        String test="R1ByXzXRFTZG1zQvQT3DwBfUshghE1lcU49vncpo6sYwk58HRXJGEJU2tmB41mUSFE1SuK5GX59oJrC7orfn2KdkZLJNkn7sU7RclGDsFRsevRLNo57QaxdEF9rkApFn4ltTVODBLNYXIgoOXN9yK1pGilN6y1F2Yd2T7KXiF9BRKauKngSWNDzuZtLrYzxd540jBvYYhehWIqM2L5dZFT4mWBhI6aOqdGBA3RZO2fL88dMs25VieVvWKZfOrzFnLrx3AhvldHFvoTSMm2u7TX4B8B75McY4B0wounbbJY9f7CSzna01AlTA1IPElEGFUejDMoNioIgXBGuSxBh8zwWtP5aBmmstPWQdDDgxLcWTWqXL6hZXLPh7xq3lEstpF4GIK2187YLdEzsYZdn6ihMh6HeRhCnqFswxnnHZ0hefy0d6CByS7gXUABUYJjD5SU5SlmaAq3m954smhJNe5bY1Z7WHlh3Da1MsoDD4dXuSl1ZtLDnLPjQURNuyeoZA";
        PostDataToDB(test);
    }
    */
    public static void PostDataToDB(String a){
        try{
            data=a;
            sql="INSERT INTO saves(save) values('"+data+"')";
            Connection connection = getConnection("jdbc:mysql://localhost:3306/progtech", "root", "Otakufaj1");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("All good");
            //ResultSet resultSet = statement.executeQuery(sql);
        }catch (Exception e) {
            e.printStackTrace();

        }

    }

}

package com.mycompany.progtechbeadando;

public class dataToMap{

    public static String [] data;
    public static String  datastr;
    public static char[][] savedMap = new char[16][32];

    public static String[][] DATA = new String[16][32];

    public static Map[][] map=new Map[16][32];


    public static void GetStringMap(){
        String tmp;

        Map map = Map.getInstance();
        try{
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 32; j++) {
                DATA[i][j] = String.valueOf(map.getMap()[i][j]);

            }

        }
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static String[][] GetStringMapValue(){
        GetStringMap();

        System.out.println(DATA[1][1]);

        return DATA;
    }
    public static void main(String[]args) {
        //DataToMapFromDB();
        System.out.println(DATA[0][1]);

    }
    public static void DataToMapFromDB(int tmp){

        DataToMap(GetData.returnData(tmp));
    }
    public static void DataToMapFromDBLatest(){
        DataToMap(GetData.returnLatestData());
    }

    public static void DataToMap(String [] a) {

        //data=GetData.returnData();
        data=a;
        datastr=data[2];
        int i=1;

        while (i <= 2) {

            //System.out.println(data[i]);

            i++;
        }
        //System.out.println(datastr);
        int  number=0,rem=0;
        i=0;
        while (i < 512) {


            if (rem >= 32) {
                number++;
                rem = 0;
            }

                /*
                System.out.print(a);
                System.out.print(temp);
                System.out.print(b);
                System.out.println();
                */

            try {


                savedMap[number][rem] = datastr.charAt(i);

                //System.out.println(savedMap[number][rem]);

                } catch (Exception e) {
                System.out.println("Hiba : " + e);
                }
            i++;
            rem++;
        }


            //System.out.println();
            //System.out.println(datastr.charAt(1));
            //System.out.println(savedMap[14][5]);

    }
}

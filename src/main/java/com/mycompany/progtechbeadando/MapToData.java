package com.mycompany.progtechbeadando;

public class MapToData {
    public static String[][] savedMap = new String[16][32];
    public static String chain="";
    public static void main(String[] args) {

        System.out.println(MapToDataValue());
    }
    public static void MapToData() {

        Map map = Map.getInstance();


        int number = 0, rem = 0, i = 0;
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

                chain += String.valueOf(map.getMap()[number][rem]);

                //System.out.println(savedMap[number][rem]);

            } catch (Exception e) {
                System.out.println("Hiba : " + e);
            }
            i++;
            rem++;

        }
        System.out.println(chain);

    }
   public static String MapToDataValue(){
        MapToData();
        return chain;
   }
}

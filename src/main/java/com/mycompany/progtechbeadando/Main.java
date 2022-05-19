/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Made by:
 * Florian & Szabolcs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {




        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter How many Iteration u want");
        String NumberOfInstances = myObj.nextLine();
        int instances=parseInt(NumberOfInstances);
        while (instances!=0) {

            Map map = Map.getInstance();
            map.beginEvolution();
            instances=instances-1;


        }



    }
    
}

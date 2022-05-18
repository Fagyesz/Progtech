/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MapTest {
    
    public MapTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEmptyCellTexture method, of class Map.
     */
    @Test
    public void testGetEmptyCellTexture() {
        System.out.println("getEmptyCellTexture");
        Map instance = Map.getInstance();
        char expResult = '.';
        char result = instance.getEmptyCellTexture();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNewborns method, of class Map.
     */
    @Test
    public void testGetNewborns() {
        System.out.println("getNewborns");
        Map instance = Map.getInstance();
        ArrayList<Animal> expResult = new ArrayList();
        ArrayList<Animal> result = instance.getNewborns();
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of getDeadAnimals method, of class Map.
     */
    @Test
    public void testGetDeadAnimals() {
        System.out.println("getDeadAnimals");
        Map instance = Map.getInstance();
        ArrayList<Animal> expResult = new ArrayList();
        ArrayList<Animal> result = instance.getDeadAnimals();
        assertEquals(expResult.size(), result.size());
    }
    
}

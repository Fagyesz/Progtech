/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarnivoreEatingTest {
    
    public CarnivoreEatingTest() {
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
     * Test of find method, of class CarnivoreEating.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Map map = Map.getInstance();
        Animal animal = new Wolf();
        CarnivoreEating instance = new CarnivoreEating();
        boolean expResult = true;
        boolean result = instance.find(map, animal);
        assertEquals(expResult, result);
    }

    /**
     * Test of eat method, of class CarnivoreEating.
     */
    @Test
    public void testEat() {
        System.out.println("eat");
        Map map = Map.getInstance();
        Animal animal = new Wolf();
        Animal pray = new Deer();
        CarnivoreEating instance = new CarnivoreEating();
        instance.eat(map, animal, pray);
        assertTrue(pray.getAlive());
    }
    
}

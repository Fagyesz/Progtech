/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;


public class HerbivoreEating extends EatingStrategy {

    @Override
    public boolean find(Map map, Animal animal) { //Fű mindig van
        return true;
    }

    @Override
    public void eat(Map map, Animal animal, Animal pray) { 
        animal.refillHunger();
    }

    @Override
    public Animal getPray() {
        return null;
    }
    
}

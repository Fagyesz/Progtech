/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;


public class CarnivoreEating extends EatingStrategy {
    Animal pray;
    
    @Override
    public boolean find(Map map, Animal animal) {
        boolean foundPray = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    if (map.getMap()[animal.getPosX()-4+i][animal.getPosX()-4+j] != map.getEmptyCellTexture()) {
                        if (map.getMap()[i][j] != 'W') {
                            for (Animal a : map.getAnimals()) {
                                if(a.getBody() == 'D' && a.getPosX() == animal.getPosX()-4+i && a.getPosY() == animal.getPosX()-4+j)
                                    pray = a;
                            }
                            foundPray = true;
                        }
                    }
                }
                catch(Exception e){
                }
            }
        }
        return foundPray;
    }
    
    @Override
    public Animal getPray(){
        return pray;
    }

    @Override
    public void eat(Map map, Animal animal, Animal pray) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try{
                    if (map.getMap()[animal.getPosX()-1+i][animal.getPosY()-1+i] == pray.getBody()) {
                        pray.die(map);
                        animal.refillHunger();
                    }
                }
                catch(Exception e){
                }
            }
        }
    }

    
    
}

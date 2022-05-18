/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;


public abstract class EatingStrategy {
    public abstract boolean find(Map map, Animal animal);
    public abstract Animal getPray();
    public abstract void eat(Map map, Animal animal, Animal pray);
}

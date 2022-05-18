/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;


public abstract class Herbivore implements Animal {
    public abstract char getBody();
    public abstract int getPosX();
    public abstract int getPosY();
    public abstract void eat(Map map);
    public abstract void move(Map map, int x, int y);
    public abstract void die(Map map);
    public abstract void addAge(Map map);
    public abstract void breed(Map map, Deer animal);
    @Override
    public abstract Object clone();
}

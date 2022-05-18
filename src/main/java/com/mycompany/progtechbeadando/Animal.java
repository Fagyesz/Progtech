/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;


public interface Animal {
    public void eat(Map map);
    public void move(Map map, int x, int y);
    public void die(Map map);
    public void addAge(Map map);
    public void breed(Map map);
    public boolean getAlive();
    public int getPosX();
    public int getPosY();
    public int getHunger();
    public char getBody();
    public void refillHunger();
}

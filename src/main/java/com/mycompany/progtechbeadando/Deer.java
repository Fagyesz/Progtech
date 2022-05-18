/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;

import java.util.Random;


public class Deer extends Herbivore {
    
    char body;
    boolean alive;
    int hunger;
    short age;
    int posX;
    int posY;
    final int maxAge = 17;
    boolean canbreed = true;
    static Random rnd = new Random();
    
    public Deer(){
        body = 'D';
        alive = true;
        hunger = 100;
        age = 0;
        posX = 11 + rnd.nextInt(3);
        posY = 27 + rnd.nextInt(3);
    }

    @Override
    public char getBody() {
        return body;
    }
    
    @Override
    public int getHunger(){
        return hunger;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }
    
    @Override
    public boolean getAlive(){
        return alive;
    }

    @Override
    public void move(Map map, int x, int y) {
        if (alive && preMove(map, x, y)){
            if (hunger < 30) {
                eat(map);
            }
            try{
                map.getMap()[posX][posY] = map.getEmptyCellTexture();
                posX += x;
                posY += y;
                map.getMap()[posX][posY] = getBody();
            }
            catch(Exception e){
            }
        }
        hunger -= 5;
    }
    
    public boolean preMove(Map map, int x, int y){
        try{
            if (map.getMap()[posX+x][posY+y] != map.getEmptyCellTexture()) {
                return false;
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public void die(Map map) {
        alive = false;
        map.getDeadAnimals().add(this);
        map.getMap()[posX][posY] = map.getEmptyCellTexture();
    }

    @Override
    public void addAge(Map map) {
        if (alive && hunger == 0) {
            die(map);
        }
        else if (age <= 50) {
            age += 1;
        }
        else if (alive) {
            die(map);
        }
    }
    
    @Override
    public void breed(Map map){
        breed(map, this);
    }

    @Override
    public void breed(Map map, Deer animal) {
        if (alive && canbreed && age > 15 && Math.abs(this.posX - animal.getPosX())<1 && Math.abs(this.posY - animal.getPosY())<1) {
            Deer lilDeer = new Deer();
            map.getNewborns().add(lilDeer);
            canbreed = false;
        }
    }

    @Override
    public Object clone() {
        Deer klon = new Deer();
        klon.age = this.age;
        klon.alive = this.alive;
        klon.body = this.body;
        klon.hunger = this.hunger;
        klon.posX = this.posX + rnd.nextInt(3);
        klon.posY = this.posY + rnd.nextInt(3);
        return klon;
    }

    @Override
    public void eat(Map map) {
        EatingStrategy strategy = new HerbivoreEating();
        if(strategy.find(map, this))
            strategy.eat(map, this, null);
    }

    @Override
    public void refillHunger() {
        this.hunger = 100;
    }
}

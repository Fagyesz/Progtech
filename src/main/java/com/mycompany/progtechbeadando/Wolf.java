/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;

import java.util.Random;


public class Wolf extends Carnivore {

    char body;
    boolean alive;
    int hunger;
    short age;
    int posX;
    int posY;
    static Random rnd = new Random();
    boolean canbreed = true;
    
    public Wolf(){
        body = 'W';
        alive = true;
        hunger = 100;
        age = 0;
        posX = rnd.nextInt(3);
        posY = rnd.nextInt(3);
    }
    
    public Wolf(int posX, int posY, int hunger){
        body = 'W';
        alive = true;
        hunger = hunger;
        age = 0;
        this.posX = posX;
        this.posY = posY;
    }
    
    
    @Override
    public char getBody(){
        return body;
    }
    
    @Override
    public int getHunger(){
        return hunger;
    }
    
    public short getAge(){
        return age;
    }
    
    public int getPosX(){
        return posX;
    }
    
    public int getPosY(){
        return posY;
    }
    
    @Override
    public boolean getAlive(){
        return alive;
    }
    
    @Override
    public void eat(Map map) {
        EatingStrategy strategy = new CarnivoreEating();
        if(strategy.find(map, this)){
            strategy.eat(map, this, strategy.getPray());
        }
    }

    @Override
    public void move(Map map, int x, int y) {
        if (alive && preMove(map, x, y)){
            if (hunger < 40) {
                eat(map);
            }
            try{
                map.getMap()[posX][posY] = map.getEmptyCellTexture();
                posX += x;
                posY += y;
                map.getMap()[posX][posY] = getBody();
            }
            catch(Exception e){}
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
    public void addAge(Map map){
        if (alive && hunger == 0) {
            die(map);
        }
        else if (age <= 72) {
            age += 1;
        }
        else if (alive) {
            die(map);
        }
    }

    @Override
    public void breed(Map map, Wolf animal) {
        if (alive && canbreed && age > 12 && Math.abs(this.posX - animal.getPosX())<1 && Math.abs(this.posY - animal.getPosY())<1) {
            Wolf cub = new Wolf(this.posX, this.posY, this.hunger);
            map.getNewborns().add(cub);
            canbreed = false;
        }
    }
    
    @Override
    public Object clone(){
        Wolf klon = new Wolf();
        klon.age = this.age;
        klon.alive = this.alive;
        klon.body = this.body;
        klon.hunger = this.hunger;
        klon.posX = this.posX + rnd.nextInt(3);
        klon.posY = this.posY + rnd.nextInt(3);
        return klon;
    }

    @Override
    public void refillHunger() {
        this.hunger = 100;
    }

    @Override
    public void breed(Map map) {
        breed(map, this);
    }
    
}

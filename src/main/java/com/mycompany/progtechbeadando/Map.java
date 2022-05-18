/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtechbeadando;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;


// A map osztály egy lazy singleton
public class Map {
    
    private static Map instance = null;
    private char[][] map;
    private Random rnd = new Random();
    private int elteltido = 0;
    private ArrayList<Animal> animals = new ArrayList();
    private ArrayList<Animal> newborns = new ArrayList();
    private ArrayList<Animal> deadanimals = new ArrayList();
    private char emptyCellTexture = '.';
    private Map(){
        map = new char[16][32];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 32; j++) {
                map[i][j] = emptyCellTexture;
            }
        }
        Carnivore w1 = new Wolf();
        Carnivore w2 = (Wolf)w1.clone();
        Carnivore w3 = (Wolf)w1.clone();
        map[w1.getPosX()][w1.getPosY()] = w1.getBody();
        map[w2.getPosX()][w2.getPosY()] = w2.getBody();
        map[w3.getPosX()][w3.getPosY()] = w3.getBody();
        
        Herbivore d1 = new Deer();
        Herbivore d2 = (Deer)d1.clone();
        Herbivore d3 = (Deer)d1.clone();
        map[d1.getPosX()][d1.getPosY()] = d1.getBody();
        map[d2.getPosX()][d2.getPosY()] = d2.getBody();
        map[d3.getPosX()][d3.getPosY()] = d3.getBody();
        animals.add(w1);
        animals.add(w2);
        animals.add(w3);
        animals.add(d1);
        animals.add(d2);
        animals.add(d3);
    }
    
    public static Map getInstance(){
        if (instance == null) {
            instance = new Map();
        }
        return instance;
    }
    
    public char[][] getMap(){
        return map;
    }
    
    public char getEmptyCellTexture(){
        return emptyCellTexture;
    }
    
    public ArrayList<Animal> getAnimals(){
        return animals;
    }
    
    public ArrayList<Animal> getNewborns(){
        return newborns;
    }
    
    public ArrayList<Animal> getDeadAnimals(){
        return deadanimals;
    }
    
    public void beginEvolution(){
        System.out.println(this);
        for(Animal animal : animals) {
            animal.move(this, 2-rnd.nextInt(4), 2-rnd.nextInt(4));
            animal.breed(this);
            animal.addAge(this);
        }
        for(Animal animal : newborns){
            animals.add(animal);
        }
        newborns.clear();
        for (Animal animal : deadanimals) {
            animals.remove(animal);
        }
        deadanimals.clear();
        elteltido++;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Eltelt hónap: ");
        sb.append(elteltido);
        sb.append("\nElő állatok száma: ");
        sb.append(animals.size());
        sb.append("\n");
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 32; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

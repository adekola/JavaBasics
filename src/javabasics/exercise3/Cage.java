/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise3;

/**
 *
 * @author kola
 */
public class Cage {

    public Cage(int id, Animal animal) {
        this.id = id;
        this.animal = animal;
    }
    int id;
    Animal animal;  
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public String feedAnimal(){
        return this.animal.eat();
    }
    
}

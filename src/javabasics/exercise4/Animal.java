/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise4;

/**
 *
 * @author kola
 */
public abstract class Animal {

    int numberOfLimbs;
    String typicalFood;
    
    public Animal(int numberOfLimbs, String typicalFood) {
        this.numberOfLimbs = numberOfLimbs;
        this.typicalFood = typicalFood;
    }
    
    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public String getTypicalFood() {
        return typicalFood;
    }

    public void setTypicalFood(String typicalFood) {
        this.typicalFood = typicalFood;
    }
  
    public String eat(){
        return "I loved the food!. Kiitos";
    }
    
    public String sleep(){
        return "Am Asleep. Disturb Not!";
    }
    
    public String breathe(){
        return "Am under water, but am breathing fine! :D";
    }
    
    public String move(){
        return "Would you like to learn my moves?";
    }
    
    public String reproduce(){
        return "Hey! Am trying to ensure progeny";
    }
    
    public String die(){
        return "Din't know I could tell if i'm dead";
    }
    
    @Override
    public String toString(){
        return String.format("Animal Name: %s \n Number of Limbs: %s \n Typical Food: %s", this.getClass().getSimpleName(), getNumberOfLimbs(), getTypicalFood());
    }
}

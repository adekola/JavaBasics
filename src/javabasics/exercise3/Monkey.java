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
public class Monkey extends Animal{

    public Monkey(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }
    
   @Override
   public String move(){
       return "I usually hop from tree to tree";
   }
}

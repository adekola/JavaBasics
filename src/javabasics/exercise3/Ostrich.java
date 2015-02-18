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
public class Ostrich extends Animal{

    public Ostrich(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }
    
    @Override
    public String reproduce(){
        return "I can do bad all by myself";
    }
}

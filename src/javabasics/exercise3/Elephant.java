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
public class Elephant extends Animal{

    public Elephant(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }
    
    @Override
    public String die(){
        return "This feels Strange";
    }
}

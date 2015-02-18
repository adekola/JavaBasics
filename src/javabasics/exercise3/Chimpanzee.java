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
public class Chimpanzee extends Animal {

    public Chimpanzee(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }
    
    @Override
    public String sleep(){
        return "Am I making sounds? Then you know am asleep";
    }
    
}

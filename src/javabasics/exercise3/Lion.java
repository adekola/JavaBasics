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
public class Lion extends Animal {

    public Lion(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }
    
    @Override
    public String breathe(){
        return "I take deep breaths when am done with prey";
    }
}

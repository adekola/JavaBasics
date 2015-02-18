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
public class Horse extends Animal implements CanRun{

    public Horse(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }

    @Override
    public void run() {
        System.out.println("Am running as fast I can");
    }
    
    
}

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
public class Pergasus extends Animal implements CanRun, CanFly{

    public Pergasus(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }

    @Override
    public void run() {
        System.out.println("Am running! Can you believe that?");
    }

    @Override
    public void fly() {
        System.out.println("And I can fly too!! Awesome!");
    }
    
    
}

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
public class Griffin extends Animal implements CanRun, CanShout, CanFly{

    public Griffin(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }

    @Override
    public void run() {
        System.out.println("Am running...faster than Usain!!");
    }

    @Override
    public void shout() {
        System.out.println("I hope you liek the sound of my shouting ;)");
    }

    @Override
    public void fly() {
        System.out.println("And yea, I got flying superpowers too");
    }
    
    
    
    
}

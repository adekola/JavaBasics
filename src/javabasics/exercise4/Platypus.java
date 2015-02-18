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
public class Platypus extends Animal implements CanRun, CanShout, CanLayEggs{

    public Platypus(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }

    @Override
    public void run() {
        System.out.println("Running feels so goooood!!");
    }

    @Override
    public void shout() {
        System.out.println("Some noise to shake things up");
    }

    @Override
    public void layeggs() {
        System.out.println("I almost forgot to lay eggs though!!");
    }
    
    
}

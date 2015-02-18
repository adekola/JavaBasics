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
public class Bird extends Animal implements CanFly, CanLayEggs{

    //Construct the Bird Object by calling the parent constructor
    public Bird(int numberOfLimbs, String typicalFood) {
        super(numberOfLimbs, typicalFood);
    }
    
    //Implement the method of the CanFly interface
    @Override
    public void fly() {
        System.out.println("here's what am made to do..Yippie!!");
    }

    //implement the method of the CanLayEggs interface
    @Override
    public void layeggs() {
        System.out.println("Absolutely important to continuity of my species");
    }
}

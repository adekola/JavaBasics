/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise11;

/**
 *
 * @author kola
 */
public class BullDog implements Dog{
    @Override
    public String bark() {
        return String.format("Here is what a %s barking sounds like", this.getClass().getSimpleName());
    }

    @Override
    public String wagTail() {
      return String.format("Here is what a %s waging its tail looks like", this.getClass().getSimpleName());    
    }

    @Override
    public String run() {
        return String.format("A %s is running. Can you catch up?", this.getClass().getSimpleName());
    }
}

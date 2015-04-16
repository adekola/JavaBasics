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
public class Kennel extends FactoryBuilder{

    @Override
   public Dog createDog(String dogBreed) {
        Dog dogToCreate;
        switch(dogBreed){
            case "GreyHound":
                dogToCreate = new GreyHound();
                break;
            case "GoldenRetriever":
                dogToCreate = new GoldenRetriever();
                break;
            case "BullDog":
                dogToCreate = new BullDog();
                break;
            case "Borenji":
                dogToCreate = new Borenji();
                break;
            case "Akita":
                dogToCreate = new Akita();
                break;
            default: 
                dogToCreate = null;
                break;
        } 
        return dogToCreate;
    }
    
}

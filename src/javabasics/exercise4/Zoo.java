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
public class Zoo {
    int numberOfCages;
    Cage[] cages;

    public Zoo(int numberOfCages, Cage[] cages) {
        this.numberOfCages = numberOfCages;
        this.cages = cages;
    }
    
    public int getNumberOfCages() {
        return numberOfCages;
    }

    public void setNumberOfCages(int numberOfCages) {
        this.numberOfCages = numberOfCages;
    }

    public Cage[] getCages() {
        return cages;
    }

    public void setCages(Cage[] cages) {
        this.cages = cages;
    }
    
    public Animal searchCage(int cageId){
        Animal a = null;
        for(Cage c : cages){
            if (c.id == cageId)
                a = c.getAnimal();
        }
        
        return a;
    }
    
    public int searchCage(Animal animal){
        int id = 0;
        for(Cage c : cages){
            if(c.getAnimal() == animal)
                id = c.getId();
        }
        
        return id;
    }
    
     public void feedAnimals(){
        for(Cage c : cages){
            System.out.println(c.feedAnimal());
        }
    }
}

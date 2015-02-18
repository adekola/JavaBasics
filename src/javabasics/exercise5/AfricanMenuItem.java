/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise5;

/**
 *
 * @author kola
 */
public class AfricanMenuItem {

    String name;
    String description;
    boolean isVeggie;
    double price;
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isIsVeggie() {
        return isVeggie;
    }

    public double getPrice() {
        return price;
    }

    public AfricanMenuItem(String name, String description, boolean isVeggie, double price) {
        this.name = name;
        this.description = description;
        this.isVeggie = isVeggie;
        this.price = price;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s ; Description: %s ; Vegetarian: %s; Price: %3.1f", name, description, isVeggie, price);
    }
}

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
public class AfricanRestaurant {

    String location;
    String openingTimes;
    
    AfricanMenu menu;
    public String getLocation() {
        return location;
    }

    public String getOpeningTimes() {
        return openingTimes;
    }

    public AfricanMenu getMenu() {
        return menu;
    }
   

    public AfricanRestaurant(String location, String openingTimes, AfricanMenu menu) {
        this.location = location;
        this.openingTimes = openingTimes;
        this.menu = menu;
    }
    
    
}

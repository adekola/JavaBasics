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
public class IndianaCurryRestaurant {

    String location;
    String openingTimes;
    
    IndianaCurryMenu menu;

    public String getLocation() {
        return location;
    }

    public String getOpeningTimes() {
        return openingTimes;
    }

    public IndianaCurryMenu getMenu() {
        return menu;
    }
    
    public IndianaCurryRestaurant(String location, String openingTimes, IndianaCurryMenu menu) {
        this.location = location;
        this.openingTimes = openingTimes;
        this.menu = menu;
    }
   
    
    
}

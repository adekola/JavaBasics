/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise5;

import java.util.ArrayList;

/**
 *
 * @author kola
 */


//Uses an ArrayList to store the menu Items
public class AfricanMenu {
    ArrayList<AfricanMenuItem> menuItems;
    Iterator iterator;
    
    public AfricanMenu(ArrayList<AfricanMenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    
    public Iterator createIterator(){
        iterator = new AfricanMenuIterator(menuItems);
        return iterator;
    }
    
    public void addItem(AfricanMenuItem item){
        menuItems.add(item);
    }
}   

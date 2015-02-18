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


//Uses the Array to store the menu items
public class IndianaCurryMenu {
    IndianMenuItem[] menuItems;
    int maxItems;
    Iterator iterator;

    public IndianMenuItem[] getMenuItems() {
        return menuItems;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public Iterator createIterator() {
        iterator =  new IndianMenuIterator(menuItems);
        return iterator;
    }

    public IndianaCurryMenu(IndianMenuItem[] menuItems, int maxItems) {
        this.menuItems = menuItems;
        this.maxItems = maxItems;
    }
    
    public void addItem(IndianMenuItem item){
        
    }
    
}

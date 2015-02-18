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
public class AfricanMenuIterator implements Iterator{
    ArrayList<AfricanMenuItem> items;
    int position = 0;

    public AfricanMenuIterator(ArrayList<AfricanMenuItem> items) {
        this.items = items;
    }
    
    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        return items.get(position++); //return the item at the current position then, incement the position to the next value
     }
    
}

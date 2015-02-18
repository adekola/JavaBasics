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
public class IndianMenuIterator implements Iterator{
    IndianMenuItem[] items;
    int position = 0;

    public IndianMenuIterator(IndianMenuItem[] items) {
        this.items = items;
    }
    
    
    @Override
    public boolean hasNext() {
        return position < items.length ;
    }

    @Override
    public Object next() {
        return items[position++];
    }
    
}

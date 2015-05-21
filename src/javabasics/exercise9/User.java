/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise9;

import java.util.ArrayList;

/**
 *
 * @author kola
 */
public class User implements Subject {

    
    String userName;
    ArrayList<Observer> followers;
    
    public User(String name){
        userName = name;
        followers = new ArrayList<>();
    }
    
    @Override
    public boolean registerObserver(Observer o) {
        return followers.add(o);
    }

    @Override
    public boolean removeObserver(Observer o) {
         return followers.remove(o);
    }

    @Override
    public boolean notifyObserver(Observer o) {
        return false;
    }

    @Override
    public String readFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

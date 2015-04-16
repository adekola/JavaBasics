/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise9;

/**
 *
 * @author kola
 */
public interface Subject {
    boolean registerObserver(Observer o);
    boolean removeObserver(Observer o);
    boolean notifyObserver(Observer o);
    String readFile();
}

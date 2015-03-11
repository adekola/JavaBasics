/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.Exercise6;

/**
 *
 * @author kola
 */
public class Queen extends Character{

    @Override
    public String fight() {
        return String.format("I am a %s and I am fighting with a %s", this.getClass().getSimpleName(), getWeapon().getClass().getSimpleName());
    }    
}

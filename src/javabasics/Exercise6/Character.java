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
public abstract class Character {
    private WeaponBehavior weapon;
    
    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    
    public abstract String fight();
    
}

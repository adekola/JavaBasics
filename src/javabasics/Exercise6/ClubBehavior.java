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
public class ClubBehavior implements WeaponBehavior {

    @Override
    public String useWeapon() {
        return String.format("This is a : %s", this.getClass().getSimpleName());
    }
}

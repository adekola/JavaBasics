/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise10;

/**
 *
 * @author kola
 */
public class Circle  implements Shape {
    @Override
    public String Draw() {
        return String.format("Drawing a: %s \n", this.getClass().getSimpleName());
    }

    @Override
    public String getShapeDetails() {
         return String.format("This is a: %s with 0 sides \n ", this.getClass().getSimpleName());
    }
}

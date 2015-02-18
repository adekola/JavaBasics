/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise2;

/**
 *
 * @author kola
 */
public class Rectangle extends Shape{

    public Rectangle(int numberOfCorners, Point[] points) {
        super(numberOfCorners, points);
    }

    
    @Override
    public String getShapeDetails() {
        return String.format("Name of Shape: %s \n Corners: %s", this.getClass().getSimpleName(), this.printPoints());
    }
}

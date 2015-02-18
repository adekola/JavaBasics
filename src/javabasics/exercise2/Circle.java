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
public class Circle extends Shape{

    public Circle(int numberOfCorners, Point[] points) {
        super(numberOfCorners, points);
    }

    @Override
    public String getShapeDetails() {
        return String.format("Name of Shape: %s \n Size: %d", this.getClass().getSimpleName(), getSize());
    }
    
}

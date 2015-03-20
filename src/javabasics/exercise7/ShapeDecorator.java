/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise7;

/**
 *
 * @author kola
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator(Shape decoratedShape){
        this.shape = decoratedShape;
    }
    
    @Override
    public String Draw() {
        return shape.Draw();
    }

    @Override
    public String getShapeDetails() {
        return shape.getShapeDetails();
    }
      
}

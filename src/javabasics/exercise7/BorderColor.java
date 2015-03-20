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
public class BorderColor extends ShapeDecorator{
     public BorderColor(Shape sh){
        super(sh);
    }

    @Override
    public String getShapeDetails() {
        return super.getShapeDetails(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Draw() {
        return super.Draw(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String setBorderColor(String color){
        return String.format("Setting Border Color of %s to %s", this.shape.getClass().getSimpleName(), color);
    }
}

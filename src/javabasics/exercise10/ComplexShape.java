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
public class ComplexShape implements Shape{
    Shape[] shapes;
    
    public ComplexShape(Shape[] shapes){
        this.shapes = shapes;
    }
    @Override
    public String Draw() {
        String drawnString = "Drawing a complex shape \n";
        for(Shape s:shapes){
            drawnString+=s.Draw();
        }
        return drawnString;
    }

    @Override
    public String getShapeDetails() {
        String shapeDetails = String.format("Here is a complex shape composed of %d shapes \n Described next: \n", shapes.length);
        for(Shape s:shapes){
            shapeDetails+=s.getShapeDetails();
        }
        return shapeDetails;
    }
    
}

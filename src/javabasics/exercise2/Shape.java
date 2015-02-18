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
public abstract class Shape {

    private int numberOfCorners;
    private Point[] points;
    private int size;
   
    

    public Shape(int numberOfCorners, Point[] points) {
        this.numberOfCorners = numberOfCorners;
        this.points = points;
    }

    /**
     * @return the numberOfCorners
     */
    public int getNumberOfCorners() {
        return numberOfCorners;
    }

    /**
     * @param numberOfCorners the numberOfCorners to set
     */
    public void setNumberOfCorners(int numberOfCorners) {
        this.numberOfCorners = numberOfCorners;
    }

    /**
     * @return the points
     */
    public Point[] getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(Point[] points) {
        this.points = points;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    
    public abstract String getShapeDetails();
    
    String printPoints(){
        String pointsString = " \n ";
        for (Point point : points) {
            pointsString += point.toString();
        }
        return pointsString;
    }
}

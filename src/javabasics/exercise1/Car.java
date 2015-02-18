/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.exercise1;

/**
 *
 * @author kola
 */
public class Car {
    final private int id;
    private String carBrand;
    private String carModel;
    private int yearOfManufacture;    
    private String carPlateNumber;
    private String color;

    static int idCount = 0;
    
    public Car(String brand, String model, int year, String plateNo, String color){
        this.carBrand = brand;
        this.carModel = model;
        this.yearOfManufacture = year;
        this.carPlateNumber = plateNo;
        this.color = color;
        
        //Id is assingned here and cannot be modified
        this.id = idCount++;
    }
    /**
     * @return the id
     */
    //Id cannot be externally set. It is set at construction and incremented for each car
    public int getId() {
        return id;
    }

    

    /**
     * @return the carBrand
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * @param carBrand the carBrand to set
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * @return the carModel
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * @param carModel the carModel to set
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * @return the yearOfManufacture
     */
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * @param yearOfManufacture the yearOfManufacture to set
     */
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    /**
     * @return the carPlateNumber
     */
    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    /**
     * @param carPlateNumber the carPlateNumber to set
     */
    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.color = Color;
    }
    
    @Override
    public String toString(){
        return String.format("Car Id: %s \n Car Brand: %s \n Car Model: %s \n Year of Manufacture: %s \n License Number: %s \n Color: %s ", getId(), getCarBrand(), getCarModel(), getYearOfManufacture(), getCarPlateNumber(), getColor());
    }
}

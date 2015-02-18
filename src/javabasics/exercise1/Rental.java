package javabasics.exercise1;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author kola
 */
public class Rental {
    private final int id;
    private Customer customer;
    private Car car;
    private Date rentalStartDate;
    private Date rentalEndDate;

    static int idCount = 0;
    
    public Rental(Customer customer, Car car, Date startDate, Date endDate){
        id = idCount++;
        
        this.customer = customer;
        this.car = car;
        this.rentalStartDate = startDate;
        this.rentalEndDate = endDate;
    }
    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car the car to set
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * @return the rentalStartDate
     */
    public Date getRentalStartDate() {
        return rentalStartDate;
    }

    /**
     * @param rentalStartDate the rentalStartDate to set
     */
    public void setRentalStartDate(Date rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    /**
     * @return the rentalEndDate
     */
    public Date getRentalEndDate() {
        return rentalEndDate;
    }

    /**
     * @param rentalEndDate the rentalEndDate to set
     */
    public void setRentalEndDate(Date rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }
    
     /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return String.format("Reservation Id: %s \n Car Details \n %s \n Customer Details \n %s \n Start Date: %s \n End Date: %s", getId(), car.toString(), customer.toString(), getRentalStartDate(), getRentalEndDate());
    } 

   
}

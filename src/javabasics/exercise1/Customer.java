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
public class Customer {
    final private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    
    static int idCount = 0;
    
    public Customer(String fName, String lName, String email, String phone){
        this.firstName = fName;
        this.lastName = lName;
        this.emailAddress = email;
        this.phoneNumber = phone;
        
        this.id = idCount++;
    }
    /**
     * @return the id
     */
    //Id is set on construction of the object and cannot be modified thereafter
    public int getId() {
        return id;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString(){
        return String.format("Customer Id: %s \n First Name: %s \n Last Name: %s \n Phone Number: %s \n Email Address: \n ", getId(), getFirstName(), getLastName(), getPhoneNumber(), getEmailAddress());
    }
}

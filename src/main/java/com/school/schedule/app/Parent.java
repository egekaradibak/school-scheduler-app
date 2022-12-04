package com.school.schedule.app;

public class Parent extends Person{

    private float phoneNumber;

    // constructor
    public Parent(float id, String firstName, String lastName, float phoneNumber) {
        super(id, firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    // Getter Methods

    public float getPhoneNumber() {
        return phoneNumber;
    }

    // Setter Methods

    public void setPhoneNumber( float phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }
}

package com.school.schedule.app;

import java.util.List;

public class Parent extends Person{

    private float phoneNumber;
    private String address;



    // Getter Methods

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    // Setter Methods

    public void setPhoneNumber( float phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress( String address ) {
        this.address = address;
    }
}

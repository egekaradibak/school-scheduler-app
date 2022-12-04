package com.school.schedule.app;

public class Parent extends Person{

    private float phoneNumber;
    private boolean isVolunteer;

    // constructor
    public Parent(float id, String firstName, String lastName, float phoneNumber, boolean isVolunteer) {
        super(id, firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.isVolunteer = isVolunteer;
    }

    // Getter Methods

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getIsVolunteer() {
        return isVolunteer;
    }

    // Setter Methods

    public void setPhoneNumber( float phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public void setIsVolunteer( boolean phoneNumber ) {
        this.isVolunteer = isVolunteer;
    }
}

package com.school.schedule.app;

public class Parent extends Person{

    private String phoneNumber;
    private boolean isVolunteer;

    // constructor
    public Parent(int id, String firstName, String lastName, String phoneNumber, boolean isVolunteer) {
        super(id, firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.isVolunteer = isVolunteer;
    }

    // Getter Methods

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getIsVolunteer() {
        return isVolunteer;
    }

    // Setter Methods

    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public void setIsVolunteer( boolean isVolunteer ) {
        this.isVolunteer = isVolunteer;
    }

    @Override
    public String toString(){
        return super.toString() + "\nPhoneNumber: " +  this.phoneNumber + "\nisVolunteer: " +  this.isVolunteer;
    }
}

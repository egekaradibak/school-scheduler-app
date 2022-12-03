package com.school.schedule.app;

public class School {
    private String address;
    private String city;
    private float telephone;
    private float numberOfStudents;
    private float numberOfStaff;


    // Getter Methods

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public float getTelephone() {
        return telephone;
    }

    public float getNumberOfStudents() {
        return numberOfStudents;
    }

    public float getNumberOfStaff() {
        return numberOfStaff;
    }

    // Setter Methods

    public void setAddress( String address ) {
        this.address = address;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public void setTelephone( float telephone ) {
        this.telephone = telephone;
    }

    public void setNumberOfStudents( float numberOfStudents ) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setNumberOfStaff( float numberOfStaff ) {
        this.numberOfStaff = numberOfStaff;
    }
}

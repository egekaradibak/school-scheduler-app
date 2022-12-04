package com.school.schedule.app;

public class School {
    private String name;
    private String address;
    private String city;
    private float telephone;

    // constructor
    public School(String name, String address, String city, float telephone) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public float getTelephone() {
        return telephone;
    }

    // Setter Methods

    public void setName( String name ) {
        this.name = name;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public void setTelephone( float telephone ) {
        this.telephone = telephone;
    }

}

package com.school.schedule.app;

public class Person {

    private int id;
    private String firstName;
    private String lastName;

    // constructor
    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter Methods

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter Methods

    public void setId( int id ) {
        this.id = id;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + "\nFirst name: " +  this.firstName + "\nLast name: " +  this.lastName;
    }

}

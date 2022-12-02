package com.school.schedule.app;

public class Person {

    private float id;
    private String firstName;
    private String lastName;
    private String password;
    private Schedule schedule;
    private School school;

    // Getter Methods

    public float getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public School getSchool() {
        return school;
    }
    // Setter Methods

    public void setId( float id ) {
        this.id = id;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public void setSchedule( Schedule schedule ) {
        this.schedule = schedule;
    }

    public void setSchool( School school ) {
        this.school = school;
    }
}

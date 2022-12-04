package com.school.schedule.app;

import java.util.List;

public class School {
    private String name;
    private String address;
    private String city;
    private float telephone;
    private List students;
    private List teachers;

    // constructor
    public School(String name, String address, String city, float telephone,List students, List teachers) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.students = students;
        this.teachers = teachers;
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

    public List getStudents() {
        return students;
    }

    public List getTeachers() {
        return teachers;
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

    public void setStudents( List students ) {
        this.students = students;
    }

    public void setTeachers( List teachers ) {
        this.teachers = teachers;
    }



}

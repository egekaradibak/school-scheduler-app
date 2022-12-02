package com.school.schedule.app;

import java.util.List;

public class Schedule {

    private Student student;
    private List<Course> courses;
    private float id;


    // Getter Methods

    public Student getStudent() {
        return student;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public float getId() {
        return id;
    }

    // Setter Methods

    public void setStudent( Student student ) {
        this.student = student;
    }

    public void setCourses( List<Course> courses ) {
        this.courses = courses;
    }

    public void setId( float id ) {
        this.id = id;
    }
}

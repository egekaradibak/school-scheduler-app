package com.school.schedule.app;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.Set;

public class Teacher extends Person{

    private List<Course> courses;
    private Boolean isFullTime;


    // Getter Methods

    public List<Course> getCourses() {
        return courses;
    }

    public Boolean getIsFullTime() {
        return isFullTime;
    }

    // Setter Methods

    public void setCourses( List<Course> courses ) {
        this.courses = courses;
    }

    public void setIsFullTime( Boolean isFullTime ) {
        this.isFullTime = isFullTime;
    }
}

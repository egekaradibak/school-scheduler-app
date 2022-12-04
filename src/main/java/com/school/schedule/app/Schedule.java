package com.school.schedule.app;

import java.util.List;

public class Schedule {
    private List<Course> courses;

    // constructor
    public Schedule(List<Course> courses) {
        this.courses = courses;
    }

    // Getter Methods

    public List<Course> getCourses() {
        return courses;
    }

    // Setter Methods

    public void setCourses( List<Course> courses ) {
        this.courses = courses;
    }
}

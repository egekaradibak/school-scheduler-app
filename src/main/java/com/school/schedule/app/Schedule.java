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

    @Override
    public String toString(){
        String coursesString = "";
        for ( Course course : this.courses){
            coursesString += course.toString() + "\n";
        }
        return "Courses:\n" + coursesString;
    }
}

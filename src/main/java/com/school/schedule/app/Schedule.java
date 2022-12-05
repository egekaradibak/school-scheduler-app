package com.school.schedule.app;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Course> courses;

    // constructor
    public Schedule() {
        this.courses = new ArrayList<Course>();
    }

    // Getter Methods

    public List<Course> getCourses() {
        return courses;
    }

    // Setter Methods

    public void setCourses( List<Course> courses ) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    @Override
    public String toString(){
        String coursesString = "";
        for ( Course course : this.courses){
            coursesString += course.toString() + ",\n";
        }
        return "\n[" + coursesString + "]";
    }
}

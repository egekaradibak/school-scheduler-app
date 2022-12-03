package com.school.schedule.app;

import java.util.List;

public class Student extends Person{

    private float schoolYear;
    private List<Course> courses;
    private float gpa;
    private float student_id;
    private Schedule schedule;
    private Parent parent;


    // Getter Methods

    public float getSchoolYear() {
        return schoolYear;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public float getGpa() {
        return gpa;
    }

    public float getStudent_id() {
        return student_id;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public Parent getParent() {
        return parent;
    }



    // Setter Methods

    public void setSchoolYear( float schoolYear ) {
        this.schoolYear = schoolYear;
    }

    public void setCourses( List<Course> courses ) {
        this.courses = courses;
    }

    public void setGpa( float gpa ) {
        this.gpa = gpa;
    }

    public void setStudent_id( float student_id ) {
        this.student_id = student_id;
    }

    public void setSchedule( Schedule schedule ) {
        this.schedule = schedule;
    }

    public void setParent( Parent parent ) {
        this.parent = parent;
    }

}


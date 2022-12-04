package com.school.schedule.app;

public class Student extends Person{

    private float gpa;
    private Schedule schedule;
    private Parent parent;

    // Getter Methods

    public float getGpa() {
        return gpa;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public Parent getParent() {
        return parent;
    }

    // Setter Methods

    public void setGpa( float gpa ) {
        this.gpa = gpa;
    }

    public void setSchedule( Schedule schedule ) {
        this.schedule = schedule;
    }

    public void setParent( Parent parent ) {
        this.parent = parent;
    }

}


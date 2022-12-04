package com.school.schedule.app;

public class Student extends Person{

    private float gpa;
    private Schedule schedule;
    private Parent parent;

    // constructor
    public Student(float id, String firstName, String lastName, float gpa, Schedule schedule, Parent parent) {
        super(id, firstName, lastName);
        this.gpa = gpa;
        this.schedule = schedule;
        this.parent = parent;
        this.schedule = schedule;
    }

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


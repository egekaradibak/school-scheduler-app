package com.school.schedule.app;

public class Student extends Person{

    private float gpa;
    private Schedule schedule;
    private Parent parent;

    // constructor
    public Student(int id, String firstName, String lastName, float gpa, Parent parent) {
        super(id, firstName, lastName);
        this.gpa = gpa;
        this.schedule = new Schedule();
        this.parent = parent;
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

    @Override
    public String toString(){
        return "{\n" + super.toString() + "\ngpa: " +  this.gpa + "\nschedule: " +  this.schedule + 
            "\nparent: " + this.parent + "\n}";
    }

}


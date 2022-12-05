package com.school.schedule.app;

public class Teacher extends Person{

    private Schedule schedule;

    // constructor
    public Teacher(int id, String firstName, String lastName, Schedule schedule) {
        super(id, firstName, lastName);
        this.schedule = schedule;
    }

    // Getter Methods

    public Schedule getSchedule() {
        return schedule;
    }

    // Setter Methods

    public void setSchedule( Schedule schedule ) {
        this.schedule = schedule;
    }

    @Override
    public String toString(){
        return super.toString() + "\nschedule: " +  this.schedule;
    }

}

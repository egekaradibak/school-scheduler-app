package com.school.schedule.app;

public class Teacher extends Person{

    private Schedule schedule;

    // constructor
    public Teacher(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.schedule = new Schedule();
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
        return "{\n" + super.toString() + "\nschedule: " +  this.schedule + "\n}";
    }

}

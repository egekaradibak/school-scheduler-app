package com.school.schedule.app;

public class Teacher extends Person{

    private Schedule schedule;

    // Getter Methods

    public Schedule getSchedule() {
        return schedule;
    }

    // Setter Methods

    public void setSchedule( Schedule schedule ) {
        this.schedule = schedule;
    }

}

package com.school.schedule.app;

public class Teacher extends Person{

    private Boolean hasTenure;
    private Schedule schedule;

    // Getter Methods

    public Boolean getHasTenure() {
        return hasTenure;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    // Setter Methods

    public void setHasTenure( Boolean hasTenure ) {
        this.hasTenure = hasTenure;
    }

    public void setSchedule( Schedule schedule ) {
        this.schedule = schedule;
    }

}

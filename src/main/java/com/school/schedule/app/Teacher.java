package com.school.schedule.app;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.Set;

public class Teacher extends Person{

    private List<Course> courses;
    private Boolean isFullTime;
    private Schedule schedule;

    // Getter Methods

    public List<Course> getCourses() {
        return courses;
    }

    public Boolean getIsFullTime() {
        return isFullTime;
    }

    public Schedule getSchedule() {
        return schedule;
    }


    // Setter Methods

    public void setCourses( List<Course> courses ) {
        this.courses = courses;
    }

    public void setIsFullTime( Boolean isFullTime ) {
        this.isFullTime = isFullTime;
    }

    public void setSchedule( Schedule schedule ) {
        this.schedule = schedule;
    }

}

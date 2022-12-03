package com.school.schedule.app;

public class Course {

    private String name;
    private String description;
    private float id;
    private String classroom;
    private Teacher teacher;


    // Getter Methods

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getId() {
        return id;
    }

    public String getClassroom() {
        return classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    // Setter Methods

    public void setName( String name ) {
        this.name = name;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public void setId( float id ) {
        this.id = id;
    }

    public void setClassroom( String classroom ) {
        this.classroom = classroom;
    }

    public void setTeacher( Teacher teacher ) {
        this.teacher = teacher;
    }
}

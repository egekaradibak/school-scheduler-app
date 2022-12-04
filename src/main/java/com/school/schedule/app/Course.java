package com.school.schedule.app;

public class Course {

    private String name;
    private float id;
    private String classroom;
    private Teacher teacher;

    // constructor
    public Course(String name, float id, String classroom, Teacher teacher) {
        this.name = name;
        this.id = id;
        this.classroom = classroom;
        this.teacher = teacher;
    }

    // Getter Methods

    public String getName() {
        return name;
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

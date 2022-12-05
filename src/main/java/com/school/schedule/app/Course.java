package com.school.schedule.app;

public class Course {

    private String name;
    private int id;
    private String classroom;
    private Teacher teacher;

    // constructor
    public Course(String name, int id, String classroom, Teacher teacher) {
        this.name = name;
        this.id = id;
        this.classroom = classroom;
        this.teacher = teacher;
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public int getId() {
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

    public void setId( int id ) {
        this.id = id;
    }

    public void setClassroom( String classroom ) {
        this.classroom = classroom;
    }

    public void setTeacher( Teacher teacher ) {
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nID: " +  this.id + "\nClassroom: " +  this.classroom + "\nTeacher: " +  this.teacher;
    }
}

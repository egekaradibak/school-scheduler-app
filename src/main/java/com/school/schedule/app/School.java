package com.school.schedule.app;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String address;
    private String city;
    private float telephone;
    private List<Student> students;
    private List<Teacher> teachers;

    // constructor
    public School(String name, String address, String city, float telephone) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public float getTelephone() {
        return telephone;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    // Setter Methods

    public void setName( String name ) {
        this.name = name;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public void setTelephone( float telephone ) {
        this.telephone = telephone;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


}

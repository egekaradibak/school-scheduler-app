package com.school.schedule.app;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String address;
    private String city;
    private String telephone;
    private List<Student> students;
    private List<Teacher> teachers;

    // constructor
    public School(String name, String address, String city, String telephone) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
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

    public String getTelephone() {
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

    public void setTelephone( String telephone ) {
        this.telephone = telephone;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public String toString(){
        String studentsList = "";
        for ( Student student : this.students){
            studentsList += "[" + student.toString() + "],\n";
        }

        String teachersList = "";
        for ( Teacher teacher : this.teachers){
            teachersList += "[" +  teacher.toString() + "],\n";
        }

        return "\nName: " + this.name + "\n\naddress: " +  this.address + "\n\ncity: " +  this.city + "\n\nTelephone: " +  this.telephone +
            "\n\nStudents:\n[" +  studentsList + "]\n" + "\n\nTeachers:\n[" + teachersList + "]\n" ;
    }
}

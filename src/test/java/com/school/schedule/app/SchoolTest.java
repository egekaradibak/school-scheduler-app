package com.school.schedule.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SchoolTest {

    School school;
    String name = "McGill";
    String address = "Sherbrooke st";
    String city = "Montreal";
    String telephone = "123456";
    int id = 5;
    String firstName = "Johnny";
    String lastName = "Bravo";
    float gpa = 2.50F;
    Student student;
    Parent parent;
    int pid = 111;
    String pfirstName = "Josh";
    String plastName = "Bravo";
    String phoneNumber = "1234567890";
    Boolean isVolunteer = true;
    Schedule schedule;
    Teacher teacher;
    int tid = 22;
    String tfirstName = "teacher";
    String tlastName = "lastname";
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Course> courses;
    String classroom = "classroom";
    String cname = "Math";
    Course course;

    @BeforeEach
    void setUp(){
        school = new School(name,address, city, telephone);
        parent = new Parent(pid, pfirstName,plastName,phoneNumber,isVolunteer);
        student = new Student(id, firstName, lastName, gpa , parent);
        schedule = new Schedule();
        teacher = new Teacher(tid, tfirstName,tlastName);
        course = new Course(cname, id, classroom, teacher);
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
        courses = new ArrayList<Course>();


    }

    @Test
    void testGetAndSetName(){
        school.setName("Concordia");
        assertEquals(school.getName(), "Concordia");
    }

    @Test
    void testGetAndSetAddress(){
        school.setAddress("Durocher St");
        assertEquals(school.getAddress(), "Durocher St");
    }

    @Test
    void testGetAndSetCity(){
        school.setCity("Toronto");
        assertEquals(school.getCity(), "Toronto");
    }
    @Test
    void testGetAndSetTelephone(){
        school.setTelephone("1122");
        assertEquals(school.getTelephone(), "1122");
    }

    @Test
    void testGetAndAddStudent(){
        school.addStudent(student);
        assertEquals(school.getStudents().size(), 1);

    }

    @Test
    void testGetAndAddTeacher(){
        school.addTeacher(teacher);
        assertEquals(school.getTeachers().size(), 1);

    }

    @Test
    void testGetAndAddCourse(){
        school.addCourse(course);
        assertEquals(school.getCourses().size(), 1);

    }

    @Test
    void testGetStudentById(){
        school.addStudent(student);
        assertEquals(school.getStudentById(id) , student);

    }

    @Test
    void testGetTeacherById(){
        school.addTeacher(teacher);
        assertEquals(school.getTeacherById(tid), teacher);

    }

    @Test
    void testGetCourseById(){
        school.addCourse(course);
        assertEquals(school.getCourseById(id), course);

    }

    @Test
    void testGetStudentByIdNull(){
        assertEquals(school.getStudentById(id) , null);

    }

    @Test
    void testGetTeacherByIdNull(){
        assertEquals(school.getTeacherById(tid), null);

    }

    @Test
    void testGetCourseByIdNull(){
        assertEquals(school.getCourseById(id), null);

    }

    @Test
    void testToString(){
        assertTrue(school.toString().contains(city));
        assertTrue(school.toString().contains(name));
        assertTrue(school.toString().contains(address));
        assertTrue(school.toString().contains(telephone));
        school.addStudent(student);
        school.addTeacher(teacher);
        school.addCourse(course);
        assertTrue(school.toString().contains(student.toString()));
        assertTrue(school.toString().contains(teacher.toString()));
        assertTrue(school.toString().contains(course.toString()));



    }




}

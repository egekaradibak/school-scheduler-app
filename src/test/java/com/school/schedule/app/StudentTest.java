package com.school.schedule.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

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

    @BeforeEach
    void setUp(){
        parent = new Parent(pid, pfirstName,plastName,phoneNumber,isVolunteer);
        student = new Student(id, firstName, lastName, gpa , parent);
    }

    @Test
    void testGetAndSetGpa(){
        student.setGpa(2.80F);
        assertEquals(student.getGpa(), 2.80F);
    }

    @Test
    void testGetAndSetSchedule(){
        schedule = new Schedule();
        student.setSchedule(schedule);
        assertEquals(student.getSchedule(), schedule);
    }

    @Test
    void testGetAndSetParent(){
        student.setParent(parent);
        assertEquals(student.getParent(), parent);
    }

    @Test
    void testToString(){
        assertTrue(student.toString().contains(String.valueOf(id)));
        assertTrue(student.toString().contains(firstName));
        assertTrue(student.toString().contains(lastName));
        assertTrue(student.toString().contains(String.valueOf(gpa)));
    }

}

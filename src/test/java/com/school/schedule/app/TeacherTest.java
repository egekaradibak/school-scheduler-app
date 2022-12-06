package com.school.schedule.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;




public class TeacherTest {

    Teacher teacher;
    int id = 1;
    String firstName = "John";
    String lastName = "Doe";
    Schedule schedule;

    @BeforeEach
    void setup(){
        schedule = new Schedule();
        teacher = new Teacher(id, firstName,lastName);
    }

    @Test
    void testGetAndSetSchedule(){
        teacher.setSchedule(schedule);
        assertEquals(schedule, teacher.getSchedule());
    }

    @Test
    void testToString(){
        assertTrue(teacher.toString().contains(firstName));
        assertTrue(teacher.toString().contains(lastName));
        assertTrue(teacher.toString().contains(String.valueOf(id)));



    }

}

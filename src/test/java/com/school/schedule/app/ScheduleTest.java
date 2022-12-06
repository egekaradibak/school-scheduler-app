package com.school.schedule.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScheduleTest {

    Schedule schedule;
    Course course;
    String name = "Math";
    int id = 101;
    String classroom = "Trottier";
    Teacher teacher;
    int teacherId = 1;
    String firstName = "John";
    String lastName = "Doe";

    @BeforeEach
    void setUp(){
        schedule = new Schedule();
    }

    @Test
    void testAddCourse(){
        teacher = new Teacher(teacherId,firstName,lastName);
        course = new Course(name, id, classroom, teacher);
        schedule.addCourse(course);
        assertEquals(schedule.getCourses().size(), 1);

    }

    @Test
    void testGetAndSetCourses(){
        teacher = new Teacher(teacherId,firstName,lastName);
        course = new Course(name, id, classroom, teacher);
        ArrayList<Course> testCourses = new ArrayList<Course>();
        testCourses.add(course);
        schedule.setCourses(testCourses);
        assertEquals(schedule.getCourses().size(), testCourses.size());

    }

    @Test
    void testToString(){
        teacher = new Teacher(teacherId,firstName,lastName);
        course = new Course(name, id, classroom, teacher);
        schedule.addCourse(course);
        assertTrue(schedule.toString().contains(course.toString()));
    }
}

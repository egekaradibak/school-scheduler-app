package com.school.schedule.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class CourseTest {

    String name = "Math";
    int id = 101;
    String classroom = "Trottier";
    Course course;
    Teacher teacher;
    int teacherId = 1;
    String firstName = "John";
    String lastName = "Doe";

   @BeforeEach
   void setUp(){
       teacher = new Teacher(11,firstName,lastName);
       course = new Course(name, id, classroom, teacher);
   }

   @Test
    void testGetAndSetName(){
       course.setName("name");
       assertEquals(course.getName(), "name");
   }

    @Test
    void testGetAndSetId(){
        course.setId(5);
        assertEquals(course.getId(), 5);
    }

    @Test
    void testGetAndSetClassroom(){
        course.setClassroom("classroom");
        assertEquals(course.getClassroom(), "classroom");
    }

    @Test
    void testGetAndSetTeacher(){
        teacher = new Teacher(teacherId,firstName,lastName);
        course.setTeacher(teacher);
        assertEquals(course.getTeacher(), teacher);
    }

    @Test
    void testToString(){
        assertTrue(course.toString().contains(name));
        assertTrue(course.toString().contains(classroom));
        assertTrue(course.toString().contains(String.valueOf(id)));
        assertTrue(course.toString().contains(teacher.toString()));

    }

}

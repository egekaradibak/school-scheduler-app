package com.school.schedule.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    Person person;
    int id = 53;
    String firstName = "Johnny";
    String lastName = "Bravo";

    @BeforeEach
    void setUp(){
        person = new Person(id,firstName,lastName);
    }

    @Test
    void testGetAndSetId(){
        person.setId(50);
        assertEquals(person.getId(), 50);
    }

    @Test
    void testGetAndSetFirstName(){
        person.setFirstName("firstName");
        assertEquals(person.getFirstName(), "firstName");
    }

    @Test
    void testGetAndSetLastName(){
        person.setLastName("lastName");
        assertEquals(person.getLastName(), "lastName");
    }

    @Test
    void testToString(){
        assertTrue(person.toString().contains(String.valueOf(id)));
        assertTrue(person.toString().contains(firstName));
        assertTrue(person.toString().contains(lastName));

    }
}
